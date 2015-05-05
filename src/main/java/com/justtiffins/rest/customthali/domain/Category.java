/**
 * 
 */
package com.justtiffins.rest.customthali.domain;

import java.util.List;

import com.justtiffins.rest.commons.domain.Item;

/**
 * @author Admin
 *
 */
public class Category {
	
	private String catNumber;
	private String name;
	private String description;
	private List<Item> items;
	
	/**
	 * @return the catNumber
	 */
	public String getCatNumber() {
		return catNumber;
	}
	/**
	 * @param catNumber the catNumber to set
	 */
	public void setCatNumber(String catNumber) {
		this.catNumber = catNumber;
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
	/**
	 * @return the items
	 */
	public List<Item> getItems() {
		return items;
	}
	/**
	 * @param items the items to set
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}

}
