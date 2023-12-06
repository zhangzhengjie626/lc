package Week4.summaryRanges228;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void summaryRanges() {
        Solution solution = new Solution();
        System.out.println(solution.summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));
        System.out.println(solution.summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9}));
    }
}