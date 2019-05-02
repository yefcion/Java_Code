package com.company;
/* 一、面向对象的特征一：封装与隐藏
 *  1.当创建了类的对象后，如果直接通过“对象.属性”的方式对相应的对象属性复制的话，可能会出现
 * 不满足实际情况的意外，我们不考虑让对象来直接作用属性，而是通过“对象.方法”的形式，来控制
 * 对象对属性的访问。实际情况中，对属性的要求就可以通过方法来体现。
 *
 * 解决的方法：（封装的思想）
 *  ①将类的属性私有化
 *  ②提供公用的方法（setter & getter）来实现调用
 *
 * 二、权限修饰符：public private protected 缺省
 *  可以用于修饰属性、方法
 *      注：1）权限从大到小：public protected 缺省 private
 *          2）修饰类的权限：public 缺省
 * */

/* 类的成员之三：构造器（constructor 构造方法）   类的成员（属性、方法、构造器）
 * 构造器作用：String、Mcu等等
 *      ①创建对象
 *      ②给创建地对象赋值
 *
 * 1.设计类时，若未显式声明类的构造器，则程序会默认提供一个空参的构造器
 * 2.一旦显式地定义类的构造器，那么默认的构造器就不再提供
 * 3.如何声明类的构造器。格式：权限修饰符 与类同名（形参）{ }
 * 4.类地多个构造器之间构成重载
 * */
public class Mcu {
    public static void main(String[] args) {
        // 基本数据类型的声明：数据类型 变量名=初始化值
        int i = 10;
        // 类的实例化：如下Witch就是一个实实在在的对象
        Marvel Witch = new Marvel();                //创建一个对象，new一个构造器
        // 通过对象调用属性，当属性允许访问时该方法可以，若被私有化，则不行
//        Witch.name = "花花";
//        Witch.power = 4;
//        Witch.info();
        // 通过对象调用方法
        Witch.setName("Witch");
        Witch.setOriName("Olsen");
        Witch.setPower(5);
        System.out.println("Power:" + Witch.getPower());
        Witch.info();
    }
}

/*
创建程序，在其中定义两个类：Marvel和Mcu类。定义如下：
用setPower()设置英雄的能力等级（0~5），用getPower()返回英雄的能力
在Mcu类中实例化Mavel类的对象Witch，调用setPower()和getPower()方法，体会Java的封装性
*/

class Marvel {
    //1.属性
    // private 修饰的属性，只能在本类中被调用，出了类之后就不能调用了
    public String name;             // public       任何地方
                                    // protected    子类
    int power;                      // 缺省          同一个包
    private String oriName;         // private      类内部

    // 构造器-此处时把默认的空参构造器显式地表现出来
    public void Marvel(){
        power = 3;                  // 给他设置一个默认的power值
    }
    // 2.方法
    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }

    public void info() {
        System.out.println("Name:" + name + "\tPower:" + power);
    }

    // 设置类的属性
    public void setName(String n) {
        name = n;
    }

    public void setOriName(String n) {
        oriName = n;
    }

    public void setPower(int l) {
        if (l > 0 && l < 6) {
            power = l;
        } else {
//            System.out.println("输入数据有误！");
            throw new RuntimeException("输入的等级有误");  // 手动抛一个异常，终止程序
        }
    }

    // 获取类的属性
    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }
}