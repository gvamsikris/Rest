/**
 * 
 */
package com.justtiffins.rest.fixedthali;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Admin
 *
 */
@Repository
public class FixedThaliRepositoryImpl implements FixedThaliRepository<FixedThali> {
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public FixedThali findOne(Map<String, Object> queryParameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Map<String, Object> queryParameters) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<FixedThali> findAll() {
		return mongoTemplate.findAll(FixedThali.class);
		}

	@Override
	public Iterable<FixedThali> findAll(Map<String, Object> queryParameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
