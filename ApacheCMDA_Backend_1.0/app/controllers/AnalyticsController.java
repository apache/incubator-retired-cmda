package controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import org.springframework.data.domain.Sort;

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
public class AnalyticsController extends Controller {

	private final DatasetAndUserRepository datasetAndUserRepository;
	private final ServiceAndUserRepository serviceAndUserRepository;
	private final ServiceAndDatasetRepository serviceAndDatasetRepository;
	private final UserRepository userRepository;
	private final DatasetRepository datasetRepository;
	private final ClimateServiceRepository serviceRepository;

	@Inject
	public AnalyticsController(
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

	public long getResultCount(String param) {
		long count = 0;
		switch (param) {
		case "User":
			count = userRepository.count();
			break;
		case "Dataset":
			count = datasetRepository.count();
			break;
		case "Service":
			count = serviceRepository.count();
			break;
		default:
			break;
		}
		return count;
	}
	
	public Map<String, Object> generateRelationalMap(String param1, String param2, String param3) {
		String option = param1 + param2 + param3;
		Map<String, Object> map = new HashMap<>();
		int[][] relations = null;
		int count1 = (int) getResultCount(param1), count3 = (int) getResultCount(param3);
		
		switch (option) {
		case "UserUserDataset": {
			relations = new int[count1][count3];
			Iterable<DatasetAndUser> datasetAndUsers = datasetAndUserRepository
					.findAll(sortByCountDesc());

			if (datasetAndUsers == null) {
				System.out.println("User and Dataset: cannot be found!");
			}

			for (DatasetAndUser one : datasetAndUsers) {
				int i = (int) one.getUser().getId() - 1;
				int j = (int) one.getDataset().getId() - 1;
				relations[i][j] = (int) one.getCount();
			}

			Matrix m1 = new Matrix(relations);
			Matrix m2 = m1.transpose();
			Matrix m3 = m1.times(m2);
			int[][] res = m3.getArray();

			map = jsonFormatForMatrix(res, "user");
			break;
		}
		case "UserUserService": {
			relations = new int[count1][count3];
			Iterable<ServiceAndUser> serviceAndUsers = serviceAndUserRepository
					.findAll(sortByCountDesc());

			if (serviceAndUsers == null) {
				System.out.println("User and Service: cannot be found!");
			}

			for (ServiceAndUser one : serviceAndUsers) {
				int i = (int) one.getUser().getId() - 1;
				int j = (int) one.getClimateService().getId() - 1;
				relations[i][j] = (int) one.getCount();
			}

			Matrix m1 = new Matrix(relations);
			Matrix m2 = m1.transpose();
			Matrix m3 = m1.times(m2);
			int[][] res = m3.getArray();

			map = jsonFormatForMatrix(res, "user");
			break;
		}
		case "DatasetDatasetUser": {
			relations = new int[count1][count3];
			Iterable<DatasetAndUser> datasetAndUsers = datasetAndUserRepository
					.findAll(sortByCountDesc());

			if (datasetAndUsers == null) {
				System.out.println("User and Dataset: cannot be found!");
			}

			for (DatasetAndUser one : datasetAndUsers) {
				int i = (int) one.getDataset().getId() - 1;
				int j = (int) one.getUser().getId() - 1;
				relations[i][j] = (int) one.getCount();
			}

			Matrix m1 = new Matrix(relations);
			Matrix m2 = m1.transpose();
			Matrix m3 = m1.times(m2);
			int[][] res = m3.getArray();

			map = jsonFormatForMatrix(res, "dataset");
			break;
		}
		case "DatasetDatasetService": {
			relations = new int[count1][count3];
			Iterable<ServiceAndDataset> datasetAndServices = serviceAndDatasetRepository
					.findAll(sortByCountDesc());

			if (datasetAndServices == null) {
				System.out.println("Dataset and Service: cannot be found!");
			}

			for (ServiceAndDataset one : datasetAndServices) {
				int i = (int) one.getDataset().getId() - 1;
				int j = (int) one.getClimateService().getId() - 1;
				relations[i][j] = (int) one.getCount();
			}

			Matrix m1 = new Matrix(relations);
			Matrix m2 = m1.transpose();
			Matrix m3 = m1.times(m2);
			int[][] res = m3.getArray();

			map = jsonFormatForMatrix(res, "dataset");
			break;
		}
		case "ServiceServiceUser": {
			relations = new int[count1][count3];
			Iterable<ServiceAndUser> serviceAndUsers = serviceAndUserRepository
					.findAll(sortByCountDesc());

			if (serviceAndUsers == null) {
				System.out.println("User and Service: cannot be found!");
			}

			for (ServiceAndUser one : serviceAndUsers) {
				int i = (int) one.getClimateService().getId() - 1;
				int j = (int) one.getUser().getId() - 1;
				relations[i][j] = (int) one.getCount();
			}

			Matrix m1 = new Matrix(relations);
			Matrix m2 = m1.transpose();
			Matrix m3 = m1.times(m2);
			int[][] res = m3.getArray();

			map = jsonFormatForMatrix(res, "service");
			break;
		}
		case "ServiceServiceDataset": {
			relations = new int[count1][count3];
			Iterable<ServiceAndDataset> datasetAndServices = serviceAndDatasetRepository
					.findAll(sortByCountDesc());

			if (datasetAndServices == null) {
				System.out.println("Dataset and Service: cannot be found!");
			}

			for (ServiceAndDataset one : datasetAndServices) {
				int i = (int) one.getClimateService().getId() - 1;
				int j = (int) one.getDataset().getId() - 1;
				relations[i][j] = (int) one.getCount();
			}

			Matrix m1 = new Matrix(relations);
			Matrix m2 = m1.transpose();
			Matrix m3 = m1.times(m2);
			int[][] res = m3.getArray();

			map = jsonFormatForMatrix(res, "service");
			break;
		}
		case "UserDatasetService":
			map = getAllDatasetAndUserWithCount();
			break;
		case "UserServiceDataset":
			map = getAllServiceAndUserWithCount();
			break;
		case "DatasetServiceUser":
			map = getAllServiceAndDatasetWithCount();
			break;
		default:
			break;
		}
		return map;
	}

	public Result getRelationalKnowledgeGraph(String format) {
		JsonNode json = request().body().asJson();

		if (json == null) {
			System.out.println("Cannot find relational knowledge graph, expecting Json data");
			return badRequest("Cannot find relational knowledge graph, expecting Json data");
		}
		String param1 = json.findPath("param1").asText();
		String param2 = json.findPath("param2").asText();
		String param3 = json.findPath("param3").asText();
		
		try {
			Map<String, Object> map = generateRelationalMap(param1, param2, param3);
			
			String result = new String();
			if (format.equals("json")) {
				result = new Gson().toJson(map);
			}
			return ok(result);
		} catch (Exception e) {
			return badRequest("Relationship not found");
		}

	}

	public Map<String, Object> getAllServiceAndDatasetWithCount() {

		List<ServiceAndDataset> datasetAndServices = serviceAndDatasetRepository
				.findAll(sortByCountDesc());

		if (datasetAndServices == null) {
			System.out.println("Dataset and Service: cannot be found!");
		}
		
		Map<String, Object> map = jsonFormatServiceAndDataset(datasetAndServices);
		return map;

	}

	public Map<String, Object> getAllDatasetAndUserWithCount() {

		List<DatasetAndUser> datasetAndUsers = datasetAndUserRepository
				.findAll(sortByCountDesc());

		if (datasetAndUsers == null) {
			System.out.println("User and Dataset: cannot be found!");
		}

		Map<String, Object> map = jsonFormatUserAndDataset(datasetAndUsers);
		return map;
	}

	public Map<String, Object> getAllServiceAndUserWithCount() {

		List<ServiceAndUser> serviceAndUsers = serviceAndUserRepository
				.findAll(sortByCountDesc());

		if (serviceAndUsers == null) {
			System.out.println("User and Service: cannot be found!");
		}

		Map<String, Object> map = jsonFormatServiceAndUser(serviceAndUsers);
		return map;
	}

	public Result getOneUserWithAllDatasetAndCount(long userId, String format) {

		try {
			User user = userRepository.findOne(userId);
			List<DatasetAndUser> datasetAndUsers = datasetAndUserRepository
					.findByUser(user);

			if (datasetAndUsers == null) {
				System.out.println("User and Dataset: cannot be found!");
				return notFound("User and Dataset: cannot be found!");
			}

			Map<String, Object> map = jsonFormatUserAndDataset(datasetAndUsers);

			String result = new String();
			if (format.equals("json")) {
				result = new Gson().toJson(map);
			}

			return ok(result);
		} catch (Exception e) {
			return badRequest("User and Dataset not found");
		}
	}

	public Result getOneDatasetWithAllUserAndCount(long datasetId,
			String format) {

		try {
			Dataset dataset = datasetRepository.findOne(datasetId);
			List<DatasetAndUser> datasetAndUsers = datasetAndUserRepository
					.findByDataset(dataset);

			if (datasetAndUsers == null) {
				System.out.println("User and Dataset: cannot be found!");
				return notFound("User and Dataset: cannot be found!");
			}

			Map<String, Object> map = jsonFormatUserAndDataset(datasetAndUsers);

			String result = new String();
			if (format.equals("json")) {
				result = new Gson().toJson(map);
			}

			return ok(result);
		} catch (Exception e) {
			return badRequest("User and Dataset not found");
		}
	}

	public Result getOneUserWithAllServiceAndCount(long userId, String format) {

		try {
			User user = userRepository.findOne(userId);
			List<ServiceAndUser> serviceAndUsers = serviceAndUserRepository
					.findByUser(user);

			if (serviceAndUsers == null) {
				System.out.println("User and Service: cannot be found!");
				return notFound("User and Service: cannot be found!");
			}

			Map<String, Object> map = jsonFormatServiceAndUser(serviceAndUsers);

			String result = new String();
			if (format.equals("json")) {
				result = new Gson().toJson(map);
			}

			return ok(result);
		} catch (Exception e) {
			return badRequest("User and Service not found");
		}
	}

	public Result getOneServiceWithAllUserAndCount(long serviceId, String format) {

		try {
			ClimateService service = serviceRepository.findOne(serviceId);
			List<ServiceAndUser> serviceAndUsers = serviceAndUserRepository
					.findByClimateService(service);

			if (serviceAndUsers == null) {
				System.out.println("User and Service: cannot be found!");
				return notFound("User and Service: cannot be found!");
			}

			Map<String, Object> map = jsonFormatServiceAndUser(serviceAndUsers);

			String result = new String();
			if (format.equals("json")) {
				result = new Gson().toJson(map);
			}

			return ok(result);
		} catch (Exception e) {
			return badRequest("User and Service not found");
		}
	}

	public Result getOneServiceWithAllDatasetAndCount(long serviceId,
			String format) {

		try {
			ClimateService service = serviceRepository.findOne(serviceId);
			List<ServiceAndDataset> datasetAndServices = serviceAndDatasetRepository
					.findByClimateService(service);

			if (datasetAndServices == null) {
				System.out.println("Dataset and Service: cannot be found!");
				return notFound("Dataset and Service: cannot be found!");
			}

			Map<String, Object> map = jsonFormatServiceAndDataset(datasetAndServices);

			String result = new String();
			if (format.equals("json")) {
				result = new Gson().toJson(map);
			}

			return ok(result);
		} catch (Exception e) {
			return badRequest("Dataset and Service not found");
		}
	}

	public Result getOneDatasetWithAllServiceAndCount(long datasetId,
			String format) {

		try {
			Dataset dataset = datasetRepository.findOne(datasetId);
			List<ServiceAndDataset> datasetAndServices = serviceAndDatasetRepository
					.findByDataset(dataset);

			if (datasetAndServices == null) {
				System.out.println("Dataset and Service: cannot be found!");
				return notFound("Dataset and Service: cannot be found!");
			}

			Map<String, Object> map = jsonFormatServiceAndDataset(datasetAndServices);

			String result = new String();
			if (format.equals("json")) {
				result = new Gson().toJson(map);
			}

			return ok(result);
		} catch (Exception e) {
			return badRequest("Dataset and Service not found");
		}
	}

	private Map<String, Object> jsonFormatUserAndDataset(
			List<DatasetAndUser> userDatasets) {
		long min = userDatasets.get(userDatasets.size()-1).getCount();
		long max = userDatasets.get(0).getCount();
		List<Map<String, Object>> nodes = new ArrayList<Map<String, Object>>();
		List<Map<String, Object>> rels = new ArrayList<Map<String, Object>>();

		int i = 1;
		int edgeId = 1;
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
				i++;
			}
			rels.add(HashMapUtil.map6("from", source, "to", target, "title", "USE",
					"id", edgeId, "weight", userDataset.getCount(), "length", (max-min)*3/userDataset.getCount()));
			edgeId++;
		}

		return HashMapUtil.map("nodes", nodes, "edges", rels);
	}

	private Map<String, Object> jsonFormatServiceAndDataset(
			List<ServiceAndDataset> serviceDatasets) {
		
		long min = serviceDatasets.get(serviceDatasets.size()-1).getCount();
		long max = serviceDatasets.get(0).getCount();
		List<Map<String, Object>> nodes = new ArrayList<Map<String, Object>>();
		List<Map<String, Object>> rels = new ArrayList<Map<String, Object>>();

		int i = 1;
		int edgeId = 1;
		for (ServiceAndDataset serviceDataset : serviceDatasets) {
			int source = 0;
			int target = 0;
			// Check whether the current service has already existed
			for (int j = 0; j < nodes.size(); j++) {
				if (nodes.get(j).get("group").equals("service")
						&& (long) nodes.get(j).get("serviceId") == serviceDataset
								.getClimateService().getId()) {
					source = (int) nodes.get(j).get("id");
					break;
				}
			}
			if (source == 0) {
				nodes.add(HashMapUtil.map7("id", i, "title", serviceDataset
						.getClimateService().getName(), "label", serviceDataset
						.getClimateService().getName(), "cluster", "3",
						"value", 1, "group", "service", "serviceId",
						serviceDataset.getClimateService().getId()));
				source = i;
				i++;
			}
			// Check whether the current dataset has already existed
			for (int j = 0; j < nodes.size(); j++) {
				if (nodes.get(j).get("group").equals("dataset")
						&& (long) nodes.get(j).get("datasetId") == serviceDataset
								.getDataset().getId()) {
					target = (int) nodes.get(j).get("id");
					break;
				}
			}
			if (target == 0) {
				nodes.add(HashMapUtil.map7("id", i, "title", serviceDataset.getDataset()
						.getName(), "label", serviceDataset.getDataset()
						.getName(), "cluster", "2", "value", 2, "group",
						"dataset", "datasetId", serviceDataset.getDataset()
								.getId()));
				target = i;
				i++;
			}

			rels.add(HashMapUtil.map6("from", source, "to", target, "title", "Utilize",
					"id", edgeId, "weight", serviceDataset.getCount(), "length", (max-min)*3/serviceDataset.getCount()));
			edgeId++;
		}

		return HashMapUtil.map("nodes", nodes, "edges", rels);
	}

	private Map<String, Object> jsonFormatServiceAndUser(
			List<ServiceAndUser> userServices) {
		
		long min = userServices.get(userServices.size()-1).getCount();
		long max = userServices.get(0).getCount();
		List<Map<String, Object>> nodes = new ArrayList<Map<String, Object>>();
		List<Map<String, Object>> rels = new ArrayList<Map<String, Object>>();

		int i = 1;
		int edgeId = 1;
		for (ServiceAndUser userService : userServices) {
			int source = 0;
			int target = 0;
			// Check whether the current user has already existed
			for (int j = 0; j < nodes.size(); j++) {
				if (nodes.get(j).get("group").equals("user")
						&& (long) nodes.get(j).get("userId") == userService
								.getUser().getId()) {
					source = (int) nodes.get(j).get("id");
					break;
				}
			}
			if (source == 0) {
				String realName = userService.getUser().getFirstName() + " "
						+ userService.getUser().getLastName();
				nodes.add(HashMapUtil.map7("id", i, "title", realName, "label", userService
						.getUser().getUserName(), "cluster", "1", "value", 1,
						"group", "user", "userId", userService.getUser()
								.getId()));
				source = i;
				i++;
			}
			// Check whether the current service has already existed
			for (int j = 0; j < nodes.size(); j++) {
				if (nodes.get(j).get("group").equals("service")
						&& (long) nodes.get(j).get("serviceId") == userService
								.getClimateService().getId()) {
					target = (int) nodes.get(j).get("id");
					break;
				}
			}
			if (target == 0) {
				nodes.add(HashMapUtil.map7("id", i, "title", userService
						.getClimateService().getName(), "label", userService
						.getClimateService().getName(), "cluster", "3",
						"value", 2, "group", "service", "serviceId",
						userService.getClimateService().getId()));
				target = i;
				i++;
			}

			rels.add(HashMapUtil.map6("from", source, "to", target, "title", "USE",
					"id", edgeId, "weight", userService.getCount(), "length", (max-min)*4/userService.getCount()));
			edgeId ++;
		}

		return HashMapUtil.map("nodes", nodes, "edges", rels);
	}
	
	public String findTitleName(String param, long id) {
		String title = "";
		switch (param) {
			case "user":
				title = userRepository.findOne(id).getUserName();
				break;
			case "dataset":
				title = datasetRepository.findOne(id).getName();
				break;
			case "service":
				title = serviceRepository.findOne(id).getName();
				break;
			default:
				break;
		}
		return title;
	}

	private Map<String, Object> jsonFormatForMatrix(int[][] matrix, String param) {

		List<Map<String, Object>> nodes = new ArrayList<Map<String, Object>>();
		List<Map<String, Object>> rels = new ArrayList<Map<String, Object>>();

		int i = 1;
		int edgeId = 1;
		for (int m = 0; m < matrix.length; m++) {
			for (int n = m + 1; n < matrix[0].length; n++) {
				if (matrix[m][n] > 0) {
					int source = 0;
					int target = 0;
					// Check whether the current user has already existed
					for (int j = 0; j < nodes.size(); j++) {
						if (nodes.get(j).get("group").equals(param)
								&& (long) nodes.get(j).get(param + "Id") == (long)m + 1) {
							source = (int) nodes.get(j).get("id");
							break;
						}
					}
					if (source == 0) {
						String name = findTitleName(param, (long)m+1);
						nodes.add(HashMapUtil.map7("id", i, "title", name, "label",
								name, "cluster", "1", "value", 1, "group",
								param, param + "Id", (long)m + 1));
						source = i;
						i++;
					}
					for (int j = 0; j < nodes.size(); j++) {
						if (nodes.get(j).get("group").equals(param)
								&& (long) nodes.get(j).get(param + "Id") == (long)n + 1) {
							target = (int) nodes.get(j).get("id");
							break;
						}
					}
					if (target == 0) {
						String name = findTitleName(param, (long)n+1);
						nodes.add(HashMapUtil.map7("id", i, "title", name, "label",
								name, "cluster", "1", "value", 1, "group",
								param, param + "Id", (long)n + 1));
						target = i;
						i++;
					}
					int zoom = 0;
					if(param.equals("dataset")) {
						zoom = 1600;
					} else {
						zoom = 6000;
					}
					rels.add(HashMapUtil.map6("from", source, "to", target, "title", "RELATE",
							"id", edgeId, "weight", matrix[m][n], "length", zoom/matrix[m][n]));
					edgeId ++;
				}
			}
		}

		return HashMapUtil.map("nodes", nodes, "edges", rels);
	}
	
	private Sort sortByCountDesc() {
        return new Sort(Sort.Direction.DESC, "count");
    }
}
