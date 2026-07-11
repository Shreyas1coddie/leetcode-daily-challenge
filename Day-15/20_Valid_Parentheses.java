class Solution {
    public boolean isValid(String s) {
        Stack<Character> seen = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (seen.isEmpty()) {
                seen.push(ch);
            } else if (ch == ')' && seen.peek() == '(' ||
                       ch == '}' && seen.peek() == '{' ||
                       ch == ']' && seen.peek() == '[') {
                seen.pop();
            } else {
                seen.push(ch);
            }
        }       
        return seen.isEmpty();
    }
}