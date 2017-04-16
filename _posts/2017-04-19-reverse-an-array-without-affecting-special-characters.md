---
layout: post
title: Reverse an array without affecting special characters
---
```java
void reverse(char[] s, int n)
{
    int l = 0;
    int r = n - 1;
    while (l < r)
    {
        if (!isAlphabet(s[l]))
        {
            l++;
        }
        else if (!isAlphabet(s[r]))
        {
            r--;
        }
        else
        {
            char tmp = s[l];
            s[l] = s[r];
            s[r] = tmp;
            l++;
            r--;
        }
    }
}

boolean isAlphabet(char c)
{
    return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z';
}
```
