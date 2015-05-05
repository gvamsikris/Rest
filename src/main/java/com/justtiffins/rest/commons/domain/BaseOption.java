/**
 * 
 */
package com.justtiffins.rest.commons.domain;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author vgajula
 *
 */
public class BaseOption implements Option {
	
	private String optionNumber;
	private String name;
	private String description;
	private BigDecimal price;
	private Integer quantity;
	private List<Item> items;
	
	/**
	 * Default Constructor.
	 */
	public BaseOption() {
	}
	
	/**
	 * Constructor with all fields.
	 * @param optionNumber
	 * @param name
	 * @param description
	 * @param price
	 * @param quantity
	 * @param items
	 */
	public BaseOption(String optionNumber, String name, String description,
			BigDecimal price, Integer quantity, List<Item> items) {
		super();
		this.optionNumber = optionNumber;
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.items = items;
	}




	/**
	 * @return the optionNumber
	 */
	public String getOptionNumber() {
		return optionNumber;
	}
	/**
	 * @param optionNumber the optionNumber to set
	 */
	public void setOptionNumber(String optionNumber) {
		this.optionNumber = optionNumber;
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
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	/**
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
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
