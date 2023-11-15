package merge;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void merge() {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3)));
        System.out.println(Arrays.toString(solution.merge(new int[]{0}, 0, new int[]{1}, 1)));
        System.out.println(Arrays.toString(solution.merge(new int[]{1}, 1, new int[]{}, 0)));

        System.out.println(Arrays.toString(solution.merge(new int[]{4, 5, 6, 0, 0, 0}, 3, new int[]{1, 2, 3}, 3)));

        System.out.println(Arrays.toString(solution.merge(new int[]{4,0,0,0,0,0}, 1, new int[]{1,2,3,5,6}, 5)));

        System.out.println(Arrays.toString(solution.merge(new int[]{-1,0,0,3,3,3,0,0,0}, 6, new int[]{1,2,2}, 3)));
    }
}