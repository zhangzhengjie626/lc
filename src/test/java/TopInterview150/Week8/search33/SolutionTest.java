package TopInterview150.Week8.search33;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void search() {
        Solution solution = new Solution();
        System.out.println(solution.search(new int[]{4, 5, 6, 7, 0, 1,}, 0));
        System.out.println(solution.search(new int[]{4, 5, 6, 7, 0, 1,}, 3));
        System.out.println(solution.search(new int[]{1}, 0));
        System.out.println(solution.search(new int[]{1}, 1));
    }
}