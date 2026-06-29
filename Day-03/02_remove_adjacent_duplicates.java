class Solution {
    public String removeDuplicates(String s) {

        // stack -> remove adjacent/ asteroid collision -> push and remove on rule
        StringBuilder sb = new StringBuilder();

        for (char in : s.toCharArray()) {
            if (sb.isEmpty() || sb.charAt(sb.length() - 1) != in) {
                sb.append(in);
            } else {
                sb.deleteCharAt(sb.length() - 1);
            }
        }

        return sb.toString();
    }
}
