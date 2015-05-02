/**
 * 
 */
package com.justtiffins.rest.customthali.domain;

import java.util.List;

/**
 * @author Ankit
 *
 */
public class VariantModel {
	
	private String vmNumber;
	private List<Category> categories;
	private String name;
	private String description;
	/**
	 * @return the vmNumber
	 */
	public String getVmNumber() {
		return vmNumber;
	}
	/**
	 * @param vmNumber the vmNumber to set
	 */
	public void setVmNumber(String vmNumber) {
		this.vmNumber = vmNumber;
	}
	/**
	 * @return the categories
	 */
	public List<Category> getCategories() {
		return categories;
	}
	/**
	 * @param categories the categories to set
	 */
	public void setCategories(List<Category> categories) {
		this.categories = categories;
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
