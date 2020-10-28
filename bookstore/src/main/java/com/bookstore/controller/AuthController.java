package com.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class AuthController {

	@RequestMapping(value = { "/login" }, method = RequestMethod.GET)
	public String loginPage(Model model) {
		return "loginPage";
	}
}
