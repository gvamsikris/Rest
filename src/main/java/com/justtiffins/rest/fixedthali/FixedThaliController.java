package com.justtiffins.rest.fixedthali;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Admin
 *
 */
@RestController
public class FixedThaliController {
	
	@Autowired
	private FixedThaliRepository<FixedThali> fixedThaliRepository;
	
	@RequestMapping(value="/rest/fixedThalis")
	public Iterable<FixedThali> getMerThali(HttpServletRequest request) {
		try {
			return fixedThaliRepository.findAll();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
