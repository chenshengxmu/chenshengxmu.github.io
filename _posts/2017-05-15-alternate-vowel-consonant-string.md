---
layout: post
title: Alternate vowel and consonant string
---
* Given a string, rearrange characters of the given string such that the vowels and consonants occupy alternate position. If string can not be rearranged in desired way, print “no such string”. The order of vowels with respect to each other and the order of consonants with respect to each other should be maintained.
* If more than one required strings can be formed, print the lexicographically smaller.
* Examples:
{% highlight cpp %}
Input : geeks
Output : gekes

Input : onse
Output : nose
There are two possible outcomes
"nose" and "ones".  Since "nose"
is lexicographically smaller, we 
print it.
{% endhighlight %}
{% highlight cpp %}
// C++ implementation of alternate vowel and
// consonant string
#include <bits/stdc++.h>
using namespace std;

// 'ch' is vowel or not
bool isVowel(char ch)
{
    if (ch == 'a' || ch == 'e' || ch == 'i' ||
            ch == 'o' || ch =='u')
        return true;
    return false;
}

// create alternate vowel and consonant string
// str1[0...l1-1] and str2[start...l2-1]
string createAltStr(string str1, string str2,
                    int start, int l)
{
    string finalStr = "";

    // first adding character of vowel/consonant
    // then adding character of consonant/vowel
    for (int i=0, j=start; j<l; i++, j++)
        finalStr = (finalStr + str1.at(i)) + str2.at(j);
    return finalStr;
}

// function to find the required
// alternate vowel and consonant string
string findAltStr(string str)
{
    int nv = 0, nc = 0;
    string vstr = "", cstr = "";
    int l = str.size();
    for (int i=0; i<l; i++)
    {
        char ch = str.at(i);

        // count vowels and updaye vowel string
        if (isVowel(ch))
        {
            nv++;
            vstr = vstr + ch;
        }

        // count consonants and update consonant
        // string
        else
        {
            nc++;
            cstr = cstr + ch;
        }
    }

    // no such string can be formed
    if (abs(nv-nc) >= 2)
        return "no such string";

    // remove first character of vowel string
    // then create alternate string with
    // cstr[0...nc-1] and vstr[1...nv-1]
    if (nv > nc)
        return (vstr.at(0) + createAltStr(cstr, vstr, 1, nv));

    // remove first character of consonant string
    // then create alternate string with
    // vstr[0...nv-1] and cstr[1...nc-1]
    if (nc > nv)
        return (cstr.at(0) + createAltStr(vstr, cstr, 1, nc));

    // if both vowel and consonant
    // strings are of equal length
    // start creating string with consonant
    if (cstr.at(0) < vstr.at(0))
        return createAltStr(cstr, vstr, 0, nv);

    // start creating string with vowel
    return createAltStr(vstr, cstr, 0, nc);
}

// Driver program to test above
int main()
{
    string str = "geeks";
    cout << findAltStr(str);
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
gekes
{% endhighlight %}
* Time Complexity: O(n), where ‘n’ the is length of the string
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

