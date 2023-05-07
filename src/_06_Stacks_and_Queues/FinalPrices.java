package _06_Stacks_and_Queues;

public class FinalPrices {
    public int[] finalPrices(int[] prices) { // O(N)으로 만들기
        int[] results = new int[prices.length];

        for(int i=0; i<prices.length; i++) {
            results[i] = prices[i];
            for(int j=i+1; j < prices.length; j++) {
                if(prices[j] <= prices[i]) {
                    results[i] = prices[i] - prices[j];
                    break;
                }
            }
        }

        return results;
    }
}
