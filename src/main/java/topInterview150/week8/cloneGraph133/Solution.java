package topInterview150.week8.cloneGraph133;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * https://leetcode.cn/problems/clone-graph/description/?envType=study-plan-v2&envId=top-interview-150
 */
public class Solution {


    // Definition for a Node.
    static class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    //节点要复制，不能只记是否访问过
    HashMap<Node, Node> visited = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        if (!visited.containsKey(node)) {

            Node n = new Node(node.val, null);
            visited.put(node, n);
            ArrayList<Node> tmpList = new ArrayList<>();
            if (node.neighbors != null && node.neighbors.size() > 0) {
                for (int i = 0; i < node.neighbors.size(); i++) {
                    tmpList.add(cloneGraph(node.neighbors.get(i)));
                }
            }
            n.neighbors = tmpList;
        }
        return visited.get(node);
    }
}
//节点要复制，不能只记是否访问过
//已经有的，就不需要再构建了，否则就无限循环了，然后连通图递归构建可以保证全部都构建到

// [[2,4],[1,3],[2,4],[1,3]]
