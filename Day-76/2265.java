 class Solution {

    int ans = 0;

    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return ans;
    }

    int[] dfs(TreeNode node) {

        // Base case
        if (node == null) {
            return new int[]{0, 0};
        }

        // Get sum and count from left subtree
        int[] left = dfs(node.left);

        // Get sum and count from right subtree
        int[] right = dfs(node.right);

        // Calculate sum of current subtree
        int sum = left[0] + right[0] + node.val;

        // Calculate number of nodes in current subtree
        int count = left[1] + right[1] + 1;

        // Check if current node equals subtree average
        if (node.val == sum / count) {
            ans++;
        }

        // Return sum and count to parent
        return new int[]{sum, count};
    }
}