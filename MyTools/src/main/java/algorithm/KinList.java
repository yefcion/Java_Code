package algorithm;

import org.junit.Test;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * LeetCode 第 215 号问题: 在 未排序 的数组中找到第 k 个最大的元素
 * https://mp.weixin.qq.com/s?__biz=MzUyNjQxNjYyMg==&mid=2247486816&idx=2&sn=29b73073022e3a2b98477fd2f29c8236&chksm=fa0e62e1cd79ebf790c2a25035fddaf47059758a1e0dbccbc233ee7be364e2ca89711007b1a7&mpshare=1&scene=1&srcid=&sharer_sharetime=1572411922866&sharer_shareid=364018cf20ef36f208b4ab016d56a2de#rd
 *
 * 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
 * 输出: 4
 *
 * @author： xu.yefcion
 * @description：
 * @date： 2019/10/30 19:48
 */

public class KinList {

    @Test
    public void findKTest(){
        int[] num = {1,3,9,45,6,20,86,5,7};
        int k = 4;
        System.out.println(findKthLargest1(num,k));
        System.out.println(findKthLargest2(num,k));
        System.out.println(findKthLargest31(num,k));
        System.out.println(findKthLargest32(num,k));
        System.out.println(findKthLargest33(num,k));
        System.out.println(findKthLargest34(num,k));
        System.out.println(findKthLargest35(num,k));
    }

    public int findKthLargest1(int[] nums, int k) {
        int len = nums.length;
        Arrays.sort(nums);
        return nums[len - k];
    }

    public int findKthLargest2(int[] nums, int k) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;

        // 转换一下，第 k 大元素的索引是 len - k
        int target = len - k;

        while (true) {
            int index = partition(nums, left, right);
            if (index == target) {
                return nums[index];
            } else if (index < target) {
                left = index + 1;
            } else {
                assert index > target;
                right = index - 1;
            }
        }
    }

    public int partition(int[] nums, int left, int right) {
        int pivot = nums[left];
        int j = left;
        for (int i = left + 1; i <= right; i++) {
            if (nums[i] < pivot) {
                // 小于 pivot 的元素都被交换到前面
                j++;
                swap(nums, j, i);
            }
        }
        // 最后这一步不要忘记了
        swap(nums, j, left);
        return j;
    }

    private void swap(int[] nums, int index1, int index2) {
        if (index1 == index2) {
            return;
        }
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    public int findKthLargest31(int[] nums, int k) {
        int len = nums.length;
        // 使用一个含有 len 个元素的最小堆，默认是最小堆，可以不写 lambda 表达式：(a, b) -> a - b
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(len, (a, b) -> a - b);
        for (int i = 0; i < len; i++) {
            minHeap.add(nums[i]);
        }
        for (int i = 0; i < len - k; i++) {
            minHeap.poll();
        }
        return minHeap.peek();
    }

    public int findKthLargest32(int[] nums, int k) {
        int len = nums.length;
        // 使用一个含有 len 个元素的最大堆，lambda 表达式应写成：(a, b) -> b - a
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(len, (a, b) -> b - a);
        for (int i = 0; i < len; i++) {
            maxHeap.add(nums[i]);
        }
        for (int i = 0; i < k - 1; i++) {
            maxHeap.poll();
        }
        return maxHeap.peek();
    }

    public int findKthLargest33(int[] nums, int k) {
        int len = nums.length;
        // 使用一个含有 k 个元素的最小堆
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k, (a, b) -> a - b);
        for (int i = 0; i < k; i++) {
            minHeap.add(nums[i]);
        }
        for (int i = k; i < len; i++) {
            // 看一眼，不拿出，因为有可能没有必要替换
            Integer topEle = minHeap.peek();
            // 只要当前遍历的元素比堆顶元素大，堆顶弹出，遍历的元素进去
            if (nums[i] > topEle) {
                minHeap.poll();
                minHeap.add(nums[i]);
            }
        }
        return minHeap.peek();
    }

    public int findKthLargest34(int[] nums, int k) {
        int len = nums.length;
        // 最小堆
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k + 1, (a, b) -> (a - b));
        for (int i = 0; i < k; i++) {
            priorityQueue.add(nums[i]);
        }
        for (int i = k; i < len; i++) {
            priorityQueue.add(nums[i]);
            priorityQueue.poll();
        }
        return priorityQueue.peek();
    }

    public int findKthLargest35(int[] nums, int k) {
        int len = nums.length;
        if (k <= len - k) {
            // System.out.println("使用最小堆");
            // 特例：k = 1，用容量为 k 的最小堆
            // 使用一个含有 k 个元素的最小堆
            PriorityQueue<Integer> minHeap = new PriorityQueue<>(k, (a, b) -> a - b);
            for (int i = 0; i < k; i++) {
                minHeap.add(nums[i]);
            }
            for (int i = k; i < len; i++) {
                // 看一眼，不拿出，因为有可能没有必要替换
                Integer topEle = minHeap.peek();
                // 只要当前遍历的元素比堆顶元素大，堆顶弹出，遍历的元素进去
                if (nums[i] > topEle) {
                    minHeap.poll();
                    minHeap.add(nums[i]);
                }
            }
            return minHeap.peek();

        } else {
            // System.out.println("使用最大堆");
            assert k > len - k;
            // 特例：k = 100，用容量为 len - k + 1 的最大堆
            int capacity = len - k + 1;
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(capacity, (a, b) -> b - a);
            for (int i = 0; i < capacity; i++) {
                maxHeap.add(nums[i]);
            }
            for (int i = capacity; i < len; i++) {
                // 看一眼，不拿出，因为有可能没有必要替换
                Integer topEle = maxHeap.peek();
                // 只要当前遍历的元素比堆顶元素大，堆顶弹出，遍历的元素进去
                if (nums[i] < topEle) {
                    maxHeap.poll();
                    maxHeap.add(nums[i]);
                }
            }
            return maxHeap.peek();
        }
    }
}