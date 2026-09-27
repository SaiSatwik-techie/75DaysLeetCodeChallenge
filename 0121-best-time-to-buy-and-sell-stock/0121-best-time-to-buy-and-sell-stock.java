class Solution {
    public int maxProfit(int[] prices) {
        int low = prices[0];
        int profit = 0, temp=0;
       for(int i=1; i<prices.length; i++){
        temp = prices[i]-low;
        profit = Math.max(profit,temp);
        if(prices[i]<low){
            low = prices[i];
        }
       } 
       return profit;
    }
}