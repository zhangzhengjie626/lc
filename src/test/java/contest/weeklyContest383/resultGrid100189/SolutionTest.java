package contest.weeklyContest383.resultGrid100189;

import org.junit.Test;

import java.util.Arrays;

public class SolutionTest {

    @Test
    public void resultGrid() {
        Solution solution = new Solution();
//        System.out.println(Arrays.deepToString(solution.resultGrid(new int[][]{{5, 6, 7, 10}, {8, 9, 10, 10}, {11, 12, 13, 10}}, 3)));
//        System.out.println(Arrays.deepToString(solution.resultGrid(new int[][]{{10, 20, 30}, {15, 25, 35}, {20, 30, 40}, {25, 35, 45}}, 12)));
//        System.out.println(Arrays.deepToString(solution.resultGrid(new int[][]{{5, 6, 7}, {8, 9, 10}, {11, 12, 13}}, 1)));
        System.out.println(Arrays.deepToString(solution.resultGrid(new int[][]{{1, 1, 4, 1}, {10, 8, 13, 17}, {2, 12, 1, 16}}, 14)));
    }
}


/**
 * 输入：
 * [[1,1,4,1],[10,8,13,17],[2,12,1,16]]
 * 14
 * 输出：
 * [[1,1,4,1],[10,8,13,17],[2,12,1,16]]
 * 预期：
 * [[5,5,5,1],[5,5,5,17],[5,5,5,16]]
 */