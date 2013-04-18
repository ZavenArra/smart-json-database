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
package net.smart_json_databsase;

import android.database.sqlite.SQLiteDatabase;


/**
 * 
 * 
 * 
 * @author Andreas Hohnholt
 *
 */
public interface IUpgrade {

	/**
	 * 
	 * Delegate of the SQLiteOpenHelper.onUpgrade Version 
	 * 
	 * 
	 * @param db a writeable db which is in a transaction - so do not close the db
	 * @param oldVersion the old version number
	 * @param newVersion the new version number
	 * 
	 */
	public void doUpgrade(SQLiteDatabase db, int oldVersion, int newVersion);
	
}
