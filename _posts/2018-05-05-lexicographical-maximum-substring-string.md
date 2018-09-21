---
layout: post
title: Lexicographical Maximum substring of string
---
* Given a string s we have to find the lexicographical maximum substring of a string
* Examples:
{% highlight cpp %}
Input : s = "ababaa"
Output : babaa
Explanation : "babaa" is the maximum lexicographic susbtring formed from this string

Input : s = "asdfaa"
Output : sdfaa
{% endhighlight %}
* The idea is simple, we traverse through all substrings. For every substring, we compare it with current result and update result if needed.
{% highlight cpp %}
// CPP program to find the lexicographically
// maximum substring.
#include <bits/stdc++.h>
using namespace std;

string LexicographicalMaxString(string str)
{
    // loop to find the max leicographic 
    // substring in the substring array
    string mx = "";
    for (int i = 0; i < str.length(); ++i)
        mx = max(mx, str.substr(i));

    return mx;
}

int main()
{
    string str = "ababaa";
    cout << LexicographicalMaxString(str);
    return 0;
}
{% endhighlight %}
{% highlight cpp %}
babaa
{% endhighlight %}
* Time Complexity : O(n) Space Complexity : O(n)
* Optimization : We find largest character and all its indexes. Now we simply traverse through all instances of the largest character to find lexicographically maximum substring.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

