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
import java.util.Collection;
import java.util.Iterator;

/**
 * 
 * Like ArrayList but only readable
 * 
 * @author Andreas Hohnholt
 *
 * @param <T>
 */
public class ReadOnlyArrayList<T> implements Iterable<T>{

	private ArrayList<T> list;

	
	protected ReadOnlyArrayList()
	{
		list = new ArrayList<T>();
	}
	
	/**
	 * if the input list is null the internal arraylist will create with a capacity of 0
	 * 
	 * @param list
	 */
	public ReadOnlyArrayList(ArrayList<T> list) {
		super();
		
		if(list == null)
		{
			this.list = new ArrayList<T>(0);
		}else{
			this.list = list;
		}	
	}
	
	/**
	 * if the input list is null the internal arraylist will create with a capacity of 0
	 * 
	 * @param list
	 */
	public ReadOnlyArrayList(T[] list) {
		super();
		
		if(list != null)
		{
			this.list = new ArrayList<T>(list.length);
			for(T e : list)
			{
				this.list.add(e);
			}
		}else{
			this.list = new ArrayList<T>(0);
		}
	}

	public boolean contains(Object arg0) {
		return list.contains(arg0);
	}

	public T get(int arg0) {
		return list.get(arg0);
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public int size() {
		return list.size();
	}

	public Object[] toArray() {
		return list.toArray();
	}

	public <T> T[] toArray(T[] arg0) {
		return list.toArray(arg0);
	}

	public String toString() {
		return list.toString();
	}

	public Object clone() {
		return list.clone();
	}
	
	public Iterator<T> iterator() {
		return list.iterator();
	}
	
	//Protected Methods for writable operations
	
	protected void add(int index, T element) {
		list.add(index, element);
	}

	protected boolean add(T e) {
		return list.add(e);
	}

	protected boolean addAll(Collection<? extends T> c) {
		return list.addAll(c);
	}

	protected boolean addAll(int index, Collection<? extends T> c) {
		return list.addAll(index, c);
	}

	protected void clear() {
		list.clear();
	}

	protected void ensureCapacity(int minCapacity) {
		list.ensureCapacity(minCapacity);
	}



	protected T remove(int index) {
		return list.remove(index);
	}

	protected boolean remove(Object o) {
		return list.remove(o);
	}

	protected boolean removeAll(Collection<?> arg0) {
		return list.removeAll(arg0);
	}
	
	public Collection<T> toCollection()
	{
		return list;
	}
	
}
