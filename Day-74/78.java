
class Solution {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        int index = 0;

        solve(nums, ans, output, index);

        return ans;
    }

    public static void solve(
            int nums[],
            List<List<Integer>> ans,
            List<Integer> output,
            int index) {

        // Base Case
        if (index >= nums.length) {

            // Make a copy of output
            ans.add(new ArrayList<>(output));

            return;
        }

        // Exclude
        solve(nums, ans, output, index + 1);

        // Include
        int currvalue = nums[index];

        output.add(currvalue);

        solve(nums, ans, output, index + 1);

        // Backtracking
        output.remove(output.size() - 1);
    }
}
