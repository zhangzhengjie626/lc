package topInterview150.week3.canConstruct383;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void canConstruct() {
        Solution solution = new Solution();
        System.out.println(solution.canConstruct("a", "b"));
        System.out.println(solution.canConstruct("aa", "ab"));
        System.out.println(solution.canConstruct("aa", "aab"));
    }
}