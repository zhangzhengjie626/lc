package Week2.strStr28;

import TopInterview150.Week2.strStr28.Solution;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void strStr() {
        Solution solution = new Solution();
        System.out.println(solution.strStr("sadbutsad", "sad"));
        System.out.println(solution.strStr("leetcode", "leeto"));
    }
}