package topInterview150.week5.removeNthFromEnd19;

import common.ListNode;

/**
 * https://leetcode.cn/problems/remove-nth-node-from-end-of-list/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        //连头都能删除，整一个新的头节点
        ListNode newHead = new ListNode();
        newHead.next = head;

        ListNode s1 = newHead;
        ListNode s2 = newHead;
        n++;
        while (n > 0 && s1 != null) {
            s1 = s1.next;
            n--;
        }
        while (s1 != null) {
            s1 = s1.next;
            s2 = s2.next;
        }
        if (s2.next != null) {
            s2.next = s2.next.next;
        }
        return newHead.next;
    }
}
