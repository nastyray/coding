import java.awt.font.NumericShaper;

/**
 * ClassName: ErFenChaZhao
 * Package: PACKAGE_NAME
 * Description:  力扣704.二分查找
 *
 * @Author lilray
 * @Create 2024/1/23 11:22
 * @Version 1.0
 */
public class ErFenChaZhao {
    //自己写出来的
    public int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int m = 0;
        boolean flag = false;
        while (i <= j) {
            m = (i + j) / 2;
            if (nums[m] == target) {
                flag = true;
                break;
            }
            if (nums[m] > target) {
                j = m - 1;
            }
            if (nums[m] < target) {
                i = m + 1;
            }
        }
        if (flag == true) {
            return m;
        } else {
            return -1;
        }


    }

    //代码随想录题解（版本一）左闭右闭区间
    class Solution {
        public int search(int[] nums, int target) {
            // 避免当 target 小于nums[0] nums[nums.length - 1]时多次循环运算
            if (target < nums[0] || target > nums[nums.length - 1]) {
                return -1;
            }
            int left = 0, right = nums.length - 1;
            while (left <= right) {
                int mid = left + ((right - left) >> 1);  // 防止溢出 等同于(left + right)/2
                if (nums[mid] == target)
                    return mid;
                else if (nums[mid] < target)
                    left = mid + 1;
                else if (nums[mid] > target)
                    right = mid - 1;
            }
            return -1;
        }
    }

    //（版本二）左闭右开区间
    class Solution2 {
        public int search(int[] nums, int target) {
            int left = 0, right = nums.length;
            while (left < right) {
                int mid = left + ((right - left) >> 1);
                if (nums[mid] == target)
                    return mid;
                else if (nums[mid] < target)
                    left = mid + 1;
                else if (nums[mid] > target)
                    right = mid;
            }
            return -1;
        }
    }





}
