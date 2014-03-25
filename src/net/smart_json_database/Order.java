package net.smart_json_database;

import java.util.Arrays;

public class Order {

	private static String[] databaseFields = {"json_uid", "createDate", "updateDate"};
	
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

	public String sql() {
		return " ORDER BY " + field + " " + direction;
		
	}

	public boolean sortDatabaseField() {
		if( Arrays.asList(databaseFields).contains(field)){
			return true;
		} else {
			return false;
		}
	}

	public boolean sortDataField() {
		if( Arrays.asList(databaseFields).contains(field)){
			return false;
		} else {
			return true;
		}
	}

	public String collation() {
		return field;
	}
}
