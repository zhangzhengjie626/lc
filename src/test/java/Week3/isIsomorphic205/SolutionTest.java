package Week3.isIsomorphic205;

import TopInterview150.Week3.isIsomorphic205.Solution;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void isIsomorphic() {
        Solution solution = new Solution();
        System.out.println(solution.isIsomorphic("egg", "add"));
        System.out.println(solution.isIsomorphic("foo", "bar"));
        System.out.println(solution.isIsomorphic("paper", "title"));
        System.out.println(solution.isIsomorphic("badc", "baba"));
    }
}