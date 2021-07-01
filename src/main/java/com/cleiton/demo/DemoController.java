package com.kb.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(path = "/api")
    public String getResp(){
        return  "This is a vaidate API by cognito User Pool!";
    }

}
