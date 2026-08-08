import java.util.*;
 class Solution {

    public TreeNode searchBST(TreeNode root, int val) {

        // Base Case
        if (root == null) {
            return null;
        }

        // Target found
        if (root.val == val) {
            return root;
        }

        // Search in left subtree
        if (root.val > val) {
            return searchBST(root.left, val);
        }

        // Search in right subtree
        return searchBST(root.right, val);
    }
}