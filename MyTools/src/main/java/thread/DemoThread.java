package thread;

/**
 * @author： xu.yefcion
 * @date： 2020.6.24 20:55
 */

public class DemoThread extends Thread {
    private String threadName;

    public DemoThread(String name) {
        threadName = name;
    }

    @Override
    public void run() {
        System.out.println("From thread: " + threadName);
    }
}
