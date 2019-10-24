package com.company;

import javax.lang.model.element.NestingKind;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // 除：/
        int i = 60;
        int j = i / 5;
        double d = i / 5;
        double d2 = i / 5.0;
        System.out.println(j);          // 4
        System.out.println(d);          // 4.0
        System.out.println(d2);         // 4.
        //取模：% 取余数
        int i1 = i % 5;
        i1 = -12 % 5;
        int i2 = 12 % (-5);
        int i3 = -12 % (-5);
        System.out.println(i1);         // -2
        System.out.println(i2);         // 2
        System.out.println(i3);         // -2

        // '*'表示数值，"*"才是字符
        System.out.println('*' + '\t' + '*');   // 93
        System.out.println('*' + '*');        // 84
        System.out.println("*" + "\t" + "*");   // *	*

        // 赋值运算符
        i1 = 10;
        i1 += 3;//i1=i1+3;

        short s = 10;
        //s=s+3;                            编译不通过
        s += 3;                               // 既可以实现运算，又不会更改s的数据类型
        System.out.println(i1);
        System.out.println(s);
        int id = 1;
        id *= 0.1;
        System.out.println("0.1倍自身为 " + id);   // 0


        boolean b1 = false;
        if (b1 == true)
            System.out.println("True");
        else
            System.out.println("False");

        boolean a = true;
        boolean b = false;
        System.out.println(a & b);
        System.out.println(a && b);
        System.out.println(a | b);
        System.out.println(a || b);
        System.out.println(a & b);
        System.out.println(a ^ b);

        // &与&&的区别：
        // &：不管左边是true还是false，右端都会进行运算
        // &&：当左端为false时，右端不再进行运算
        // 建议使用 &&
        int il = 10;
        if (b & (i1++) > 0) {
            System.out.println("今天天气很睛朗");
        } else {
            System.out.println("难得没有雾霾");
        }
        System.out.println(i1);//11
        i2 = 10;
        if (b && (i2++) > 0) {
            System.out.println("今天天气很睛朗");
        } else {
            System.out.println("难得没有雾霾");
        }
        System.out.println(i2);

        // 位运算符：<<左移 >>右移 >>>无符号右移 | & ~反码
        // 节省内存空间，效率高
        i3 = 31;
        System.out.println(i3 << 3);            //248 = 31 * 2^3
        System.out.println(12 & 5);             //4
        System.out.println(12 | 5);             //13
        System.out.println(12 ^ 5);             //9
        System.out.println(~12);                //-13

        // 三元运算符
        int i4 = 10, i5 = 10;
        int max = (i4 > i5) ? i4 : i5;
        String str = (i4 > i5) ? "i4 大" : (i4 == i5) ? "相等" : "i5大";  // 嵌套三元
        System.out.println("三元运算符：" + max);
        System.out.println("三元运算符：" + str);

        // 小程序 十进制转十六进制
        // 1、使用函数实现
        System.out.println("\n" + i + "的10到16进制转换");
        String binary = Integer.toBinaryString(i);
        System.out.println(binary);
        String hex = Integer.toHexString(i);
        System.out.println(hex);
        // 2、手动实现
        i = 60;
        j = i & 15;            //获取i最低四位对应的值
        String k1 = (j <= 9) ? j + "" : (char) (j - 10 + 'a') + "";
        System.out.println(k1);
        i = i >> 4;
        System.out.println(i);
        int z = i & 15;
        String k2 = (z <= 9) ? z + "" : (char) (z - 10 + 'a') + "";
        System.out.println(k2 + k1);
    }
}
