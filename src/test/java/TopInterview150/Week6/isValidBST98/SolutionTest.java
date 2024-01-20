package TopInterview150.Week6.isValidBST98;

import Common.TreeNode;
import TopInterview150.Week6.isValidBST98.Solution;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void isValidBST() {
        TreeNode treeNode = new TreeNode(5,
                new TreeNode(1, null, null),
                new TreeNode(4, new TreeNode(3, null, null), new TreeNode(6, null, null)));
        Solution solution = new Solution();

        TreeNode t1 = new TreeNode(2,
                new TreeNode(1, null, null),
                new TreeNode(3, null, null));

        solution.isValidBST(t1);
    }
}