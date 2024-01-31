import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

/**
 * ClassName: BubbleSort
 * Package: PACKAGE_NAME
 * Description:  冒泡排序
 *
 * @Author lilray
 * @Create 2024/1/31 11:44
 * @Version 1.0
 */
public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int len = arr.length;
        for(int i = 0;i < len;i++){
            for (int j = 0;j < len - 1 - i;j++){
                if (arr[j] > arr[j + 1]) {
                    // 交换arr[j+1]和arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 1, 6};
        int[] expectedArr = {1, 2, 3, 5, 6, 8};
        BubbleSort.bubbleSort(arr);
        System.out.println("arr = " + Arrays.toString(arr));
        Assertions.assertArrayEquals(expectedArr, arr);
    }
}
