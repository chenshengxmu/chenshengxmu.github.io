---
layout: post
title: Longest common subsequence with permutations allowed
---
* Given two strings in lowercase, find the longest string whose permutations are subsequences of given two strings. The output longest string must be sorted.
* Examples:
{% highlight cpp %}
Input  :  str1 = "pink", str2 = "kite"
Output : "ik" 
The string "ik" is the longest sorted string 
whose one permutation "ik" is subsequence of
"pink" and another permutation "ki" is 
subsequence of "kite". 

Input  : str1 = "working", str2 = "women"
Output : "now"

Input  : str1 = "geeks" , str2 = "cake"
Output : "ek"

Input  : str1 = "aaaa" , str2 = "baba"
Output : "aa"
{% endhighlight %}
* The idea is to count characters in both strings.
{% highlight cpp %}
// C++ program to find LCS with permutations allowed
#include<bits/stdc++.h>
using namespace std;

// Function to calculate longest string
// str1     --> first string
// str2     --> second string
// count1[]  --> hash array to calculate frequency
//              of characters in str1
// count[2]  --> hash array to calculate frequency
//              of characters in str2
// result   --> resultant longest string whose
// permutations are sub-sequence of given two strings
void longestString(string str1, string str2)
{
    int count1[26] = {0}, count2[26]= {0};

    // calculate frequency  of characters
    for (int i=0; i<str1.length(); i++)
        count1[str1[i]-'a']++;
    for (int i=0; i<str2.length(); i++)
        count2[str2[i]-'a']++;

    // Now traverse hash array
    string result;
    for (int i=0; i<26; i++)

        // append character ('a'+i) in resultant
        // string 'result' by min(count1[i],count2i])
        // times
        for (int j=1; j<=min(count1[i],count2[i]); j++)
            result.push_back('a' + i);

    cout << result;
}

// Driver program to run the case
int main()
{
    string str1 = "geeks", str2 = "cake";
    longestString(str1, str2);
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
ek
{% endhighlight %}
* Time Complexity : O(m + n) where m and n are lengths of input strings. Auxiliary Space : O(1)
* If you have another approach to solve this problem then please share.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

