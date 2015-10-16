package workflow;

public class Connection {
	private long id;
	private long from_node;
	private String from;
	private long to_node;
	private String to;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getFrom_node() {
		return from_node;
	}
	
	public void setFrom_node(long from_node) {
		this.from_node = from_node;
	}
	
	public String getFrom() {
		return from;
	}
	
	public void setFrom(String from) {
		this.from = from;
	}
	
	public long getTo_node() {
		return to_node;
	}
	
	public void setTo_node(long to_node) {
		this.to_node = to_node;
	}
	
	public String getTo() {
		return to;
	}
	
	public void setTo(String to) {
		this.to = to;
	}

}
