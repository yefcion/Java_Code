package thisback;

//import java.util.Date;
//import java.util.Scanner;
import java.util.*;

/*
* package：声明源文件所在的包，写在程序的第一行
*   每【.】一次，表示一层文件目录
*   包名都要小写
*
* import：
*   1.显式导入指定包下的类或接口
*   2.卸载包的声明和源文件之间
*   3.如果需要引入多个类或接口，那么就并列写出
*   4.如果导入的类是java.lang包下的，如：System String Math等，不需要显式声明
*   5.理解 .* 的概念，如 java.util.*
*   6.如何处理同名类的导入。如，在util包和sql包下同时存在Data类
*   7.import static 表示导入指定类的 static 属性或方法
*       import static java.lang.System.out 之后 就可以直接用 out.println()
*   8.导入 java,lang.* 只能导入lang包下的所有类或接口，不能导入lang包下子包内的类
*
* */
public class Akey {
    public static void main(String[] args) {
        System.out.println("hello world");
        Scanner s = new Scanner(System.in);
        s.next();
    }
}
