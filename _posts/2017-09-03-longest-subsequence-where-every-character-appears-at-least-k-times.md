---
layout: post
title: Longest subsequence where every character appears at-least k times
---
* Given a string and a number k, find the longest subsequence of a string where every character appears at-least k times.
* Examples:
{% highlight cpp %}
Input : str = "geeksforgeek"
         k = 2
Output : geeskgeeks
Every character in the output
subsequence appears at-least 2
times.

Input : str = "aabbaabacabb"
          k = 5
Output : aabbaabaabb
{% endhighlight %}
* Method 1 (Brute force) We generate all subsequences. For every subsequence count distinct characters in it and find the longest subsequence where every character appears at-least k times.
* Method 2 (Efficient way) 1. Find the frequency of the string and store it in an integer array of size 26 representing the alphabets. 2. After finding the frequency iterate the string character by character and if the frequency of that character is greater than or equal to the required number of repetitions then print that character then and there only.
{% highlight cpp %}
// C++ program to Find longest subsequence where
//  every character appears at-least k times
#include<bits/stdc++.h>
using namespace std;

const int MAX_CHARS = 26;

void longestSubseqWithK(string str, int k)    
{
    int n = str.size();                   

    // Count frequencies of all characters
    int freq[MAX_CHARS] = {0};                    
    for (int i = 0 ; i < n; i++)    
        freq[str[i] - 'a']++;              
    
    // Traverse given string again and print
    // all those characters whose frequency
    // is more than or equal to k.
    for (int i = 0 ; i < n ; i++)   
        if (freq[str[i] - 'a'] >= k)               
            cout << str[i];      
}

// Driver code
int main() {
    string str = "geeksforgeeks";
    int k = 2;
    longestSubseqWithK(str, k);       
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
geeksgeeks
{% endhighlight %}
* This code has a time complexity of O(n) where n is the size of the string.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

