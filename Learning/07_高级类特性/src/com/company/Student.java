package com.company;

public class Student extends Person {
    //    private String name;
//    private int age;
//
    private String schoolName;
    private int id = 10708;             // 学号

    public Student() {
        super();
    }

    public Student(String schoolName) {
//        this.name = name;
//        this.age = age;
        super("李雷",23);
        this.schoolName = schoolName;
    }

    //    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void eat() {
//        System.out.println("吃饭");
//    }
//
//    public void wall() {
//        System.out.println("走路");
//    }

    public void info() {
        System.out.println("I am a Student");
        System.out.println("Pname: "+super.getName());
        System.out.println("Sname: "+schoolName);

        System.out.println("学号是：" + this.id);
        System.out.println("身份证号是：" + super.id);
    }

}
