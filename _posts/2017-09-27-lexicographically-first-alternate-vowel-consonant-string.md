---
layout: post
title: Lexicographically first alternate vowel and consonant string
---
* Given a string str. The problem is to rearrange characters of the given string such that the vowels and consonants occupy alternate position and the string so formed should be lexicographically (alphabetically) smallest. If string can not be rearranged in desired way, print “no such string”.
* Examples:
{% highlight cpp %}
Input : mango
Output : gamon
It could be arranged in other ways too, like
manog, etc., but gamon is lexicographically
smallest.

Input : aeroplane
Output : alanepero
{% endhighlight %}
* Approach: Following are the steps:
{% highlight cpp %}
// C++ implementation of lexicographically first
// alternate vowel and consonant string
#include <bits/stdc++.h>
using namespace std;

#define SIZE 26

// 'ch' is vowel or not
bool isVowel(char ch)
{
    if (ch == 'a' || ch == 'e' || ch == 'i' || 
                       ch == 'o' || ch == 'u')
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
    for (int i = 0, j = start; j < l; i++, j++)
        finalStr = (finalStr + str1.at(i)) +
                                 str2.at(j);
    return finalStr;
}

// function to find the required lexicographically
// first alternate vowel and consonant string
string findAltStr(string str)
{
    // hash table to store frequencies
    // of each character in 'str'
    int char_freq[SIZE];

    // initilaize all elements of char_freq[]
    // to 0
    memset(char_freq, 0, sizeof(char_freq));

    int nv = 0, nc = 0;
    string vstr = "", cstr = "";
    int l = str.size();

    for (int i = 0; i < l; i++) {
        char ch = str.at(i);

        // count vowels
        if (isVowel(ch))
            nv++;

        // count consonants
        else
            nc++;

        // update frequency of 'ch' in
        // char_freq[]
        char_freq[ch - 97]++;
    }

    // no such string can be formed
    if (abs(nv - nc) >= 2)
        return "no such string";

    // form the vowel string 'vstr' and
    // consonant string 'cstr' which contains
    // characters in lexicographical order
    for (int i = 0; i < SIZE; i++) {
        char ch = (char)(i + 97);
        for (int j = 1; j <= char_freq[i]; j++) {
            if (isVowel(ch))
                vstr += ch;
            else
                cstr += ch;
        }
    }

    // remove first character of vowel string
    // then create alternate string with
    // cstr[0...nc-1] and vstr[1...nv-1]
    if (nv > nc)
        return (vstr.at(0) + createAltStr(cstr,
                                 vstr, 1, nv));

    // remove first character of consonant string
    // then create alternate string with
    // vstr[0...nv-1] and cstr[1...nc-1]
    if (nc > nv)
        return (cstr.at(0) + createAltStr(vstr, 
                                  cstr, 1, nc));

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
    string str = "aeroplane";
    cout << findAltStr(str);
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
alanepero
{% endhighlight %}
* Time Complexity: O(n), where n is the length of the string.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

