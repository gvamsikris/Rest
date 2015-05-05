/**
 * 
 */
package com.justtiffins.rest.fixedthali.excelimport;

/**
 * @author Admin
 *
 */
public enum FixedThaliExcelImportTagsEnum {
	
	OPTNUM("optionNumber"),
	NAME("name"),
	DESCRIPTION("description"),
	PRICE("price"),
	FIXEDTHALISTART("FixedThaliStart"),
	FIXEDTHALISTOP("FixedThaliEnd");
	
	private String tagName;
	
	private FixedThaliExcelImportTagsEnum(String tagName) {
		this.tagName = tagName;
	}

	/**
	 * @return the tagName
	 */
	public String getTagName() {
		return tagName;
	}

}
