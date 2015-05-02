/**
 * 
 */
package com.justtiffins.rest.customthali.excelimport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.justtiffins.rest.customthali.domain.CustomThali;

/**
 * @author Admin
 *
 */
@RestController
public class CustomThaliExcelImportController {
	
	@Autowired
	private CustomThaliExcelImportService excelImportService;
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	@RequestMapping(value="/rest/importCustomThali")
	public CustomThali importTodaysCustomThali() throws Exception {
		CustomThali customThali = excelImportService.readExcel();
				
		mongoTemplate.dropCollection(CustomThali.class);
		
		mongoTemplate.insert(customThali);
		return customThali;
	}

}
