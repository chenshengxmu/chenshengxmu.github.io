---
layout: post
title: Largest Sum Contiguous Subarray
---
```java
int maxSubArraySum(int[] a, int n)
{
    int[] b = new int[n];
    b[0] = a[0];
    for (int i = 1; i < n; i++)
    {
        if (b[i-1] >= 0)
        {
            b[i] = b[i - 1] + a[i];
        }
        else
        {
            b[i] = a[i];
        }
    }
    int max = b[0];
    for (int i = 1; i < n; i++)
    {
        if (b[i] > max)
        {
            max = b[i];
        }
    }
    return max;
}

int maxSubArraySumOpt(int[] a, int n)
{
    int max = a[0];
    int curr_max = a[0];
    for (int i = 1; i < n; i++)
    {
        if (curr_max >= 0)
        {
            curr_max = curr_max + a[i];
        }
        else
        {
            curr_max = a[i];
        }
        if (curr_max > max)
        {
            max = curr_max;
        }
    }
    return max;
}

int maxSubArraySumWithIndex(int[] a, int n)
{
    int start = 0;
    int end = 0;
    int s = 0;
    int max = a[0];
    int curr_max = a[0];
    for (int i = 1; i < n; i++)
    {
        if (curr_max >= 0)
        {
            curr_max = curr_max + a[i];
        }
        else
        {
            curr_max = a[i];
            s = i;
        }
        if (curr_max > max)
        {
            max = curr_max;
            start = s;
            end = i;
        }
    }
    return max;
}
```
