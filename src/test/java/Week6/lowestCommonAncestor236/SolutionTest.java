package Week6.lowestCommonAncestor236;

import Common.TreeNode;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void lowestCommonAncestor() {
        Solution solution = new Solution();
        TreeNode t3 = new TreeNode(3);
        TreeNode t5 = new TreeNode(5);
        TreeNode t1 = new TreeNode(1);
        TreeNode t6 = new TreeNode(6);
        TreeNode t2 = new TreeNode(2);
        TreeNode t0 = new TreeNode(0);
        TreeNode t8 = new TreeNode(8);
        TreeNode t7 = new TreeNode(7);
        TreeNode t4 = new TreeNode(4);
        t3.left = t5;
        t3.right = t1;
        t5.left = t6;
        t5.right = t2;
        t2.left = t7;
        t2.right = t4;
        t1.left = t0;
        t1.right = t8;


        solution.lowestCommonAncestor(t3, t5, t4);
    }
}