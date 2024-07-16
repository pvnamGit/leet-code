package array.stock_profit;

// 121. Best Time to Buy and Sell Stock
class Solution {
  public int maxProfit(int[] prices) {
    int buyDate = 0;
    int maxProfit = 0;
    for (int sellDate = 1; sellDate < prices.length; sellDate++) {
      int profit = prices[sellDate] - prices[buyDate];
      if (profit > maxProfit) maxProfit = profit;
      if (profit < 0) buyDate = sellDate;
    }
    return maxProfit > 0 ? maxProfit : 0;
  }
}
