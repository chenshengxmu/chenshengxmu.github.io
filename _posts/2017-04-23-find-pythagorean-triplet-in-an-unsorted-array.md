---
layout: post
title: Pythagorean Triplet in an array
---
```java
boolean isTriplet(int[] a, int n)
{
    for (int i = 0; i < n; i++)
    {
        a[i] = a[i] * a[i];
    }
    Arrays.sort(a);
    for (int i = n-1; i >= 2; i--)
    {
        int l = 0;
        int r = i - 1;
        while (l < r)
        {
            if (a[l] + a[r] == a[i])
            {
                return true;
            }
            else if (a[l] + a[r] < a[i])
            {
                l++;
            }
            else
            {
                r--;
            }
        }
    }
    return false;
}
```
