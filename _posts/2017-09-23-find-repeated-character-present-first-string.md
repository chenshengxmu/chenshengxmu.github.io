---
layout: post
title: Find repeated character present first in a string
---
* Given a string, find the repeated character present first in the string.
* (Not the first repeated character, found here.) Examples:
{% highlight cpp %}
Input  : geeksforgeeks
Output : g
(mind that it will be g, not e.)
{% endhighlight %}
* Asked in: Goldman Sachs internship
* Simple Solution using O(N^2) complexity The solution is to loop through the string for each character and search for the same in the rest of the string. This would need two loops and thus not optimal.
{% highlight c %}
// C program to find the fist character that 
// is repeated
#include <stdio.h>
#include <string.h>

int findRepeatFirstN2(char* s)
{
    // this is O(N^2) method
    int p = -1, i, j;
    for (i = 0; i < strlen(s); i++) {
        for (j = i + 1; j < strlen(s); j++) {
            if (s[i] == s[j]) {
                p = i;
                break;
            }
        }
        if (p != -1)
            break;
    }

    return p;
}

// Driver code
int main()
{
    char str[] = "geeksforgeeks";
    int pos = findRepeatFirstN2(str);
    if (pos == -1)
        printf("Not found");
    else
        printf("%c", str[pos]);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to find the fist character
// that is repeated
import java.io.*;
import java.util.*;

class GFG {

    static int findRepeatFirstN2(String s)
    {
        
        // this is O(N^2) method
        int p = -1, i, j;
        for (i = 0; i < s.length(); i++)
        {
            for (j = i + 1; j < s.length(); j++)
            {
                if (s.charAt(i) == s.charAt(j))
                {
                    p = i;
                    break;
                }
            }
            if (p != -1)
                break;
        }
    
        return p;
    }
    
    // Driver code
    static public void main (String[] args)
    {
        String str = "geeksforgeeks";
        int pos = findRepeatFirstN2(str);
        
        if (pos == -1)
            System.out.println("Not found");
        else
        System.out.println( str.charAt(pos));
    }
}

// This code is contributed by anuj_67.
{% endhighlight %}
* Output:
{% highlight cpp %}
g
{% endhighlight %}
* Optimization by counting occurrences
* This solution is optimized by using the following techniques: 1. We loop through the string and hash the characters using ASCII codes. Store 1 if found and store 2 if found again. Also, store the position of the letter first found in.
* 2. We run a loop on the hash array and now we find the minimum position of any character repeated.
* This will have a runtime of O(N).
{% highlight c %}
// C program to find the fist character that 
// is repeated
#include <stdio.h>
#include <string.h>

// 256 is taken just to ensure nothing is left,
// actual max ASCII limit is 128
#define MAX_CHAR 256

int findRepeatFirst(char* s)
{
    // this is optimized method
    int p = -1, i, k;

    // initialized counts of occurrences of
    // elements as zero
    int hash[MAX_CHAR] = { 0 };

    // initialized positions
    int pos[MAX_CHAR];

    for (i = 0; i < strlen(s); i++) {
        k = (int)s[i];
        if (hash[k] == 0) {
            hash[k]++;
            pos[k] = i;
        } else if (hash[k] == 1)
            hash[k]++;
    }

    for (i = 0; i < MAX_CHAR; i++) {
        if (hash[i] == 2) {
            if (p == -1) // base case
                p = pos[i];
            else if (p > pos[i])
                p = pos[i];
        }
    }

    return p;
}

// Driver code
int main()
{
    char str[] = "geeksforgeeks";
    int pos = findRepeatFirst(str);
    if (pos == -1)
        printf("Not found");
    else
        printf("%c", str[pos]);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java Program to find the fist character  
// that is repeated

import java.util.*;
import java.lang.*;

public class GFG
{
    public static int findRepeatFirst(String s)
    {
        // this is optimized method
        int p = -1, i, k;

        // initialized counts of occurrences of
        // elements as zero
        int MAX_CHAR = 256;
        int hash[] = new int[MAX_CHAR];

        // initialized positions
        int pos[] = new int[MAX_CHAR];

        for (i = 0; i < s.length(); i++)
        {
            k = (int)s.charAt(i);
            if (hash[k] == 0)
            {
                hash[k]++;
                pos[k] = i;
            }
            else if (hash[k] == 1)
                hash[k]++;
        }

        for (i = 0; i < MAX_CHAR; i++)
        {
            if (hash[i] == 2)
            {
                if (p == -1) // base case
                    p = pos[i];
                else if (p > pos[i])
                    p = pos[i];
            }
        }

        return p;
    }

// Driver code
    public static void main(String[] args)
    {
        String str = "geeksforgeeks";
        int pos = findRepeatFirst(str);
        if (pos == -1)
            System.out.println("Not found");
        else
            System.out.println(str.charAt(pos));
    }
}

// Code Contributed by Mohit Gupta_OMG
{% endhighlight %}
{% highlight cpp %}
g
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

