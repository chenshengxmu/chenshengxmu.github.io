---
layout: post
title: Minimum number of characters to be removed to make a binary string alternate
---
* Given a binary string, the task is to find minimum number of characters to be removed from it so that it becomes alternate. A binary string is alternate if there are no two consecutive 0s or 1s.
* Examples :
{% highlight cpp %}
Input  : s = "000111"
Output : 4  
We need to delete two 0s and
two 1s to make string alternate.

Input  : s = "0000"
Output : 3  
We need to delete three characters
to make it alternate.

Input  :  s = "11111"
Output :  4   

Input  : s = "01010101"
Output : 0   

Input  : s = "101010"
Output : 0
{% endhighlight %}
* This problem has below simple solution.
* We traverse string from left to right and compare current character with next character.
* Below is the implementation of above algorithm.
{% highlight cpp %}
// C++ program to find minimum number
// of characters to be removed to make
// a string alternate.
#include <bits/stdc++.h>
using namespace std;

// Returns count of minimum characters to
// be removed to make s alternate.
void countToMake0lternate(const string& s)
{
    int result = 0;

    for (int i = 0; i < (s.length() - 1); i++)

        // if two alternating characters
        // of string are same
        if (s[i] == s[i + 1])
            result++; // then need to
    // delete a character

    return result;
}

// Driver code
int main()
{
    cout << countToMake0lternate("000111") << endl;
    cout << countToMake0lternate("11111") << endl;
    cout << countToMake0lternate("01010101") << endl;
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to find minimum number
// of characters to be removed to make
// a string alternate.
import java.io.*;

public class GFG {

    // Returns count of minimum characters to
    // be removed to make s alternate.
    static int countToMake0lternate(String s)
    {
        int result = 0;

        for (int i = 0; i < (s.length() - 1); i++)

            // if two alternating characters
            // of string are same
            if (s.charAt(i) == s.charAt(i + 1))
                result++; // then need to
        // delete a character

        return result;
    }

    // Driver code
    static public void main(String[] args)
    {
        System.out.println(countToMake0lternate("000111"));
        System.out.println(countToMake0lternate("11111"));
        System.out.println(countToMake0lternate("01010101"));
    }
}

// This code is contributed by vt_m.
{% endhighlight %}
{% highlight cpp %}
4
4
0
{% endhighlight %}
* Time Complexity : O(n) where n is number of characters in input string.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

