package Week2.romanToInt13;

import Week2.romanToInt13.Solution;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void romanToInt() {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("III"));
        System.out.println(solution.romanToInt("IV"));
        System.out.println(solution.romanToInt("IX"));
        System.out.println(solution.romanToInt("LVIII"));
        System.out.println(solution.romanToInt("MCMXCIV"));
    }
}