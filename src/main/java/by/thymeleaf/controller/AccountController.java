package by.thymeleaf.controller;

import by.thymeleaf.entity.Account;
import by.thymeleaf.entity.AccountType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;

@Controller
public class AccountController {
    @ModelAttribute("allAccountTypes")
    public AccountType[] allAccountTypes(){
        return  AccountType.values();
    }

    @GetMapping("/account")
    public String showAccountPage(Model model) {

        model.addAttribute("message", "Hello dima");
        Account account = new Account();
        account.setNumber(31232);
        account.setTypes(Arrays.asList(AccountType.BILLING,AccountType.CREDIT));

        model.addAttribute("account", account);
        return "account";
    }
    @PostMapping("/account")
    public String saveAccount(Account account){
        System.out.println(account);
        return     "account";
    }
}
