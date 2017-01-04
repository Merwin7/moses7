package com.niit.shopfront.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HomeController {
	@RequestMapping("/registerhere")
	public String register1(Model m)
	{
		m.addAttribute("registerMessage","successfuly registered");
		return "index";
	}
	@RequestMapping("/")
	public String gotohome(Model model)
	{
		model.addAttribute("home","true");
		return "index";
	}
	
	@RequestMapping("/validate")
	public String validate(@RequestParam("userid")String id,@RequestParam("password") String pwd,Model model)
	{
		if(id.equals("niit") && pwd.equals("niit"))
		{
			model.addAttribute("SuccessMessage","Login Successful");
		}
		else
		{
			model.addAttribute("ErrorMessage","Invalid Credentials");
		}
		return "index";
	}
	
	@RequestMapping("/login")
	public String login( Model model)
	{
		model.addAttribute("userClickedLogin","true");
		return "login";
	}
	@RequestMapping("/4k")
	public String moreinfo( Model model)
	{
		model.addAttribute("userClicked4k","true");
		return "4k";
	}

	@RequestMapping("/3d")
	public String moreinfo1( Model model)
	{
		model.addAttribute("userClicked3d","true");
		return "3d";
	}
	@RequestMapping("/led")
	public String moreinfos( Model model)
	{
		model.addAttribute("userClickedled","true");
		return "led";
	}
	
	@RequestMapping("/register")
	public String register( Model model)
	{
		model.addAttribute("userClickedRegister","true");
		return "register";
	}
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		model.addAttribute("home","true");
		return "index";
	}
	@RequestMapping("/aboutus")
	public String about( Model model)
	{
		model.addAttribute("aboutus","true");
		return "aboutus";
	}
	@RequestMapping("/contactus")
	public String contact( Model model)
	{
		model.addAttribute("contactus","true");
		return "contactus";
	}
	@RequestMapping("/terms")
	public String terms( Model model)
	{
		model.addAttribute("terms","true");
		return "terms";
	}
	
}
