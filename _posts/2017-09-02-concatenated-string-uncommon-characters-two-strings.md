---
layout: post
title: Concatenated string with uncommon characters of two strings
---
* Two strings are given and you have to modify 1st string such that all the common characters of the 2nd strings have to be removed and the uncommon characters of the 2nd string have to be concatenated with uncommon characters of the 1st string.
* Examples:
{% highlight cpp %}
Input : S1 = "aacdb"
        S2 = "gafd"
Output : "cbgf"

Input : S1 = "abcs";
        S2 = "cxzca";
Output : "bsxz"
{% endhighlight %}
* The idea is to use hash map where key is character and value is number of strings in which character is present. If a character is present in one string, then count is 1, else if character is present in both strings, count is 2.
{% highlight cpp %}
// C++ program Find concatenated string with
// uncommon characters of given strings
#include <bits/stdc++.h>
using namespace std;

string concatenetedString(string s1, string s2)
{   
    string res = ""; // result

    // store all characters of s2 in map
    unordered_map<char, int> m;
    for (int i = 0; i < s2.size(); i++)
        m[s2[i]] = 1;

    // Find characters of s1 that are not
    // present in s2 and append to result
    for (int i = 0; i < s1.size(); i++)
    {
        if (m.find(s1[i]) == m.end())
            res += s1[i];
        else
            m[s1[i]] = 2;
    }

    // Find characters of s2 that are not
    // present in s1.
    for (int i = 0; i < s2.size(); i++)
        if (m[s2[i]] == 1)
            res += s2[i];
    return res;
}

/* Driver program to test above function */
int main()
{
    string s1 = "abcs";
    string s2 = "cxzca";
    cout << concatenetedString(s1, s2);
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
bsxz
{% endhighlight %}
* Asked In : Microsoft
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

