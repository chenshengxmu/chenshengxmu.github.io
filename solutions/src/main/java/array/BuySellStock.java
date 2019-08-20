package array;

public class BuySellStock
{
    public int maxProfit(int[] prices) {
        if (prices.length < 1)
        {
            return 0;
        }
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
        }

        return maxProfit;
    }
}
