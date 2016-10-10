package wz.leetcode.problem119;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution
 *
 * @author wz
 * @date 2016年06月15日 22:22
 */
public class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> res = new ArrayList<>(rowIndex+1);

        if (rowIndex==0)
            return res;

        res.add(1);
        List<Integer> temp;
        for (int i=2;i<=rowIndex+1;i++){
            temp = new ArrayList<>(i);
            temp.add(1);
            for (int j = 1; j <= i-2; j++)
                temp.add(res.get(j-1)+res.get(j));
            temp.add(1);
            res = temp;
        }
        return res;
    }
}
