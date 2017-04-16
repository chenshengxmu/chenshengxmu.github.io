---
layout: post
title: Longest Palindromic Subsequence
---
```java
int lpsRecursive(char[] s, int i, int j)
{
    if (i == j)
    {
        return 1;
    }
    if (s[i] == s[j] && i + 1 == j)
    {
        return 2;
    }
    if (s[i] == s[j])
    {
        return lpsRecursive(s, i + 1, j - 1) + 2;
    }
    return Integer.max(lpsRecursive(s, i + 1, j), lpsRecursive(s, i, j - 1));
}

int lpsDP(char[] s, int n)
{
    int[][] L = new int[n][n];
    for (int i = 0; i < n; i++)
    {
        L[i][i] = 1;
    }
    for (int len = 2; len <= n; len++)
    {
        for (int i = 0; i < n - len + 1; i++)
        {
            int j = i + len - 1;
            if (s[i] == s[j] && len == 2)
            {
                L[i][j] = 2;
            }
            else if (s[i] == s[j])
            {
                L[i][j] = L[i + 1][j - 1] + 2;
            }
            else
            {
                L[i][j] = Integer.max(L[i][j - 1], L[i + 1][j]);
            }
        }
    }
    return L[0][n - 1];
}

int lpsWithLCS(char[] s, int n)
{
    char[] s2 = reverse(s, n);
    return lcs(s, s2, n, n);
}
```
