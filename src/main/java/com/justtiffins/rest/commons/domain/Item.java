package com.justtiffins.rest.commons.domain;

import java.math.BigDecimal;

/**
 * This particular item is used as purely for defining cost of the option.
 * 
 * @author vgajula
 *
 */
public interface Item {
	
	/**
	 * Number to be used across systems.
	 * @return {@link String}
	 */
	String getItemNumber();
	
	/**
	 * Name of the Item.
	 * @return {@link String}
	 */
	String getName();
	
	/**
	 * Description of the Item.
	 * @return {@link String}
	 */
	String getDescription();

	/**
	 * Cost of the item.
	 * @return {@link BigDecimal}
	 */
	BigDecimal getCostPrice();
	
	/**
	 * Number of item part of the order.
	 * @return {@link Integer}
	 */
	Integer getQauntity();
	
	/**
	 * Type of the item.
	 * @return {@link String}
	 */
	String getType();
	
	

}
