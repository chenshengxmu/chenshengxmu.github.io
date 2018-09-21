---
layout: post
title: Lexicographical concatenation of all substrings of a string
---
* Given a string, find concatenation of all substrings in lexicographic order.
* Examples:
* Input : s = “abc” Output : aababcbbcc The substrings of s in lexicographic order are “a”, “b”, “c”, “ab”, “abc”, “bc”. Concatenation of substrings is “a”+”ab”+”abc”+”b”+”bc”+”c” = “aababcbbcc”.
* Input : s = “cba” Output : abbaccbcba
* 1. Find all the substrings of string and store it in a string array. The size of array would be n*(n+1)/2 where n is length of input string. 2. Sort the string array to make them all in lexicographical order. 3. Concatenate the strings of string array in another empty string.
{% highlight cpp %}
// CPP Program to create concatenation of all
// substrings in lexicographic order.
#include <bits/stdc++.h>
using namespace std;

string lexicographicSubConcat(string s)
{
    int n = s.length();

    // Creating an array to store substrings
    int sub_count = n*(n+1)/2;
    string arr[sub_count];     

    // finding all substrings of string
    int index = 0;
    for (int i = 0; i < n; i++) 
        for (int len = 1; len <= n - i; len++) 
            arr[index++] = s.substr(i, len);
    
    // Sort all substrings in lexicographic
    // order
    sort(arr, arr + sub_count); 

    // Concatenating all substrings
    string res = "";
    for (int i = 0; i < sub_count; i++) 
        res += arr[i];     
        
    return res;    
}

int main()
{
    string s = "cba"; 
    cout << lexicographicSubConcat(s);
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
aababcbbcc
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

