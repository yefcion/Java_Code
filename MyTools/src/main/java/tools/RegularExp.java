package tools;

import org.junit.Test;
import utils.RegexUtil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author： xu.yefcion
 * @description： 菜鸟教程：正则表达式 https://www.runoob.com/java/java-regular-expressions.html
 * 简书：Java中正则表达式 https://www.jianshu.com/p/3c076c6b2dc8
 * @date： 2020.6.8 22:03
 */

public class RegularExp {

    /**
     * java.util.regex 包主要包括以下三个类：
     *
     * Pattern 类：
     * pattern 对象是一个正则表达式的编译表示。Pattern 类没有公共构造方法。要创建一个 Pattern 对象，你必须首先调用其公共静态编译方法，它返回一个 Pattern 对象。该方法接受一个正则表达式作为它的第一个参数。
     *
     * Matcher 类：
     * Matcher 对象是对输入字符串进行解释和匹配操作的引擎。与 Pattern 类一样，Matcher 也没有公共构造方法。你需要调用 Pattern 对象的 matcher 方法来获得一个 Matcher 对象。
     * <p>
     * PatternSyntaxException：
     * PatternSyntaxException 是一个非强制异常类，它表示一个正则表达式模式中的语法错误。
     */

    @Test
    public void regexRlex() {
        // 按指定模式在字符串查找
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(\\D*)(\\d+)(.*)";

        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);

        // 现在创建 matcher 对象
        Matcher m = r.matcher(line);
        if (m.find()) {
            // 组是用括号划分的正则表达式，可以根据组的编号来引用某个组
            // 组号 0 表示整个表达式
            System.out.println("Found value: " + m.group(0));
            // 组号 1 表示被第一对括号括起来的组
            System.out.println("Found value: " + m.group(1));
            // 组号 2 表示被第二对括号括起来的组
            System.out.println("Found value: " + m.group(2));
            // 组号 3 表示被第三对括号括起来的组
            System.out.println("Found value: " + m.group(3));
        } else {
            System.out.println("NO MATCH");
        }
    }

    @Test
    public void regex1() {
        String str = "8";
        String regex = "[0-9]";
        boolean flag = Pattern.matches(regex, str);
        System.out.println(flag);

        Pattern r = Pattern.compile(regex);
        Matcher matcher = r.matcher(str);
        if (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }

    @Test
    public void regex2() {
        String str = "hello world";
        String regex = "[a-zA-Z]{3,6}";
        System.out.println(str.matches(regex));

        // 匹配3个到5个字母，大小写不限，包括3和5个 空格会被视为隔断
        patMat(regex, str);
    }

    @Test
    public void regex3() {
        String str = "13656231253";
        String regex = "1[2378][0-35-9]{9}";
        patMat(regex, str);
    }

    @Test
    public void regexReplace() {
        String str = "123bh53jkHonB36sbNfG45ji";
        String regex = "[a-zA-Z]+";
        String regex2 = "\\d+";
        // 将字符串中英文字母替换为 * 符号
        System.out.println(str.replaceAll(regex, "*"));
        // 将字符串中单个数字或者连续的数字替换为 0
        System.out.println(str.replaceAll(regex2, "0"));
    }

    @Test
    public void regexSplit() {
        // 取大写字母
        String str = "HelloWorldHelloJava";
        String regex = "[a-z]+";
        System.out.println(RegexUtil.patMat(regex, str));

        String[] arr = str.split(regex);
        for (String s : arr) {
            System.out.println(s);
        }
    }

    /**
     * 正则匹配方法
     *
     * @param regex
     * @param str
     * @return
     */
    public boolean patMat(String regex, String str) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            System.out.println("no matcher");
            return false;
        }
        System.out.println(matcher.group(0));
        return true;
    }

}
