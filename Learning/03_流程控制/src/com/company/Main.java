package com.company;
// 流程控制：顺序结构；分支结构（if-else;swich-case）；循环结构（while;do-while;for(;;)）

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 2.创建一个Scanner类的对象
//        Scanner s = new Scanner(System.in);
//        System.out.println("请输入一个字符串");
        // 3.调用此对象的相应的方法，完成键盘输入的值的获取
        // next() 表示从键盘获取一个字符串
//        String str = s.next();
//        System.out.println(str);
/*
        // 一、小明成绩
        Scanner S = new Scanner(System.in);
        System.out.println("请输入小明的成绩：");
        int score = S.nextInt();
        if (score > 100 || score < 0) {
            System.out.println("数值错误");
        } else {
            if (score == 100) {
                System.out.println("奖励一辆BMW");
            } else if (score > 80 && score <= 99) {
                System.out.println("奖励一台iPhone");
            } else if (score > 60 && score < 80) {
                System.out.println("奖励一本参考书");
            } else {
                System.out.println("什么奖励也没有");
            }
        }

        // 二、输入三个整数，并对它们排序
        // 1.从键盘获取三个整数
        Scanner s1 = new Scanner(System.in);
        System.out.println("输入三个数：");
        int i1 = s1.nextInt();
        int i2 = s1.nextInt();
        int i3 = s1.nextInt();
        // 2.对三个数进行排序
        System.out.println("从小到大的顺序为：");
        if (i1 > i2) {
            if (i3 > i1) {
                System.out.println(i2 + " " + i1 + " " + i3);
            } else if (i3 > i2) {
                System.out.println(i2 + " " + i3 + " " + i1);
            } else {
                System.out.println(i3 + " " + i2 + " " + i1);
            }
        } else {
            if (i3 > i2) {
                System.out.println(i1 + " " + i2 + " " + i3);
            } else if (i1 > i3) {
                System.out.println(i3 + " " + i1 + " " + i2);
            } else {
                System.out.println(i1 + " " + i3 + " " + i2);
            }
        }
*/
        // Switch
        /*
        1.根据变量的值，选择相应的case去判断，一旦满足case条件，就执行case的相应语句。如果没有break或者已经到结尾的话，会继续执行其下的case语句。
        2.default：是可选的，而且位置是灵活的。
        3.变量可以是哪些类型？char byte short int 枚举string（jdk1.7）
        4.case条件：其中条件只能是值，不能是取值范围！
        */
        int sw = 2;
        switch (sw) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("five");
                break;
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("Hello world !");
        }
        int num = 0;
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                sum += i;
                num++;
            }
        }
        System.out.println("100 以内偶数个数：" + num);
        System.out.println("100 以内偶数和是：" + sum);

        // 打印三角形操作
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 4 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < i + 1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 4 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 99 乘法表
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }

        // 10000 内所有质/素数
        System.out.println("100 内所有质/素数：");
        boolean flag = false;
        // 程序 1
        long start_1 = System.currentTimeMillis();    // 获取系统当前的毫秒时间
        for (int i = 2; i < 10000; i++) {            // 遍历100 内自然数
            // 如何判断 i 是否使一个质数
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = true;
                }
            }
            if (flag == false) {
                System.out.print(i + " ");
            }
            flag = false;                    // 此处应该把flag重新初始化
        }
        long end_1 = System.currentTimeMillis();
        System.out.println("\n程序1运行时间：" + (end_1 - start_1) + " 毫秒");

        // 程序2 优化
        long start_2 = System.currentTimeMillis();
        for (int i = 2; i < 10000; i++) {
            // 如何判断 i 是否使一个质数
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = true;
                    break;                  // 修改，从而使程序中一旦满足条件立即跳出当前循环
                }
            }
            if (flag == false) {
                System.out.print(i + " ");
            }
            flag = false;
        }
        long end_2 = System.currentTimeMillis();
        System.out.println("\n程序2运行时间：" + (end_2 - start_2) + " 毫秒");

        // 程序3 优化
        long start_3 = System.currentTimeMillis();
        for (int i = 2; i < 10000; i++) {
            // 如何判断 i 是否使一个质数
            for (int j = 2; j < Math.sqrt(i); j++) {    // 修改，比较到原数的平方根即止
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                System.out.print(i + " ");
            }
            flag = false;
        }
        long end_3 = System.currentTimeMillis();
        System.out.println("\n程序3运行时间：" + (end_3 - start_3) + " 毫秒");

        // 程序4 label优化
        long start_4 = System.currentTimeMillis();
        l:for (int i = 2; i < 10000; i++) {             // 修改，使用标签 l:
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = true;
                    continue l;
                }
            }
            System.out.print(i);
        }
        long end_4 = System.currentTimeMillis();
        System.out.println("\n程序4运行时间：" + (end_4 - start_4) + " 毫秒");


        // break
        for (int i=1;i<10;i++){
            System.out.print(i);
        }
        System.out.println("\nbreak:");

        for (int i=1;i<10;i++){             // 运行到2结束
            if (i%2==0){
                break;
            }
            System.out.print(i);
        }
        System.out.println("\ncontinue:");

        for (int i=1;i<10;i++){             // 跳过2的倍数
            if (i%2==0){
                continue;
            }
            System.out.print(i);
        }
        System.out.println("\nlabel break:");

        label:for (int i=1;i<10;i++){             // 结束label所在循环
            if (i%2==0){
                break label;
            }
            System.out.print(i);
        }

        // 1000 内完数:一个数恰好等于它的因子之和
        int factor=0;
        System.out.println("\n\n1000内完数：");
        for (int i=1;i<1001;i++){
            factor=0;
            for (int j=1;j<i;j++){
                //每执行完一次如下的循环，就会将i的所有的因子累加到factor中
                if(i%j==0){
                    factor += j;
                }
            }
            if (factor==i){
                System.out.print(i+" ");
            }
        }
    }
}
