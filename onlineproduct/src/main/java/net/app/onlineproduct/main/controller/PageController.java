package net.app.onlineproduct.main.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class PageController {

	@RequestMapping(value = {"/","/index","/home"})
	public ModelAndView index()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", "Welcome to springBoot Web Mvc");
		
		return mv;
			
	}
	
	/*
	 * .................testing of @RequestParam and @PAthVAriable........
	 * 
	 * 
	 * @RequestMapping("/requestparamtest") public ModelAndView
	 * testRequestParam(@RequestParam("greeting")String greeting) { ModelAndView mv
	 * = new ModelAndView("page"); mv.addObject("greeting", greeting);
	 * 
	 * return mv;
	 * 
	 * }
	 * 
	 * 
	 * @RequestMapping("/pathvariabletest/{greeting}") public ModelAndView
	 * testPathVariable(@PathVariable("greeting")String greeting) { ModelAndView mv
	 * = new ModelAndView("page"); mv.addObject("greeting", greeting);
	 * 
	 * return mv;
	 * 
	 * }
	 */
}
