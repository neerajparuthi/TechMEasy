package com.techm.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.techm.entity.Employee;

@Controller
public class EmployeeRegistrationController {

	
@RequestMapping(value="/newRegistration", method=RequestMethod.GET)
public ModelAndView getEmployeeRegistrationPage(){
	
	ModelAndView  mv =new ModelAndView("newEmployee");
	mv.addObject("msg", "Employee Registration Form");
	return mv;
}

@RequestMapping(value="/empRegisterSuccess", method=RequestMethod.POST)
public ModelAndView getRegistrationSuccessPage(@Valid @ModelAttribute("employee") Employee emp1, BindingResult result){
	
	if(result.hasErrors()){
		
		ModelAndView mv=new ModelAndView("newEmployee");
		return mv;
	}
	
	ModelAndView mv=new ModelAndView("newEmpRegisterSuccess");
	
	return mv;
}
	
}
