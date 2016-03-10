package wz.leetcode.problem27;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Solution
 *
 * @author wz
 * @date 2016年05月09日 21:30
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=val)
                nums[len++] = nums[i];
        }
        return len;
//        int start = -1,end = -1;
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == val){
//                start = i;
//                break;
//            }
//        }
//        if (start==-1)
//            return nums.length;
//        for (int i = start+1; i<=nums.length;i++){
//            end = i;
//            if (i== nums.length || nums[i] != val)
//                break;
//        }
//        for(int i =start,j=end;j<nums.length;i++,j++){
//            nums[i] = nums[j];
//        }
//
//        return nums.length-(end-start);
    }
}
