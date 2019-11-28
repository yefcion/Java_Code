package com.company;

public class Worker extends Person {
    public Worker() {

    }

    public Worker(String name, int age) {
//        this.name = name;
//        this.age = age;
        this.setName(name);
        this.setAge(age);
    }

    public void info(){
        System.out.println("I am a Worker");
    }
}
