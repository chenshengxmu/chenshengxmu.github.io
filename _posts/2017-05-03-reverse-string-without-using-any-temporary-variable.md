---
layout: post
title: Reverse string without using any temporary variable
---
* We are given a string. We are also given indexes of first and last characters in string. The task is to reverse the string without using any extra variable.
* Examples:
{% highlight cpp %}
Input  : str = "abc"
Output : str = "cba" 

Input :  str = "GeeksforGeeks"
Output : str = "skeeGrofskeeG"
{% endhighlight %}
* If we take a look at program to reverse a string or array, all we need to do is swap two characters. The idea is to use XOR for swapping the variable. Below is C++ implementation of the idea.
{% highlight cpp %}
// C++ Program to reverse a string without
// using temp variable
#include <bits/stdc++.h>
using namespace std;

// Function to reverse string and return revesed string
string reversingString(string str, int start, int end)
{
    // Iterate loop upto start not equal to end
    while (start < end)
    {
        // XOR for swapping the variable
        str[start] ^= str[end];
        str[end] ^= str[start];
        str[start] ^= str[end];

        ++start;
        --end;
    }
    return str;
}

// Driver Code
int main()
{
    string s = "GeeksforGeeks";
    cout << reversingString(s, 0, 12);
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
skeeGrofskeeG
{% endhighlight %}
* If we are allowed to library function, we can also use the idea discussed in quickly reverse a string in C++. We don’t even need indexes of first and last characters.
{% highlight cpp %}
// Reversing a string using reverse()
#include<bits/stdc++.h>
using namespace std;

int main()
{
   string str = "geeksforgeeks";
    
   // Reverse str[beign..end]
   reverse(str.begin(), str.end());
    
   cout << str;
   return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
skeeGrofskeeG
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

