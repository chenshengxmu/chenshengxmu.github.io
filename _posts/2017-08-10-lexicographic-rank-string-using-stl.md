---
layout: post
title: Lexicographic rank of a string using STL
---
* You are given a string, find its rank among all its permutations sorted exicographically.
* Examples:
{% highlight cpp %}
Input : str[] = "acb"
Output : Rank = 2

Input : str[] = "string"
Output : Rank = 598

Input : str[] = "cba"
Output : Rank = 6
{% endhighlight %}
* We have already discussed solutions to find Lexicographic rank of string
* In this post, we use the STL function “next_permutation ()” to generate all possible permutations of the given string and, as it gives us permutations in lexicographic order, we will put an iterator to find the rank of each string. While iterating when Our permuted string becomes identical to the original input string, we break from the loop and the iterator value for the last iteration is our required result.
{% highlight cpp %}
// C++ program to print rank of 
// string using next_permute()
#include <bits/stdc++.h>
using namespace std;
 
// Function to print rank of string
// using next_permute()
int findRank(string str)
{
    // store original string
    string orgStr = str;

    // Sort the string in lexicographically
    // ascending order
    sort(str.begin(), str.end());
 
    // Keep iterating until
    // we reach equality condition
    long int i = 1;
    do {
        // check for nth iteration
        if (str == orgStr)
            break;
 
        i++;
    } while (next_permutation(str.begin(), str.end()));
 
    // return iterator value
    return i;
}
 
// Driver code
int main()
{
    string str = "GEEKS";
    cout << findRank(str);
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
25
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

