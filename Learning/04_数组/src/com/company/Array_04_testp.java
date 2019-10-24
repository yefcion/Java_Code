package com.company;
/*
    从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
    成绩 >= 最高分-10 等级为 A
    成绩 >= 最高分-20 等级为 B
    成绩 >= 最高分-30 等级为 C
    其余等级为 D
    提示：先读入学生人数，根据人数创建int数组，存放学生成绩。
*/

import java.util.Scanner;

public class Array_04_testp {
    public static void main(String[] args) {
        // 1.创建Scanner的对象，并从键盘获取学生的个数n
        Scanner s = new Scanner(System.in);
        System.out.println("请输入学生的个数：");
        int count = s.nextInt();                    //用count记录学生个数
        // 2.根据输入学生的个数n，创建一个长度为n的int型的数组
        int[] scores = new int[count];
        int maxScore = 0;
        // 3.以此从键盘获取n个学生的成绩，并赋给相应的数组元素，并获取n个学生中的最高分
        for (int i = 0; i < count; i++) {
            scores[i] = s.nextInt();                  //依次从键盘获取学生的成绩
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
        }
        System.out.println("最高分为：" + maxScore);
        // 4.遍历学生成绩的数组，并根据学生成绩与最高分的差值，赋予相应的等级，并输出
        for (int i=0;i<count;i++){
            char level;
            if (scores[i]>=maxScore-10){
                level = 'A';
            }else if (scores[i]>=maxScore-20){
                level ='B';
            }else if (scores[i]>=maxScore-30){
                level = 'C';
            }else{
                level = 'D';
            }
            System.out.println("学生"+(i+1)+"得分"+scores[i]+"，等级为："+level);
        }
    }
}
