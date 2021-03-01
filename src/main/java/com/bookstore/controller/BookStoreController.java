package com.bookstore.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookStoreController {

//	@RequestMapping(value = { "/home" }, method = RequestMethod.GET)
//	public String homePage(Model model) {
//		Authentication myUser = SecurityContextHolder.getContext().getAuthentication();
//		String userEmail = myUser.getName();
//		if (userEmail != null && !(userEmail.equals("anonymousUser"))) {
//			model.addAttribute("email", userEmail);
//		}
//		return "homePage";
//	}

	@RequestMapping(value = { "/contactus" }, method = RequestMethod.GET)
	public String contactusPage(Model model) {

		model.addAttribute("address", "Vietnam");
		model.addAttribute("phone", "09888888");
		model.addAttribute("email", "test@gmail.com");

		return "contactusPage";
	}

	@RequestMapping(value = { "/edit" }, method = RequestMethod.GET)
	public String showEditProductView(Model model) {
		return "editPage";
	}


    @RequestMapping(value = { "/home" }, method = RequestMethod.GET)
    public String getCategories(Model model){
        List<String> categories = new ArrayList<>();
        categories.add("Java");
        categories.add("C++");
        categories.add("Comic");
        categories.add("Novel");
        model.addAttribute("categories", categories);
        return "homePage";
    }

}
