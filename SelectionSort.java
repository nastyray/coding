import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

/**
 * ClassName: SelectionSort
 * Package: PACKAGE_NAME
 * Description: 选择排序
 *
 * @Author lilray
 * @Create 2024/2/14 21:13
 * @Version 1.0
 */
public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int len = arr.length;
        for (int i = 0;i < len - 1;i++){
            int minIndex = i;  //min是下标，不是数本身
            for (int j = i + 1;j < len/*内部要比到最后一个*/ ;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 1, 6};
        int[] expectedArr = {1, 2, 3, 5, 6, 8};
        SelectionSort.selectionSort(arr);
        System.out.println("arr = " + Arrays.toString(arr));
        Assertions.assertArrayEquals(expectedArr, arr);
    }
}
