import java.util.*;
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int sorted[]=arr.clone();
        Arrays.sort(sorted);

        HashMap <Integer,Integer> result=new HashMap<>();
        int r=1;

        for(int nums:sorted){
            if(!result.containsKey(nums)){
                result.put(nums,r++);
            }
        }

        for(int i=0;i<arr.length;i++){
            arr[i]=result.get(arr[i]);
        }

        return arr;
    }
}