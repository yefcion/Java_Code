package utils;

/**
 * @author： xu.yefcion
 * @description：
 * @date： 2019/12/17 23:15
 */

class ThreadCom extends Thread {
    @Override
    public void run() {
        System.out.println("my thread 1, this block should deposit the thread comment ");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
