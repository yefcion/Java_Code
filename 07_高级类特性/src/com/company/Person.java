package com.company;

public class Person {
    private String name;
    private int age;
    int id = 320324;         // 身份证号码

    public Person(){
        this.name = "kris";
        this.age = 15;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("吃饭");
    }

    public void wall() {
        System.out.println("走路");
    }
}
