package topInterview150.week5.levelOrder102;

import common.TreeNode;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void levelOrder() {
        TreeNode root = new TreeNode(3,
                new TreeNode(9,null,null),
                new TreeNode(20,new TreeNode(15,null,null),new TreeNode(7,null,null)));

        Solution solution = new Solution();
        solution.levelOrder(root);
    }
}