package Medium;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class FindBottomLeftTreeValue {
    int maxDepth = -1;
    int mostLeft = Integer.MAX_VALUE;
    int theValue = 0;
    public void bottomLeft(TreeNode root, int depth, int left) {
        if (root == null) {
            return;
        }
        if (root.right == null && root.left == null) {
            if (depth > maxDepth) {
                maxDepth = depth;
                mostLeft = left;
                theValue = root.val;
            } else if (depth == maxDepth) {
                if (mostLeft >= left) {
                    mostLeft = left;
                    theValue = root.val;
                }
            }
        } else {
            bottomLeft(root.left, depth + 1, left - 1);
            bottomLeft(root.right, depth + 1, left + 1);
        }
    }

    public int findBottomLeftValue(TreeNode root) {
        bottomLeft(root, 0, 0);
        return theValue;
    }
}
