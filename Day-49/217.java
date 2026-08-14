class Solution {
    public boolean containsDuplicate(int[] nums) {
        int i=0;
        Arrays.sort(nums);

        while(i<nums.length-2){
            if(nums[i]==nums[i+1]){
                return true;
            }
            i++;
        }
        
        return false;
    }
}