package Week6.copyRandomList138;

import Common.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.cn/problems/copy-list-with-random-pointer/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {
    public Node copyRandomList(Node head) {
        Node newNode = new Node(0);
        Node resPre = newNode;
        Node preHead = new Node(0);
        preHead.next = head;
        Map<Integer, Integer> mark = new HashMap<>();
        Map<Node, Integer> loc = new HashMap<>();
        Map<Integer, Node> newNodeMap = new HashMap<>();

        int i = 0;
        while (head != null) {
            Node node = new Node(head.val);
            newNode.next = node;
            loc.put(head, i);
            newNodeMap.put(i, node);
            newNode = newNode.next;
            head = head.next;
            i++;
        }
        i = 0;
        Node cur = preHead.next;
        while (cur != null) {
            if (cur.random != null) {
                mark.put(i, loc.get(cur.random));
            } else {
                mark.put(i, -1);
            }
            cur = cur.next;
            i++;
        }

        i = 0;
        Node r = resPre.next;
        while (r != null) {
            if (mark.get(i) != -1) {
                r.random = newNodeMap.get(mark.get(i));
            } else {
                r.random = null;
            }
            i++;
            r = r.next;
        }
        return resPre.next;
    }
}
//硬写的