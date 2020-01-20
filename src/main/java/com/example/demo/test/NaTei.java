package com.example.demo.test;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component("NaTei")
public class NaTei implements Coffee, InitializingBean {
    @Override
    public String getName() {
        return "拿铁";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("-------------------------init-----------------------------");
        CoffeeFactory.registerCoffee(2,new NaTei());
    }
}
