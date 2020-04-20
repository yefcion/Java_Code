package utils;

import org.junit.Test;


public class Md5UtilsTest {

    @Test
    public void md5Test() {
        String text = "hiJack";
        String newStr = Md5Utils.MD5Encode(text, "UTF_8", true);
        System.out.println(newStr);
    }

}
