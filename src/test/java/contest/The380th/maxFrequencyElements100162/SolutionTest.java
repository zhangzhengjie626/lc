package contest.The380th.maxFrequencyElements100162;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void maxFrequencyElements() {
        Solution solution = new Solution();
        System.out.println(solution.maxFrequencyElements(new int[]{1, 2, 2, 3, 1, 4}));
        System.out.println(solution.maxFrequencyElements(new int[]{1, 2, 3, 4, 5}));
    }
}