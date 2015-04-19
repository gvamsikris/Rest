package com.justtiffins.rest.commons.domain;

import java.math.BigDecimal;
import java.util.List;

/**
 * It defines option which a user can choose to order.
 * It can be seen as ordered item, and will be part of the bill.
 * @author vgajula
 *
 */
public interface Option {
	
	/**
	 * Number which will be used to identify across systems.
	 * @return
	 */
	String getOptionNumber();
	
	/**
	 * Name of the option.
	 * @return
	 */
	String getName();
	
	/**
	 * Description of the option.
	 * @return
	 */
	String getDescription();
	
	/**
	 * Get selling price for the price item.
	 * @return Price in Bigdecimal
	 */
	BigDecimal getPrice();
	
	
	/**
	 * Number of Items.
	 * @return Quantity as Integer
	 */
	Integer getQuantity();
	
	
	/**
	 * List of cost items attached for this particular price Item.
	 * @return {@link List} of {@link Item}
	 */
	List<Item> getItems();

}
