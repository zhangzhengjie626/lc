package topInterview150.week3.isValid20;

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