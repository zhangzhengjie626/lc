package topInterview150.week3.isSubsequence392;

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