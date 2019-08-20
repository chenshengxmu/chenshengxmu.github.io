package array;

public class BuySellStock42
{
    public int maxProfit(int k, int[] prices)
    {
        if (prices.length < 1)
        {
            return 0;
        }

        if (k > prices.length)
        {
            int res = 0;
            for (int i = 1; i < prices.length; i++)
            {
                if (prices[i] > prices[i - 1])
                {
                    res += (prices[i] - prices[i - 1]);
                }
            }
            return res;
        }

        int[][] profit = new int[k + 1][prices.length];

        for (int i = 1; i <= k; i++)
        {
            int maxDiff = Integer.MIN_VALUE;
            for (int j = 1; j < prices.length; j++)
            {
                maxDiff = Math.max(maxDiff, profit[i - 1][j - 1] - prices[j - 1]);
                profit[i][j] = Math.max(profit[i][j - 1], prices[j] + maxDiff);
            }
        }

        return profit[k][prices.length - 1];
    }
}
