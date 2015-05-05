package com.justtiffins.rest.mongo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoFactoryBean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

/**
 * @author Admin
 *
 */
@Configuration
public class MongoConnector {
		
	@Value("${spring.data.mongodb.database}")
	private String databaseName;
	
	@Value("${spring.data.mongodb.host}")
	private String host;
	
	@Value("${spring.data.mongodb.port}")
	private Integer port;
	
	public @Bean MongoFactoryBean mongoFactoryBean() {
		MongoFactoryBean mongoFactoryBean = new MongoFactoryBean();
		mongoFactoryBean.setHost(host);
		mongoFactoryBean.setPort(port);
		return mongoFactoryBean;
	}
	
	public @Bean MongoDbFactory mongoDBFactory () throws Exception {
		return new SimpleMongoDbFactory(mongoFactoryBean().getObject(), databaseName);
	}
	
	public @Bean MongoTemplate mongoTemplate() throws Exception {
		return new MongoTemplate(mongoDBFactory());
	}
}
