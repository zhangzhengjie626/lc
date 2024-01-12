package Week6.minStack155;

import java.util.Stack;

/**
 * https://leetcode.cn/problems/min-stack/?envType=study-plan-v2&envId=top-interview-150
 */
class MinStack {

    private Stack<Integer> mins;
    private Stack<Integer> s;
    private int min;

    public MinStack() {
        s = new Stack<>();
        mins = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int val) {
        s.push(val);
        if (val < min) {
            min = val;
        }
        mins.push(min);
    }

    public void pop() {
        s.pop();
        mins.pop();
        //栈空判断
        if (mins.isEmpty()) {
            min = Integer.MAX_VALUE;
        } else {
            min = mins.peek();
        }
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return min;
    }
}
//解法1辅助栈

//解法2 原地记录差值

class MinStack2 {

    private Stack<Long> s;
    private long min;

    public MinStack2() {
        s = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int val) {
        //栈空和非空的逻辑不一致
        if (s.isEmpty()) {
            min = val;
            s.push(0L);
        } else {
            //栈中记录和上一个最小值的差值,用来 在出栈的时候，还原上一个最小值
            s.push((long) (val - min));
            if (val < min) {
                min = val;
            }
        }
    }

    public void pop() {
        long pop = s.pop();
        if (pop < 0) {
            min = min - pop;
        }
    }

    public int top() {
        if (s.peek() < 0) {
            return (int) min;
        } else {
            return (int) (min + s.peek());
        }
    }

    public int getMin() {

        return (int) min;
    }
}
//0 -2
//2 -2
//-1 -3
//栈中记录和上一个最小值的差值， 最小值
//["MinStack","push","push","push","getMin","pop","top","getMin"]
//[[],[-2],[0],[-3],[],[],[],[]]

//[null,null,null,null,-3,null,0,-2]

//int越界了  -2147483648 - 2147483647 越界了  val - min
//做差时都需要考虑越界问题