---
layout: post
title: Find subarray with given sum
---
```java
boolean subArraySumSimple(int[] a, int n, int sum)
{
    for (int i = 0; i < n; i++)
    {
        int cur_sum = a[i];
        if (cur_sum == sum)
        {
            return true;
        }
        for (int j = i + 1; j < n; j++)
        {
            cur_sum += a[j];
            if (cur_sum == sum)
            {
                System.out.println(i + " " + j);
                return true;
            }
        }
    }
    return false;
}
```
