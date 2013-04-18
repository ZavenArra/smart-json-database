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
package net.smart_json_databsase.tools;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

/**
 * 
 * A helper Class
 * 
 * @author Andreas Hohnholt
 *
 */
public class Util {

	private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
	
	/**
	 * 
	 * 
	 * @param s
	 * @return true if the given string is null or empty
	 */
	public static boolean IsNullOrEmpty(String s)
	{
		if(s == null)
			return true;
		
		if("".equals(s.trim()))
			return true;
		
		return false;
	}
	
	/**
	 * 
	 * @param collection
	 * @return true if the given collection is null or emtpy
	 */
	public static boolean IsNullOrEmpty(Collection<?> collection)
	{
		if(collection == null)
			return true;
		
		if(collection.size() < 1)
			return true;
		
		return false;
	}
	
	/**
	 * 
	 * @param array
	 * @return true if the given array is null or emtpy
	 */
	public static boolean IsNullOrEmpty(Object[] array)
	{
		if(array == null)
			return true;
		
		if(array.length < 1)
			return true;
		
		return false;
	}
	
	/**
	 * 
	 * @param array
	 * @return true if the given array is null or emtpy
	 */
	public static boolean IsNullOrEmpty(int[] array)
	{
		if(array == null)
			return true;
		
		if(array.length < 1)
			return true;
		
		return false;
	}
	
	/**
	 * 
	 * @param array
	 * @return true if the given array is null or emtpy
	 */
	public static boolean IsNullOrEmpty(double[] array)
	{
		if(array == null)
			return true;
		
		if(array.length < 1)
			return true;
		
		return false;
	}
	
	/**
	 * 
	 * @param array
	 * @return true if the given array is null or emtpy
	 */
	public static boolean IsNullOrEmpty(long[] array)
	{
		if(array == null)
			return true;
		
		if(array.length < 1)
			return true;
		
		return false;
	}
	
	/**
	 * 
	 * @param s
	 * @return false if the given string is null or empty
	 */
	public static boolean IsNotNullOrEmpty(String s)
	{
		return !IsNullOrEmpty(s);
	}
	
	/**
	 * Convert a string with the format yyyy-MM-dd HH:mm:ss to a date object
	 * 
	 * @param date - must have the format yyyy-MM-dd HH:mm:ss
	 * @return the date based on the given string or null if the the string isn't parsable
	 */
	public static Date ParseDateFromString(String date)
	{
		String[] split1 = date.trim().split(" ");
		
		if(split1.length != 2)
			return null;
		
		String[] dateElements = split1[0].split("-");
		String[] timeElements = split1[1].split(":");
		
		if(dateElements.length != 3)
			return null;
		
		if(timeElements.length != 3)
			return null;
		
		Date d = new Date(Integer.parseInt(dateElements[0]) - 1900, //incoming year is +1900 // 3910 -> 2010
							Integer.parseInt(dateElements[1]) -1, // month is wrong else
									Integer.parseInt(dateElements[2]),
											Integer.parseInt(timeElements[0]),
													Integer.parseInt(timeElements[1]),
															Integer.parseInt(timeElements[2]));
		
		return d;
	}
	
	/**
	 * Covernt a date object to a string in the format yyyy-MM-dd HH:mm:ss
	 * 
	 * @param date
	 * @return a yyyy-MM-dd HH:mm:ss string
	 */
	public static String DateToString(Date date)
	{
		return dateFormat.format(date);
	}
	
	/**
	 * Convert long to int
	 * 
	 * @exception IllegalArgumentException if _long < Integer.MIN_VALUE || _long > Integer.MAX_VALUE
	 * @param _long
	 * @return
	 */
	public static int LongToInt(long _long) {
	    if (_long < Integer.MIN_VALUE || _long > Integer.MAX_VALUE) {
	        throw new IllegalArgumentException("cast from long to int will change the value of " +_long);
	    }
	    return (int) _long; 
	}
	
	/**
	 * Returns the defaultvalue if the value is null
	 * 
	 * @param <T>
	 * @param value 
	 * @param defaultValue
	 * @return
	 */
	public static <T> T GetDefaultValue(T value, T defaultValue)
	{
		if(value != null)
			return value;
		
		return defaultValue;
	}
	
}
