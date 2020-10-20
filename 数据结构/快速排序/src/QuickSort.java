/*
优化：
1.partition 挖坑（小细节优化）
2.数量比较少的时候，不是最快（当区间内的个数低于某个阈值时（16），使用插排）
3.优化选择特殊的数的方式---现在的方式选左边
（1）随机选
（2）挑几个数，选大小为中间的（三数取中）
4.把相等的值特殊处理（建立小区间放相同的数使后面不需再重复swap）
 */
import sun.applet.resources.MsgAppletViewer;

public class QuickSort {
    public static void quickSort(long[] array) {
        quickSortInternal(array, 0, array.length - 1);
    }

    // 区间是 [lowIndex, highIndex]
    private static void quickSortInternal(long[] array, int lowIndex, int highIndex) {
        // 由于是闭区间，所以，区间内个个数需要加个 1
        int size = highIndex - lowIndex + 1;
        if (size <= 1) {
            return;
        }

        // 选择其中一个数（选最左边的） —— array[lowIndex]
        // 执行 partition，小的放左，大的放右
        // keyIndex 是经过 partition 之后，选出来的数最终所在下标
        int keyIndex = partition(array, lowIndex, highIndex);
        // 分别对左右区间进行相同的处理 —— 递归方法
        quickSortInternal(array, lowIndex, keyIndex - 1);
        quickSortInternal(array, keyIndex + 1, highIndex);
    }

    // 区间是 array[lowIndex, highIndex]
    // 1. 选择 array[lowIndex] 作为特殊的数
    // 2. 需要遍历整个区间（不能遗漏任何的数）和 选出来的数比较
    // 3. 保证 小于等于的在左边，大于等于的在右边（但没有顺序要求)
    private static int partition(long[] array, int lowIndex, int highIndex) {
        // 选择合适的方法
        return partitionHover(array, lowIndex, highIndex);
    }


    //交换
    private static void swap(long[] array, int index1, int index2) {
        long t = array[index1];
        array[index1] = array[index2];
        array[index2] = t;
    }


    //Hover法
    private static int partitionHover(long[] array, int lowIndex, int highIndex) {
        int leftIndex = lowIndex;
        int rightIndex = highIndex;
        // 选择的数是最左边的一个
        long key = array[lowIndex];
        // 选择了最左边，从右边先走

        // 停止条件 leftIndex == rightIndex
        // 循环的继续的条件 leftIndex < rightIndex
        while (leftIndex < rightIndex) {

            while (leftIndex < rightIndex && array[rightIndex] >= key) {
                rightIndex--;
            }
            // 说明 [rightIndex] 遇到了小的了

            while (leftIndex < rightIndex && array[leftIndex] <= key) {
                leftIndex++;
            }
            // 说明 [leftIndex] 遇到了大的了

            swap(array, leftIndex, rightIndex);
        }

        swap(array, lowIndex, leftIndex);

        return leftIndex;
    }


    //挖坑法（Hover优化）
    private static int partition挖坑(long[] array, int lowIndex, int highIndex) {

        int left = lowIndex;
        int right = highIndex;

        long key = array[lowIndex];

        while(left < right ) {
            while(left < right && array[right] >= key) {
                right--;
            }

            array[left] = array[right];

            while(left < right && array[left] <= key) {
                left++;
            }

            swap(array,left,right);

        }
        return left;
    }
}
