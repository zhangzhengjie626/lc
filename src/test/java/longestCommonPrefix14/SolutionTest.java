package longestCommonPrefix14;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void longestCommonPrefix() {
        Solution solution = new Solution();
        System.out.println(solution.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(solution.longestCommonPrefix(new String[]{"dog","racecar","car"}));
        System.out.println(solution.longestCommonPrefix(new String[]{"ab", "a"}));
    }
}