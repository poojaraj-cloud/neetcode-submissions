class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int l =0;
        int maxLen = Integer.MIN_VALUE;

        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            while(set.contains(c)){
                set.remove(s.charAt(l));
                l++;

            }
            set.add(c);
            maxLen = Math.max(maxLen,i-l+1);

        }
        return maxLen==Integer.MIN_VALUE?0:maxLen;
        
    }
}
