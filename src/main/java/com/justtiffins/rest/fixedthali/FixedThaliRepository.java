/**
 * 
 */
package com.justtiffins.rest.fixedthali;

import java.util.Map;

import org.springframework.data.repository.Repository;

import com.justtiffins.rest.commons.domain.BaseOption;


/**
 * @author Admin
 *
 */

public interface FixedThaliRepository<R extends BaseOption> extends Repository<R, Long>{
	

	/**
	 * To find a thali based on id.
	 * @param id
	 * @return
	 */
	R findOne(Map<String, Object> queryParameters);

	/**
	 * To check whether thali exists or not.
	 * @param id
	 * @return
	 */
	boolean exists(Map<String, Object> queryParameters);

	/**
	 * To Get all types of thalis.
	 * @return
	 */
	Iterable<R> findAll();

	/**
	 * Get thalis based on there id.
	 * @param ids
	 * @return
	 */
	Iterable<R> findAll(Map<String, Object> queryParameters);

	/**
	 * Total count of thalis.
	 * @return
	 */
	long count();

}
