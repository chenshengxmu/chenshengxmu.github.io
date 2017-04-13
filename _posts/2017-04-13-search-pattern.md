---
layout: post
title: Searching for Patterns
---
```java
void search(char[] pat, int m , char[] txt, int n)
{
    for (int i = 0; i <= n - m; i++)
    {
        int j = 0;
        while (j < m)
        {
            if (pat[j] != txt[i + j])
            {
                break;
            }
            j++;
        }
        if (j == m)
        {
            System.out.println(i);
        }
    }
}
```
