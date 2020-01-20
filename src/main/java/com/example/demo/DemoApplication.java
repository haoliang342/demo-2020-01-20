package com.example.demo;

import com.example.demo.ApplicationContextUtilDemo.ApplicationContextUtil;
import com.example.demo.TestReflection.TestReflection;
import com.example.demo.test.Coffee;
import com.example.demo.test.CoffeeFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

		Coffee coffee = CoffeeFactory.getCoffee(1);

		System.out.println(coffee.getName());

		Coffee coffee1 = CoffeeFactory.getCoffee(2);

		System.out.println(coffee1.getName());

		Coffee natei = ApplicationContextUtil.getBean("NaTei");
		Coffee lafei = ApplicationContextUtil.getBean("LaFei");
		System.out.println(natei.getName());
		System.out.println(lafei.getName());

		TestReflection testReflection = new TestReflection();
		testReflection.testRefleciton();
		testReflection.testReflection1();

	}
}
