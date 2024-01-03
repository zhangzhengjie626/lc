package Week5.sumNumbers129;

import Common.TreeNode;
import org.junit.Test;

import javax.transaction.TransactionRequiredException;

import static org.junit.Assert.*;

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