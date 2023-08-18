package com.fquery.horceracing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fquery.horceracing.entity.User;
import com.fquery.horceracing.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService theUserService) {
        userService= theUserService;
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {
        User theUser = new User(null, null, null);
        theModel.addAttribute("user", theUser);

        return "users/showFormForAdd";
    }

    @PostMapping("/save")
    public String saveUser(@ModelAttribute("user") User theUser) {

        userService.save(theUser);
        return "showFormForAdd";
    }

    
}
