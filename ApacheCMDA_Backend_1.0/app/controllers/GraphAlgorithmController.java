package controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import org.jgrapht.GraphPath;
import org.jgrapht.WeightedGraph;
import org.jgrapht.alg.DijkstraShortestPath;
import org.jgrapht.alg.KShortestPaths;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;

import models.ClimateService;
import models.ClimateServiceRepository;
import models.Dataset;
import models.DatasetAndUser;
import models.DatasetAndUserRepository;
import models.DatasetRepository;
import models.ServiceAndDataset;
import models.ServiceAndDatasetRepository;
import models.ServiceAndUser;
import models.ServiceAndUserRepository;
import models.User;
import models.UserRepository;
import play.mvc.Controller;
import play.mvc.Result;
import util.HashMapUtil;
import util.Matrix;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;

@Named
@Singleton
public class GraphAlgorithmController extends Controller {

	private final DatasetAndUserRepository datasetAndUserRepository;
	private final ServiceAndUserRepository serviceAndUserRepository;
	private final ServiceAndDatasetRepository serviceAndDatasetRepository;
	private final UserRepository userRepository;
	private final DatasetRepository datasetRepository;
	private final ClimateServiceRepository serviceRepository;

	@Inject
	public GraphAlgorithmController(
			DatasetAndUserRepository datasetAndUserRepository,
			ServiceAndUserRepository serviceAndUserRepository,
			ServiceAndDatasetRepository serviceAndDatasetRepository,
			UserRepository userRepository, DatasetRepository datasetRepository,
			ClimateServiceRepository serviceRepository) {
		this.datasetAndUserRepository = datasetAndUserRepository;
		this.serviceAndUserRepository = serviceAndUserRepository;
		this.serviceAndDatasetRepository = serviceAndDatasetRepository;
		this.userRepository = userRepository;
		this.datasetRepository = datasetRepository;
		this.serviceRepository = serviceRepository;
	}
	
	public Result getShortestPath(int source, int target, String format) {
		
		try {
			Iterable<DatasetAndUser> userDatasets = datasetAndUserRepository
					.findAll();

			if (userDatasets == null) {
				System.out.println("User and Dataset: cannot be found!");
				return notFound("User and Dataset: cannot be found!");
			}
			List<Map<String, Object>> nodes = new ArrayList<Map<String, Object>>();
			List<Map<String, Object>> rels = new ArrayList<Map<String, Object>>();
			WeightedGraph<Integer, DefaultWeightedEdge> graph = createGraph(userDatasets, nodes, rels);
			Map<String, Object> map = new HashMap<>();
			
			List<Map<String, Object>> node = new ArrayList<Map<String, Object>>();
			List<Map<String, Object>> rel = new ArrayList<Map<String, Object>>();
			
			List<DefaultWeightedEdge> path =
	                DijkstraShortestPath.findPathBetween(graph, source, target);
			for(DefaultWeightedEdge p : path) {
				int v1 = graph.getEdgeSource(p);
				int v2 = graph.getEdgeTarget(p);
				if(!node.contains(nodes.get(v1-1)))
					node.add(nodes.get(v1-1));
				if(!node.contains(nodes.get(v2-1)))
					node.add(nodes.get(v2-1));
				for(Map<String, Object> one : rels) {
					if((int)one.get("from") == v1 && (int)one.get("to") == v2) {
						rel.add(one);
					}
				}
			}
			
			map = HashMapUtil.map("nodes", node, "edges", rel);
			
			String result = new String();
			if (format.equals("json")) {
				result = new Gson().toJson(map);
			}

			return ok(result);
		} catch (Exception e) {
			return badRequest(e.getMessage());
		}
	}
	
public Result getKShortestPath(int source, int target, int k, String format) {
		
		try {
			Iterable<DatasetAndUser> userDatasets = datasetAndUserRepository
					.findAll();

			if (userDatasets == null) {
				System.out.println("User and Dataset: cannot be found!");
				return notFound("User and Dataset: cannot be found!");
			}
			List<Map<String, Object>> nodes = new ArrayList<Map<String, Object>>();
			List<Map<String, Object>> rels = new ArrayList<Map<String, Object>>();
			WeightedGraph<Integer, DefaultWeightedEdge> graph = createGraph(userDatasets, nodes, rels);
			// return this map list
			List<Map<String, Object>> mapList = new ArrayList<Map<String, Object>>();

			KShortestPaths kPaths = new KShortestPaths(graph, source, k);
			List<GraphPath> paths = kPaths.getPaths(target);
	        
			for(GraphPath p : paths) {
				List<Map<String, Object>> node = new ArrayList<Map<String, Object>>();
				List<Map<String, Object>> rel = new ArrayList<Map<String, Object>>();
				for (Object edge : p.getEdgeList()) {
					int v1 = graph.getEdgeSource((DefaultWeightedEdge)edge);
					int v2 = graph.getEdgeTarget((DefaultWeightedEdge)edge);
					if(!node.contains(nodes.get(v1-1)))
						node.add(nodes.get(v1-1));
					if(!node.contains(nodes.get(v2-1)))
						node.add(nodes.get(v2-1));
					for (Map<String, Object> one : rels) {
						if((int)one.get("from") == v1 && (int)one.get("to") == v2) {
							rel.add(one);
						}
					}
				}
				mapList.add(HashMapUtil.map("nodes", node, "edges", rel));
			}
		
			String result = new String();
			if (format.equals("json")) {
				result = new Gson().toJson(mapList);
			}

			return ok(result);
		} catch (Exception e) {
			return badRequest(e.getMessage());
		}
	}
	
	public WeightedGraph<Integer, DefaultWeightedEdge> createGraph(Iterable<DatasetAndUser> userDatasets,
			List<Map<String, Object>> nodes, List<Map<String, Object>> rels) {
		WeightedGraph<Integer, DefaultWeightedEdge> g =
	            new SimpleWeightedGraph<Integer, DefaultWeightedEdge>(DefaultWeightedEdge.class);

		int i = 1;
		long edgeId = 1;
		for (DatasetAndUser userDataset : userDatasets) {
			int source = 0;
			int target = 0;
			// Check whether the current user has already existed
			for (int j = 0; j < nodes.size(); j++) {
				if (nodes.get(j).get("group").equals("user")
						&& (long) nodes.get(j).get("userId") == userDataset
								.getUser().getId()) {
					source = (int) nodes.get(j).get("id");
					break;
				}
			}
			if (source == 0) {
				String realName = userDataset.getUser().getFirstName() + " "
						+ userDataset.getUser().getLastName();
				nodes.add(HashMapUtil.map7("id", i, "title", realName, "label", userDataset
						.getUser().getUserName(), "cluster", "1", "value", 1,
						"group", "user", "userId", userDataset.getUser()
								.getId()));

				source = i;
				g.addVertex(source);
				i++;
			}
			// Check whether the current dataset has already existed
			for (int j = 0; j < nodes.size(); j++) {
				if (nodes.get(j).get("group").equals("dataset")
						&& (long) nodes.get(j).get("datasetId") == userDataset
								.getDataset().getId()) {
					target = (int) nodes.get(j).get("id");
					break;
				}
			}
			if (target == 0) {
				nodes.add(HashMapUtil.map7("id", i, "title", userDataset.getDataset()
						.getName(), "label",
						userDataset.getDataset().getName(), "cluster", "2",
						"value", 2, "group", "dataset", "datasetId",
						userDataset.getDataset().getId()));
				target = i;
				g.addVertex(target);
				i++;
			}
			rels.add(HashMapUtil.map5("from", source, "to", target, "title", "USE",
					"id", edgeId, "weight", userDataset.getCount()));
			g.addEdge(source, target);
			g.setEdgeWeight(g.getEdge(source, target), userDataset.getCount());
			edgeId++;
		}
		return g;
	}

}
