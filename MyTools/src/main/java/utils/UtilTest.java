package utils;

import org.junit.Test;

/**
 * @author： xu.yefcion
 * @description：
 * @date： 2019/12/17 23:21
 */

public class UtilTest {
    @Test
    public void testPic() {
        String base64 = ImageUtil.img2base64Local("F:\\yefci\\Pictures\\家系图.jpg");
        System.out.println(base64);
    }

    /**
     * ip->long：
     * 1.将ip地址按字符串读入，用分隔符分割开后成为一个字符串数组{xyzo}。
     * 2.将数组里的字符串强转为long类型后执行：x^24+y^16+z^8+o  得到最后的返回值。
     * 3.这里的加权采用移位(<<)完成。
     *
     * @param strIp :ip地址 例：x.y.z.o
     * @return 转换后的long类型值
     */
    public static long ipToLong(String strIp) {
        String[] s = strIp.split("\\.");
        long ip = (Long.parseLong(s[0]) << 24)
                + (Long.parseLong(s[1]) << 16) +
                (Long.parseLong(s[2]) << 8)
                + (Long.parseLong(s[3]));
        return ip;
    }

    /**
     * long->ip
     * 1.采用StringBuffer方便字符串拼接。
     * 2.ip第一位：整数直接右移24位。
     * ip第二位：整数先高8位置0.再右移16位。
     * ip第三位：整数先高16位置0.再右移8位。
     * ip第四位：整数高24位置0.
     * 3.将他们用分隔符拼接即可。
     *
     * @param longIp
     * @return
     */
    public static String longToIP(long longIp) {
        //采用SB方便追加分隔符 "."
        StringBuffer sb = new StringBuffer("");
        sb.append((longIp >> 24)).append(".").
                append(((longIp & 0x00ffffff) >> 16)).append(".").
                append(((longIp & 0x0000ffff) >> 8)).append(".").
                append((longIp & 0x000000ff));
//        sb.append(String.valueOf(longIp>>24)).append(".").
//                append(String.valueOf((longIp&0x00ffffff)>>16)).append(".").
//                append(String.valueOf((longIp&0x0000ffff)>>8)).append(".").
//                append(String.valueOf(longIp&0x000000ff));
        return sb.toString();
    }

    @Test
    public void ipTest() {
        String s = "10.46.169.137";
        System.out.println(ipToLong(s));
        long ip = ipToLong(s);
        System.out.println(longToIP(ip));
    }
}
