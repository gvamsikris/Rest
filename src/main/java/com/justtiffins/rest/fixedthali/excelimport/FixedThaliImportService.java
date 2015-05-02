/**
 * 
 */
package com.justtiffins.rest.fixedthali.excelimport;

import java.util.List;

import com.justtiffins.rest.fixedthali.FixedThali;

/**
 * @author Admin
 *
 */
public interface FixedThaliImportService {
	
	
	/**
	 * Reads excel from path and updates mongo db.
	 * @exception Exception
	 */
	List<FixedThali> readExcel() throws Exception;

}
