class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
             count += expand(i, i, s);
            count += expand(i, i + 1, s);
        }

        return count;
    }

    public int expand(int l, int r, String s) {
        int n = s.length();
        int count = 0;
        while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
            count++;
            l--;
            r++;
        }
        return count;
    }
}
