package dsa.leetcode._121.personal;

public class Solution {

    public int maxProfit(int[] prices) {
        int minPrice=prices[0], maxPrice=prices[0], maxProfit=0;

        for(int i=1; i<prices.length; i++) {
            if(prices[i]<minPrice) {
                minPrice=prices[i];
                maxPrice=prices[i];
            }
            if(prices[i]>maxPrice) {
                maxPrice=prices[i];
                int profit = maxPrice-minPrice;
                if(profit>maxProfit) {
                    maxProfit=profit;
                }
            }
        }

        return maxProfit;
    }
}
