package com.example.mathknight.web.form;

import com.example.mathknight.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class UserRegistrationFormValidator implements Validator {

    @Autowired
    private UserService userService;

    @Override
    public boolean supports(Class<?> aClass) {
        return UserRegistrationForm.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        UserRegistrationForm form = (UserRegistrationForm)o;

        System.out.println("validation");
        if (userService.isUserWithEmailExist(form.getEmail())) {
            errors.rejectValue("email", "", "User with email already registered");
        }


    }
}
