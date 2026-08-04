class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;

        HashSet<Integer> hs=new HashSet<>();
        int ans=0;
        for(int i=0;i<n;i++){
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
            }
            else{
                ans = nums[i];
                break;
            }
        }
        return ans;
    }
}