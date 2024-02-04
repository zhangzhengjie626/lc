package topInterview150.week5.rightSideView199;

import common.TreeNode;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void rightSideView() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,null, new TreeNode(5,null,null)),
                new TreeNode(3,null, new TreeNode(4,null,null)));
        Solution solution = new Solution();
        System.out.println(solution.rightSideView(root));
    }
}