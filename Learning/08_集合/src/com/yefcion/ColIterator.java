package com.yefcion;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

public class ColIterator {
    /**
     * 迭代器遍历
     */
    @Test
    public void test1(){
        Collection col = new ArrayList();
        col.add(1);
        col.add("aa");
        col.add(new String("bb"));
        col.add(new Person("mm", 12));

        Iterator i = col.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }

    /**
     * 增强 for 循环遍历集合
     */
    @Test
    public void test2(){
        Collection col = new ArrayList();
        col.add(1);
        col.add("aa");
        col.add(new String("bb"));
        col.add(new Person("mm", 12));

        for (Object i:col){
            System.out.println(i);
        }
    }

    /**
     * 增强 for 循环遍历数组
     */
    @Test
    public  void test3(){
        String[] str = new String[]{"a","b","c"};
        for (Object i:str){
            System.out.println(i);
        }
    }

    /**
     * 面试题
     */
    @Test
    public void test4(){
        String[] str = new String[]{"a","b","s"};
        for (int i=0;i<str.length;i++){
            str[i] = i+" ";
        }
        for (int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }
    }

    @Test
    public void test5(){
        String[] str = new String[]{"a","b","s"};
        for (Object i:str){
            i = "x";
            System.out.println(i);
        }
        for (int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }
    }
}
