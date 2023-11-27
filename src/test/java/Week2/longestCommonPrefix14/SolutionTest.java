package Week2.longestCommonPrefix14;

import Week2.longestCommonPrefix14.Solution;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void longestCommonPrefix() {
        Solution solution = new Solution();
        System.out.println(solution.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(solution.longestCommonPrefix(new String[]{"dog","racecar","car"}));
        System.out.println(solution.longestCommonPrefix(new String[]{"ab", "a"}));
    }
}