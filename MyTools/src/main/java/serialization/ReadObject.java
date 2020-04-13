package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author： xu.yefcion
 * @description：
 * @date： 2020.4.13 23:25
 */

public class ReadObject {
    public static void main(String[] args) {
        Qing qing = null;
        try {
            String sourcePath = "ser.txt";
            FileInputStream fileIn = new FileInputStream(sourcePath);
            ObjectInputStream ois = new ObjectInputStream(fileIn);
            qing = (Qing) ois.readObject();
            ois.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Qing class not found");
            c.printStackTrace();
            return;
        }

        System.out.println(qing);
    }
}
