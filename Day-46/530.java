
 class Solution {

    private List<Integer> list = new ArrayList<>();
    private int min = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {

        if (root == null)
            return -1;

        getMinimumDifference(root.left);

        if (list.size() >= 1) {
            min = Math.min(min, root.val - list.get(list.size() - 1));
        }

        list.add(root.val);

        getMinimumDifference(root.right);

        return min;
    }
 }