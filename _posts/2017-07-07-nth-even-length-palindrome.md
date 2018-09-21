---
layout: post
title: Nth Even length Palindrome
---
* Given a number n as string, find the nth even-length positive palindrome number .
* Examples:
{% highlight cpp %}
Input : n = "1"
Output : 11
1st even-length palindrome is 11 .

Input : n = "10"
Output : 1001
The first 10 even-length palindrome numbers are 11, 22, 
33, 44, 55, 66, 77, 88, 99 and 1001.
{% endhighlight %}
* As, it is a even-length palindrome so its first half should be equal to second half and length will be 2, 4, 6, 8 …. To evaluate nth palindrome let’s just see 1st 10 even-length palindrome numbers 11, 22, 33, 44, 55, 66, 77, 88, 99 and 1001 . Here, nth palindrome is nn’ where n’ is reverse of n . Thus we just have to write n and n’ in a consecutive manner where n’ is reverse of n .
* Below is implementation of this approach .
{% highlight cpp %}
// C++ program to find n=th even length string.
#include <bits/stdc++.h>
using namespace std;

// Function to find nth even length Palindrome
string evenlength(string n)
{
    // string r to store resultant
    // palindrome. Initialize same as s
    string res = n;

    // In this loop string r stores
    // reverse of string s after the
    // string s in consecutive manner .
    for (int j = n.length() - 1; j >= 0; --j)
        res += n[j];

    return res;
}

// Driver code to test above function
int main()
{
    string n = "10";
    cout << evenlength(n);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to find nth even length Palindrome
import java.io.*;

class GFG {
    // Function to find nth even length Palindrome
    static String evenlength(String n)
    {
        // string r to store resultant
        // palindrome. Initialize same as s
        String res = n;

        // In this loop string r stores
        // reverse of string s after the
        // string s in consecutive manner
        for (int j = n.length() - 1; j >= 0; --j)
            res += n.charAt(j);

        return res;
    }

    // driver program
    public static void main(String[] args)
    {
        String n = "10";
        System.out.println(evenlength(n));
    }
}

// Contributed by Pramod Kumar
{% endhighlight %}
{% highlight cpp %}
1001
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

