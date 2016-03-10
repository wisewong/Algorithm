package wz.leetcode.problem35;

/**
 * Solution
 *
 * @author wz
 * @date 2016年05月05日 22:05
 */
public class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0,high = nums.length-1,mid;
        while (low<=high){
            mid = (low+high)/2;
            if (target == nums[mid])
                return mid;
            if (target>nums[mid])
                low = mid + 1;
            else
                high = mid -1;
        }
        if (target>nums[low])
            return low;
        return high;
    }
}
