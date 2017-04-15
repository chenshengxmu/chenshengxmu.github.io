---
layout: post
title: Count trailing zero bits
---
```java
int countTrailingZero(int x)
{
    int count = 0;
    for (int i = 0; i < 32; i++)
    {
        if ((x & 1) != 0)
        {
            break;
        }
        x = x >> 1;
        count++;
    }
    return count;
}
```
