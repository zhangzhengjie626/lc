package TopInterview150.Week6.rotateRight61;

import Common.ListNode;
import TopInterview150.Week6.rotateRight61.Solution;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void rotateRight() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));

        Solution solution = new Solution();
        solution.rotateRight(head, 2);

    }
}