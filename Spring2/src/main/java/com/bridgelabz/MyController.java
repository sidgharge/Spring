package com.bridgelabz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/welcome")
	public ModelAndView sendMessage(){
		ModelAndView modelAndView = new ModelAndView("hello");
		modelAndView.addObject("msg" , "Hello By Annotation");
		return modelAndView;
	}
}
