package com.company;

// 二维数组
// 声明方式：
// 一维数组：int[] x 或 int x[]
// 二维数组：int[][] y 或 int[] y[] 或 int y[][]


public class Array_11_mulmed {
    public static void main(String[] args) {
        int[] scores1 = new int[10];
        int[][] scores2;
        String[][] names;
        // 1.二维数组的初始化
        scores2 = new int[][]{{1, 2, 3}, {2, 3, 4}, {4, 5, 6}, {7}}; //静态初始化

        names = new String[6][5];                           //动态初始化的方法1
        names = new String[6][];                            //动态初始化的方法2
        names[0] = new String[5];
        names[1] = new String[4];
        names[2] = new String[5];
        names[3] = new String[7];
        names[4] = new String[6];
        names[5] = new String[5];
        names[0][1] = "try";
        names[3][5] = "hi";

        // 2.如何引用具体的某一个元素
        int[][] i = new int[3][2];              // int[] i[] = new int[3][2]
        i[1][0] = 90;
        i[2][1] = 100;

        // 3.数组的长度
        // 二维数组的长度，length属性
        System.out.println(i.length);           // 3
        // 二维数组中元素的长度
        System.out.println(i[0].length);        // 2
        System.out.println(names.length);       // 6
        System.out.println(names.length);       // 6
        System.out.println(names[4].length);    // 6
        System.out.println();

        // 4.遍历二维数组
        for (int m = 0; m < names.length; m++) {       // 控制行数
            for (int n = 0; n < names[m].length; n++) {
                System.out.print(names[m][n] + " ");
            }
            System.out.println();
        }

        // 5.常见异常

        // 5.1 数组下标越界异常: java.lang.ArrayIndexOutOfBoundsException
        int[] ai = new int[9];
        //ai[9] = 0;

        // 5.2 空指针异常: java.lang.NullPointerException
        // 第一种
//        boolean[] b=new boolean[3];
//        b = null;
//        System.out.println(b[0]);
        // 第二种
//        String[] str = new String[4];
//        System.out.println(str[3].toString());
        // 第三种
        int[][] j = new int[3][];
        j[2][0] = 12;
    }
}
