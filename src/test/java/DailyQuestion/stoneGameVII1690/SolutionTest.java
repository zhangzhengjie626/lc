package DailyQuestion.stoneGameVII1690;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void stoneGameVII() {
        Solution solution = new Solution();
//        System.out.println(solution.stoneGameVII(new int[]{5, 3, 1, 4, 2}));
//        System.out.println(solution.stoneGameVII(new int[]{7, 90, 5, 1, 100, 10, 10, 2}));
//        System.out.println(solution.stoneGameVII(new int[]{481, 905, 202, 250, 371, 628, 92, 604, 836, 338, 676, 734}));
        //状态没遍历完，有的情况没遍历到导致的
        System.out.println(solution.stoneGameVII(new int[]{792, 195, 697, 271, 743, 51, 836, 322, 135, 550, 399, 182, 988, 25, 395, 254, 480, 931, 513, 772, 798, 102, 110, 915, 794, 330, 597, 220, 789, 462}));
        //基本上是做出来了，但是超时了
    }
}