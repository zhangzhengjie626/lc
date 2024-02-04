package topInterview150.week6.evalRPN150;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void evalRPN() {
        Solution solution = new Solution();
        solution.evalRPN(new String[]{"4", "13", "5", "/", "+"});
    }
}