package fit.fancyday.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class Login {
    @GetMapping("/auth")
    public String login(){
        return "登录成功~~~sixth";
    }
}
