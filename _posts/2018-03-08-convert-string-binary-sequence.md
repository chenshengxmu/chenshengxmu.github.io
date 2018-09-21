---
layout: post
title: Convert String into Binary Sequence
---
* Given a string of character the task is to convert each character of a string into the equivalent binary number.
* Examples :
{% highlight cpp %}
Input : GFG
Output : 1000111 1000110 1000111  

Input :  geeks
Output : 1100111 1100101 1100101 1101011 1110011
{% endhighlight %}
* The idea is to first calculate the length of the string as n and then run a loop n times. In each iteration store ASCII value of character in variable val and then convert it into binary number and store result in array finally print the array in reverse order.
{% highlight cpp %}
// C++ program to convert
// string into binary string
#include <bits/stdc++.h>
using namespace std;

// utility function
void strToBinary(string s)
{
    int n = s.length();


    for (int i = 0; i <= n; i++)
    {
        // convert each char to
        // ASCII value
        int val = int(s[i]);

        // Convert ASCII value to binary
        string bin = "";
        while (val > 0)
        {
            (val % 2)? bin.push_back('1') :
                       bin.push_back('0');
            val /= 2;
        }
        reverse(bin.begin(), bin.end());

        cout << bin << " ";
    }
}

// driver code
int main()
{

    string s = "geeks";
    strToBinary(s);
    return 0;
}
{% endhighlight %}
{% highlight cpp %}
1100111 1100101 1100101 1101011 1110011
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

