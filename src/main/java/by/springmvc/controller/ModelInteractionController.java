package by.springmvc.controller;

import by.springmvc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Random;

@Controller
@SessionAttributes("sessionTest")
public class ModelInteractionController {
@ModelAttribute
    public void prepopulateUser(Model model){
        model.addAttribute("defaultUser",new User("def","user"));
    }
    @ModelAttribute("defaultUser2")
    public User prepopulateUser2(){
      return new User("def","user");
    }

    @GetMapping("/model")
    public String showModelPage(Model model){
        model.addAttribute("randomNumber",new Random().nextInt());
        model.addAttribute("sessionTest","TEXT test session");

        return "model";
    }
    @GetMapping("/secondModel")
    public String showModelPage2(Model model){
        model.addAttribute("randomNumber",new Random().nextInt());
        System.out.println(model.containsAttribute("sessionTest"));
        return "model";
    }
}
