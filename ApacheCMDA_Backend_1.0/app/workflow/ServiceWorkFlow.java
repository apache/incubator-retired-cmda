package workflow;

import java.util.Arrays;

public class ServiceWorkFlow {
	private long uid;
	private Node[] nodes;
	private Connection[] connections;
	private Group[] groups;
	
	public long getUid() {
		return uid;
	}
	
	public void setUid(long uid) {
		this.uid = uid;
	}
	
	public Node[] getNodes() {
		return nodes;
	}
	
	public void setNodes(Node[] nodes) {
		this.nodes = nodes;
	}
	
	public Connection[] getConnections() {
		return connections;
	}
	
	public void setConnections(Connection[] connections) {
		this.connections = connections;
	}
	
	public Group[] getGroups() {
		return groups;
	}
	
	public void setGroups(Group[] groups) {
		this.groups = groups;
	}

	@Override
	public String toString() {
		return "ServiceWorkFlow [uid=" + uid + ", nodes="
				+ Arrays.toString(nodes) + ", connections="
				+ Arrays.toString(connections) + ", groups="
				+ Arrays.toString(groups) + "]";
	}

}
