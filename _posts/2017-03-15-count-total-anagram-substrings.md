---
layout: post
title: Count of total anagram substrings
---
* Given a string of lower alphabet characters, count total substring of this string which are anagram to each other.
* Examples:
{% highlight cpp %}
Input  : str = “xyyx”
Output : 4
Total substrings of this string which
are anagram to each other are 4 which 
can be enumerated as,
{“x”, “x”}, {"y", "y"}, {“xy”, “yx”}, 
{“xyy”, “yyx”}

Input  : str = "geeg"
Output : 4
{% endhighlight %}
* The idea is to create a map. We use character frequencies as keys and corresponding counts as values. We can solve this problem by iterating over all substrings and counting frequencies of characters in every substring. We can update frequencies of characters while looping over substrings i.e. there won’t be an extra loop for counting frequency of characters. In below code, a map of key ‘vector type’ and value ‘int type’ is taken for storing occurrence of ‘frequency array of length 26’ of substring characters. Once occurrence ‘o’ of each frequency array is stored, total anagrams will be the sum of o*(o-1)/2 for all different frequency arrays because if a particular substring has ‘o’ anagrams in string total o*(o-1)/2 anagram pairs can be formed.
* Below is C++ implementation of above idea.
{% highlight cpp %}
// C++ program to count total anagram
// substring of a string
#include <bits/stdc++.h>
using namespace std;

// Total number of lowercase characters
#define MAX_CHAR 26

// Utility method to return integer index
// of character 'c'
int toNum(char c)
{
    return (c - 'a');
}

// Returns count of total number of anagram
// substrings of string str
int countOfAnagramSubstring(string str)
{
    int N = str.length();

    // To store counts of substrings with given
    // set of frequencies.
    map<vector<int>, int> mp;

    // loop for starting index of substring
    for (int i=0; i<N; i++)
    {
        vector<int> freq(MAX_CHAR, 0);

        // loop for length of substring
        for (int j=i; j<N; j++)
        {
            // update freq array of current
            // substring
            freq[toNum(str[j])]++;

            // increase count corresponding
            // to this freq array
            mp[freq]++;
        }
    }

    // loop over all different freq array and
    // aggregate substring count
    int result = 0;
    for (auto it=mp.begin(); it!=mp.end(); it++)
    {
        int freq = it->second;
        result += ((freq) * (freq-1))/2;
    }
    return result;
}

//  Driver code to test above methods
int main()
{
    string str = "xyyx";
    cout << countOfAnagramSubstring(str) << endl;
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
4
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

