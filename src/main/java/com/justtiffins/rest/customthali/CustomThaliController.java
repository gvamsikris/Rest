/**
 * 
 */
package com.justtiffins.rest.customthali;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.justtiffins.rest.customthali.domain.CustomThali;

/**
 * @author vgajula
 *
 */
@RestController
public class CustomThaliController {
	
	@Autowired
	private CustomThaliRepository<CustomThali> meriThaliRepository;
	
	@RequestMapping(value="/rest/merithali")
	public Iterable<CustomThali> getMerThali(HttpServletRequest request) {
		try {
			return meriThaliRepository.findAll();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public void addMeriThaliToCart(@RequestBody CustomThali meriThali, @PathVariable String phoneId) {
		
	}
	
	public String getTest() {
		return "Successful";
	}
}
