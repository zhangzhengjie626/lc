package Week6.reverseBetween92;

import Common.ListNode;
import TopInterview150.Week6.reverseBetween92.Solution;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void reverseBetween() {
        ListNode tmp = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5, null)))));

        Solution solution = new Solution();
        solution.reverseBetween(tmp, 2, 4);
    }
}