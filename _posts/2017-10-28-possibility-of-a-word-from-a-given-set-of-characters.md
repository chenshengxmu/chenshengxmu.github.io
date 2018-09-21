---
layout: post
title: Possibility of a word from a given set of characters
---
* Given two strings ‘s’ and ‘q’, check if all characters of q are present in ‘s’.
* Examples:
{% highlight cpp %}
Example:
Input: s = "abctd"
       q = "cat"
Output: Yes
Explanation:
All characters of "cat" are
present in "abctd"
 
Input: s = dog
       hod
Output: No
Explanation:
Given query 'hod' hod has the letter
'h' which is not available in set 'dog', 
hence the output is no.
{% endhighlight %}
* A simple solution is to try all characters one by one. Find its number of occurrences in ‘q’, then in ‘s’. Number of occurrences in ‘q’ must be less than or equal to same in ‘s’. If all characters satisfy this condition, return true. Else return false.
* An efficient solution is to create a frequency array of length 256 (Number of possible characters) and initialize it to 0. Then we calculate the frequency of each element present in ‘s’. After counting characters in ‘s’, we traverse through ‘q’ and check if frequency of each character is less than its frequency in ‘s’, by reducing its frequency in the frequency array constructed for ‘s’.
* Below given is the implementation of the above approach
{% highlight cpp %}
// CPP program to check if a query string
// is present is given set.
#include <bits/stdc++.h>
using namespace std;

const int MAX_CHAR = 256;

bool isPresent(string s, string q)
{
    // Count occurrences of all characters
    // in s.
    int freq[MAX_CHAR] = { 0 };
    for (int i = 0; i < s.length(); i++)
        freq[s[i]]++;

    // Check if number of occurrences of
    // every character in q is less than
    // or equal to that in s.
    for (int i = 0; i < q.length(); i++) {
        freq[q[i]]--;
        if (freq[q[i]] < 0) 
           return false;
    }

    return true;
}

// driver program
int main()
{
    string s = "abctd";
    string q = "cat";

    if (isPresent(s, q))
        cout << "Yes";
    else
        cout << "No";

    return 0;
}
{% endhighlight %}
{% highlight java %}
// java program to check if a query
// string is present is given set.
import java.io.*;

public class GFG {

    static int MAX_CHAR = 256;
    
    static boolean isPresent(String s, String q)
    {
        
        // Count occurrences of all
        // characters in s.
        int []freq = new int[MAX_CHAR];
        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i)]++;
    
        // Check if number of occurrences of
        // every character in q is less than
        // or equal to that in s.
        for (int i = 0; i < q.length(); i++)
        {
            freq[q.charAt(i)]--;
            
            if (freq[q.charAt(i)] < 0) 
                return false;
        }
    
        return true;
    }
    
    // driver program
    static public void main (String[] args)
    {
        String s = "abctd";
        String q = "cat";
    
        if (isPresent(s, q))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

// This code is contributed by vt_m.
{% endhighlight %}
{% highlight python %}
# Python 3 program to check if a query
# string is present is given set.
MAX_CHAR = 256

def isPresent(s, q):

    # Count occurrences of all characters
    # in s.
    freq = [0] *  MAX_CHAR 
    for i in range(0 , len(s)):
        freq[ord(s[i])] += 1

    # Check if number of occurrences of
    # every character in q is less than
    # or equal to that in s.
    for i in range(0, len(q)):
        freq[ord(q[i])] -= 1
        if (freq[ord(q[i])] < 0): 
            return False
    
    return True

# driver program
s = "abctd"
q = "cat"

if (isPresent(s, q)):
    print("Yes")
else:
    print("No")

# This code is contributed by Smitha
{% endhighlight %}
{% highlight cpp %}
Yes
{% endhighlight %}
* Time complexity : O(n)
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

