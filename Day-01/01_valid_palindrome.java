# Day-1/125_valid_palindrome

  class Solution {
    public boolean isPalindrome(String s) {
        
        String st= s.toLowerCase();
        int rp= 0;
        int lp= s.length()-1;

        

        while(rp<lp){
            
            char char1= st.charAt(rp);
            char char2= st.charAt(lp);
            
            if(!(char1>='0' &&char1<='9' || char1 >= 'a' && char1<= 'z' )){
                rp++;
                continue;
            }

            if(!(char2>='0' &&char2<='9' || char2 >= 'a' && char2<= 'z' )){
                lp--;
                continue;
            }

            if(char1!=char2){
                return false;
            }
            rp++;
            lp--;
        }
        return true;
    }
}
