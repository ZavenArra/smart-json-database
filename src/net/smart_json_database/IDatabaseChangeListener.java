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

/**
 * 
 * @author Andreas Hohnholt
 *
 */
public interface IDatabaseChangeListener {

	public static final int CHANGETYPE_INSERT = 0;
	public static final int CHANGETYPE_UPDATE = 1;
	public static final int CHANGETYPE_DELETE = 2;
	
	public void onEntityChange(int _id, int _changeType);
	
	public void onTagChange(String name, int _changeType);
	
}
