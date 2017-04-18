---
layout: post
title: Count triplets with sum smaller than a given value
---
```java
int countTriplets(int a[], int n, int sum)
{
    Arrays.sort(a);
    int count = 0;
    for (int i = 0; i < n - 2; i++)
    {
        int j = i + 1;
        int k = n - 1;
        while (j < k)
        {
            if (a[i] + a[j] + a[k] >= sum)
            {
                k--;
            }
            else
            {
                count += (k - j);
                j++;
            }
        }
    }
    return count;
}
```
