package easy;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author： xu.yefcion
 * @description：
 * @date： 2019/11/6 23:02
 */

public class NumForTarget {
    public int[] twoSum(int[] nums, int target) {
        int n1 = 0;
        int n2 = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    n1 = i;
                    n2 = j;
                }
            }
        }
        return new int[]{n1, n2};
    }

    /**
     * 优解
     */
    public int[] twoSumB(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(16);
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    @Test
    public void sunTest() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int times = 1000;
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            twoSum(nums, target);
        }
        long endTime1 = System.currentTimeMillis();
        long time1 = endTime1 - startTime1;
        System.out.println("run time1: " + time1);

        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            twoSumB(nums, target);
        }
        long endTime2 = System.currentTimeMillis();
        long time2 = endTime2 - startTime2;
        System.out.println("run time2: " + time2);

    }
}
