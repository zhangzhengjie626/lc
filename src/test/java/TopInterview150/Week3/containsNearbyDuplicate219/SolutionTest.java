package TopInterview150.Week3.containsNearbyDuplicate219;

import TopInterview150.Week3.containsNearbyDuplicate219.Solution;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void containsNearbyDuplicate() {
        Solution solution = new Solution();
        System.out.println(solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
        System.out.println(solution.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
        System.out.println(solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }
}