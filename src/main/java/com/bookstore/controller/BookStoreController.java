package com.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class BookStoreController {

	@RequestMapping(value = { "/home" }, method = RequestMethod.GET)
	public String homePage(Model model) {
		return "homePage";
	}

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
}
