---
layout: post
title: check if strings are rotations of each other or not
---
```java
boolean areRotations(String s1, String s2)
{
    if (s1.length() != s2.length())
    {
        return false;
    }
    String s = s1 + s1;
    return s.contains(s2);
}
```
