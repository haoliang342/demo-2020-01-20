package com.example.demo.TestReflection;

/**
 * 实体类123123123
 */
public class Animal {
    private String name;
    private int age;
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Animal : name = " + name + " age = " + age;
    }
}
