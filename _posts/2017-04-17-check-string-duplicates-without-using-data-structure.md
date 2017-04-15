---
layout: post
title: Efficiently check if a string has duplicates without using any additional data structure
---
```java
boolean areCharactorsUnique(String s)
{
    int checker = 0;
    for (int i = 0; i < s.length(); i++)
    {
        int k = s.charAt(i) - 'a';
        int val = 1 << k;
        if ((checker & val) > 0)
        {
            return false;
        }
        checker |= val;
    }
    return true;
}
```
