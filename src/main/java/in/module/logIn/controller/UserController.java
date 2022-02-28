package in.module.logIn.controller;

import in.module.logIn.entity.User;
import in.module.logIn.exception.UserAlreadyRegistered;
import in.module.logIn.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;
    Logger log= LoggerFactory.getLogger(UserController.class);

    @PostMapping("/signup")
    public User register(@RequestBody User user){
        log.info("Register Yourself");
        return userService.register(user);

    }
    @PostMapping("/login")
    public String logIn(@RequestBody User user){
        log.info("Log-in to your account");
        return userService.logIn(user);

    }



}
