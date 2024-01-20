package TopInterview150.Week2.hIndex274;

import java.util.HashMap;
import java.util.Map;

/**
 * 274.H指数
 */
public class Solution {
    public int hIndex(int[] citations) {
        //我的思路：统计每个引用次数的文章数目，输出>=文章数目的最大的值
        //估计有性能问题，但是一时半会想不出来其他方法了，先试试能过几个再说
        //哇，过了，虽然性能不高
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < citations.length; i++) {
            map.put(i + 1, 0);
        }
        for (int i = 0; i < citations.length; i++) {
            for (int j = 1; j <= Math.min(citations[i], citations.length); j++) {
                map.put(j, map.get(j) + 1);
            }
        }
        int max = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue() >= e.getKey()) {
                max = e.getKey();
            }
        }
        return max;
    }
}