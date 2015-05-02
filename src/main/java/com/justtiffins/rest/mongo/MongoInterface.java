/**
 * 
 */
package com.justtiffins.rest.mongo;

import java.util.List;

import com.mongodb.DB;

/**
 * @author Admin
 *
 */
public interface MongoInterface {
	
	/**
	 * @return
	 */
	DB db();
	
	List<String> getDatabaseNames();

}
