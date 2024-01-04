package Week5.randomizedSet380;

import java.util.*;

/**
 * https://leetcode.cn/problems/insert-delete-getrandom-o1/description/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {

}

class RandomizedSet {
    private List<Integer> list;
    private Map<Integer, Integer> map;

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        } else {
            list.add(val);
            map.put(val, list.size() - 1);
            return true;
        }

    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        } else {
            int tmp = map.get(val);
            map.put(list.get(list.size() - 1), tmp);
            list.set(tmp, list.get(list.size() - 1));
            map.remove(val);
            list.remove(list.size() - 1);
            return true;
        }
    }

    public int getRandom() {
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }
}