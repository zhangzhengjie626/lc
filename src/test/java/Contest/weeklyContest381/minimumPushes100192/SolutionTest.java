package Contest.weeklyContest381.minimumPushes100192;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void minimumPushes() {
        Solution solution = new Solution();
        System.out.println(solution.minimumPushes("abcde"));
        System.out.println(solution.minimumPushes("xyzxyzxyzxyz"));
        System.out.println(solution.minimumPushes("aabbccddeeffgghhiiiiii"));
    }
}