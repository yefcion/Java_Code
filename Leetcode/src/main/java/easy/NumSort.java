package easy;

import org.junit.Test;

/** 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * @author： xu.yefcion
 * @description： https://leetcode-cn.com/problems/reverse-integer/
 * @date： 2019/11/20 22:13
 */

public class NumSort {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    @Test
    public void reverseTest() {
        int x = reverse(-123490);
        System.out.println(x);
    }
}
