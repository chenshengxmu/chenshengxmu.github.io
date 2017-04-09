---
layout: post
title: Remove extra spaces from a string
---
```java
void removeAllSpace(char[] a)
{
    int j = 0;
    int n = a.length;
    for (int i = 0; i < n; i++)
    {
        if (a[i] != ' ')
        {
            a[j] = a[i];
            j++;
        }
    }
    a[j] = '@';
}

void removeExtraSpace(char[] a)
{
    int j = 0;
    int n = a.length;
    int i = 0;
    while (i < n && a[i] == ' ')
    {
        i++;
    }
    while (i < n)
    {
        if (a[i] != ' ')
        {
            a[j] = a[i];
            j++;
            i++;
        }
        else
        {
            while (i < n && a[i] == ' ')
            {
                i++;
            }
            if (i < n)
            {
                a[j] = ' ';
                j++;
            }
        }
    }
    a[j] = '@';
}

void removeExtraSpacePunctuation(char[] a)
{
    int j = 0;
    int n = a.length;
    int i = 0;
    while (i < n && a[i] == ' ')
    {
        i++;
    }
    while (i < n)
    {
        if (a[i] != ' ')
        {
            a[j] = a[i];
            j++;
            i++;
        }
        else
        {
            while (i < n && a[i] == ' ')
            {
                i++;
            }
            if (i < n)
            {
                if (a[i] != '.' && a[i] != ',' && a[i] != '?')
                {
                    a[j] = ' ';
                    j++;
                }
            }
        }
    }
    a[j] = '@';
}
```
