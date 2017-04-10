---
layout: post
title: Find an equal point in a string of brackets
---
```java
int findEqualIndex(char[] a, int n)
{
    int[] open = new int[n + 1];
    int[] close = new int[n + 1];
    open[0] = 0;
    close[n] = 0;
    for (int i = 1; i < n + 1; i++)
    {
        if (a[i - 1] == '(')
        {
            open[i] = open[i - 1] + 1;
        } else
        {
            open[i] = open[i - 1];
        }
    }
    for (int i = n - 1; i >= 0; i--)
    {
        if (a[i] == ')')
        {
            close[i] = close[i + 1] + 1;
        } else
        {
            close[i] = close[i + 1];
        }
    }
    int index = 0;
    for (int i = 0; i < n + 1; i++)
    {
        if (open[i] == close[i])
        {
            index = i;
        }
    }
    return index;
}
```
