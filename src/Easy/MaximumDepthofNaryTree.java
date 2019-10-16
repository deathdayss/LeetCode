package Easy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumDepthofNaryTree {

static class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
}
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.children == null || root.children.size() == 0) {
            return 1;
        } else {
            ArrayList<Integer> maxNode = new ArrayList<>();
            boolean hasNext = false;
            for (Node sub : root.children) {
                if (sub.children != null && sub.children.size() > 0) {
                    maxNode.add(1 + maxDepth(sub));
                    hasNext = true;
                }
            }
            if (hasNext) {
                return Collections.max(maxNode);
            } else {
                return 2;
            }
        }
    }
}
