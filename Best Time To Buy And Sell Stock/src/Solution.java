class Solution {
    public int maxProfit(int[] prices) {
        int cheap = Integer.MAX_VALUE,expensive = Integer.MIN_VALUE,maxProfit = 0;
        boolean bought = false;

        for(int i = 0; i < prices.length; i++){
            if(cheap > prices[i]){
                cheap = prices[i];
                bought= true;
                expensive = Integer.MIN_VALUE;
            }

            if(bought){
                expensive = Math.max(expensive,prices[i]);
            }

            maxProfit = Math.max(expensive - cheap < 0 ? 0 : expensive - cheap, maxProfit);

        }
        return maxProfit;
    }
}