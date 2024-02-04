package topInterview150.week6.reverseBetween92;

import common.ListNode;

/**
 * https://leetcode.cn/problems/reverse-linked-list-ii/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode newHead = new ListNode();
        newHead.next = head;

        ListNode startPre = newHead;
        ListNode start = startPre.next;
        while (left != 1) {
            startPre = startPre.next;
            start = start.next;
            left--;
        }

        ListNode end = newHead;
        while (right != 0) {
            end = end.next;
            right--;
        }
        ListNode endNext = end.next;

        ListNode pre = endNext;
        ListNode newNext;
        while (start != end) {
            newNext = start.next;
            start.next = pre;
            pre = start;
            start = newNext;


        }
        //end的处理
        end.next = pre;
        startPre.next = end;
        return newHead.next;
    }
}