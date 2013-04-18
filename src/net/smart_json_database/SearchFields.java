/*
 *    
   Copyright 2011 Andreas Hohnholt

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
   
   */
package net.smart_json_database;


public class SearchFields {

	
	public static SearchFields Where(String key, String value)
	{
		SearchFields search = new SearchFields();
		search.query.append(" WHERE data LIKE \"%" + key +"_:_"+value+"%\"");
		return search;
	}
	
	public static SearchFields Where(String key, int value)
	{
		SearchFields search = new SearchFields();
		search.query.append(" WHERE data LIKE \"%" + key +"_:"+ value + "%\"");
		return search;
	}
	
	public static SearchFields Where(String key, double value)
	{
		SearchFields search = new SearchFields();
		search.query.append(" WHERE data LIKE \"%" + key +"_:"+ value + "%\"");
		return search;
	}
	
	private StringBuffer query = new StringBuffer();
	//private ArrayList<String> params = new ArrayList<String>();
	
	private SearchFields()
	{
		
	}
	
	public SearchFields And(String key, String value)
	{
		this.query.append(" AND data LIKE \"%" + key +"_:_"+value+"%\"");
		return this;
	}
	
	public SearchFields And(String key, int value)
	{
		this.query.append(" AND data LIKE \"%" + key +"_:"+ value + "%\"");
		return this;
	}
	
	public SearchFields And(String key, double value)
	{
		this.query.append(" AND data LIKE \"%" + key +"_:"+ value + "%\"");
		return this;
	}
	
	
	public SearchFields Or(String key, String value)
	{
		this.query.append(" OR data LIKE \"%" + key +"_:_"+value+"%\"");
		return this;
	}
	
	public SearchFields Or(String key, int value)
	{
		this.query.append(" OR data LIKE \"%" + key +"_:"+ value + "%\"");
		return this;
	}
	
	public SearchFields Or(String key, double value)
	{
		this.query.append(" OR data LIKE \"%" + key +"_:"+ value + "%\"");
		return this;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.query.toString();
	}
	
	
}
