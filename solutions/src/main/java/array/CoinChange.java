package array;

import java.util.Arrays;

public class CoinChange
{
    public int coinChange(int[] coins, int amount)
    {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);

        dp[0] = 0;
        for (int i = 1; i < amount; i++)
        {
            int min = 0;
            for (int j = 0; j < coins.length; j++)
            {
                if (coins[j] <= amount)
                {
                    min = Math.min(min, dp[amount - coins[j]]);
                }
            }
            dp[i] = min;
        }
        
        return dp[amount] > amount ? -1 : dp[amount];


    }
}
