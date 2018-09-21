---
layout: post
title: Convert to a string that is repetition of a substring of k length
---
* Given a string, find if it is possible to convert it to a string that is repetition of substring with k characters. To convert, we can replace one substring of length k with k characters.
* Examples:
{% highlight cpp %}
Input: str = "bdac",  k = 2
Output: True
We can either replace "bd" with "ac" or 
"ac" with "bd".

Input: str = "abcbedabcabc",  k = 3
Output: True
Replace "bed" with "abc" so that the 
whole string becomes repetition of "abc".

Input: str = "bcacc", k = 3
Output: False
k doesn't divide string length i.e. 5%3 != 0

Input: str = "bcacbcac", k = 2
Output: False

Input: str = "bcdbcdabcedcbcd", k = 3
Output: False
{% endhighlight %}
* This can be used in compression. If we have a string where complete string is repetition except one substring, then we can use this algorithm to compress the string.
* One observation is, length of string must be a multiple of k as we can replace only one substring. The idea is declare a map mp which maps strings of length k to an integer denoting its count. So, if there are only two different sub-strings of length k in the map container and count of one of the sub-string is 1 then answer is true. Otherwise answer is false.
{% highlight cpp %}
// C++ program to check if a string can be converted to
// a string that has repeated substrings of length k.
#include<bits/stdc++.h>
using namespace std;

// Returns true if str can be coverted to a string
// with k repeated substrings after replacing k
// characters.
bool checkString(string str, long k)
{
    // Length of string must be a multiple of k
    int n = str.length();
    if (n%k != 0)
        return false;

    // Map to store strings of length k and their counts
    unordered_map<string, int> mp;
    for (int i=0; i<n; i+=k)
        mp[str.substr(i, k)]++;

    // If string is already a repition of k substrings,
    // return true.
    if (mp.size() == 1)
        return true;

    // If number of distinct substrings is not 2, then
    // not possible to replace a string.
    if (mp.size() != 2)
        return false;

    // One of the two distinct must appear exactly once.
    // Either the first entry appears once, or it appears
    // n/k-1 times to make other substring appear once.
    if ((mp.begin()->second == (n/k - 1)) ||
                    mp.begin()->second == 1)
       return true;

    return false;
}

// Driver code
int main()
{
    checkString("abababcd", 2)? cout << "Yes" :
                                cout << "No";
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
Yes
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

