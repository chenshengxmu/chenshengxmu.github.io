---
layout: post
title: Edit Distance
---
```java
int editDistRecur(char[] s1, char[] s2, int m, int n)
{
    if (m == 0)
    {
        return n;
    }
    if (n == 0)
    {
        return m;
    }
    if (s1[m - 1] == s2[n - 1])
    {
        return editDistRecur(s1, s2, m - 1, n - 1);
    }
    return 1 + Integer.min(editDistRecur(s1, s2, m - 1, n - 1), Integer.min(editDistRecur(s1, s2, m - 1, n), editDistRecur(s1, s2, m, n - 1)));
}

int editDistDP(char[] s1, char[] s2, int m, int n)
{
    int[][] dp = new int[m + 1][n + 1];
    for (int i = 0; i < m + 1; i++)
    {
        for (int j = 0; j < n + 1; j++)
        {
            if (i == 0)
            {
                dp[i][j] = j;
            }
            else if (j == 0)
            {
                dp[i][j] = i;
            }
            else if (s1[i - 1] == s2[j - 1])
            {
                dp[i][j] = dp[i - 1][j - 1];
            }
            else
            {
                dp[i][j] = 1 + Integer.min(dp[i - 1][j - 1], Integer.min(dp[i - 1][j], dp[i][j - 1]));
            }
        }
    }
    return dp[m][n];
}
```
