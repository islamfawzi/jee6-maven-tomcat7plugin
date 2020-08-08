package com.spring;

import javax.ws.rs.GET;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

	@RequestMapping(method = RequestMethod.GET, value = "/")
	@ResponseBody
	public String welcome() {
		return "Welocme";
	}
}
