package stage;

import org.junit.Test;

import java.util.*;

/**
 * @author： xu.yefcion
 * @description： 迭代器
 * @date： 2019/11/6 22:17
 * @URL： https://www.cnblogs.com/zyuze/p/7726582.html
 */
public class IterateUse {
    /**
     * 迭代器模式：就是提供一种方法对一个容器对象中的各个元素进行访问，而又不暴露该对象容器的内部细节。
     *
     * 想到我再在用 map 的时候，需要 "total" 去去对应的值
     */

    /**
     * 数组遍历
     */
    @Test
    public void arrayTry() {
        int[] arr = {1, 2, 3};
        for (int i:arr){
            System.out.println(i);
        }
//        int[] array = new int[3]; for (int i:array){ System.out.println(i); }
    }

    /**
     * 数列集合遍历
     */
    @Test
    public void arrListTry(){
        List<String> arrList = new ArrayList();
        arrList.add(0,"hello");
        arrList.add(1,"world");
//        arrList.add(3,"world"); 如果跳过 2 直接给 3 赋值的话，直接报错
        for (String str : arrList){
            System.out.println(str);
        }
    }

    /**
     * 迭代器遍历各类集合
     */
    @Test
    public void colItr(){
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        System.out.println("list iterate turn: ");
        Iterator<String> listIt = list.iterator();
        while (listIt.hasNext()){
            System.out.println(listIt.next());
        }

        List<String> linkList = new LinkedList<>();
        linkList.add("link1");
        linkList.add("link2");
        linkList.add("link3");
        System.out.println("\nlinkList iterate turn: ");
        Iterator<String> linkIt = linkList.iterator();
        while (linkIt.hasNext()){
            System.out.println(linkIt.next());
        }

        Set<String> set = new HashSet<>();
        set.add("set1");
        set.add("set2");
        set.add("set3");
        System.out.println("\nset iterate turn: ");
        Iterator<String> setIt = set.iterator();
        while (setIt.hasNext()){
            System.out.println(setIt.next());
        }

        // Iterator遍历时不可以删除集合中的元素，否则抛出 ConcurrentModificationException 异常
    }

    /**
     *  foreach循环 与 迭代器的对比:
     *
     *  > ArrayList对随机访问比较快，而for循环中使用的get()方法，采用的即是随机访问的方法，因此在ArrayList里for循环快。
     *  > LinkedList则是顺序访问比较快，Iterator中的next()方法采用的是顺序访问方法，因此在LinkedList里使用Iterator较快。
     *  > 主要还是要依据集合的数据结构不同的判断。
     */

}
