class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);

        int resultSum=nums[0]+nums[1]+nums[2];
        int maxSum = Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            int rp=i+1;
            int lp=nums.length-1;

            while(rp<lp){
                int sum=nums[i]+nums[rp]+nums[lp];
                if(sum==target){
                    return sum;
                }
                else if(sum<target){
                    rp++;
                }
                else{
                    lp--;
                }
                int diffToAchieve=Math.abs(sum-target);
                if(diffToAchieve < maxSum){
                    resultSum=sum;
                    maxSum=diffToAchieve;
                }

            }
        }
        return resultSum;
    }
}
