---
layout: post
title: Find largest word in dictionary by deleting some characters of given string
---
* Giving a dictionary and a string ‘str’, find the longest string in dictionary which can be formed by deleting some characters of the given ‘str’.
* Examples:
{% highlight cpp %}
Input : dict = {"ale", "apple", "monkey", "plea"}   
        str = "abpcplea"  
Output : apple 

Input  : dict = {"pintu", "geeksfor", "geeksgeeks", 
                                        " forgeek"} 
         str = "geeksforgeeks"
Output : geeksgeeks
{% endhighlight %}
* Asked In : Google Interview
* This problem reduces to finding if a string is subsequence of another string or not. We traverse all dictionary words and for every word, we check if it is subsequence of given string and is largest of all such words. We finally return the longest word with given string as subsequence.
* Below c++ implementation of above idea
{% highlight cpp %}
// C++ program to find largest word in Dictionary
// by deleting some characters of given string
#include <bits/stdc++.h>
using namespace std;

// Returns true if str1[] is a subsequence of str2[].
// m is length of str1 and n is length of str2
bool isSubSequence(string str1, string str2)
{
    int m = str1.length(), n = str2.length();

    int j = 0; // For index of str1 (or subsequence

    // Traverse str2 and str1, and compare current
    // character of str2 with first unmatched char
    // of str1, if matched then move ahead in str1
    for (int i=0; i<n&&j<m; i++)
        if (str1[j] == str2[i])
            j++;

    // If all characters of str1 were found in str2
    return (j==m);
}

// Returns the longest string in dictionary which is a
// subsequence of str.
string findLongestString(vector <string > dict, string str)
{
    string result = "";
    int length = 0;

    // Traverse through all words of dictionary
    for (string word : dict)
    {
        // If current word is subsequence of str and is largest
        // such word so far.
        if (length < word.length() && isSubSequence(word, str))
        {
            result = word;
            length = word.length();
        }
    }

    // Return longest string
    return result;
}

// Driver program to test above function
int main()
{
    vector <string > dict = {"ale", "apple", "monkey", "plea"};
    string str = "abpcplea" ;
    cout << findLongestString(dict, str) << endl;
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
apple
{% endhighlight %}
* Time Complexity : O(N*K*n) Here N is the length of dictionary and n is the length of given string ‘str’ and K – maximum length of words in the dictionary.
* Auxiliary Space : O(1)
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

