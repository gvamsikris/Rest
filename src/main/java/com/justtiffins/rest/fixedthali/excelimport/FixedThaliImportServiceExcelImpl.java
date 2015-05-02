/**
 * 
 */
package com.justtiffins.rest.fixedthali.excelimport;

import static com.justtiffins.rest.fixedthali.excelimport.FixedThaliExcelImportTagsEnum.DESCRIPTION;
import static com.justtiffins.rest.fixedthali.excelimport.FixedThaliExcelImportTagsEnum.FIXEDTHALISTART;
import static com.justtiffins.rest.fixedthali.excelimport.FixedThaliExcelImportTagsEnum.FIXEDTHALISTOP;
import static com.justtiffins.rest.fixedthali.excelimport.FixedThaliExcelImportTagsEnum.NAME;
import static com.justtiffins.rest.fixedthali.excelimport.FixedThaliExcelImportTagsEnum.OPTNUM;
import static com.justtiffins.rest.fixedthali.excelimport.FixedThaliExcelImportTagsEnum.PRICE;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.justtiffins.rest.fixedthali.FixedThali;

/**
 * @author Admin
 *
 */
@Service
@Transactional
public class FixedThaliImportServiceExcelImpl implements FixedThaliImportService {

	@Override
	public List<FixedThali> readExcel() throws Exception {
		File file = new File("F:\\WORK\\HungerDelight\\Test\\rest\\src\\main\\resources\\import\\FixedThali.xlsx");
		if (!file.exists()) {
			return null;
		}
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("FixedThali");
		Iterator<Row> rows = sheet.rowIterator();
		
		List<FixedThali> thaliList = parseRows(rows);
		
		workbook.close();
		
		return thaliList;
		
	}

	private List<FixedThali> parseRows(Iterator<Row> rows) {
		List<FixedThali> thaliList = new ArrayList<FixedThali>();
		while (rows.hasNext()) {
			Row row = (Row) rows.next();
			String tag = null;
			Cell cell = row.getCell(0);
			if (cell != null) {
				tag = cell.getStringCellValue();
			}
			if (FIXEDTHALISTART.getTagName().equalsIgnoreCase(tag)) {
				FixedThali fixedThali = parseFixedThali(rows);
				if (fixedThali != null) {
					thaliList.add(fixedThali);
				}
			}
			
		}
		return thaliList;
	}

	private FixedThali parseFixedThali(Iterator<Row> rows) {
		FixedThali thali = new FixedThali();
		boolean executionEnd = false;
		while (rows.hasNext()) {
			Row row = (Row) rows.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			while (cellIterator.hasNext()) {
				Cell cell = (Cell) cellIterator.next();
				String tag = cell.getStringCellValue();
				if (OPTNUM.getTagName().equalsIgnoreCase(tag)) {
					cell = cellIterator.next();
					thali.setOptionNumber(cell.getStringCellValue());
				} else if (NAME.getTagName().equalsIgnoreCase(tag)) {
					cell = cellIterator.next();
					thali.setName(cell.getStringCellValue());
				} else if (DESCRIPTION.getTagName().equalsIgnoreCase(tag)) {
					cell = cellIterator.next();
					thali.setDescription(cell.getStringCellValue());
				} else if (PRICE.getTagName().equalsIgnoreCase(tag)) {
					cell = cellIterator.next();
					thali.setPrice(new BigDecimal(cell.getNumericCellValue()));
				}  else if (FIXEDTHALISTOP.getTagName().equalsIgnoreCase(tag)) {
					executionEnd = true;
					break;
				}
			}
			if (executionEnd) {
				break;
			}
		}
		return thali;
	}

}
