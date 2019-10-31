package tools;

import org.junit.Test;

import javax.xml.crypto.Data;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author： xu.yefcion
 * @description：
 * @date： 2019/10/31 22:16
 */

public class TiemAbout {
    @Test
    public void timeTest() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // 当前时间
        String timeNow = sdf.format(new Date());
        System.out.println("当前时间：" + timeNow);

        // 时间转时间戳
        Date date = sdf.parse(timeNow);
        long time2stamp = date.getTime();
        String stampStr = String.valueOf(time2stamp);
        System.out.println("时间转时间戳：" + stampStr);

        // 时间戳转时间
        String stamp2time2 = sdf.format(new Date(Long.parseLong(stampStr)));
        System.out.println("时间戳转时间：" + stamp2time2);

        // 当前时间戳(现成函数)
        Long timeStamp = System.currentTimeMillis();
        System.out.println("函数当前时间戳：" + timeStamp);

        // 函数时间戳转时间
        String stamp2time = sdf.format(new Date(timeStamp));
        System.out.println("函数时间戳转时间：" + stamp2time);

    }
}
