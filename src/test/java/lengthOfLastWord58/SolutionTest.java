package lengthOfLastWord58;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

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