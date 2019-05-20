package com.cg.demomvcjavaconfig.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.demomvcjavaconfig.dto.Product;
import com.cg.demomvcjavaconfig.service.ProductService;


@Controller
public class MyController {

	@Autowired
	ProductService productService;
	
	@GetMapping("login")
	public String loginPage()
	{
		return "mylogin";
	}
	
	
	

	 @PostMapping("checkLogin")
     public String doLogin(@RequestParam("uname") String user,@RequestParam("upass") String pass) {
		// System.out.println("check login");
		 if(user.equals("admin") && pass.equals("123")) {
			 return "listpage";
		 }else {
			 return "error";
		 }
		// return null;
	 }
	 
	 @GetMapping("addpage")
	 public ModelAndView getAddproduct(@ModelAttribute("prod") Product pro) {
		 List<String> listOfCategory=new ArrayList<>();
		 listOfCategory.add("Electronics");
		 listOfCategory.add("Book");
		 listOfCategory.add("Cosmetics");
		// map.put("cato",listOfCategory);,Map<String,Object> map
		 return new ModelAndView("addproduct", "cato", listOfCategory);
	 }
	 
	 @GetMapping("showpage")
	 public ModelAndView showProduct() {
		 List<Product> myProducts = productService.showProduct();
		 return new ModelAndView("showAll", "showproduct", myProducts);
	 }
	 
	 
	 @PostMapping("addproduct")
	 public ModelAndView addproduct(@ModelAttribute("prod") Product pro) {
//		 System.out.println(pro);
		Product product= productService.addProduct(pro);
		 return new ModelAndView("success","key",product);
	 }
	
}
