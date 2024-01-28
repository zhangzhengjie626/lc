package Contest.weeklyContest382.maximumLength100206;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void maximumLength() {
        Solution solution = new Solution();
        System.out.println(solution.maximumLength(new int[]{5, 4, 1, 2, 2}));
        System.out.println(solution.maximumLength(new int[]{1, 3, 2, 4}));
        System.out.println(solution.maximumLength(new int[]{1, 1, 1, 4}));
        System.out.println(solution.maximumLength(new int[]{1, 1}));
        System.out.println(solution.maximumLength(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 4, 6, 8, 16, 32, 64, 256, 512, 1024}));
//        System.out.println((int) Math.sqrt(2));
    }
}