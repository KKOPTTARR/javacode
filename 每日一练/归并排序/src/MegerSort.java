/*
2020年9月29日
LeetCode上看到的比较简单的归并排序
1.组件一个新数组，用空间换时间
2.两个指针，线性扫描这个数组，来对比，放入新数组中排好序。
3.再将新数组中的值放回数组
注意指针的细节问题就可以

只需一个数组。

补充归并排序的思想
一个数组，定义中间点，一分为二，直至小于两个数
新一个小数组，也有两个部分，这两个部分两个指针，线性扫描，对比，小的先放入头部就行。
*/
public class MegerSort {
    public static void main(String[] args) {
        int[] arr1 = {23, 32, 54, 12, 6, 7, 9, 3, 5, 12, 29, 93, 98, 12, 42};
        MegerSort s = new MegerSort();
        s.quartion(arr1, 0, arr1.length - 1);
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }

    public void quartion(int arr[], int low, int high) {
        // 至少有两个数来排序
        if (low >= high) return;
        // 重要，一分为二分治
        int mid = low + (high - low) / 2;
        quartion(arr, low, mid);
        quartion(arr, mid + 1, high);

        // 最后才合并
        merge(arr, low, mid, high);
    }

    public void merge(int arr[], int low, int mid, int high) {
        // 新数组
        int temp[] = new int[high - low + 1];
        // 确定指针
        int i = low, j = mid + 1;
        // 线性扫描
        // 注意前置条件！！必须i <= mid或者 j <= high, 不然i 和 j就一直增长
        for (int z = 0; z < temp.length; z++) {
            // 想放入左边数组进入temp[z]：
            // 1.j > high
            // 2.arr[i] < arr[j]
            if (i <= mid && (j > high || arr[i] <= arr[j])) {
                temp[z] = arr[i++];
            }
            // 想放入右边数组进入temp[z]：
            // 1.i > mid
            // 2.arr[j] < arr[i];
            else if (j <= high && (i > mid || arr[j] <= arr[i])) {
                temp[z] = arr[j++];
            }
        }
        // 放回arr
        for (int z = 0; z < temp.length; z++) {
            arr[low + z] = temp[z];
        }
    }
}


//https://blog.csdn.net/qq_34060370/article/details/108928332