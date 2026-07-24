

class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()){
            return false;
        }

        int count[]=new int [26];

        for(char st:s.toCharArray()){
            count[st-'a']++;
        }
        for(char st2:t.toCharArray()){
            count[st2-'a']--;
        }
        for(int val:count ){
            if(val!=0){
                return false;
            }
        }

        return true;
    }
}
