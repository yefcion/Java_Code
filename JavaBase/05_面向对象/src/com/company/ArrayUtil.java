package com.company;

public class ArrayUtil {
    // 求数组的最大值
    public int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    // 求数组的最小值
    public int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    // 遍历数组元素
    public void printArray(int[] arr) {
        System.out.println("\n数组为：\t");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    // 求数组的平均数
    public int avg(int[] arr) {
        int avg = 0;
        avg = getSum(arr) / arr.length;
        return avg;
    }

    // 数组求和
    public int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // 数组的反转
    public int[] reverse(int[] arr) {
        for (int x = 0, y = arr.length - 1; x < y; x++, y--) {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }
        return arr;
    }

    // 实现数组的复制
    public int[] copy(int[] arr) {
        int[] arr_2 = new int[]{};
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr_2[i] = i;
            }
        }
        return arr_2;
    }

    // 对数组进行排序：冒泡
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // 交换数组中指定位置的元素：交换arr中索引为i和j的两个元素
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

class Overload {
    /* 重载
     * 方法的重载（overload）
     * 要求同时满足：1.同一个类中 2.方法名必须相同 3.方法的参数列表不同（①参数的个数不同 或 ②参数类型不同）
     * 补充：方法的重载与方法的返回值类型没有关系！
     * */

    // 定义两个int型变量的和
    public int getSum(int i, int j) {
        return i + j;
    }

    // 定义三个int型变量的和
    public int getSum(int i, int j, int k) {
        return i + j + k;
    }

    // 定义两个double类型数据的和
    public double getSum(double i, double j) {
        return i + j;
    }

    // 打印三个double类型数据的和
    public void getSum(double i, double j, double k) {
        System.out.println(i + j + k);
    }

    // 练习一
    /* 编写程序，定义三个重载方法并调用。方法名为mOL。
    >三个方法分别接收一个int参数、两个int参数、一个字符串参数。分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
    >在主类的main()方法中分别用参数区别调用三个方法。*/
    public void mOL(int i) {
        System.out.println("1参平方为：" + i * i);
    }

    public void mOL(int i, int j) {
        System.out.println("2参乘积为：" + i * j);
    }

    public void mOL(String s) {
        System.out.println("字符串为：" + s);
    }

    // 可变个数的形参
    public void mOL(String... args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    // 练习二
    /*定义三个重载方法max（）
    第一个方法求两个int值中的最大值
    第二个方法求两个double值中的最大值
    第三个方法求三个double值中的最大值
    并分别调用三个方法。*/
    public int max(int i, int j) {
        if (i > j) {
            return i;
        } else {
            return j;
        }
    }

    public double max(double i, double j) {
        return (i > j) ? i : j;
    }

    public double max(double i, double j, double k) {
        return (max(i, j) > k) ? max(i, j) : k;
//        if (i > j) {
//            if (j > k) {
//                return i;
//            } else if (i > k) {
//                return i;
//            } else {
//                return k;
//            }
//        } else if (j > k) {
//            return j;
//        } else {
//            return k;
//        }
    }
}

