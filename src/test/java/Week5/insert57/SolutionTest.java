package Week5.insert57;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void insert() {
        int[][] test = new int[][]{{2,5},{6,7},{8,9}};
        Solution solution = new Solution();
        System.out.println(Arrays.deepToString(solution.insert(test, new int[]{0, 1})));
    }
}