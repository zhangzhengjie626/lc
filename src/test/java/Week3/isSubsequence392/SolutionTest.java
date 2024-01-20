package Week3.isSubsequence392;

import TopInterview150.Week3.isSubsequence392.Solution;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void isSubsequence() {
        Solution solution = new Solution();
        System.out.println(solution.isSubsequence("abc","ahbgdc"));
        System.out.println(solution.isSubsequence("axc","ahbgdc"));
        System.out.println(solution.isSubsequence("acb","ahbgdc"));//寄1
        System.out.println(solution.isSubsequence("aaaaaa","bbaaaa"));//寄2

    }
}