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
    

}
