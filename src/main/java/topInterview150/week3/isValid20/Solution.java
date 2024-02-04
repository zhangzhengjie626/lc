package topInterview150.week3.isValid20;

import java.util.HashMap;
import java.util.Stack;

/**
 * 20.有效的括号
 */
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('(', ')');
        map.put('[', ']');
        for (int i = 0; i < s.length(); i++) {
            Character peek = null;
            if (!stack.isEmpty()) {
                peek = stack.peek();
            }
            if (peek != null && map.containsKey(peek) && s.charAt(i) == map.get(peek)) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}
//寄1 ："([)]" map不包含右括号