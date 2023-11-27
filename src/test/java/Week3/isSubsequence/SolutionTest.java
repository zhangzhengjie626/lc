package Week3.isSubsequence;

import org.junit.Test;

import static org.junit.Assert.*;

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