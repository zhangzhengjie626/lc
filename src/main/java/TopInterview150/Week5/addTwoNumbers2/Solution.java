package TopInterview150.Week5.addTwoNumbers2;

import Common.ListNode;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int up = 0;
        ListNode pre = new ListNode();
        ListNode res = pre;
        while (l1 != null && l2 != null) {
            ListNode cur = new ListNode();
            cur.val = l1.val + l2.val + up;
            up = 0;
            if (cur.val >= 10) {
                cur.val = cur.val % 10;
                up = 1;
            }
            l1 = l1.next;
            l2 = l2.next;
            pre.next = cur;
            pre = cur;
        }

        while (l1 != null) {
            ListNode cur = new ListNode();
            cur.val = l1.val + up;
            up = 0;
            if (cur.val >= 10) {
                cur.val = cur.val % 10;
                up = 1;
            }
            l1 = l1.next;
            pre.next = cur;
            pre = cur;
        }

        while (l2 != null) {
            ListNode cur = new ListNode();
            cur.val = l2.val + up;
            up = 0;
            if (cur.val >= 10) {
                cur.val = cur.val % 10;
                up = 1;
            }
            l2 = l2.next;
            pre.next = cur;
            pre = cur;
        }

        if (up == 1) {
            ListNode cur = new ListNode();
            cur.val = 1;
            pre.next = cur;
        }
        return res.next;
    }
}
