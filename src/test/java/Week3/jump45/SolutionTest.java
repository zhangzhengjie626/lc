package Week3.jump45;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void jump() {
        Solution solution = new Solution();
        System.out.println(solution.jump(new int[]{2,3,1,1,4}));
        System.out.println(solution.jump(new int[]{2,3,0,1,4}));
    }
}