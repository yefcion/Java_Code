package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author： xu.yefcion
 * @description：
 * @date： 2020.4.13 23:20
 */

public class WriteObject {
    public static void main(String[] args) {
        Qing qing = new Qing();
        qing.setAge(18);
        qing.setSex(true);
        qing.setHobbies("book");

        try {
            String sourcePath = "ser.txt";
            FileOutputStream fileOut = new FileOutputStream(sourcePath);
            ObjectOutputStream oos = new ObjectOutputStream(fileOut);
            oos.writeObject(qing);
            oos.close();
            fileOut.close();
            System.out.println("Serialization is over");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
