package TopInterview150.Week3.isAnagram242;

import TopInterview150.Week3.isAnagram242.Solution;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void isAnagram() {
        Solution solution = new Solution();
        System.out.println(solution.isAnagram("anagram", "nagaram"));
        System.out.println(solution.isAnagram("rat", "car"));
    }
}