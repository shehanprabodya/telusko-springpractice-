package com.shehan.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component//this tell this class  to recognize the class that need to create an object in a container
public class Dev {

    //@Autowired //connect laptop object-Field injection
    //private Laptop laptop;//instance variable

    @Autowired
    @Qualifier("laptop")

    private Computor comp;
//    public Dev(Laptop laptop) {// constructor injection

//        this.laptop = laptop;
//    }

//    @Autowired
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public void build(){

       // laptop.compile();
        comp.compile();
        System.out.println("build");
    }
}
