
class Solution {
    public long countCommas(long n) {

       if(n<1000){
        return 0;
       }

       long countOfCommas = 0;
       long start =1000;
       long comma =1;

       while(start<n){
        long end = start*1000-1;
        long numbers;

        if(n<end){
            numbers = n-start+1;
        }
        else{
            numbers = end-start+1;
        }
        countOfCommas += numbers*comma;

        start=start*1000;
        comma++;
       }
       return countOfCommas;
    }
}