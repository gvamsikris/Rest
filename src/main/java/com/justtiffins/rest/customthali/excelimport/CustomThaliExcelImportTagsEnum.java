/**
 * 
 */
package com.justtiffins.rest.customthali.excelimport;

/**
 * @author Admin
 *
 */
public enum CustomThaliExcelImportTagsEnum {
	
	OPTNUM("optionNumber"),
	NAME("name"),
	DESCRIPTION("description"),
	PRICE("price"),
	ITEMSSTART("itemsStart"),
	ITEMSTOP("itemsEnd"),
	VARIANTMODELSTART("variantModelStart"),
	VMNUMBER("vmNumber"),
	VARIANTMODELSTOP("variantModelEnd"),
	CATEGORYSTART("categoryStart"),
	CATEGORYSTOP("categoryEnd"),
	CATITEMSTART("catItem"),
	CATNUM("catNumber"),
	ITEMNUMBER("itemNumber");
	
	private String tagName;
	
	private CustomThaliExcelImportTagsEnum(String tagName) {
		this.tagName = tagName;
	}

	/**
	 * @return the tagName
	 */
	public String getTagName() {
		return tagName;
	}

}
