package by.springmvc.controller;

import by.springmvc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationController {
    @PostMapping("/register")
    public String register(@RequestParam("firstName") String firstName,
                           @RequestParam("lastName") String lastName,
                           User user){
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(user);
        return "redirect:/register";
    }
    @GetMapping("/register")
    public String showRegisterPage(){

        return "registration";
    }

}
