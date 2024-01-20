package Week3.isPalindrome125;

import TopInterview150.Week3.isPalindrome125.Solution;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void isPalindrome() {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(solution.isPalindrome("race a car"));
        System.out.println(solution.isPalindrome(" "));
        System.out.println(solution.isPalindrome("0P"));
    }
}