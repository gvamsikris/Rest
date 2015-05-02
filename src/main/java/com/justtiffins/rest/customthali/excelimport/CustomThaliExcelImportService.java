/**
 * 
 */
package com.justtiffins.rest.customthali.excelimport;

import com.justtiffins.rest.customthali.domain.CustomThali;

/**
 * @author Admin
 *
 */
public interface CustomThaliExcelImportService {
	
	
	/**
	 * Reads excel from path and updates mongo db.
	 * @exception Exception
	 */
	CustomThali readExcel() throws Exception;

}
