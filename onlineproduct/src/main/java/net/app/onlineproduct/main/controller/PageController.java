package net.app.onlineproduct.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import net.app.onlineproductbackend.dao.CategoryDao;
import net.app.onlineproductbackend.dto.Category;

@RestController
public class PageController {

	@Autowired
	CategoryDao categoryDao;
	
	@RequestMapping(value = {"/","/index","/home"})
	public ModelAndView index()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("categories", categoryDao.list());
		mv.addObject("userClickHome", true);
		mv.addObject("title", "Home");
		
		return mv;
			
	}
	
	@RequestMapping(value = "/about")
	public ModelAndView aboutUs()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClickAbout", true);
		mv.addObject("title", "About Us");
		
		return mv;
			
	}
	
	@RequestMapping(value = "/contact")
	public ModelAndView contactUs()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClickContact", true);
		mv.addObject("title", "Contact Us");
		
		return mv;
			
	}
	
	/*
	 * 
	 * Methods to load allproducts and product by their category
	 */
	@RequestMapping(value = "/show/all/products")
	public ModelAndView showAllProducts()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("categories", categoryDao.list());
		mv.addObject("userClickShowAllProducts", true);
		mv.addObject("title", "All Products");
		
		return mv;
			
	}
	@RequestMapping(value = "/show/category/{id}/product")
	public ModelAndView showCategoryProduct(@PathVariable("id") int id)
	{
		ModelAndView mv = new ModelAndView("page");
		
		Category category = null;
		category = categoryDao.get(id);
		
		mv.addObject("category", category);
		
		mv.addObject("categories", categoryDao.list());
		mv.addObject("userClickShowCategoryProduct", true);
		mv.addObject("title", category.getName());
		
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
