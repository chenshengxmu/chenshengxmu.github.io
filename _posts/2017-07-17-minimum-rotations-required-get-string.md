---
layout: post
title: Minimum rotations required to get the same string
---
* Given a string, we need to find the minimum number of rotations required to get the same string.
* Examples:
{% highlight cpp %}
Input : s = "geeks"
Output : 5

Input : s = "aaaa"
Output : 1
{% endhighlight %}
* The idea is based on below post.
* A Program to check if strings are rotations of each other or not
* Step 1 : Initialize result = 0 (Here result is count of rotations) Step 2 : Take a temporary string equals to original string concatenated with itself. Step 3 : Now take the substring of temporary string of size same as original string starting from second character (or index 1). Step 4 : Increase the count. Step 5 : Check whether the substring becomes equal to original string. If yes, then break the loop. Else go to step 2 and repeat it from the next index.
{% highlight cpp %}
// C++ program to determine minimum number
// of rotations required to yield same
// string.
#include <iostream>
using namespace std;

// Returns count of rotations to get the
// same string back.
int findRotations(string str)
{
    // tmp is the concatenated string.
    string tmp = str + str;
    int n = str.length();

    for (int i = 1; i <= n; i++) {

        // substring from i index of original
        // string size.
        string substring = tmp.substr(i, str.size());

        // if substring matches with original string
        // then we will come out of the loop.
        if (str == substring)
            return i;
    }
    return n;
}

// Driver code
int main()
{
    string str = "abc";
    cout << findRotations(str) << endl;
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to determine minimum number
// of rotations required to yield same
// string.

import java.util.*;

class GFG
{
    // Returns count of rotations to get the
    // same string back.
    static int findRotations(String str)
    {
        // tmp is the concatenated string.
        String tmp = str + str;
        int n = str.length();
    
        for (int i = 1; i <= n; i++)
        {
    
            // substring from i index of original
            // string size.
            
            String substring = tmp.substring(i, str.length());
    
            // if substring matches with original string
            // then we will come out of the loop.
            if (str == substring)
                return i;
        }
        return n;
    }

    // Driver Method
    public static void main(String[] args)
    {
            String str = "abc";
        System.out.println(findRotations(str));
    }
}
/* This code is contributed by Mr. Somesh Awasthi */
{% endhighlight %}
{% highlight cpp %}
3
{% endhighlight %}
* Time Complexity : O(n)
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

