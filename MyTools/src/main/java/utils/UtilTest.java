package utils;

import org.junit.Test;

/**
 * @author： xu.yefcion
 * @description：
 * @date： 2019/12/17 23:21
 */

public class UtilTest {
    @Test
    public void testThread() {
        ThreadCom threadCom = new ThreadCom();
        Thread threadRun = new Thread(new ThreadRun());
        System.out.println("main Thread begin");
        threadCom.start();
        threadRun.start();
        System.out.println("main Thread end");
    }

    /**
     * 敲重点：不能直接调用 run()，直接调用 run() 不会创建线程，而是主线程直接执行 run() 的内容，相当于执行普通函数。这时就是串行执行的。看下面代码。
     */
    @Test
    public void testThread2() {
        ThreadCom threadCom = new ThreadCom();
        threadCom.setName("thread 1: threadCom");

        Thread threadRun = new Thread(new ThreadRun());
        threadRun.setName("thread 2: threadRun");

        System.out.println("main Thread begin");
        threadCom.run();
        threadRun.run();
        System.out.println("main Thread end");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 直接调用 run() 方法，没有创建线程。
    }

    @Test
    public void testThread3() {
        ThreadCom threadCom = new ThreadCom();
        threadCom.setName("thread 1: threadCom");

        Thread threadRun = new Thread(new ThreadRun());
        threadRun.setName("thread 2: threadRun");

        System.out.println("main Thread begin");
        threadCom.start();
        threadRun.start();
        System.out.println("main Thread end");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 直接调用 run() 方法，没有创建线程。
    }

    @Test
    public void testPic(){
        String base64 = ImageUtils.img2base64Local("F:\\yefci\\Pictures\\家系图.jpg");
        System.out.println(base64);
    }
}
