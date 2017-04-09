---
layout: post
title: Count substrings with same first and last characters
---
```java
int countSubstringWithEqualEnds(char[] a)
{
    int count = 0;
    int n = a.length;
    for (int i = 0; i < n; i++)
    {
        for (int j = i; j < n; j++)
        {
            if (a[i] == a[j])
            {
                count++;
            }
        }
    }
    return count;
}

int countSubstringWithEqualEndsBest(char[] a)
{
    int result = 0;
    int[] count = new int[26];
    int n = a.length;
    for (int i = 0; i < n; i++)
    {
        int key = a[i] - 'a';
        count[key] += 1;
    }

    for (int i = 0; i < 26; i++)
    {
        result += (count[i] * (count[i] + 1) / 2);
    }
    return result;
}
```
