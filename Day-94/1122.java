class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int max = 0;
        // 1. Find the maximum value in arr1 to size the frequency array
        for (int i = 0; i < arr1.length; i++) {
            max = Math.max(max, arr1[i]);
        }
        
        //  Count frequencies of each element in arr1
        int[] count = new int[max + 1];
        for (int i = 0; i < arr1.length; i++) {
            count[arr1[i]]++;
        }
        
        int[] ans = new int[arr1.length];
        int index = 0;
        
        // 3. Place elements matching arr2 in the specified relative order
        for (int i = 0; i < arr2.length; i++) {
            while (count[arr2[i]] > 0) {
                ans[index] = arr2[i];
                index++;
                count[arr2[i]]--;
            }
        }
        
        // 4. Place remaining elements in ascending order
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                ans[index] = i;
                index++;
                count[i]--;
            }
        }
        
        return ans;
    }
}
