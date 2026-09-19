class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);

        int prefix =0;

        for(int i =0;i<n;i++){
            prefix += nums[i];
            int mod = prefix%k;

            if(map.containsKey(mod)){
                int len = i- map.get(mod);
                if(len>=2){
                    return true;
                }
            }else{
                map.put(mod,i);
            }

        }
        return false;
        
    }
}