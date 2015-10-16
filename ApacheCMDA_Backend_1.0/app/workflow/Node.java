package workflow;

public class Node {
	private long nid;
	private String name;
	private String type;
	private boolean anim;
	private double x;
	private double y;
	private Fields fields;
	
	public long getNid() {
		return nid;
	}
	
	public void setNid(long nid) {
		this.nid = nid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public boolean isAnim() {
		return anim;
	}
	
	public void setAnim(boolean anim) {
		this.anim = anim;
	}
	
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public Fields getFields() {
		return fields;
	}
	
	public void setFields(Fields fields) {
		this.fields = fields;
	}
	
}
