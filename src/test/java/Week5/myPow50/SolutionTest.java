package Week5.myPow50;

import org.junit.Test;

import static org.junit.Assert.*;

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