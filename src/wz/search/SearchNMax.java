package wz.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * SearchNMax
 * 统计出现次数前N的数字
 * @author wz
 * @date 2016年05月13日 8:39
 */
public class SearchNMax {
    public void search(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]))
                map.put(nums[i],map.get(nums[i])+1);
            else
                map.put(nums[i],1);
        }
        ArrayList<Map.Entry> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries,(o1, o2) -> ((Integer)o1.getValue()).compareTo((Integer)o2.getValue()));

    }
}
