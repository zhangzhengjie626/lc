package Week5.groupAnagrams49;

import java.sql.Array;
import java.util.*;
import java.util.stream.Stream;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> resMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            if (resMap.containsKey(sort(strs[i]))) {
                resMap.get(sort(strs[i])).add(strs[i]);
            } else {
                ArrayList<String> tmp = new ArrayList<>();
                tmp.add(strs[i]);
                resMap.put(sort(strs[i]), tmp);
            }

        }
        return new ArrayList<>(resMap.values());
    }

    private String sort(String str) {
        ArrayList<String> tmp = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            tmp.add(str.charAt(i) + "");
        }
        Collections.sort(tmp);
        StringBuilder stringBuffer = new StringBuilder();
        for (int i = 0; i < tmp.size(); i++) {
            stringBuffer.append(tmp.get(i));
        }
        return stringBuffer.toString();
    }
}
//瞎写的，过是过了，但是效率太低了