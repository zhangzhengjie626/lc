package TopInterview150.Week5.sumNumbers129;

import Common.TreeNode;
import TopInterview150.Week5.sumNumbers129.Solution;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void sumNumbers(){
        TreeNode root = new TreeNode(1,
                new TreeNode(2,null,null),
                new TreeNode(3,null,null));
        Solution solution = new Solution();
        System.out.println(solution.sumNumbers(root));

    }

}