class Solution {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        int minV = Integer.MAX_VALUE;

        for(int p : prices){
             minV = Math.min(minV,p);
            int profit = p-minV;

            maxProfit = Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}
