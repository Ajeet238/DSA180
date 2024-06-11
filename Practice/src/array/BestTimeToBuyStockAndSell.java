package array;

public class BestTimeToBuyStockAndSell {
	
	 public int maxProfit(int[] prices) {
	        int n = prices.length;
	        int min = prices[0];
	        int maxProfit = 0;
	        int profit = 0;

	        for(int i=1; i<n; i++){
	            profit = prices[i] - min;
	            if(profit > maxProfit){
	                maxProfit = profit;
	            }
	            min = Math.min(min,prices[i]);

	        }

	        return maxProfit;
	    }
}
