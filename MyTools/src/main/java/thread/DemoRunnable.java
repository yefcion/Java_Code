package thread;

/**
 * @author： xu.yefcion
 * @date： 2020.6.24 20:59
 */

public class DemoRunnable implements Runnable {
    private String threadName;

    public DemoRunnable(String name) {
        threadName = name;
    }

    @Override
    public void run() {
        System.out.println("From runnable: " + threadName);
    }
}
