/**
 * 
 */
package com.justtiffins.rest.customthali.domain;

import java.math.BigDecimal;
import java.util.List;

import com.justtiffins.rest.commons.domain.BaseOption;
import com.justtiffins.rest.commons.domain.CustomOption;
import com.justtiffins.rest.commons.domain.Item;
import com.justtiffins.rest.commons.domain.ValidationRules;

/**
 * @author vgajula
 *
 */
public class CustomThali extends BaseOption implements CustomOption {
	
	private VariantModel variantModel;
	
	/**
	 * Default Constructor.
	 */
	public CustomThali () {
		
	}
	
	
	
	/**
	 * Constructor with all fields.
	 * @param optionNumber
	 * @param name
	 * @param description
	 * @param price
	 * @param quantity
	 * @param items
	 * @param variantModel
	 */
	public CustomThali(String optionNumber, String name, String description,
			BigDecimal price, Integer quantity, List<Item> items,
			VariantModel variantModel) {
		super(optionNumber, name, description, price, quantity, items);
		this.variantModel = variantModel;
	}
	
	/**
	 * Constructor for super class.
	 * @param optionNumber
	 * @param name
	 * @param description
	 * @param price
	 * @param quantity
	 * @param items
	 */
	public CustomThali(String optionNumber, String name, String description,
			BigDecimal price, Integer quantity, List<Item> items) {
		super(optionNumber, name, description, price, quantity, items);
		this.variantModel = null;
	}

	/**
	 * @return the variantModel
	 */
	public VariantModel getVariantModel() {
		return variantModel;
	}



	/**
	 * @param variantModel the variantModel to set
	 */
	public void setVariantModel(VariantModel variantModel) {
		this.variantModel = variantModel;
	}



	@Override
	public ValidationRules getValidationRules() {
		return null;
	}

}
