class Solution {
    public int compress(char[] chars) {

     if(chars.length==1){
        return chars.length;
     }

        StringBuilder sb=new StringBuilder();
        Map<Character, Integer> map = new LinkedHashMap<>();
           int i=1;
         Character ch=chars[0];
         int count=1;
           while(i<chars.length){
            
                if(chars[i]!=chars[i-1]){
                    sb.append(ch);
                    if(count!=1){
                    sb.append(count);
                    }
                     ch=chars[i];
                     count=0;
                }
                count++;
                i++;
           }
            sb.append(ch);
             if(count!=1){
                    sb.append(count);
            }

        for(int j=0;j<sb.length();j++){
            chars[j]=sb.charAt(j);
        }
        return sb.length();
    }
}