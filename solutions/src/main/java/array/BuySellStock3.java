package array;

public class BuySellStock3
{
    public int maxProfit(int[] prices) {
        if (prices.length < 1)
        {
            return 0;
        }
        int[] maxProfitBefore = new int[prices.length];
        int maxProfit = 0;
        int minSoFar = prices[0];
        for (int i = 1; i < prices.length; i++)
        {
            if (prices[i] < minSoFar)
            {
                minSoFar = prices[i];
            }
            else
            {
                maxProfit = Math.max(prices[i] - minSoFar, maxProfit);
            }
            maxProfitBefore[i] = maxProfit;
        }

        int[] maxProfitAfter = new int[prices.length];
        maxProfit = 0;
        int maxSoFar = prices[prices.length-1];
        for (int i = prices.length-2; i >= 0; i--)
        {
            if (prices[i] > maxSoFar)
            {
                maxSoFar = prices[i];
            }
            else
            {
                maxProfit = Math.max(maxSoFar - prices[i], maxProfit);
            }
            maxProfitAfter[i] = maxProfit;
        }

        maxProfit = 0;
        for (int i = 0; i < prices.length; i++)
        {
            maxProfit = Math.max(maxProfit, maxProfitBefore[i] + maxProfitAfter[i]);
        }

        return maxProfit;
    }
}
