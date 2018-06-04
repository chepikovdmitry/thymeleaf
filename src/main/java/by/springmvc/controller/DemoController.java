package by.springmvc.controller;

import by.springmvc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@Controller
public class DemoController {

    @GetMapping(path = "/demo")
    public String showDemoPage(Model model,@RequestHeader("Accept-Encoding") String encoding){
        System.out.println(encoding);
        User user = new User("fda", "dfd");
        model.addAttribute("currentUser",user);
        return "demo";
    }


}
