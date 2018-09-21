---
layout: post
title: String with k distinct characters and no same characters adjacent
---
* Given N and K, print a string that has n characters. The string should have exactly k distinct characters and no adjacent positions.
* Examples:
{% highlight cpp %}
Input  : n = 5, k = 3 
Output :  abcab
Explanation: 3 distinct character a, b, c
and n length string. 

Input: 3 2
Output: aba 
Explanation: 2 distinct character 'a' 
and 'b' and n length string.
{% endhighlight %}
* Consider the first k Latin letters. We will add them to the answer in the order, firstly, we add a, then b and so on. If letters are finished but the length of the answer is still less than the required one, then we start again adding letters from the beginning of the alphabet. We repeat this process until the length of the answer becomes n and print it once done.
* Below is the implementation of the above approach
{% highlight cpp %}
// CPP program to construct a n length string
// with k distinct characters such that no two
// same characters are adjacent.
#include <iostream>
using namespace std;

// Function to find a string of length
// n with k distinct characters.
string findString(int n, int k)
{
    // Initialize result with first k
    // Latin letters
    string res = "";
    for (int i = 0; i < k; i++)
        res = res + (char)('a' + i);

    // Fill remaining n-k letters by
    // repeating k letters again and again.
    int count = 0;
    for (int i = 0; i < n - k; i++) {
        res = res + (char)('a' + count);
        count++;
        if (count == k)
            count = 0;
    }
    return res;
}

// Driver code
int main()
{
    int n = 5, k = 2;
    cout << findString(n, k);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to construct a n length
// string with k distinct characters
// such that no two same characters
// are adjacent.
import java.io.*;

public class GFG {
    
    // Function to find a string of
    // length n with k distinct characters.
    static String findString(int n, int k)
    {
        
        // Initialize result with first k
        // Latin letters
        String res = "";
        
        for (int i = 0; i < k; i++)
            res = res + (char)('a' + i);
    
        // Fill remaining n-k letters by
        // repeating k letters again and 
        // again.
        int count = 0;
        
        for (int i = 0; i < n - k; i++)
        {
            res = res + (char)('a' + count);
            count++;
            
            if (count == k)
                count = 0;
        }
        
        return res;
    }
    
    // Driver code
    static public void main (String[] args)
    {
    
        int n = 5, k = 2;
        
        System.out.println(findString(n, k));
    }
}

// This article is contributed by vt_m.
{% endhighlight %}
{% highlight cpp %}
ababa
{% endhighlight %}
* Time complexity : O(n)
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

