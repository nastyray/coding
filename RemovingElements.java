/**
 * ClassName: RemovingElements
 * Package: PACKAGE_NAME
 * Description:  力扣27.移除元素
 *
 * @Author lilray
 * @Create 2024/1/24 11:49
 * @Version 1.0
 */
public class RemovingElements {




    //暴力解法
    class Solution {
        public int removeElement(int[] nums, int val) {
            int len = nums.length;
            for(int i = 0;i < len;i++){ // 发现需要移除的元素，就将数组集体向前移动一位
                if(nums[i] == val){
                    for(int j = i + 1;j< len;j++){
                        nums[j - 1] = nums [j];
                    }
                    i--; // 因为下标i以后的数值都向前移动了一位，所以i也向前移动一位
                    len--; // 此时数组的大小-1
                }
            }
            return len;
        }
    }

    // 快慢指针法，时间复杂度：O(n)
    // 空间复杂度：O(1)
    class Solution1 {
        public int removeElement(int[] nums, int val) {
            int fast = 0;
            int slow = 0;
            int len = nums.length;
            for( fast = 0;fast<len;fast++ ){
                if(nums[fast]!= val){
                    nums[slow] = nums[fast];
                    slow++;
                }


            }
            return slow;
        }
    }

    //相向双指针法
    class Solution2 {
        public int removeElement(int[] nums, int val) {
            int left = 0;
            int right = nums.length - 1;
            while(right >= 0 && nums[right] == val) right--; //将right移到从右数第一个值不为val的位置
            while(left <= right) {
                if(nums[left] == val) { //left位置的元素需要移除
                    //将right位置的元素移到left（覆盖），right位置移除
                    nums[left] = nums[right];
                    right--;
                }
                left++;
                while(right >= 0 && nums[right] == val) right--;
            }
            return left;
        }
    }

    // 相向双指针法（版本二）
    class Solution3 {
        public int removeElement(int[] nums, int val) {
            int left = 0;
            int right = nums.length -1;
            int len = nums.length;

            while(left <= right){
                if(nums[left] == val){
                    nums[left] = nums[right];
                    right--;
                }else{
                    left++;  // 这里兼容了right指针指向的值与val相等的情况
                }
            }

            return left;
        }
    }


}
