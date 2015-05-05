/**
 * 
 */
package com.justtiffins.rest.customthali.excelimport;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;

import static com.justtiffins.rest.customthali.excelimport.CustomThaliExcelImportTagsEnum.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.justtiffins.rest.commons.domain.BaseItem;
import com.justtiffins.rest.commons.domain.Item;
import com.justtiffins.rest.customthali.domain.Category;
import com.justtiffins.rest.customthali.domain.CustomThali;
import com.justtiffins.rest.customthali.domain.VariantModel;

/**
 * @author Admin
 *
 */
@Service
@Transactional
public class CustomThaliExcelImportServiceImpl implements CustomThaliExcelImportService {

	@Override
	public CustomThali readExcel() throws Exception {
		File file = new File("F:\\WORK\\HungerDelight\\Test\\rest\\src\\main\\resources\\import\\TodayCustomThali.xlsx");
		if (!file.exists()) {
			return null;
		}
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet2");
		Iterator<Row> rows = sheet.rowIterator();
		
		CustomThali customThali = parseRows(rows);
		
		workbook.close();
		
		return customThali;
		
	}

	/**
	 * @param rows
	 * @return
	 */
	private CustomThali parseRows(Iterator<Row> rows) {
		CustomThali customThali = new CustomThali();
		while (rows.hasNext()) {
			Row row = rows.next();
			String tag = "";
			Object value = "";
			Cell cell = row.getCell(0);
			if (cell != null) {
				tag = cell.getStringCellValue();
			}
			cell = row.getCell(1);
			if (cell != null) {
				if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
					value = cell.getStringCellValue();
				} else if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
					value = new BigDecimal(cell.getNumericCellValue());
				}
			}
			if (OPTNUM.getTagName().equalsIgnoreCase(tag)) {
				customThali.setOptionNumber((String)value);
			} else if (NAME.getTagName().equalsIgnoreCase(tag)) {
				customThali.setName((String)value);
			} else if (DESCRIPTION.getTagName().equalsIgnoreCase(tag)) {
				customThali.setDescription((String)value);
			} else if (PRICE.getTagName().equalsIgnoreCase(tag)) {
				customThali.setPrice((BigDecimal)value);
			} else if (ITEMSSTART.getTagName().equalsIgnoreCase(tag)) {
				parseItems(rows, customThali);
			} else if (VARIANTMODELSTART.getTagName().equalsIgnoreCase(tag)) {
				parseVariantModel(row, customThali);
				parseVariantModel(rows, customThali);
			}
		}
		return customThali;
	}

	/**
	 * @param rows
	 * @param customThali
	 */
	private void parseItems(Iterator<Row> rows, CustomThali customThali) {
		System.out.println("Items search started");
	}
	
	private void parseVariantModel(Row row, CustomThali customThali) {
		Iterator<Cell> cellIterator = row.cellIterator();
		VariantModel variantModel = new VariantModel();
		customThali.setVariantModel(variantModel);

		while (cellIterator.hasNext()) {
			Cell cell = cellIterator.next();
			if (VMNUMBER.getTagName().equalsIgnoreCase(cell.getStringCellValue())) {
				cell  = cellIterator.next();
				variantModel.setVmNumber(cell.getStringCellValue());
			} else if (NAME.getTagName().equalsIgnoreCase(cell.getStringCellValue())) {
				cell  = cellIterator.next();
				variantModel.setName(cell.getStringCellValue());
			} else if (DESCRIPTION.getTagName().equalsIgnoreCase(cell.getStringCellValue())) {
				cell  = cellIterator.next();
				variantModel.setDescription(cell.getStringCellValue());
			}
		}
	}

	/**
	 * @param rows
	 * @param customThali
	 */
	private void parseVariantModel(Iterator<Row> rows, CustomThali customThali) {
		System.out.println("variant Model search started");
		customThali.getVariantModel().setCategories(new ArrayList<Category>());
		parseCategories(rows, customThali);
		System.out.println("variant Model search ended");
	}
	
	/**
	 * @param rows
	 * @param customThali
	 */
	private void parseCategories(Iterator<Row> rows, CustomThali customThali) {
		System.out.println("variant Model search started");
		Category category = null;
		while (rows.hasNext()) {
			Row row = rows.next();
			String cellValue = row.getCell(0).getStringCellValue();
			if (CATEGORYSTART.getTagName().equalsIgnoreCase(cellValue)) {
				category = new Category();
				category.setItems(new ArrayList<Item>());
				parseCategoryValues(row, category);
				customThali.getVariantModel().getCategories().add(category);
			} else if (CATITEMSTART.getTagName().equalsIgnoreCase(cellValue)) {
				BaseItem item = new BaseItem();
				parseCategoryItem(row, item);
				if (category != null) {
					category.getItems().add(item);	
				}
				
			}
		}
		System.out.println("variant Model search ended");
		
	}
	
	private void parseCategoryValues (Row row, Category category) {
		Iterator<Cell> cellIterator = row.cellIterator();
		while (cellIterator.hasNext()) {
			Cell cell = cellIterator.next();
			if (CATNUM.getTagName().equalsIgnoreCase(cell.getStringCellValue())) {
				cell  = cellIterator.next();
				category.setCatNumber(cell.getStringCellValue());
			} else if (NAME.getTagName().equalsIgnoreCase(cell.getStringCellValue())) {
				cell  = cellIterator.next();
				category.setName(cell.getStringCellValue());
			} else if (DESCRIPTION.getTagName().equalsIgnoreCase(cell.getStringCellValue())) {
				cell  = cellIterator.next();
				category.setDescription(cell.getStringCellValue());
			}
		}
	}
	
	private void parseCategoryItem (Row row, BaseItem item) {
		Iterator<Cell> cellIterator = row.cellIterator();
		while (cellIterator.hasNext()) {
			Cell cell = cellIterator.next();
			if (ITEMNUMBER.getTagName().equalsIgnoreCase(cell.getStringCellValue())) {
				cell  = cellIterator.next();
				item.setItemNumber(cell.getStringCellValue());
			} else if (NAME.getTagName().equalsIgnoreCase(cell.getStringCellValue())) {
				cell  = cellIterator.next();
				item.setName(cell.getStringCellValue());
			} else if (DESCRIPTION.getTagName().equalsIgnoreCase(cell.getStringCellValue())) {
				cell  = cellIterator.next();
				item.setDescription(cell.getStringCellValue());
			}
		}
	}

}
