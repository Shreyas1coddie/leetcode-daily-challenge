class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums== null || nums.length<3){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        Set<List<Integer>> result=new HashSet<>();
        for(int i=0;i<nums.length-2;i++){
            int rp=i+1;
            int lp=nums.length-1;

            while(rp<lp){
                int sum=nums[i]+nums[rp]+nums[lp];

                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[rp],nums[lp]));
                    rp++;
                    lp--;
                }
                else if(sum<0){
                    rp++;
                }
                else{
                    lp--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}
