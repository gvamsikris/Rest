package com.justtiffins.rest.customthali;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.justtiffins.rest.RestApiApplication;
import com.justtiffins.rest.customthali.domain.CustomThali;
import com.justtiffins.rest.customthali.domain.VariantModel;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RestApiApplication.class)
@WebAppConfiguration
public class InsertMongoDBDocs {
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@Test
	public void updateMongoDB () {
		mongoTemplate.insert(new CustomThali("D126", "Timepass", "", new BigDecimal(90), 1, null, new VariantModel()));
	}
}
