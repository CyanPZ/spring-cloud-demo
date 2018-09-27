package io.cyanpz.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CPZ
 * @date 18-9-25 下午10:44
 **/
@RestController
public class GreetController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/greet")
    public String greet(String name){

        if(StringUtils.isEmpty(name)){
            return "Hello from greet-service on "+serverPort;
        }

        return "Hello "+name+", from greet-service on "+serverPort;
    }

}
