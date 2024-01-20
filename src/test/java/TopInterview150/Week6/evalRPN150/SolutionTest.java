package TopInterview150.Week6.evalRPN150;

import TopInterview150.Week6.evalRPN150.Solution;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void evalRPN() {
        Solution solution = new Solution();
        solution.evalRPN(new String[]{"4", "13", "5", "/", "+"});
    }
}