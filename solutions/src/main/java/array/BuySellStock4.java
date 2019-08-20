package array;

public class BuySellStock4
{
    public int maxProfit(int k, int[] prices)
    {
        if (prices.length < 1)
        {
            return 0;
        }

        int[][] profit = new int[k + 1][prices.length];

        for (int i = 1; i <= k; i++)
        {
            for (int j = 1; j < prices.length; j++)
            {
                int max = 0;
                for (int m = 0; m < j; m++)
                {
                    max = Math.max(max, prices[j] - prices[m] + profit[i - 1][m]);
                }
                profit[i][j] = Math.max(profit[i][j - 1], max);
            }
        }

        return profit[k][prices.length - 1];
    }
}
