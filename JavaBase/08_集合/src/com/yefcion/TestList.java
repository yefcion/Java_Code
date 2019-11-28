package com.yefcion;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author： xu.yefcion
 * @description：
 * @date： 2019/9/18 22:28
 */

public class TestList {
    /**
     * ArrayList：List 的主要实现类
     *
     * 相对于 Collection 新增方法
     */
    @Test
    public void test1(){
        List list = new ArrayList();
        list.add(1);
        list.add("23");

        Iterator i = list.iterator();
        System.out.print("list.ori: ");
        while (i.hasNext()){
            System.out.print(i.next()+" ");
        }

        // 增指定位置元素
        list.add(1,"try");
        list.add(1,"22");
        System.out.print("\nlist.add: ");
        Iterator j = list.iterator();
        while (j.hasNext()){
            System.out.print(j.next()+" ");
        }

        // 增删改查
        list.add(1,"pom");
        System.out.println("\nlist.get: "+list.get(1));
        System.out.println("list.rm: "+list.remove(1));
        System.out.println("list.set: "+list.set(1,"yefcion"));
    }
}
