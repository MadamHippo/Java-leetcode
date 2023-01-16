class Solution {
    public int maxProfit(int[] prices) {
        
        /*
        int left_pointer = 0;
        int right_pointer = 1;
        

        int max_profits = 0;
        
        while (right_pointer < prices.length){
            if (prices[left_pointer] < prices[right_pointer]){
                int current_price = prices[right_pointer] - prices[left_pointer];
                max_profits = Math.max(max_profits, current_price);
            }
            
            else {
                left_pointer = right_pointer;                
            }
            
            right_pointer++;

        }
        return max_profits;
        
        
        You are given an array prices where prices[i] is the price of a given stock on the i day. 
        You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
        Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
        
        
        Input: prices = [7,1,5,3,6,4]
        Output: 5
        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
        
        Input: prices = [7,6,4,3,1]
        Output: 0
        Explanation: In this case, no transactions are done and the max profit = 0.
        */
        
        
        
        if (prices == null || prices.length == 0){
            return 0;
        }
        
        int buy = 0;
        int max_profits = 0;
        
        for (int sell = 1; sell < prices.length; sell++){
            if (prices[buy] < prices[sell]){
                int current_price = prices[sell]-prices[buy];
                max_profits = Math.max(max_profits, current_price);
            }
            else {
                buy = sell;
            }
        }
        return max_profits;
        
    }
}
