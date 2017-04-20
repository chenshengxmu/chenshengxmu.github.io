---
layout: post
title: Length of the largest subarray with contiguous elements for distinct elements
---
```java
int findLengthWithDistinctElements(int[] a, int n)
{
    int max_len = 1;
    for (int i = 0; i < n - 1; i++)
    {
        int min = a[i];
        int max = a[i];
        for (int j = i + 1; j < n; j++)
        {
            if (a[j] < min)
            {
                min = a[j];
            }
            if (a[j] > max)
            {
                max = a[j];
            }
            if (max - min == j - i)
            {
                int len = max - min + 1;
                if (len > max_len)
                {
                    max_len = len;
                }
            }
        }

    }
    return max_len;
}
```
