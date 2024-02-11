package contest.weeklyContest384;

import contest.weeklyContest384.modifiedMatrix100230.Solution;
import org.junit.Test;

import java.util.Arrays;

public class SolutionTest {

    @Test
    public void modifiedMatrix() {
        Solution solution = new Solution();
        System.out.println(Arrays.deepToString(solution.modifiedMatrix(new int[][]{{1, 2, -1}, {4, -1, 6}, {7, 8, 9}})));
        System.out.println(Arrays.deepToString(solution.modifiedMatrix(new int[][]{{3, -1}, {5, 2}})));
    }
}