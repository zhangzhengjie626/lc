package contest.weeklyContest383.minimumTimeToInitialState100204;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void minimumTimeToInitialState() {
        Solution solution = new Solution();
        System.out.println(solution.minimumTimeToInitialState("abacaba", 3));
        System.out.println(solution.minimumTimeToInitialState("abacaba", 4));
        System.out.println(solution.minimumTimeToInitialState("abcbabcd", 2));
        System.out.println(solution.minimumTimeToInitialState("aab", 2));
    }
}