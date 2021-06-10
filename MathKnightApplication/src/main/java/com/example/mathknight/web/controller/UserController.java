package com.example.mathknight.web.controller;

import com.example.mathknight.domain.service.UserService;
import com.example.mathknight.web.form.UserRegistrationForm;
import com.example.mathknight.web.form.UserRegistrationFormValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRegistrationFormValidator userRegistrationForm;

    @InitBinder("userForm")
    private void initBinder(WebDataBinder binder) {
        binder.addValidators((Validator) userRegistrationForm);
    }

    @GetMapping("/user/registration")
    public ModelAndView registration(ModelAndView model) {
        model.addObject("userForm", new UserRegistrationForm());
        model.setViewName("/user/registration");

        return model;
    }

    @PostMapping("/user/registration")
    public ModelAndView registrationPost(ModelAndView model,
                                         @Valid @ModelAttribute("userForm") UserRegistrationForm userForm,
                                         BindingResult result) {

        if(result.hasErrors()) {
            model.addObject("userForm", userForm);
            model.setViewName("/user/registration");
        } else {
            System.out.println(model);
            model.setViewName("redirect:/");
        }

        return model;
    }

}
