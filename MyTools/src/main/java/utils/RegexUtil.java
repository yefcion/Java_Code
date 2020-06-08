package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author： xu.yefcion
 * @description： 正则表达式工具类
 * @date： 2020.6.8 22:51
 */

public class RegexUtil {
    public static String patMat(String regex, String str) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return matcher.group(0);
    }
}
