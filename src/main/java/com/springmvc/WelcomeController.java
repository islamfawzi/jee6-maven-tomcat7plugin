package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

	@RequestMapping(method = RequestMethod.GET, value = "/")
//	@ResponseBody
	public String welcome(@RequestParam String name, ModelMap model) {
		model.put("name", name);
		return "welcome";
	}
}
