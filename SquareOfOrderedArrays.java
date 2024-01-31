import java.util.Arrays;

/**
 * ClassName: SquareOfOrderedArrays
 * Package: PACKAGE_NAME
 * Description:  力扣977 有序数组的平方
 *
 * @Author lilray
 * @Create 2024/1/31 11:13
 * @Version 1.0
 */
public class SquareOfOrderedArrays {
    //暴力解法
    class Solution {
        public int[] sortedSquares(int[] nums) {
            int len = nums.length;
            for(int i = 0;i< len;i++){
                nums[i] = nums[i] * nums[i];
            }

            Arrays.sort(nums);
            return nums;

        }
    }
    //双指针法
    class Solution1 {
        public int[] sortedSquares(int[] nums) {
            int len = nums.length;
            int left = 0;
            int right = len - 1;
            int index = len - 1;
            int[] result = new int[len];

            while(left <= right){
                if(nums[left] * nums[left] < nums[right] * nums[right]){
                    result[index] = nums[right]*nums[right];
                    right--;
                    index--;
                }else{
                    result[index] = nums[left] * nums[left];
                    index--;
                    left++;
                }
            }

            return result;
        }
    }
}
