---
layout: post
title: Longest Palindromic Substring
---
```java
int longestPalindromicSubstrWithIndex(char[] a, int n)
{
    int max = 0;
    int start = 0;
    int end = 0;
    for (int i = 0; i < n; i++)
    {
        int low = i - 1;
        int high = i + 1;
        while (low >= 0 && high < n && a[low] == a[high])
        {
            int gap = high - low + 1;
            if (gap > max)
            {
                max = gap;
                start = low;
                end = high;
            }
            low--;
            high++;
        }
        low = i - 1;
        high = i;
        while (low >= 0 && high < n && a[low] == a[high])
        {
            int gap = high - low + 1;
            if (gap > max)
            {
                max = gap;
                start = low;
                end = high;
            }
            low--;
            high++;
        }
    }
    return max;
}
```
