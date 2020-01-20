package com.example.demo.test;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component("LaFei")
public class LaFei implements Coffee, InitializingBean {
    @Override
    public String getName() {
        return "拉菲";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("-------------------------init-----------------------------");
        CoffeeFactory.registerCoffee(1,new LaFei());
    }
}
