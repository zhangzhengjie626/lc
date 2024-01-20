package TopInterview150.Week2.intToRoman12;

import TopInterview150.Week2.intToRoman12.Solution;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void intToRoman() {
        Solution solution = new Solution();
        System.out.println(solution.intToRoman(3));
        System.out.println(solution.intToRoman(4));
        System.out.println(solution.intToRoman(9));
        System.out.println(solution.intToRoman(58));
        System.out.println(solution.intToRoman(1994));
    }
}