package com.company;

public class Array_01_base {
    public static void main(String[] args) {
        int i = 12;
        // 1.如何定义一个数组
        // 1.1 数组的声明
        String[] names;
        int[] scores;
        // 1.2 初始化
        // 第一种：静态初始化-初始化数组与给给数组元素赋值同时进行
        names = new String[]{"邱淑贞", "张敏", "关之琳", "李嘉欣"};
        // 第二种：动态初始化-初始化数组与给数组元素赋值分开进行
        scores = new int[4];
        // 2.如何调用相应的数组元素，通过数组元素的下角标的方式来调用
        //下角标从0开始，到n-1结束，其中n表示数组的长度
        scores[0] = 92;
        scores[1] = 90;
        scores[2] = 95;
        scores[3] = 94;
        // 3.数组的长度，通过数组的length属性
        System.out.println(names.length);           //4
        System.out.println(scores.length);          //4
        // 4.遍历数组元素
        for (int j = 0; j < 4; j++) {
            System.out.print(names[j] + "\t");
            System.out.println(scores[j]);
        }
    }
}
