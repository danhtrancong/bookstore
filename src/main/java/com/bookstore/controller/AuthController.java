package com.bookstore.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bookstore.dto.UserDTO;
import com.bookstore.service.UserService;

@Controller
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	UserService userService;

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
		model.addAttribute("user", new UserDTO());
		return "registerPage";
	}


	@RequestMapping(value = { "/register" }, method = RequestMethod.POST)
	public String createUser(Model model, @ModelAttribute("user") UserDTO userDTO) {

		String returnPage = "registerPage";
		Map<String, String> errorMessages = validate(userDTO);
		if (errorMessages.isEmpty()) {
			String savedUser = userService.createUser(userDTO);
			if (savedUser != "" && savedUser != null) {
				model.addAttribute("result", savedUser);
				returnPage = "redirect:/auth/login";
			} else {
				errorMessages.put("execptionalMessage", "Unable to register a new user");
				model.addAttribute("errors", errorMessages);
			}
		} else {
			model.addAttribute("errors", errorMessages);
		}

		return returnPage;
	}

	@RequestMapping(value = { "/access-denied" }, method = RequestMethod.GET)
	public String showAccessDeniedView(Model model) {
		return "accessdeniedPage";
	}

	private Map<String, String> validate(UserDTO userDTO) {
		Map<String, String> errorMessages = new HashMap<String, String>();
		if (userDTO.getEmail().isEmpty()) {
			errorMessages.put("email", "Please type email");
		}
		if (userDTO.getFullName().isEmpty()) {
			errorMessages.put("fullName", "Please type Name");
		}
		if (userDTO.getPhonNumber().isEmpty()) {
			errorMessages.put("phoneNumber", "Please type Phone Number");
		}
		if (userDTO.getPassword().isEmpty()) {
			errorMessages.put("password", "Please type Password");
		}
		if (!userDTO.getPassword().equals(userDTO.getConfirmPassword())) {
			errorMessages.put("confirmPassword", "Confirm Password doesn't match");
		}
		if (userDTO.getConfirmPassword().isEmpty()) {
			errorMessages.put("confirmPassword", "Please type Confirm Password");
		}
		return errorMessages;
	}
}
