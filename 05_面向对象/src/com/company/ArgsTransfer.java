package com.company;

/* 方法的参数传递（重点难点）
 *  1.形参与实参
 *      形参：方法声明时，方法小括号内的参数
 *      实参：调用方法时，实际传入的参数值
 *  2.规则：Java中的参数传递机制：值传递机制
 *      1）形参是基本数据类型：将实参的值传递给形参的基本数据类型的变量
 *      2）形参是引用数据类型：将实参的引用类型的变量的值（对应的对空间对象实体的首选地址值）传递给形参的引用类型变量
 */
public class ArgsTransfer {
    public static void main(String[] args) {
        int i = 10;
        int j = 6;
        System.out.println("i:" + i + "\tj:" + j);

        ArgsTransfer a1 = new ArgsTransfer();
        a1.swap(i, j);                              // 此处形参为引用数据类型
        System.out.println("i:" + i + "\tj:" + j);  // 结果不变

        ArgsTransfer tt = new ArgsTransfer();
        DataSwap dt = new DataSwap();
        tt.dswap(dt);
        System.out.println("i:" + dt.i + "\tj:" + dt.j);  // 结果不变

        // 值传递练习
        Value t = new Value();
        t.first();
    }

    // 定义一个交换方法
    public void swap(int m, int n) {
        int temp = m;
        m = n;
        n = temp;
        System.out.println("hi");
    }

    public void dswap(DataSwap ds) {
        int temp = ds.i;
        ds.i = ds.j;
        ds.j = temp;
    }
}

class DataSwap {
    int i = 10;
    int j = 15;
}

class Value {
    int i = 15;                                 // 成员变量

    public void first() {
        int i = 5;                              // 成员变量
        Value v = new Value();                  // 堆中i值为15 【内存地址①】
        v.i = 25;                               // ①内存地址上的i值改为25
        second(v, i);                           // 方法中的执行结束内存地址释放
        System.out.println(v.i);                //
    }

    public void second(Value v, int i) {
        i = 0;                                  // 成员变量
        v.i = 20;                               // ①内存地址上的i值改为20
        Value val = new Value();                // 堆中i值为15 【内存地址②】
        v = val;                                // v的①内存地址直接抹除，使用val的②内存地址
        System.out.println(v.i + " " + i);      // 15 0
    }
}

