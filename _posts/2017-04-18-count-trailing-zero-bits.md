---
layout: post
title: Count trailing zero bits
---
```java
int countTrailingZero(int x)
{
    int count = 0;
    while ((x & 1) == 0)
    {
        x = x >> 1;
        count++;
    }
    return count;
}
```
