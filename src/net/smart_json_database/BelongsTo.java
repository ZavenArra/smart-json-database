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

/**
 * 
 * @author Andreas Hohnholt
 *
 */
public class BelongsTo {

	protected String mName;
	private ReadOnlyArrayList<Integer> mRelations = new ReadOnlyArrayList<Integer>();
	private ReadOnlyArrayList<Integer> mToRemove = new ReadOnlyArrayList<Integer>();
	private ReadOnlyArrayList<Integer> mToAdd = new ReadOnlyArrayList<Integer>();
	
	public BelongsTo(String _name)
	{
		mName = _name;
	}
	
	protected void init(ArrayList<Integer> relations)
	{
		mRelations = new ReadOnlyArrayList<Integer>(relations);
	}
	
	protected void put (Integer object)
	{
		mRelations.add(object);
	}
	
	public String getName() {
		return mName;
	}


	public void add(Integer object)
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
	
	public void remove(Integer object)
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
	
	public ReadOnlyArrayList<Integer> getAll()
	{
		return mRelations;
	}


	protected ReadOnlyArrayList<Integer> getToRemove() {
		return mToRemove;
	}


	protected ReadOnlyArrayList<Integer> getToAdd() {
		return mToAdd;
	}
	
	public int length()
	{
		return mRelations.size();
	}
	
	
	
}
