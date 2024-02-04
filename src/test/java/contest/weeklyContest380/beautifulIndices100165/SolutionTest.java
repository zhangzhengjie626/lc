package contest.weeklyContest380.beautifulIndices100165;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void beautifulIndices() {
        Solution solution = new Solution();
        System.out.println(solution.beautifulIndices("isawsquirrelnearmysquirrelhouseohmy", "my", "squirrel", 15));
        System.out.println(solution.beautifulIndices("abcd", "a", "a", 4));
        System.out.println(solution.beautifulIndices("eueuau", "u", "e", 3));
    }
}