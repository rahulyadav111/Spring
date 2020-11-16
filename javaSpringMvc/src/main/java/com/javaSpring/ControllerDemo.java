package com.javaSpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
public class ControllerDemo
{
	
	@RequestMapping("/hello")
	public String view()
	{
		return "welcome";
		
	}

}
