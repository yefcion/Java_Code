package utils;

/**
 * @author： xu.yefcion
 * @description：
 * @date： 2019/12/17 23:19
 */

class ThreadRun implements Runnable {
    @Override
    public void run() {
        System.out.println("my runnable thread");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
