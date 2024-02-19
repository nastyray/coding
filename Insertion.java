import org.junit.jupiter.api.Assertions;
import java.util.Arrays;

/**
 * 插入排序
 */
public class Insertion {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        // 外部循环从第二个元素开始，到最后一个为止
        // 因为我们将第一个元素视为已排序部分
        for (int i = 1; i < n; i++) {
            int key = arr[i];    //先把key的值给取出来
            int j = i - 1;  //已经排序好的元素
            // 将当前值key和前面的值进行比较，
            // 如果前面的值>key 则将值往后移1位
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            // 在不小当前值key的位置，插入当前值key
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 1, 6};
        int[] expectedArr = {1, 2, 3, 5, 6, 8};
        Insertion.insertionSort(arr);
        System.out.println("arr = " + Arrays.toString(arr));
        Assertions.assertArrayEquals(expectedArr, arr);
    }
}