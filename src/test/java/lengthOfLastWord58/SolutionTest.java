package lengthOfLastWord58;

import Week2.lengthOfLastWord58.Solution;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void lengthOfLastWord() {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLastWord("Hello World"));
        System.out.println(solution.lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(solution.lengthOfLastWord("luffy is still joyboy"));
        System.out.println(solution.lengthOfLastWord(" a"));
        System.out.println(solution.lengthOfLastWord("Today is a nice day"));
    }
}