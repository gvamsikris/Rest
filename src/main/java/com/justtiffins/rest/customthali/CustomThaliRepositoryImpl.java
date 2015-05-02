/**
 * 
 */
package com.justtiffins.rest.customthali;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Repository;

import com.justtiffins.rest.customthali.domain.CustomThali;

/**
 * @author Admin
 *
 */
@Repository
public class CustomThaliRepositoryImpl implements CustomThaliRepository<CustomThali> {

	@Autowired
	private MongoTemplate mongoTemplate;

	/**
	 * To find a thali based on id.
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public CustomThali findOne(Map<String, Object> queryParameters) {
		if (queryParameters == null || queryParameters.size() <= 0) {
			return null;
		}
		
		Set<Entry<String, Object>> entrySet = queryParameters.entrySet();
		Criteria criteria = null;
		boolean firstFlag = false;
		for (Entry<String, Object> entry : entrySet) {
			if (firstFlag) {
				criteria = criteria.and(entry.getKey()).is(entry.getValue());
			} else {
				criteria = where(entry.getKey()).is(entry.getValue());
			}
		}
		
		if (criteria == null) {
			return null;
		}
		
		return mongoTemplate
				.findOne(query(criteria), CustomThali.class);
	}

	/**
	 * To check whether thali exists or not.
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public boolean exists(Map<String, Object> queryParameters) {
		return false;
	}

	/**
	 * To Get all types of thalis.
	 * 
	 * @return
	 */
	@Override
	public Iterable<CustomThali> findAll() {
		return mongoTemplate.findAll(CustomThali.class);
	}

	/**
	 * Get thalis based on there id.
	 * 
	 * @param ids
	 * @return
	 */
	@Override
	public Iterable<CustomThali> findAll(Map<String, Object> queryParameters) {
		return null;
	}

	/**
	 * Total count of thalis.
	 * 
	 * @return
	 */
	@Override
	public long count() {
		return 0;
	}
}
