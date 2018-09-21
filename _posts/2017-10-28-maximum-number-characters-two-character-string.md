---
layout: post
title: Maximum number of characters between any two same character in a string
---
* Given a string, find the maximum number of characters between any two same character in the string. If no character repeats, print -1.
{% highlight cpp %}
Input : str = "abba"
Output : 2
The maximum number of characters are
between two occurrences of 'a'.

Input : str = "baaabcddc"
Output : 3
The maximum number of characters are
between two occurrences of 'b'.

Input : str = "abc"
Output : -1
{% endhighlight %}
* Approach 1 (Simple): Use two nested loops. The outer loop picks character from left to right, the inner loop finds farthest occurrence and keeps track of maximum.
{% highlight cpp %}
// Simple C++ program to find maximum number
// of characters between two occurrences of
// same character
#include <bits/stdc++.h>
using namespace std;

int maximumChars(string& str)
{
    int n = str.length();
    int res = -1;
    for (int i = 0; i < n - 1; i++)
        for (int j = i + 1; j < n; j++)
            if (str[i] == str[j])
                res = max(res, abs(j - i - 1));
    return res;
}

// Driver code
int main()
{
    string str = "abba";
    cout << maximumChars(str);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Simple Java program to find maximum
// number of characters between two
// occurrences of same character
class GFG {
    
    static int maximumChars(String str)
    {
        int n = str.length();
        int res = -1;
        
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (str.charAt(i) == str.charAt(j))
                    res = Math.max(res, 
                         Math.abs(j - i - 1));
                         
        return res;
    }
    
    // Driver code
    public static void main(String[] args)
    {
        String str = "abba";
        
        System.out.println(maximumChars(str));
    }
}

// This code is contributed by vt_m.
{% endhighlight %}
{% highlight cpp %}
2
{% endhighlight %}
* Time Complexity : O(n^2)
*   Approach 2 (Efficient) : Initialize an array”FIRST” of length 26 in which we have to store first occurrence of an alphabet in the string and another array “LAST” of length 26 in which we will store last occurrence of the alphabet in the string here index 0 is correspond to alphabet a, 1 for b and so on . After that we will take the difference of last and first arrays to find max difference if they are not at same position.
{% highlight cpp %}
// Efficient C++ program to find maximum number
// of characters between two occurrences of
// same character
#include <bits/stdc++.h>
using namespace std;

const int MAX_CHAR = 256;

int maximumChars(string& str)
{
    int n = str.length();
    int res = -1;

    // Initialize all indexes as -1.
    int firstInd[MAX_CHAR];
    for (int i = 0; i < MAX_CHAR; i++)
        firstInd[i] = -1;

    for (int i = 0; i < n; i++) {
        int first_ind = firstInd[str[i]];

        // If this is first occurrence 
        if (first_ind == -1)
            firstInd[str[i]] = i;

        // Else find distance from previous
        // occurrence and update result (if
        // required). 
        else
            res = max(res, abs(i - first_ind - 1));
    }
    return res;
}

// Driver code
int main()
{
    string str = "abba";
    cout << maximumChars(str);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Efficient java program to find maximum
// number of characters between two
// occurrences of same character
import java.io.*;

public class GFG {

    static int MAX_CHAR = 256;
    
    static int maximumChars(String str)
    {
        int n = str.length();
        int res = -1;
    
        // Initialize all indexes as -1.
        int []firstInd = new int[MAX_CHAR];
        
        for (int i = 0; i < MAX_CHAR; i++)
            firstInd[i] = -1;
    
        for (int i = 0; i < n; i++)
        {
            int first_ind = firstInd[str.charAt(i)];
    
            // If this is first occurrence 
            if (first_ind == -1)
                firstInd[str.charAt(i)] = i;
    
            // Else find distance from previous
            // occurrence and update result (if
            // required). 
            else
                res = Math.max(res, Math.abs(i
                                  - first_ind - 1));
        }
        
        return res;
    }
    
    // Driver code
    
    static public void main (String[] args)
    {
        String str = "abba";
        
        System.out.println(maximumChars(str));
    }
}

// This code is contributed by vt_m.
{% endhighlight %}
{% highlight cpp %}
2
{% endhighlight %}
* Time Complexity : O(n)
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

