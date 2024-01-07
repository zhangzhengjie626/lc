package Week5.rightSideView199;

import Common.TreeNode;
import org.junit.Test;
import sun.reflect.generics.tree.Tree;

import static org.junit.Assert.*;

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