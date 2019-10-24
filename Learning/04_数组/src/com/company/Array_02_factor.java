package com.company;

public class Array_02_factor {
    public static void main(String[] args) {
        // 对于基本数据类型的变量创建的数组，byte short int long float int long double char boolean
        // 1.对于 byte short int long 而言，创建数组后，默认值为0
        int[] scores = new int[4];
        scores[0] = 89;
        scores[3] = 90;
        for (int i = 0; i < 4; i++) {
            System.out.print(scores[i] + " ");
        }
        //2.对于 flaot double 而言，默认值为0.0
        System.out.println("\nf d 默认");
        float[] f = new float[4];
        f[0] = 1.2F;
        for (int i = 0; i < 4; i++) {
            System.out.print(f[i] + " ");
        }
        // 3.对于char而言，默认值为空
        System.out.println("\nchar 默认");
        char[] c = new char[4];
        c[0] = 's';
        for (int i = 0; i < 4; i++) {
            System.out.print(c[i] + ",");
        }
        // 4.对于boolean而言，默认值为false
        System.out.println("\nboolean 默认");
        boolean[] b = new boolean[4];
        b[0] = true;
        for (int i = 0; i < 4; i++) {
            System.out.print(b[i] + " ");
        }
        // 5.对于引用类型的变量构成的数组而言，默认值为null
        System.out.println("\nboolean String");
        String[] s=new String[4];
        for (int i=0;i<4;i++){
            System.out.print(s[i]+" ");
        }

        int[] i = new int[]{1,35,6,13};
        int[] j = new int[10];
        for (int k=0;k<4;k++){
            j[k]=i[k];
        }
        System.out.println(i);          // 打印内存地址
        System.out.println(j);          // 打印内存地址
        for (int k=0;k<10;k++){
            System.out.print(j[k]+" ");
        }
    }
}
