package wz.leetcode.problem283;

/**
 * Solution
 *
 * @author wz
 * @date 2016年05月03日 22:02
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0,j = 0;
        while (i<nums.length && nums[i]!=0)
            i++;
        j = i+1;
        while (j<nums.length && nums[j]==0)
            j++;
        while (j<nums.length){
            if (nums[j]==0)
                j++;
            else
                nums[i++] = nums[j++];
        }
        while (i<nums.length)
            nums[i++] = 0;
    }

    public static void main(String[] args) {
        new Solution().moveZeroes(new int[]{0,1,0,3,12});
    }
}
