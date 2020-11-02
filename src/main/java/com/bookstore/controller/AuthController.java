package com.bookstore.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/auth")
public class AuthController {

	@RequestMapping(value = { "/login" }, method = RequestMethod.GET)
	public String showLoginView(Model model) {
		return "loginPage";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			// new SecurityContextLogoutHandler().logout(request, response, auth);
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "redirect:/login?logout";
	}

	@RequestMapping(value = { "/register" }, method = RequestMethod.GET)
	public String registerPage(Model model) {
		return "registerPage";
	}

	@RequestMapping(value = { "/access-denied" }, method = RequestMethod.GET)
	public String showAccessDeniedView(Model model) {
		return "accessdeniedPage";
	}
}
