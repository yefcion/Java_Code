package utils;

import org.junit.Test;

/**
 * @author： xu.yefcion
 * @description：
 * @date： 2019/12/17 23:21
 */

public class UtilTest {
    @Test
    public void testPic(){
        String base64 = ImageUtils.img2base64Local("F:\\yefci\\Pictures\\家系图.jpg");
        System.out.println(base64);
    }
}
