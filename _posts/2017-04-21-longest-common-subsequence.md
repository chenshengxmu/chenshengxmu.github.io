---
layout: post
title: Longest Common Subsequence
---
```java
int lcsRecursive(char[] x, char[] y, int m, int n)
{
    if (m == 0 || n == 0)
    {
        return 0;
    }
    if (x[m - 1] == y[n - 1])
    {
        return lcsRecursive(x, y, m - 1, n - 1) + 1;
    }
    return Integer.max(lcsRecursive(x, y, m - 1, n), lcsRecursive(x, y, m, n - 1));
}

int lcsDP(char[] x, char[] y, int m, int n)
{
    int[][] L = new int[m + 1][n + 1];
    for (int i = 0; i < m + 1; i++)
    {
        for (int j = 0; j < n + 1; j++)
        {
            if (i == 0 || j == 0)
            {
                L[i][j] = 0;
            }
            else if (x[i-1] == y[j-1])
            {
                L[i][j] = L[i - 1][j - 1] + 1;
            }
            else
            {
                L[i][j] = Integer.max(L[i - 1][j], L[i][j - 1]);
            }
        }
    }
    return L[m][n];
}
```
