package workflow;

import java.util.ArrayList;
import java.util.List;

import models.ServiceExecutionLog;

import com.google.gson.Gson;

public class VisTrailJson {
	
	public static String getVisTrailJson(List<ServiceExecutionLog> list) {
		
		ServiceWorkFlow serviceWorkFlow = new ServiceWorkFlow();
		
		serviceWorkFlow.setUid(list.get(0).getUser().getId());
		
		long nodeIdGenerator = 1;
		List<Node> nodeList = new ArrayList<Node>();
		
		for (int i = 0; i < list.size(); i++) {
			FieldIn fieldIn = new FieldIn();
			fieldIn.setName("in");
			fieldIn.setValue("execution" + nodeIdGenerator);
			
			FieldOut fieldOut = new FieldOut();
			fieldOut.setName("out");
			fieldOut.setValue(null);
			
			Fields fields = new Fields();
			fields.setIn(new FieldIn[] {fieldIn});
			fields.setOut(new FieldOut[] {fieldOut});
			
			Node node = new Node();
			node.setNid(nodeIdGenerator);
			node.setName(list.get(i).getClimateService().getName());
			node.setType("Service");
			node.setAnim(false);
			node.setX(56.800006091594696);
			node.setY(230.8000060915947);
			node.setFields(fields);
			
			nodeList.add(node);
			
			nodeIdGenerator++;
		}
		
		FieldIn[] fieldInArray = new FieldIn[list.size()];
		for (int i = 0; i < list.size(); i++) {
			FieldIn fieldIn = new FieldIn();
			fieldIn.setName("in" + i);
			fieldIn.setValue("");
			fieldInArray[i] = fieldIn;
		}
		
		FieldOut fieldOut = new FieldOut();
		fieldOut.setName("out");
		fieldOut.setValue(null);
		
		Fields fields = new Fields();
		fields.setIn(fieldInArray);
		fields.setOut(new FieldOut[] {fieldOut});
		
		Node node = new Node();
		node.setNid(nodeIdGenerator);
		node.setName("Aggregation");
		node.setType("Aggregation");
		node.setAnim(false);
		node.setX(56.800006091594696);
		node.setY(230.8000060915947);
		node.setFields(fields);
		
		nodeList.add(node);
		
		nodeIdGenerator++;
		
		FieldIn fieldInWriteFile = new FieldIn();
		fieldInWriteFile.setName("in");
		fieldInWriteFile.setValue("");
		
		FieldOut fieldOutWriteFile = new FieldOut();
		fieldOut.setName("out");
		fieldOut.setValue(null);
		
		Fields fieldsWriteFile = new Fields();
		fieldsWriteFile.setIn(new FieldIn[] {fieldInWriteFile});
		fieldsWriteFile.setOut(new FieldOut[] {fieldOutWriteFile});
		
		Node nodeWriteFile = new Node();
		nodeWriteFile.setNid(nodeIdGenerator);
		nodeWriteFile.setName("WriteFile");
		nodeWriteFile.setType("WriteFile");
		nodeWriteFile.setAnim(false);
		nodeWriteFile.setX(56.800006091594696);
		nodeWriteFile.setY(230.8000060915947);
		nodeWriteFile.setFields(fields);
		
		nodeList.add(nodeWriteFile);
		
		nodeIdGenerator++;
		
		FieldIn fieldInFileSink1 = new FieldIn();
		fieldInFileSink1.setName("in");
		fieldInFileSink1.setValue(null);
		
		FieldIn fieldInFileSink2 = new FieldIn();
		fieldInFileSink2.setName("in0");
		fieldInFileSink2.setValue(null);
		
		FieldOut fieldOutFileSink = new FieldOut();
		fieldOutFileSink.setName(null);
		fieldOutFileSink.setValue(null);
		
		Fields fieldsFileSink = new Fields();
		fieldsFileSink.setIn(new FieldIn[] {fieldInFileSink1, fieldInFileSink2});
		fieldsFileSink.setOut(new FieldOut[] {fieldOutFileSink});
		
		Node nodeFileSink = new Node();
		nodeFileSink.setNid(nodeIdGenerator);
		nodeFileSink.setName("FileSink");
		nodeFileSink.setType("FileSink");
		nodeFileSink.setAnim(false);
		nodeFileSink.setX(716.0);
		nodeFileSink.setY(156.07);
		nodeFileSink.setFields(fields);
		
		nodeList.add(nodeFileSink);
		
		nodeIdGenerator++;
		
		serviceWorkFlow.setNodes(nodeList.toArray(new Node[nodeList.size()]));
		
		List<Connection> connectionList = new ArrayList<Connection>();
		for (int i = 0; i < list.size(); i++) {
			Connection connection = new Connection();
			connection.setId(nodeIdGenerator);
			connection.setFrom_node(i + 1);
			connection.setFrom("out");
			connection.setTo_node(list.size() + 1);
			connection.setTo("in" + i);
			
			connectionList.add(connection);

			nodeIdGenerator++;
		}
		
		for (int i = 0; i < 2; i++) {
			Connection connection = new Connection();
			connection.setId(nodeIdGenerator);
			connection.setFrom_node(list.size() + i + 1);
			connection.setFrom("out");
			connection.setTo_node(list.size() + i + 2);
			connection.setTo("in");
			
			connectionList.add(connection);

			nodeIdGenerator++;
		}
		
		serviceWorkFlow.setConnections(connectionList.toArray
				(new Connection[connectionList.size()]));
		
		serviceWorkFlow.setGroups(new Group[0]);
		
		Gson gson = new Gson();

		return gson.toJson(serviceWorkFlow);
	}

}
