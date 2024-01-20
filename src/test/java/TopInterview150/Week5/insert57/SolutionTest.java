package TopInterview150.Week5.insert57;

import TopInterview150.Week5.insert57.Solution;
import org.junit.Test;

import java.util.Arrays;

public class SolutionTest {

    @Test
    public void insert() {
        int[][] test = new int[][]{{2,5},{6,7},{8,9}};
        Solution solution = new Solution();
        System.out.println(Arrays.deepToString(solution.insert(test, new int[]{0, 1})));
    }
}