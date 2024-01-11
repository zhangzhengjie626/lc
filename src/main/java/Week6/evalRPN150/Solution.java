package Week6.evalRPN150;

import java.util.Stack;

/**
 * https://leetcode.cn/problems/evaluate-reverse-polish-notation/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> s = new Stack<>();
        for (String str : tokens) {
            if (str.equals("+")) {
                String op1 = s.pop();
                String op2 = s.pop();
                int res = Integer.parseInt(op2) + Integer.parseInt(op1);
                s.push(String.valueOf(res));
            } else if (str.equals("-")) {
                String op1 = s.pop();
                String op2 = s.pop();
                int res = Integer.parseInt(op2) - Integer.parseInt(op1);
                s.push(String.valueOf(res));
            } else if (str.equals("*")) {
                String op1 = s.pop();
                String op2 = s.pop();
                int res = Integer.parseInt(op2) * Integer.parseInt(op1);
                s.push(String.valueOf(res));
            } else if (str.equals("/")) {
                String op1 = s.pop();
                String op2 = s.pop();
                int res = Integer.parseInt(op2) / Integer.parseInt(op1);
                s.push(String.valueOf(res));
            } else {
                s.push(str);
            }
        }
        return Integer.parseInt(s.peek());
    }
}
//注意运算数的顺序，第一个数在第二个数后边 测试提交