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
package net.smart_json_database.tools;

import android.util.Log;

/**
 * 
 * Simple Wrapper for android.util.Log
 * 
 * @author Andreas Hohnholt
 *
 */
public class Logger {
	
	private String tag = "";
	
	private Logger(String _tag)
	{
		tag = _tag;
	}
	
	/**
	 * 
	 * Creates a Logger that using the given tag
	 * 
	 * @param _tag
	 * @return
	 */
	public static Logger CreateLogger(String _tag)
	{
		return new Logger(_tag);
	}
	
	/**
	 * Creates a Logger that using as tag "logger.tag - tag"
	 * 
	 * @param logger
	 * @param _tag
	 * @return
	 */
	public static Logger CreateSubLogger(Logger logger,String _tag)
	{
		return new Logger(logger.tag + " - " +_tag);
	}	
	
	/**
	 * 
	 * @param _message
	 * @param _tr
	 */
	public void debug(String _message, Throwable _tr)
	{
		Log.d(tag, _message, _tr);
	}
	
	/**
	 * 
	 * @param _message
	 */
	public void debug(String _message)
	{
		Log.d(tag, _message);
	}
	
	/**
	 * 
	 * @param _messages
	 * @param _tr
	 */
	public void debug(String[] _messages, Throwable _tr)
	{
		StringBuilder b = new StringBuilder();
		
		for(String _message : _messages)
		{
			b.append(_message);
			b.append("\n");
		}
		if(_tr == null){
			Log.d(tag, b.toString());
		}else{
			Log.d(tag, b.toString(),_tr);
		}
	}
	
	/**
	 * 
	 * @param _messages
	 */
	public void debug(String[] _messages)
	{
		debug( _messages, null);
	}
	
	/**
	 * 
	 * @param _message
	 * @param _tr
	 */
	public void error(String _message, Throwable _tr)
	{
		Log.e(tag, _message, _tr);
	}
	
	/**
	 * 
	 * @param _message
	 */
	public void error(String _message)
	{
		Log.e(tag, _message);
	}
	
	/**
	 * 
	 * @param _message
	 */
	public void info(String _message)
	{
		Log.i(tag, _message);
	}

}
