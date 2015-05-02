package com.justtiffins.rest.customthali.excelimport;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.justtiffins.rest.RestApiApplication;
import com.justtiffins.rest.customthali.domain.CustomThali;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RestApiApplication.class)
@WebAppConfiguration
public class CustomThaliExcelImportServiceImplTest {
	
	@Autowired
	private CustomThaliExcelImportService excelImportService;

	@Test
	public void testReadExcel() throws Exception {
		CustomThali customThali = excelImportService.readExcel();
		assertEquals("Custom Thali 1", customThali.getName());
		assertEquals(customThali.getVariantModel().getCategories().size() > 0, true);
	}

}
