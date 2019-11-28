public class Array_13_sort {
    public static void main(String[] args) {
        // 常用10种排序算法
        int arr[] = new int[]{2, 3, -5, 37, 11, 13, 17, 19};
        System.out.println("数组为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 1、冒泡排序：相邻两元素进行比较，如有需要则进行交换，
        // 每完成一次循环就将最大元素排在最后（如从小到大排序）
        // 下一次循环是将其它的数进行类似操作。
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("排序结果：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // 2、直接选择排序
        // 在一组元素R[i]到R[n]中选择具有最小关键码的元素
        // 若它不是这组元素中的第一个元素，则将它与这组元素中的第一个元素对调。
        // 除去具有最小关键字的元素，在剩下的元素中重复第（1）、（2）步，
        // 直到剩余元素只有一个为止。
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("\n排序结果：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
