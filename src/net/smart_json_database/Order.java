package net.smart_json_database;

public class Order {

	private String field = "json_uid";
	private String direction = "DESC";
	 
	public Order(String field) {
		super();
		this.field = field;
	}

	public Order(String field, String direction) {
		super();
		this.field = field;
		this.direction = direction;
	}

	public String toString() {
		return " ORDER BY " + field + " " + direction;
		
	}
}
