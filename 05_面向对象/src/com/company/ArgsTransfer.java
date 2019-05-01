package com.company;

/* 方法的参数传递（重点难点）
 *  1.形参与实参
 *      形参：方法声明时，方法小括号内的参数
 *      实参：调用方法时，实际传入的参数值
 *  2.规则：Java中的参数传递机制：值传递机制
 *      1）形参是基本数据类型：将实参的值传递给形参的基本数据类型的变量
 *      2）形参是引用数据类型：
 *
 *
 *
 *
 *
 *
 */
public class ArgsTransfer {
    public static void main(String[] args) {
        int i = 10;
        int j = 6;
        System.out.println("i:" + i + "\tj:" + j);
        ArgsTransfer a1 = new ArgsTransfer();
        a1.swap(i, j);                              // 将i的值传递给m，将j的值传递给n
        System.out.println("i:" + i + "\tj:" + j);  //结果不变
    }

    // 定义一个交换方法
    public void swap(int m, int n) {
        int temp = m;
        m = n;
        n = temp;
        System.out.println("hi");
    }
}
