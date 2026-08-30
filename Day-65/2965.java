
class Solution {
     public int[] findMissingAndRepeatedValues(int[][] grid) {
        
        int ans[]=new int[2];
        int n=grid.length;
        int total=n*n;
        int a=-1;
        int b=-1;

        int freq[]=new int[total+1];
        int m=freq.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<grid[0].length;j++){
                freq[grid[i][j]]++;
            }
        }

        for(int i=1;i<m;i++){
            if(freq[i]==0){
                b=i;
            }
            if(freq[i]==2){
                a=i;
            }
        }
        ans[0]=a;
        ans[1]=b;
        return ans;
}

}


