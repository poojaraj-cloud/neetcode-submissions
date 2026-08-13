class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int left = i+1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    List<Integer> res =Arrays.asList(nums[i], 
                    nums[left], nums[right]);
                    set.add(res);
                    right--;
                    left++;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
