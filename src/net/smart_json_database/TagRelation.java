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

import java.util.ArrayList;

public class TagRelation {

	private String mName;
	private ReadOnlyArrayList<String> mRelations = new ReadOnlyArrayList<String>();
	private ReadOnlyArrayList<String> mToRemove = new ReadOnlyArrayList<String>();
	private ReadOnlyArrayList<String> mToAdd = new ReadOnlyArrayList<String>();
	
	public TagRelation()
	{
		mName = "Tags";
	}
	
	protected void init(ArrayList<String> relations)
	{
		mRelations = new ReadOnlyArrayList<String>(relations);
	}
	
	protected void put (String object)
	{
		mRelations.add(object);
	}
	
	public String getName() {
		return mName;
	}


	public void add(String object)
	{
		if(!mRelations.contains(object))
		{
			mRelations.add(object);
			
			if(!mToAdd.contains(object))
			{
				mToAdd.add(object);
			}
			
			if(mToRemove.contains(object))
			{
				mToRemove.remove(object);
			}
		}
	}
	
	public void remove(String object)
	{
		if(mRelations.contains(object))
		{
			mRelations.remove(object);
			
			if(!mToRemove.contains(object))
			{
				mToRemove.add(object);
			}
			
			if(mToAdd.contains(object))
			{
				mToAdd.remove(object);
			}
		}
	}
	
	public ReadOnlyArrayList<String> getAll()
	{
		return mRelations;
	}

	protected ReadOnlyArrayList<String> getToRemove() {
		return mToRemove;
	}


	protected ReadOnlyArrayList<String> getToAdd() {
		return mToAdd;
	}
	
	public int length()
	{
		return mRelations.size();
	}
	
	
	
}
