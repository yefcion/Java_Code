package algorithm;

/**
 * @author： xu.yefcion
 * @description：
 * @date： 2019/10/30 20:44
 */

public class SortList {
    /**
     * 交换a数组中i和j的位置
     *
     * @param a 需要交换的数组
     * @param i 位置
     * @param j 位置
     */
    public static void exc(int a[], int i, int j) {
        // 当他们相等的时候就没必要进行交换
        if (a[i] != a[j]) {
            a[i] ^= a[j];
            a[j] ^= a[i];
            a[i] ^= a[j];
        }
    }

    /**
     * 选择排序
     * @param a 进行排序的数组
     */
    public static int[] selectionSort(int a[]){
        int min;
        for(int i=0;i<a.length;i++){
            min = i;
            // 这个for循环是为了找出最小的值
            for (int j = i+1; j < a.length; j++) {
                if(a[min]>a[j]){
                    min = j;
                }
            }
            /** 如果第一个取出的元素不是最小值，就进行交换
             * 意思就是：如果取出的元素就是最小值，那么就没有必要进行交换了 		   */
            if(min != i){
                // 进行交换
                exc(a, i, min);
            }
        }
        return a;
    }

    /**
     * 插入排序
     * @param a 进行排序的数组
     * @return 返回排序好的数组
     */
    public static int[] insertSort(int a[]) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            // 如果a[i]比前面的数字小，则a[i]向前挪
            for (int j = i; j >0 && (a[j-1]>a[j]); j--) {
                exc(a, j, j-1);
            }
        }
        return a;
    }

    /**
     * 冒泡排序
     * @param a
     * @return
     */
    public static int[] bubbleSort(int[] a) {
        int N = a.length;
        for (int i = 0; i < N - 1; i++) {
            // 小的数字向上冒泡
            for (int  j= N-1; j > i; j--) {
                // 交换位置
                if(a[j-1]>a[j]){
                    exc(a, j-1, j);
                }
            }
        }
        return a;
    }

    /**
     * 冒泡排序的优化
     * @param a
     * @return
     */
    public static int[] bubbleSort2(int[] a) {
        int N = a.length;
        boolean flag = true;
        for (int i = 0; i < N - 1 && flag; i++) {
            int j = N-1;
            for (flag = false; j > i; j--) {
                if(a[j-1]>a[j]){
                    flag = true;
                    exc(a, j-1, j);
                }
            }
        }
        return a;
    }

    /**
     * 梳排序
     * @param a
     * @return
     */
    public static int[] combSort(int[] a) {
        int N = a.length;
        int step = N;
        int k;
        // 第一部分
        while((step /= 1.3) > 1) {
            for (int i = N-1; i >= step; i--) {
                k = i -step;
                if(a[k]>a[i]){
                    // 交换位置
                    exc(a, k, i);
                }
            }
        }
        // 第二部分：进行冒泡排序
        a= bubbleSort2(a);
        return a;
    }

    /**
     * shell排序
     * @param a
     * @return
     */
    public static int[] shellSort(int[] a){
        int N = a.length;
        int h = 1;
        // 增量序列
        while(h < N/3){
            // h = 1,4,13,40,……
            h = h*3 + 1;
        }

        while(h>=1){
            for (int i = h; i < N; i++) {
                // 进行插入排序，诺a[j]比a[j-h]小，则向前挪动h
                for (int j = i; j >= h && a[j-h]>a[j]; j -= h) {
                    exc(a, j, j-h);
                }
            }
            h /= 3;
        }
        return a;
    }

    /**
     * 进行切分，并进行交换
     * @param a 数组
     * @param lo 切分开始的位置
     * @param h 切分结束的位置
     * @return 返回分界点的位置
     */
    public static int partition(int[] a,int lo,int h){
        // 选取中间的值为基准值
        int middle = (lo+h+1)/2;
        int v = a[middle];
        // 将基准值和a[lo]交换位置
        exc(a, lo, middle);

        int i = lo;
        int j = h+1;
        while(true){

            // 假如左边的小于基准值，则一直进行循环
            while(a[++i] < v){
                // 防止越界
                if(i == h){
                    break;
                }
            }
            // 假如右边的大于基准值，则一直进行循环
            while(a[--j]>v){
                if(j == lo){
                    break;
                }
            }

            // 一旦i>=j则代表i前面的除第一个外都比基准值小，j后面的都比基准值大，这时候就可以跳出循环了
            if(i>=j){
                break;
            }

            // 进行交换(因为a[lo]>v,a[h]<v，所以将两者进行交换)
            exc(a, i,j);
        }
        // 将基准放到分界点
        exc(a, lo, j);
        return j;
    }

    /**
     * 调用quickSort函数
     * @param a 数组
     */
    public static void quickSort(int[] a){
        quickSort(a,0,a.length-1);
    }

    /**
     * 进行递归的快排
     * @param a
     * @param lo
     * @param h
     */
    public static void quickSort(int[] a,int lo,int h){
        if(h <= lo) {
            return ;
        }
        // j为基准值的位置
        int j = partition(a, lo, h);
        // 进行递归调用，将j前面的进行快排
        quickSort(a,lo,j-1);
        // 进行递归调用，将j后面的进行快排
        quickSort(a,j+1,h);
    }

    /**
     * 小的结点往下移动
     * @param a
     * @param k 开始移动的位置
     * @param N 下沉结束位置
     */
    public static void sink(int[] a,int k,int N) {
        // 满足向下移动的条件
        while(2*k+1 <= N){
            int j = 2*k + 1;
            // 从 a[j]和a[j+1]中a比较出较大的元素
            if(j < N -1 && a[j+1] > a[j]){
                j ++;
            }
            if(a[j] < a[k]){
                break;
            }
            // 将大的元素移动到上面去
            exc(a, k, j);
            k = j;
        }
    }

    public static void heepSort(int[] a) {
        int N = a.length;

        // 构造一个堆有序
        for (int i = N/2; i >= 0; i--) {
            sink(a, i,N - 1);
        }
        N = N -1;
        // 然后进行下沉排序
        while(N>0){
            exc(a, 0, N--);
            sink(a, 0,N);
        }
    }

    // 临时空间
    public static int[] aux;
    /**
     * 进行归并操作
     * @param a　数组
     * @param lo　第一部分数组的开始位置
     * @param middle　第一部分数组归并的结束位置
     * @param hi　第二部分数组归并的结束位置
     */
    public static void merge(int[] a,int lo,int middle,int hi) {
        int i = lo;
        // 第二部分数组归并的开始位置
        int j = middle +1;

        // 将a[lo..hi]的内容复制到aux[lo..hi]
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        for (int z = lo; z <= hi; z++) {

            if(i > middle){
                a[z] = aux[j++];
            }else if(j > hi){
                a[z] = aux[i++];
            }else if(aux[i] > aux[j]){
                a[z] = aux[j++];
            }else{
                a[z] = aux[i++];
            }
        }
    }

    public static void mergeSort(int[] a){
        aux = new int[a.length];
        mergeSort(a, 0, a.length-1);
    }

    public static void mergeSort(int[] a, int lo, int hi ){
        if(lo >= hi){
            return;
        }
        int middle = (lo + hi)/2;
        // 对左半边进行排序
        mergeSort(a,lo,middle);
        // 对右半边进行排序
        mergeSort(a,middle+1,hi);
        // 进行归并
        merge(a, lo, middle, hi);
    }
}
