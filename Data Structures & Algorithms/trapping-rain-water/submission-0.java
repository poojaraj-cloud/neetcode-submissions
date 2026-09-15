class Solution {
    public int trap(int[] height) {
        int n = height.length;

        //create an rightMax array
        int [] rightMax = new int [n];
        rightMax[n-1] =0;

        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(height[i+1],rightMax[i+1]);
        }

        int leftMax = 0;
        int water =0;
        int ans =0;
        for(int i = 1 ; i<n-1;i++){
            int rmax = rightMax[i];
            leftMax = Math.max(leftMax,height[i-1]);

            water = Math.min(rmax,leftMax) - height[i];
            if(water>0){
                ans = ans + water;
            }

            
            
        }
        return ans;
         
    }
}
