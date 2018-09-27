package io.cyanpz.userservice.controller;

import io.cyanpz.userservice.api.GreetApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CPZ
 * @date 18-9-26 下午11:03
 **/
@RestController
public class UserController {

    @Autowired
    private GreetApi greetApi;


    @GetMapping("/login")
    public String login(String name){

        String greet = greetApi.greet(name);

        return "Login Success,"+greet;
    }


}
