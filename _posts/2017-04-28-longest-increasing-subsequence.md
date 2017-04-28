---
layout: post
title: Longest Increasing Subsequence
---
```java
int lis(int[] a, int n)
{
    int[] b = new int[n];
    for (int i = 0; i < n; i++)
    {
        b[i] = 1;
    }
    for (int i = 1; i < n; i++)
    {
        for (int j = 0; j < i; j++)
        {
            if (a[j] < a[i] && b[i] < b[j] + 1)
            {
                b[i] = b[j] + 1;
            }
        }
    }
    int max = 0;
    for (int i = 0; i < n; i++)
    {
        if (b[i] > max)
        {
            max = b[i];
        }
    }
    return max;
}
```
