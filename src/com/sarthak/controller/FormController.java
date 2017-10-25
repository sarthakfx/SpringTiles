package com.sarthak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sarthak.form.Form;

@Controller
public class FormController {

	@RequestMapping(value = "/addContact", method = RequestMethod.POST)  
    public String addContact(@ModelAttribute("contact") Form contact, BindingResult result) {  
        //write the code here to add details
        return "redirect:contact.html";  
    }  
      
    @RequestMapping("/contact")  
    public ModelAndView showContacts() {  
        return new ModelAndView("contact", "command", new Form());  
    }  
}
