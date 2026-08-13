class Solution {
    public int longestConsecutive(int[] nums) {
        int len = 0;
        int longest = 0;

        HashSet<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }

        for (int n : nums) {
            if (!set.contains(n - 1)) {//need to find the start.
                int curr = n;
                len = 1;

                while (set.contains(curr + 1)) {
                    curr++;
                    len++;
                }
            }
            longest = Math.max(longest, len);
        }
        return longest;
    }
}
