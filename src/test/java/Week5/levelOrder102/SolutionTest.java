package Week5.levelOrder102;

import Common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

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