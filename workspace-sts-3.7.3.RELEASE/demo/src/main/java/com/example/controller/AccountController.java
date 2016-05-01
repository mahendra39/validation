package com.example.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.Account;

@Controller
@RequestMapping("account")
public class AccountController {
	@RequestMapping(value="register", method=RequestMethod.GET)
	public String register(ModelMap modelMap)
	{
		modelMap.put("account",new Account());
		return "account/register";
	}
	
	@RequestMapping(value="register", method=RequestMethod.POST)
	public String register(@ModelAttribute("account")@Valid Account account,BindingResult bindingResult,
			ModelMap modelMap)
	{
		if(bindingResult.hasErrors()){
			modelMap.put("account",account);
			//System.out.println(account);
			return "account/register";
		}else {
			modelMap.put("account",account);
			System.out.println(account);
			return "account/success";
		}
	}
	
	

}
