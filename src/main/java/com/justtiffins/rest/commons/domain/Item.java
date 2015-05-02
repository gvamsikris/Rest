package com.justtiffins.rest.commons.domain;


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
	
}
