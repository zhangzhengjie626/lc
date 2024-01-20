package Week5.gameOfLife289;

import TopInterview150.Week5.gameOfLife289.Solution;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void gameOfLife() {
        int[][] test1 = new int[][]{{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        Solution solution = new Solution();
        solution.gameOfLife(test1);
    }
}