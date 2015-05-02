/**
 * 
 */
package com.justtiffins.rest.fixedthali.excelimport;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.justtiffins.rest.fixedthali.FixedThali;

/**
 * @author Admin
 *
 */
@RestController
public class FixedThaliImportController {
	
	@Autowired
	private FixedThaliImportService excelImportService;
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	@RequestMapping(value="/rest/importFixedThali")
	public List<FixedThali> importTodaysCustomThali() throws Exception {
		List<FixedThali> thaliList = excelImportService.readExcel();
				
		mongoTemplate.dropCollection(FixedThali.class);
		
		mongoTemplate.insert(thaliList, FixedThali.class);
		return thaliList;
	}

}
