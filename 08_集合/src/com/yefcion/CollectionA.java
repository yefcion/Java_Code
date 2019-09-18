package com.yefcion;

/**
 * 1.存储对象可以考虑：1 数组  2 集合
 * 2.数组存储对象的特点：Student[] stu = new Student[20]; stu[0] = new Student();
 *   > 弊端：1 一旦创建，长度不可变；2 真实的数组存放的对象个数不可知
 * 3.集合
 *      Collection 接口
 *          |----- List 接口：存储有序的，可以重复的元素
 *              |----- ArrayList、LinkedList、Vector
 *          |----- Set 接口：存储无序的，不可重复的元素
 *              |----- Hash Set、LinkedHashSet、TreeSet
 *      Map 接口：存储“键 - 值”对数据
 *          |----- HashMap、LinkedHashMap、TreeMap、Hashtable(子类：Properties)
 * */

import org.junit.Test;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.*;

public class CollectionA {
    @Test
    public void testCollection1() {
        Collection col = new ArrayList();
        System.out.println(col.size());
        // 1.add() 向集合中添加一个元素
        col.add(123);
        col.add("aa");
        col.add(new Date());
        col.add("bb");
        // 2.size() 返回集合中的元素个数
        System.out.println(col.size());
        // 3.addAll(Collection col2) 将形参 col2 中包含的所有元素添加到当前集合中
        Collection col2 = Arrays.asList(1, 2, 3);
        col.addAll(col2);
        System.out.println(col.size());
        System.out.println(col);
        // 4.isEmpty() 判断集合是否为空
        System.out.println(col.isEmpty());
        // 5.clear() 清空集合元素
        col.clear();
        System.out.println(col.isEmpty());

    }

    @Test
    public void testCollection2() {
        Collection col = new ArrayList();
        col.add(123);
        col.add("aa");
        col.add(new Date());
        col.add(new String("bb"));
        col.add(new Person("mm", 12));
        System.out.println(col);
        System.out.println(col.size());
        // 6.contains() 判断集合是否包含指定 obj 元素，返回布尔值
        boolean b1 = col.contains(new String("bb"));
        System.out.println(b1);
        // 判断依据是元素所在类的 equals() 方法。注：所以需要重写 equals
        // 如果存入集合中的元素是自定义的对象。要求：自定义类要重写 equals() 方法！
        boolean b2 = col.contains(new Person("mm", 12));
        System.out.println(b2);
        // 7.containsAll() 判断当前集合是否包含指定集合中的全部元素
        Collection col2 = new ArrayList();
        col2.addAll(col);
        col.add(1);
        boolean b3 = col.containsAll(col2);
        System.out.println(b3);
        // 8.remove() 删除元素
        col.remove("aa");
        // 9.retainAll(Collection col2) 交集
        col.retainAll(col2);
        System.out.println(col);
    }

    @Test
    public void testCollection3() {
        Collection col = new ArrayList();
        Date d = new Date();
        col.add(123);
        col.add("aa");
        col.add(d);
        col.add(new String("bb"));
        col.add(new Person("mm", 12));
        Collection col2 = new ArrayList();
        col2.addAll(col);
        col2.remove(d);
        System.out.println("col2:\t" + col2);
        col.add("end");
        System.out.println("col:\t" + col);

        // 9.a.removeAll(Collection b)  删除 a 中与 b 重合的元素
        // a(1,2,3) b(2,3,4) a.removeAll(b)->a(1)
        col2.add("txt");
        System.out.println("col2:\t" + col2);
        col.removeAll(col2);
        System.out.println("col.rmAll:\t" + col);

        // 10.equals() 所有元素都相同，顺序也要相同
        Collection col3 = new ArrayList();
        col3.addAll(col);
        col.add(1);
        col.add(2);
        col3.add(2);
        col3.add(1);
        System.out.println("col:\t" + col);
        System.out.println("col3:\t" + col3);
        System.out.println("col=col3:\t" + col.equals(col3));

        // 11.hashCode() 每次生成的哈希值不同
        System.out.println("col.hash:\t" + col.hashCode());

        // 12.toArray() 集合转数组
        System.out.print("toArray: ");
        Object[] obj = col.toArray();
        for (int i = 0; i < obj.length; i++) {
            System.out.print(obj[i] + " ");
        }

        // 13.iterator() 返回一个 Iterator 接口实现类的对象，进而实现集合元素遍历
        System.out.print("\niterator: ");
        Iterator iterator = col.iterator();
        // 方式1 丑拒
//        for (int i=0;i<col.size();i++){
//            System.out.print(iterator.next()+" ");
//        }
        // 方式2 常用
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
