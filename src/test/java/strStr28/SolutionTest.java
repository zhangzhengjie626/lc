package strStr28;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void strStr() {
        Solution solution = new Solution();
        System.out.println(solution.strStr("sadbutsad", "sad"));
        System.out.println(solution.strStr("leetcode", "leeto"));
    }
}