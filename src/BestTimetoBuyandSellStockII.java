/*
 Day 05

 Say you have an array prices for which the ith element is the price of a given stock on day i.

 Design an algorithm to find the maximum profit.
 You may complete as many transactions as you like
 (i.e., buy one and sell one share of the stock multiple times).

 Example 1:
    Input: [7,1,5,3,6,4]
    Output: 7
    1->5, 3->6
 Example 2:
    Input: [1,2,3,4,5]
    Output: 4
    1->5
 Example 3:
    Input: [7,6,4,3,1]
    Output: 0
*/

public class BestTimetoBuyandSellStockII {
    public static void main(String[] args){
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }
}
