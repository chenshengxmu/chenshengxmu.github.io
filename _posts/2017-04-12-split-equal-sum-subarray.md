---
layout: post
title: Split an array into two equal sum subarrays
---
```java
int findSplitPoint(int[] a, int n)
{
    int leftSum = 0;
    for (int i = 0; i < n; i++)
    {
        leftSum += a[i];
    }
    int rightSum = 0;
    for (int i = n - 1; i >= 0; i--)
    {
        rightSum += a[i];
        leftSum -= a[i];
        if (rightSum == leftSum)
        {
            return i;
        }
    }
    return -1;
}
```
