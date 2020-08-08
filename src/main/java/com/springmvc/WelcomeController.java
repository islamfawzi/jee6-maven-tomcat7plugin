package com.springmvc;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

	private Logger logger = Logger.getLogger(this.getClass());

	@RequestMapping(method = RequestMethod.GET, value = "/")
//	@ResponseBody

//	@RequestParam(name="name") String name
//	@RequestParam(defaultValue="defaultValue") String name
//	@RequestParam Map<String,String> allParams  // ?id=1&name=islam
//	@RequestParam List<String> ids    // ?ids=1,2,3,4
	public String welcome(@RequestParam(required=false) String name, ModelMap model) {
		logger.info("name: " + name);
		model.put("name", name);
		return "welcome";
	}
}
