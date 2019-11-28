package com.company;

// 测试类
public class Practice {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.info();
        s1.addAge();
        s1.info();
        s1.study();

        Circle c1 = new Circle();
        c1.setRadius(9);
        c1.getArea();
        c1.radius = 4.5;            // 等同于setRadius
        c1.getArea();
    }
}

//类，是抽象的
class Person {
    // 1.属性
    String name;
    int age;
    boolean sex;

    // 2.方法
    public void eat() {
        System.out.println("人吃饭");
    }

    public void sleep() {
        System.out.println("人睡觉");
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void info() {
//        eat();
//        sleep();
        System.out.println("name:" + name + "\tage:" + age + "\tsex:" + sex);
    }

    public void setAge(int n) {
        age = n;
    }

    public int getAge() {
        System.out.println("age:" + age);
        return age;
        // 其后不可以声明语句
    }

    // 当通过对象调用此方法时，会将方法的返回值提供给方法的调用者，即当前对象
    public String desc() {
        if (age > 18) {
            return "恰同学少年";
        } else {
            return "你还小";
        }
    }
}

/*要求：
 * （1）创建Student类的对象，设置该对象的name、age和sex属性，调用study方法，
 *       输出字符串“studying”，调用showAge（）方法显示age值，
 *       调用addAge（）方法给对象的age属性值增加2岁。
 * （2）创建第二个对象.执行上述操作，体会同一个类的不同对象之间的关系。
 */
class Student {
    String name;
    int age = 0;
    boolean sex;

    public void study() {
        System.out.println("studying");
    }

    public void showAge() {
        System.out.println("age:" + age);
    }

    public void addAge() {
        age += 2;
    }

    public void info() {
        System.out.println("name:" + name + "\tsex:" + sex + "\tage:" + age);
    }
}

// 利用面向对象的编程思想，设计类 Circle 计算圆的面积
class Circle {
    double radius = 1.0;

    // 提供方法，用于获取圆的面积
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }
}

class PassObject {
    public void printAreas(Circle c, int time) {
        System.out.println("Radius\t\tArea");
//        for (int i = 1; i <= time; i++) {
//            c.setRadius(i);
//            System.out.println(c.radius + "\t\t" + c.getArea());
//        }
        int i=1;
        while (i<=time){
            c.setRadius(i);
            System.out.println(c.radius + "\t\t" + c.getArea());
            i++;
        }
        c.setRadius(i);
    }
}

