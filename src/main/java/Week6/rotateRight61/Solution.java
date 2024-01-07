package Week6.rotateRight61;

import Common.ListNode;

/**
 * https://leetcode.cn/problems/rotate-list/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        ListNode newHead = new ListNode();
        int length = 0;
        newHead.next = head;
        ListNode tmp = head;
        while (tmp != null) {
            tmp = tmp.next;
            length++;
        }
        int newK = k % length;
        newK++;
        ListNode slow = newHead;
        ListNode fast = newHead;
        while (newK != 0 & fast != null) {
            fast = fast.next;
            newK--;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        //slow.next是第一个点
        ListNode oriHead = head;
        newHead.next = slow.next;
        slow.next = null;
        ListNode oriTail = newHead.next;
        ListNode oriTailPre = newHead;
        while (oriTail != null) {
            oriTail = oriTail.next;
            oriTailPre = oriTailPre.next;
        }
        oriTailPre.next = oriHead;
        return newHead.next;
    }
}
//特例[]