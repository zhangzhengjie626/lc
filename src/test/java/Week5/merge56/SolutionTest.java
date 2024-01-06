package Week5.merge56;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void merge() {
        Solution solution = new Solution();
        int[][] test = new int[4][2];
        test[3][0]=1;
        test[3][1]=3;
        test[1][0]=2;
        test[1][1]=6;
        test[2][0]=8;
        test[2][1]=10;
        test[0][0]=15;
        test[0][1]=18;
        System.out.println(Arrays.deepToString(solution.merge(test)));

        int[][] test1 = new int[2][2];
        test1[1][0]=2;
        test1[1][1]=3;
        test1[0][0]=1;
        test1[0][1]=4;
        System.out.println(Arrays.deepToString(solution.merge(test1)));



        int[][] test2 = new int[5][2];
        test2[0][0]=2;
        test2[0][1]=3;
        test2[1][0]=4;
        test2[1][1]=5;
        test2[2][0]=6;
        test2[2][1]=7;
        test2[3][0]=8;
        test2[3][1]=9;
        test2[4][0]=1;
        test2[4][1]=10;



        System.out.println(Arrays.deepToString(solution.merge(test2)));
    }
}