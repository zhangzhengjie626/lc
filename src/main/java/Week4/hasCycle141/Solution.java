package Week4.hasCycle141;

import Common.ListNode;

/**
 * 141.环形链表
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != null && fast != null && fast.next != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        if (slow == null || fast == null || fast.next == null) {
            return false;
        }
        return false;
    }
    //寄1 快慢的设置，一开始判断的话，不能设置相等
    //寄2 空listnode判断
}
