---
layout: post
title: Maximum difference between two elements such that larger element appears after the smaller number
---
```java
int maxDiff(int[] a, int n)
{
    int max_diff = a[1] - a[0];
    int min = a[0];
    for (int i = 1; i < n; i++)
    {
        int diff = a[i] - min;
        if (diff > max_diff)
        {
            max_diff = diff;
        }
        if (a[i] < min)
        {
            min = a[i];
        }
    }
    return max_diff;
}
```
