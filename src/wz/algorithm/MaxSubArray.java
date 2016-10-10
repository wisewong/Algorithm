package wz.algorithm;

/**
 * MaxSubArray
 * 最大子数组和
 *
 * @author wz
 * @date 16/10/10 11:17
 */
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int max = nums[0],maxEndHere = nums[0];
        for (int i = 0; i<nums.length ;i++ ) {
            maxEndHere = Math.max(maxEndHere+nums[i],nums[i]);
            max = Math.max(maxEndHere,max);
        }
        return max;
    }

}
