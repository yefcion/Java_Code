package com.company;

public class Zoo {
    public static void main(String[] args) {
        // 基本数据类型的声明：数据类型 变量名=初始化值
        int i = 10;
        // 类的实例化：如下a1就是一个实实在在的对象
        Animal a1 = new Animal();
        // 通过对象调用属性
        a1.name = "花花";
        a1.age = 3;
        System.out.println("name:" + a1.name + " age:" + a1.age);
        // 通过对象调用方法
        a1.eat();
        a1.sleep();

        // 再创建一个类的对象
        Animal a2 = new Animal();
        System.out.println("name:" + a2.name + " age:" + a2.age);
        // 这种赋值方式，两者实际上是一样的
        Animal a3 = a1;
        System.out.println("name:" + a3.name + " age:" + a3.age);
        a3.name = "维尼熊";
        System.out.println("a1.name:" + a1.name + " a1.age:" + a1.age);
    }
}

class Animal {
    //1.属性
    String name;
    int age;

    // 2.方法
    public void eat() {
        System.out.println("动物进食");
    }

    public void sleep() {
        System.out.println("动物睡觉");
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}