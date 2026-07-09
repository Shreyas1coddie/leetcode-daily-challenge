class Solution {
    public boolean isUgly(int n) {
        if(n <= 0) return false;
        if(n == 1) return true;
        boolean isUglyNumber = true;
        while( n != 1){
            if( n%2 == 0){
                n /= 2;
                continue;
            }else if( n%3 == 0){
                n /= 3;
                continue;
            } else if( n%5 == 0){
                n /= 5;
                continue;
            } else {
                isUglyNumber = false;
                break;
            }
        }
        return isUglyNumber;
    }
}