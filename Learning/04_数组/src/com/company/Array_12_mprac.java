package com.company;

public class Array_12_mprac {
    public static void main(String[] args) {
        // 计算array数组内所有元素的和
        int count = 0;
        int[][] arr = new int[][]{{3, 8, 2}, {2, 7}, {9, 0, 1, 6}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                count += arr[i][j];
//                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println("数组元素之和为：" + count);

        // 用二维数组打印一个10行杨辉三角
        // 1.第一行有1个元素，第n行有n个元素
        // 2.每一行的第一个元素和最后一个元素都是1
        // 3.从第三行开始，对于非第一个元素和最后一个元素的元素
        // yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j]
        int yanghui[][] = new int[10][];
        // 1.初始化二维数组
        for (int i = 0; i < yanghui.length; i++) {
            yanghui[i] = new int[i + 1];
        }
        // 2.显式的为二维数组的每个元素赋值
        for (int i = 0; i < yanghui.length; i++) {
            for (int j = 0; j < yanghui[i].length; j++) {
                yanghui[i][0] = yanghui[i][i] = 1;

                if (i > 1 && j > 0 && j < i) {
                    yanghui[i][j] = yanghui[i - 1][j] + yanghui[i - 1][j - 1];
                }
            }
        }

        //遍历二维数组
        for (int i = 0; i < yanghui.length; i++) {
            for (int j = 0; j < yanghui[i].length; j++) {
                System.out.print(yanghui[i][j] + "\t");
            }
            System.out.println();
        }

        /*
         * 1.求数组元素的最大值、最小值、平均数、总和等
         * 2.数组的复制、反转
         * 3.数组元素的排序
         * */

        // 1.求数组元素的最大值、最小值、平均数、总和等
        int arr_1[] = new int[]{12, 34, 52, -45, 22, 90};
        // 最大值
        int max = arr_1[0];
        for (int i = 0; i < arr_1.length; i++) {
            if (max < arr_1[i]) {
                max = arr_1[i];
            }
        }
        System.out.println("\n最大值为：\t" + max);
        // 最小值
        int min = arr_1[0];
        for (int i = 0; i < arr_1.length; i++) {
            if (min > arr_1[i]) {
                min = arr_1[i];
            }
        }
        System.out.println("最小值为：\t" + min);
        // 求和
        int sum = 0;
        for (int i = 0; i < arr_1.length; i++) {
            sum += arr_1[i];
        }
        System.out.println("和为：\t\t" + sum);
        // 平均数
        int avg = 0;
        avg = sum / arr_1.length;
        System.out.println("平均值为：\t" + avg);

        // 2.数组的复制、反转
        /*（1）创建一个名为TestArray的类，在main（）方法中声明array1和array2两个变量，他们是int[]类型的数组。
            （2）使用大括号，把array1初始化为8个素数：2，3，5，7，11，13，17，19。
            （3）显示array1的内容。
            （4）赋值array2变量等于array1，修改array2中的偶索引元素，使其等于索引值（如aray[0]=0，array[2]=2）。打印出array1。
        */
        int array_1[] = new int[]{2, 3, 5, 7, 11, 13, 17, 19};
        int array_2[] = new int[]{};
        System.out.println("array_1 ：");
        for (int i = 0; i < array_1.length; i++) {
            System.out.print(array_1[i] + " ");
        }
        array_2 = array_1;                              // 这么修改的话对 array_2 的操作会作用在 array_1 上
        for (int i = 0; i < array_2.length; i++) {
            if (i % 2 == 0) {
                array_2[i] = i;
            }
        }
        System.out.println("\narray_2 ：");
        for (int i = 0; i < array_1.length; i++) {
            System.out.print(array_1[i] + " ");
        }
        // 数组元素反转
        System.out.println("\n元素反转：");
        for (int x = 0, y = array_2.length - 1; x < y; x++, y--) {
            int temp = array_2[x];
            array_2[x] = array_2[y];
            array_2[y] = temp;
        }
        for (int i=0;i<array_2.length;i++){
            System.out.print(array_2[i]+" ");
        }
    }
}
