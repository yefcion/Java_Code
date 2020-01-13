package utils;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

/**
 * @author： xu.yefcion
 * @description：
 * @date： 2020/1/13 22:01
 */

public class TimeUtils {

    public void Local() {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        String str = "20191113182930";
        LocalDateTime thisTime = LocalDateTime.parse(str, dtf);

        Map<Integer,String> map = new HashMap<>(16);
        for (int i = 0; thisTime.isBefore(localDateTime); i++) {
            map.put(i,thisTime.format(dtf));
            thisTime = thisTime.plusDays(1L);
        }
        System.out.println(map);
    }

    @Test
    public void testLocal(){
        Local();
    }
}
