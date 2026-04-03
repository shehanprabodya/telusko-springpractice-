package com.shehan.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computor {

    @Override
    public void compile(){
        System.out.println("compile faster");
    }
}
