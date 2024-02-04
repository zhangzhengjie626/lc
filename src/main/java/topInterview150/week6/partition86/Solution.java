package topInterview150.week6.partition86;

import common.ListNode;

/**
 * https://leetcode.cn/problems/partition-list/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode large = new ListNode(0);
        ListNode small = new ListNode(0);
        ListNode ans = small;
        ListNode largePre = large;
        while (head != null) {
            if (head.val < x) {
                small.next = head;
                small = small.next;
            } else {
                large.next = head;
                large = large.next;
            }
            head = head.next;
        }
        small.next = largePre.next;
        large.next = null;
        return ans.next;
    }
}
