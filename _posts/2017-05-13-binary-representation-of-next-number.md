---
layout: post
title: Binary representation of next number
---
* Given a binary input that represents binary representation of positive number n, find binary representation of n+1.
* The binary input may be and may not fit even in unsigned long long int.
* Examples:
{% highlight cpp %}
Input : 10011
Output : 10100
Here n = (19)10 = (10011)2
next greater integer = (20)10 = (10100)2 

Input : 111011101001111111
Output : 111011101010000000
{% endhighlight %}
* We store input as string so that large numbers can be handled. We traverse the string from rightmost character and convert all 1s to 0s until we find a 0. Finally convert the found 0 to 1. If we do not find a 0, we append a 1 to overall string.
{% highlight cpp %}
string nextGreater(num)
  l = num.length

  // Find first 0 from right side. While
  // searching, convert 1s to 0s
  for i = l-1 to 0
    if num[i] == '0'
       num[i] = '1'
       break
    else
       num[i] = '0'
         
  // If there was no 0  
  if i < 0
      num = '1' + num
  return num
{% endhighlight %}
* Below is C++ implementation of above idea.
{% highlight cpp %}
// C++ implementation to find the binary
// representation of next greater integer
#include <bits/stdc++.h>
using namespace std;

// function to find the required
// binary representation
string nextGreater(string num)
{
    int l = num.size();

    // examine bits from the right
    for (int i=l-1; i>=0; i--)
    {
        // if '0' is encountered, convert
        // it to '1' and then break
        if (num.at(i) == '0')
        {
            num.at(i) = '1';
            break;
        }

        // else convert '1' to '0'
        else
            num.at(i) = '0';
    }

    // if the binary representation
    // contains only the set bits
    if (i < 0)
        num = "1" + num;

    // final binary representation
    // of the required integer
    return num;
}

// Driver program to test above
int main()
{
    string num = "10011";
    cout << "Binary representation of next number = "
         << nextGreater(num);
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
Binary representation of next number = 10100
{% endhighlight %}
* Time Complexity : O(n) where n is number of bits in input.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

