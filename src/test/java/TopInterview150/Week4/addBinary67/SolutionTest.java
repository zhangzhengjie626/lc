package TopInterview150.Week4.addBinary67;

import TopInterview150.Week4.addBinary67.Solution;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void addBinary() {
        Solution solution = new Solution();
        System.out.println(solution.addBinary("11", "1"));
        System.out.println(solution.addBinary("1010", "1011"));
        System.out.println(solution.addBinary("100", "110010"));
        System.out.println(solution.addBinary("100", "110010"));
        System.out.println(solution.addBinary("111", "101010"));
    }
}