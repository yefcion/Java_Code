package utils;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.HashMap;
import java.util.Map;

/**
 * @author： xu.yefcion
 * @description： Java8 时间 API 使用
 * https://www.yuque.com/shimoind/hm4ydh/xtk4al
 * ChronoField
 * https://nowjava.com/docs/java-api-11/java.base/java/time/temporal/ChronoField.html
 * @date： 2020/1/13 22:01
 */
public class TimeUtil {

    @Test
    public void time() {
        // 获取当前时间
        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow);
        // 获取指定时间对象
        LocalTime thatTime = LocalTime.of(23, 15, 34);
//        08:15:34
        int hour = thatTime.getHour();
//        23
        int minute = thatTime.getMinute();
//        15
        int second = thatTime.getSecond();
//        34
    }

    @Test
    public void date() {
        LocalDate dateNow = LocalDate.now();
        System.out.println(dateNow);
        // 指定日期对象
        LocalDate thatDate = LocalDate.of(2020, 7, 24);
//        2020-07-24
        int year = thatDate.getYear();
        int monthV = thatDate.getMonthValue();
        int dayV = thatDate.getDayOfMonth();

        Month month = thatDate.getMonth();
//        JULY
        DayOfWeek dayOfWeek = thatDate.getDayOfWeek();
//        FRIDAY
    }

    @Test
    public void timeFormat() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime that = LocalDateTime.of(2020, 7, 24, 12, 3, 45);
        LocalDate date = now.toLocalDate();
        LocalTime time = now.toLocalTime();
    }

    @Test
    public void second() {
        Instant instant = Instant.now();
        // 获取秒数
        long currentSecond = instant.getEpochSecond();
//        1595522710
        System.out.println(currentSecond);
        // 获取毫秒数/时间戳
        long currentMilli = instant.toEpochMilli();
//        1595522710545
        // 更简便获取时间戳的方式
        System.currentTimeMillis();
//        1595522710545
    }

    @Test
    public void duration(){
        // Duration.between()方法创建 Duration 对象
        LocalDateTime from = LocalDateTime.of(2017, Month.JANUARY, 1, 00, 0, 0);
        // 2017-01-01 00:00:00
        LocalDateTime to = LocalDateTime.of(2019, Month.SEPTEMBER, 12, 14, 28, 0);
        // 2019-09-15 14:28:00
        Duration duration = Duration.between(from, to);
        // 表示从 from 到 to 这段时间
        long days = duration.toDays();
        // 这段时间的总天数
        long hours = duration.toHours();
        // 这段时间的小时数
        long minutes = duration.toMinutes();
        // 这段时间的分钟数
        long seconds = duration.getSeconds();
        // 这段时间的秒数
        long milliSeconds = duration.toMillis();
        // 这段时间的毫秒数
        long nanoSeconds = duration.toNanos();
        // 这段时间的纳秒数
    }

    @Test
    public void dateValue() {
        LocalDateTime n = LocalDateTime.now();
        int hour1 = n.get(ChronoField.DAY_OF_YEAR);
        System.out.println(hour1);
    }


    public void Local() {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        String str = "20191113182930";
        LocalDateTime thisTime = LocalDateTime.parse(str, dtf);

        Map<Integer, String> map = new HashMap<>(16);
        for (int i = 0; thisTime.isBefore(localDateTime); i++) {
            map.put(i, thisTime.format(dtf));
            thisTime = thisTime.plusDays(1L);
        }
        System.out.println(map);
    }

    @Test
    public void testLocal() {
        Local();
        formatTime("12/12/2020 19:12:45");
    }


    public void formatTime(String inDateStr) {
        LocalDate localDate = LocalDate.of(2019, 9, 12);
        String s1 = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        // 自定义格式化
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String s3 = localDate.format(dateTimeFormatter);

        // 解析时间
        LocalDate localDate1 = LocalDate.parse("20190912", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate localDate2 = LocalDate.parse("2019-09-12", DateTimeFormatter.ISO_LOCAL_DATE);
    }

}
