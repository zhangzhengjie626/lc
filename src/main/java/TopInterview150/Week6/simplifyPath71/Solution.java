package TopInterview150.Week6.simplifyPath71;

import java.util.Stack;

/**
 * https://leetcode.cn/problems/simplify-path/description/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        for (String cur : path.split("/")) {
            if (cur.equals(".") || cur.isEmpty() || (cur.equals("..") && s.isEmpty())) {
                continue;
                //判空
            } else if (cur.equals("..")) {
                s.pop();
            } else {
                s.push(cur);
            }
        }
        String res = "";
        while (!s.isEmpty()) {
            res = "/" + s.pop() + res;
        }
        return res.isEmpty() ? "/" : res;
    }
}
//效率低了点