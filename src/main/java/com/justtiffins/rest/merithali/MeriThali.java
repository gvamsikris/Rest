/**
 * 
 */
package com.justtiffins.rest.merithali;

import java.util.Map;

import com.justtiffins.rest.commons.domain.BaseOption;
import com.justtiffins.rest.commons.domain.CustomOption;
import com.justtiffins.rest.commons.domain.ValidationRules;

/**
 * @author vgajula
 *
 */
public class MeriThali extends BaseOption implements CustomOption {
	
	private Map<String, Object> variantModel;
	
	/**
	 * @return the variantModel
	 */
	public Map<String, Object> getVariantModel() {
		return variantModel;
	}



	/**
	 * @param variantModel the variantModel to set
	 */
	public void setVariantModel(Map<String, Object> variantModel) {
		this.variantModel = variantModel;
	}



	@Override
	public ValidationRules getValidationRules() {
		// TODO Auto-generated method stub
		return null;
	}

}
