/**
 * 
 */
package com.justtiffins.rest.commons.domain;

/**
 * @author Admin
 *
 */
public class BaseItem implements Item {
	
	private String itemNumber;
	private String name;
	private String description;
	/**
	 * @return the itemNumber
	 */
	public String getItemNumber() {
		return itemNumber;
	}
	/**
	 * @param itemNumber the itemNumber to set
	 */
	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
