package com.bookstore.validator;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.bookstore.dto.UserDTO;

@Service("UserValidator")
public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return UserDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "valid.email");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "fullName", "valid.fullName");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "phonNumber", "valid.phonNumber");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "valid.password");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPassword", "valid.confirmPassword");

	}

}
