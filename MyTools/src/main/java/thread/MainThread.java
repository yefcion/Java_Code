package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author： xu.yefcion
 * @description： 多线程相关知识，参考链接：https://yefcion.github.io/2020/06/24/115-%E5%A4%9A%E7%BA%BF%E7%A8%8B/
 * @date： 2020.6.24 21:01
 */

public class MainThread {

    // 线程池数量
    private static int POOL_NUM = 10;

    public static void main(String[] args) {
        DemoThread t1 = new DemoThread("自定义线程 Thread");
        t1.start();

        DemoRunnable r=new DemoRunnable("自定义线程 Runnable");
        Thread t2 = new Thread(r);
        t2.start();

        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(POOL_NUM);
        for (int i=0; i<POOL_NUM; i++) {
            DemoRunnable thread = new DemoRunnable("线程池线程 " + i);
            // r.sleep(1000);
            fixedThreadPool.execute(thread);
        }
        // 关闭线程池
        fixedThreadPool.shutdown();
    }

}
