---
layout: post
title: Length of the largest subarray with contiguous elements for duplicate elements
---
```java
int findLengthWithDuplicateElements(int[] a, int n)
{
    int max_len = 1;
    for (int i = 0; i < n - 1; i++)
    {
        HashSet<Integer> set = new HashSet<>();
        set.add(a[i]);
        int min = a[i];
        int max = a[i];
        for (int j = i + 1; j < n; j++)
        {
            if (set.contains(a[j]))
            {
                break;
            }
            set.add(a[j]);
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
