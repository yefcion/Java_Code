package com.company;

import java.util.Scanner;

/*
 *  1.面向对象的编程关注于类的设计
 *  2.设计类实际上就是设计类的成员
 *  3.基本类的成员：属性（成员变量/Field）& 方法（Method）
 */

/*
 *  一、面向对象思想的落地法则：
 *  1.设计类，并设计类的成员被（成员变量&成员方法）
 *  2.通过类，来创建类的对象（也称类的实例化）
 *  3.通过“对象.属性”或“对象.方法”来调用，完成相应功能
 *  二、创建的多个对象，彼此各自拥有一套类的属性，当对其中一个对象属性进行修改时
 *  不会影响其他对象的属性值
 *
 *  三、类的属性（成员变量）
 *  成员变量 VS 局部变量
 *  相同点：
 *      1.遵循变量声明得格式：数据类型 变量名 = 初始化值
 *      2.都用作用域
 *  不同点：
 *      1.声明的位置不同
 *          成员变量：声明在类内，方法外
 *          局部变量：声明在方法内，方法的形参部分，代码块内
 *      2.修饰符
 *          成员变量：public private protected 缺省
 *          局部变量：没有修饰符，与所在的方法修饰符相同
 *      3.初始化值：一定会有初始化值
 *          成员变量：如果在声明的时候，不是显式地赋值，则不同数据类型有不同初始化值
 *              byte short int long ==> 0
 *              float double ==> 0.0
 *              char ==> 空格
 *              boolean ==> false
 *              引用类型 ==> null
 *          局部变量：一定要显式地赋值，即局部变量没有初始化值
 *      4.内存中位置
 *          成员变量：堆
 *          局部变量：栈
 *
 * 总结：关于变量的分类：
 *      1.按照数据类型的不同：基本数据类型（8种）&引用数据类型
 *      2.按照声明位置的不同：成员变量&局部变量
 *
 * 四、类的方法：提供某种功能的实现
 *  1.实例：public void eat(){//方法体}
 *          public String getName(){}
 *          public void setName(String n){}
 *    格式：权限修饰符
 *          返回值类型 （void 无返回值；具体的返回值）
 *          方法名 （形参）{}
 *  2.关于返回值类型：
 *          void 表明此方法不需要返回值
 *          有返回值的方法 在方法的最后一定有 return+返回值对应的变量
 *          记忆：void 与 return 不可以同时出现在同一个方法内
 *  3.方法内可以调用本类的其他方法或属性，但不能在方法内定义其他方法
 */

/*
 * 重载
 * 方法的重载（overload）
 * 要求同时满足：1.同一个类中 2.方法名必须相同 3.方法的参数列表不同（①参数的个数不同 或 ②参数类型不同）
 * 补充：方法的重载与方法的返回值类型没有关系！
 *
 * 可变个数的形参的方法
 *   1）格式：对于方法的形参：数据类型...形参名
 *   2）可变个数的形参的方法与同名的方法之间构成重载
 *   3）可变个数的形参在调用时，个数从0开始，到无穷多个都可以
 *   4）使用【可变多个形参的方法】与【形参使用数组】是一致的
 *   5）若方法中存在可变个数的形参，那么一定要声明在方法形参的最后
 *
 * 在类中一旦定义了重载的可变个数的形参的方法后，部分方法可省略
 */

/* 其他
* 1.匿名类对象：创建的类的对象事匿名的
*   1）当只需要一次调用类的对象时，可以考虑使用匿名对象
*   2）特点：创建的匿名类对象只能调用一次
* */
public class Main {

    public static void main(String[] args) {
        // write your code here
        Person p1 = new Person();
        p1.info();

        p1.name = "钟馗";
        p1.age = 324;
        p1.sex = true;
        p1.info();
        p1.setName("鬼谷子");
        p1.info();
        System.out.println("p1:" + p1);

        Person p2 = p1;
        System.out.println("p2:" + p2);
        p2.info();
        p2 = new Person();
        System.out.println("p2:" + p2);
        p2.info();

        // 实例化Scanner类得对象，通过此对象
        System.out.println("请输入一个年龄给p2：");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        p2.setAge(i);
        System.out.println(p2.desc());

        // 数组相关操作
        int[] arr = new int[]{21,343,-43,2,34,55,15};
        ArrayUtil au = new ArrayUtil();
        au.printArray(arr);
        System.out.println("平均数：\t"+au.avg(arr));
        au.sort(arr);
        System.out.println("数组排序：\t");
        au.printArray(arr);

        // 重载操作
        System.out.println("\n\n重载操作：");
        Overload ol = new Overload();
        ol.mOL(7);
        ol.mOL(7,9);
        ol.mOL("hhh");
        System.out.println("\n最大值：");
        System.out.println(ol.max(2,4));
        System.out.println(ol.max(1.2,2.3));
        System.out.println(ol.max(2.3,3.4,3.7));

        // 圆面积操作
        PassObject p = new PassObject();
        Circle c = new Circle();
        p.printAreas(c,5);
        System.out.println("now radius is: "+c.getRadius());
    }
}