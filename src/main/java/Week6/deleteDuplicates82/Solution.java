package Week6.deleteDuplicates82;

import Common.ListNode;

/**
 * https://leetcode.cn/problems/remove-duplicates-from-sorted-list-ii/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode newHead = new ListNode();
        newHead.next = head;
        ListNode pre = newHead;
        ListNode cur = head;

        while (cur != null) {
            boolean dup = false;
            while (cur.next != null && cur.next.val == pre.next.val) {
                dup = true;
                cur = cur.next;
            }
            if (dup) {
                if (cur != null) {
                    pre.next = cur.next;
                } else {
                    pre.next = null;
                }

            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return newHead.next;
    }
}
//pre的位置更新问题
