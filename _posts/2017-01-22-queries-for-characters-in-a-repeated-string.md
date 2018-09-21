---
layout: post
title: Queries for characters in a repeated string
---
* Given a string X. Form a string S by repeating string X multiple times i.e appending string X multiple times with itself. There are Q queries of form i and j. The task is to print “Yes” if the element at index i is same as the element at index j in S else print “No” for each query.
* Examples :
{% highlight cpp %}
Input : X = "geeksforgeeks", Q = 3.
Query 1: 0 8
Query 2: 8 13
Query 3: 6 15

Output :
Yes
Yes
No

String S will be "geeksforgeeksgeeksforgeeks....".
For Query 1, index 0 and index 8 have same element i.e 'g'.
For Query 2, index 8 and index 13 have same element i.e 'g'.
For Query 3, index 6 = 'o' and index 15 = 'e' which are not same.
{% endhighlight %}
* Let length of string X be n. Observe that element at indexes 0, n, 2n, 3n,…. are same. Similarly for index i, position i, n+i, 2n+i, 3n+i,….. contain same element. So, for each query, find (i%n) and (j%n) and if both are same for string X.
* Below is the implementation of above idea :
{% highlight cpp %}
// Queries for same characters in a repeated
// string
#include<bits/stdc++.h>
using namespace std;

// Print whether index i and j have same
// element or not.
void query(char s[], int i, int j)
{
    int n = strlen(s);

    // Finding relative position of index i,j.
    i %= n;
    j %= n;

    // Checking is element are same at index i, j.
    (s[i]==s[j])? (cout << "Yes" << endl):
                  (cout << "No" << endl);
}

// Driven Program
int main()
{
    char X[] = "geeksforgeeks";

    query(X, 0, 8);
    query(X, 8, 13);
    query(X, 6, 15);

    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java Program to Queries for
// same characters in a 
// repeated string
import java.io.*;

public class GFG{
    
// Print whether index i and j
// have same element or not
static void query(String s, int i,
                  int j)
{
    int n = s.length();

    // Finding relative position
    // of index i,j
    i %= n;
    j %= n;

    // Checking is element are same
    // at index i, j
    if(s.charAt(i) == s.charAt(j))
    System.out.println("Yes");
    else
    System.out.println("No");
}

    // Driver Code
    static public void main (String[] args)
    {
    String X = "geeksforgeeks";

    query(X, 0, 8);
    query(X, 8, 13);
    query(X, 6, 15);

    }
}

// This code is contributed by vt_m.
{% endhighlight %}
{% highlight cpp %}
Yes
Yes
No
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

