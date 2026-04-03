package com.shehan.demo;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component//this tell this class  to recognize the class that need to create a object in a container
public class Dev {

    public void build(){
        System.out.println("build");
    }
}
