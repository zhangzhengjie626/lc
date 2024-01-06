package Week5.zigzagLevelOrder103;

import Common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void zigzagLevelOrder() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4,null,null),null),
                new TreeNode(3,null,
                        new TreeNode(5,null,null)));


        TreeNode root1 = new TreeNode(3,
                new TreeNode(9,
                        null,null),
                new TreeNode(20,new TreeNode(15,null,null),
                        new TreeNode(7,null,null)));

        Solution solution = new Solution();
        System.out.println(solution.zigzagLevelOrder(root1));
        System.out.println(solution.zigzagLevelOrder(root));
    }
}