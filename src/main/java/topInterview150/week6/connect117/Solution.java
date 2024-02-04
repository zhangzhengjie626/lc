package topInterview150.week6.connect117;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Solution {
    public Node connect(Node root) {
        if (root == null) {
            return root;
        }
        List<Node> cur = new ArrayList<>();
        cur.add(root);
        int size = 1;
        List<Node> tmp = new ArrayList<>();
        while (size != 0) {
            Node node = cur.get(0);
            cur.remove(0);
            tmp.add(node);
            size--;
            if (node.left != null) {
                cur.add(node.left);
            }
            if (node.right != null) {
                cur.add(node.right);
            }
            if (size == 0) {
                for (int i = 0; i < tmp.size(); i++) {
                    if (i + 1 >= tmp.size()) {
                        tmp.get(i).next = null;
                    } else {
                        tmp.get(i).next = tmp.get(i + 1);
                    }
                }
                size = cur.size();
                tmp = new ArrayList<>();
            }
        }
        return root;
    }
}


class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};