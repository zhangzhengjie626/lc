package TopInterview150.Week3.isValid20;

import TopInterview150.Week3.isValid20.Solution;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void isValid() {
        Solution solution = new Solution();
        System.out.println(solution.isValid("()"));
        System.out.println(solution.isValid("()[]{}"));
        System.out.println(solution.isValid("(]"));
        System.out.println(solution.isValid("([)]"));
    }
}