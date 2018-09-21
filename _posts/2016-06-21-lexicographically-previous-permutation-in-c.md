---
layout: post
title: How to find Lexicographically previous permutation?
---
* Given a word, find lexicographically smaller permutation of it. For example, lexicographically smaller permutation of “4321” is “4312” and next smaller permutation of “4312” is “4231”. If the string is sorted in ascending order, the next lexicographically smaller permutation doesn’t exist.
* We have discussed next_permutation() that modifies a string so that it stores lexicographically smaller permutation. STL also provides std::prev_permutation. It returns ‘true’ if the function could rearrange the object as a lexicographically smaller permutation. Otherwise, it returns ‘false’.
{% highlight cpp %}
// C++ program to demonstrate working of
// prev_permutation()
#include <bits/stdc++.h>
using namespace std;

// Driver code
int main()
{
    string str = "4321";
    if ( prev_permutation(str.begin(), str.end()) )
        cout << "Previous permutation is "<< str ;
    else
        cout << "Previous permutation doesn't exist" ;
    return 0;
}
{% endhighlight %}
* Output :
{% highlight cpp %}
Previous permutation is 4312
{% endhighlight %}
* How to write our own prev_permutation()? Below are steps to find the previous permutation? 1. Find largest index i such that str[i – 1] > str[i]. 2. Find largest index j such that j >= i and str[j] < str[i – 1]. 3. Swap str[j] and str[i – 1]. 4. Reverse the sub-array starting at str[i].
* Below is C++ implementation of above steps.
{% highlight cpp %}
// C++ program to print all permutations with
// duplicates allowed using prev_permutation()
#include <bits/stdc++.h>
using namespace std;

// Function to compute the previous permutation
bool prevPermutation(string &str)
{
    // Find index of the last element of the string
    int n = str.length() - 1;

    // Find largest index i such that str[i ? 1] >
    // str[i]
    int i = n;
    while (i > 0 && str[i - 1] <= str[i])
        i--;

    // if string is sorted in ascending order
    // we're at the last permutation
    if (i <= 0)
        return false;

    // Note - str[i..n] is sorted in ascending order

    // Find rightmost element's index that is less
    // than str[i - 1]
    int j = i - 1;
    while (j + 1 <= n && str[j + 1] <= str[i - 1])
        j++;

    // Swap character at i-1 with j
    swap(str[i - 1], str[j]);

    // Reverse the substring [i..n]
    reverse(str.begin() + i, str.end());

    return true;
}

// Driver code
int main()
{
    string str = "4321";
    if ( prevPermutation(str) )
        cout << "Previous permutation is "<< str ;
    else
        cout << "Previous permutation doesn't exist" ;
    return 0;
}
{% endhighlight %}
* Output :
{% highlight cpp %}
Previous permutation is 4312
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above

