import java.util.*;
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        Arrays.sort(nums);

        int n=nums.length;

        Set <List<Integer>> result =new HashSet<>();
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                int rp=j+1;
                int lp=n-1;

                while(rp<lp){

                    long sum= (long)nums[i]+nums[j]+nums[rp]+nums[lp];

                    if(sum==target){
                        result.add(Arrays.asList(nums[i],nums[j],nums[rp],nums[lp]));
                        rp++;
                        lp--;
                    }

                   else if(sum<target){
                        rp++;
                    }

                    else{
                        lp--;
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }
}