class Solution {

    public boolean isSubsequence(String s, String t) {
        return check(s, t, 0, 0);
    }

    public boolean check(String s, String t, int i, int j) {

        // We found all characters of s
        if (i == s.length()) {
            return true;
        }

        // t is finished but s still has characters
        if (j == t.length()) {
            return false;
        }

        // Characters match → include t[j]
        if (s.charAt(i) == t.charAt(j)) {
            return check(s, t, i + 1, j + 1);
        }

        // Characters don't match → exclude t[j]
        return check(s, t, i, j + 1);
    }
}