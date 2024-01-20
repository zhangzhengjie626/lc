package TopInterview150.Week7.wordBreak139;

import TopInterview150.Week7.wordBreak139.Solution;
import org.junit.Test;

import java.util.Arrays;

public class SolutionTest {

    @Test
    public void wordBreak() {
        Solution solution = new Solution();
        System.out.println(solution.wordBreak("leetcode", Arrays.asList("leet", "code")));
    }
}