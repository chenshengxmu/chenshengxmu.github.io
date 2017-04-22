---
layout: post
title: Convert array of distinct elements into Zig-Zag fashion
---
```java
void zigZag(int[] a, int n)
{
    boolean flag = true;
    for (int i = 0; i < n - 1; i++)
    {
        if (flag)
        {
            if (a[i] > a[i+1])
            {
                int tmp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = tmp;
            }
        }
        else
        {
            if (a[i] < a[i+1])
            {
                int tmp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = tmp;
            }
        }
        flag = !flag;
    }
}
```
