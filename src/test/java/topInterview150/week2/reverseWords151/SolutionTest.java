package topInterview150.week2.reverseWords151;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void reverseWords() {
        Solution solution = new Solution();
        System.out.println(solution.reverseWords("the sky is blue"));
        System.out.println(solution.reverseWords("  hello world  "));
        System.out.println(solution.reverseWords("a good   example"));
    }
}