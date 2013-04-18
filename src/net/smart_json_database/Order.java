package net.smart_json_database;

public class Order {

	/*
	 * Always sorts by json id descending.
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return " ORDER BY json_uid DESC";
	}
}
