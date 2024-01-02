package codePractice;

public class BuyAndSellStock {

	public static int maxProfit(int[] prices) {
		int min = prices[0];
		int nextMax = 0;
		int minIndex = 0;
		int profit = 0;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i]<min) {
				min = prices[i];
				minIndex = i;
			}
			}
	

		for (int i = minIndex; i < prices.length - 1; i++) {
			if (prices[i + 1] > prices[i]) {
				nextMax = prices[i+1];
			}
		}

		if (minIndex != prices.length&&nextMax!=0) {
			profit = nextMax - min;
		}
		System.out.println(min + " , "+nextMax+" , "+profit);
		return profit;
	}

	public static void main(String[] args) {
		int prices[] = {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));

	}

}
