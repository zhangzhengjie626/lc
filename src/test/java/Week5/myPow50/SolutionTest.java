package Week5.myPow50;

import TopInterview150.Week5.myPow50.Solution;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void myPow() {
        Solution solution = new Solution();
        System.out.println(solution.myPow(2.0, 10));
        System.out.println(solution.myPow(2.1, 3));
        System.out.println(solution.myPow(2.0, -2));
        System.out.println(solution.myPow(2.00000, -2147483648));
        System.out.println(solution.myPow(1.00000, -2147483648));
    }
}