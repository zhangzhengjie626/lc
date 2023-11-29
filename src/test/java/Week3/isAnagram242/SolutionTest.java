package Week3.isAnagram242;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void isAnagram() {
        Solution solution = new Solution();
        System.out.println(solution.isAnagram("anagram", "nagaram"));
        System.out.println(solution.isAnagram("rat", "car"));
    }
}