package com.justtiffins.rest.fixedthali.excelimport;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.justtiffins.rest.RestApiApplication;
import com.justtiffins.rest.fixedthali.FixedThali;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RestApiApplication.class)
@WebAppConfiguration
public class FixedThaliImportServiceExcelImplTest {
	
	@Autowired
	private FixedThaliImportService fixedThaliImportService;

	@Test
	public void testReadExcel() throws Exception {
		List<FixedThali> thaliList = fixedThaliImportService.readExcel();
		assertEquals(thaliList.size()> 0, true);
//		fail("Not yet implemented");
	}

}
