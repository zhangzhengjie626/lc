package Week6.findPeakElement162;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void findPeakElement() {
        Solution solution = new Solution();
        System.out.println(solution.findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4}));
        System.out.println(solution.findPeakElement(new int[]{1, 2, 3, 1}));
        System.out.println(solution.findPeakElement(new int[]{6, 5, 4, 3, 2, 3, 2}));
    }
}