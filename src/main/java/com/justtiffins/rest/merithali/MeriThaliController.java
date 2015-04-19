/**
 * 
 */
package com.justtiffins.rest.merithali;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author vgajula
 *
 */
@Controller
public class MeriThaliController {
	
	public @ResponseBody MeriThali getMerThali(HttpServletRequest request) {
		return new MeriThali();
	}
	
	public void addMeriThaliToCart(@RequestBody MeriThali meriThali, @PathVariable String phoneId) {
		
	}
}
