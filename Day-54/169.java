
class Solution {
    public int majorityElement(int[] nums) {
       int n=nums.length;

        int majority=nums[0];
        int freq=0;
       for(int i=1;i<n;i++){
            if(majority==nums[i]){
                freq++;
            }
            else if(freq==0){
                majority=nums[i];
            }
            else{
                freq--;
            }
       }
       return majority;
    }
}