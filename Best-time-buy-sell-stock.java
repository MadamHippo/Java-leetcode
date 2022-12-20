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
