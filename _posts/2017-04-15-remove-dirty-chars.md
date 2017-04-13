---
layout: post
title: Remove characters from the first string which are present in the second string
---
```java
void removeDirtyChars(char[] s1, int n1, char[] s2, int n2)
{
    int[] count = new int[256];
    for (int i = 0; i < n2; i++)
    {
        count[s2[i]] += 1;
    }
    int j = 0;
    for (int i = 0; i < n1; i++)
    {
        if (count[s1[i]] == 0)
        {
            s1[j] = s1[i];
            j++;
        }
    }
    s1[j] = '\0';
}
```
