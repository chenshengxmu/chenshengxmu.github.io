---
layout: post
title: Ways to remove one element from a binary string so that XOR becomes zero
---
* Given a binary string, task is to erase exactly one integer in the array so that the XOR of the remaining numbers is zero. The task is to count number of ways to remove one element so that XOR of that string become ZERO.
* Examples :
{% highlight cpp %}
Input : 10000
Output : 1
We only have 1 ways to 

Input : 10011
Output : 3
There are 3 ways to make XOR 0. We
can remove any of the three 1's.

Input : 100011100
Output : 5
There are 5 ways to make XOR 0. We
can remove any of the give 0's
{% endhighlight %}
* A simple solution is to one by one remove an element, then compute XOR of remaining string. And count occurrences where removing an element makes XOR 0.
* An efficient solution is based on following fact. If count of 1s is odd, then we must remove a 1 to make count 0 and we can remove any of the 1s. If count of 1s is even, then XOR is 0, We can remove any of the 0s and XOR will remain 0.
{% highlight cpp %}
// C++ program to count number of ways to
// remove an element so that XOR of remaining
// string becomes 0.
#include <bits/stdc++.h>
using namespace std;

// Return number of ways in which XOR become ZERO
// by remove 1 element
int xorZero(string str)
{
    int one_count = 0, zero_count = 0;
    int n = str.length();

    // Counting number of 0 and 1
    for (int i = 0; i < n; i++)
        if (str[i] == '1')
            one_count++;
        else
            zero_count++;
    
    // If count of ones is even
    // then return count of zero
    // else count of one
    if (one_count % 2 == 0)
        return zero_count;
    return one_count;
}

// Driver Code
int main()
{
    string str = "11111";
    cout << xorZero(str) << endl;
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to count number of ways to
// remove an element so that XOR of remaining
// string becomes 0.
import java.util.*;
 
class CountWays
{
    // Returns number of ways in which XOR become
    // ZERO by remove 1 element
    static int xorZero(String s)
    {
        int one_count = 0, zero_count = 0;
        char[] str=s.toCharArray();
        int n = str.length;
     
        // Counting number of 0 and 1
        for (int i = 0; i < n; i++)
            if (str[i] == '1')
                one_count++;
            else
                zero_count++;
         
        // If count of ones is even
        // then return count of zero
        // else count of one
        if (one_count % 2 == 0)
            return zero_count;
        return one_count;
    }

    // Driver Code to test above function
    public static void main(String[] args)
    {
        String s = "11111";
        System.out.println(xorZero(s));  
    }
}

// This code is contributed by Mr. Somesh Awasthi
{% endhighlight %}
{% highlight cpp %}
5
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

