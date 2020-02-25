package Contests.Contest163;


class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}

public class FindElementsinaContaminatedBinaryTree {
    class FindElements {
        TreeNode normal;
        public FindElements(TreeNode root) {
            if (root != null) {
                root.val = 0;
                helpFind(root);
            }
            normal = root;
        }

        public void helpFind(TreeNode root) {
            if (root != null) {
                if (root.left != null) {
                    root.left.val = 2 * root.val + 1;
                    helpFind(root.left);
                }
                if (root.right != null) {
                    root.right.val = 2 * root.val + 2;
                    helpFind(root.right);
                }
            }
        }

        public boolean find(int target) {
            return helperFind(normal, target);
        }

        public boolean helperFind(TreeNode root, int target) {
            if (root == null) {
                return false;
            } else if (root.val == target) {
                return true;
            } else {
                return helperFind(root.left, target) || helperFind(root.right, target);
            }
        }
    }
}
