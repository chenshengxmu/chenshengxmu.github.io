---
layout: post
title: Lexicographically n-th permutation of a string
---
* Given a string of length m containing lowercase alphabets only. You have to find the n-th permutation of string lexicographically.
* Examples:
{% highlight cpp %}
Input : str[] = "abc", n = 3
Output : Result = "bac"
Explanation : All possible permutation in
sorted order: abc, acb, bac, bca, cab, cba

Input : str[] = "aba", n = 2
Output : Result = "aba"
Explanation : All possible permutation
in sorted order: aab, aba, baa
{% endhighlight %}
* Prerequisite : Permutations of a given string using STL
* Idea behind printing n-th permutation is quite simple we should use STL (explained in above link) for finding next permutation and do it till the nth permutation. After n-th iteration, we should break from the loop and then print the string which is our nth permutation.
{% highlight cpp %}
long int i = 1;
    do
    {
        // check for nth iteration
        if (i == n)
            break;
       i++; // keep incrementing the iteration
    } while (next_permutation(str.begin(), str.end()));

    // print string after nth iteration
   print str;
{% endhighlight %}
{% highlight cpp %}
// C++ program to print nth permutation with
// using next_permute()
#include <bits/stdc++.h>
using namespace std;

// Function to print nth permutation
// using next_permute()
void nPermute(string str, long int n)
{
    // Sort the string in lexicographically
    // ascending order
    sort(str.begin(), str.end());

    // Keep iterating until
    // we reach nth position
    long int i = 1;
    do {
        // check for nth iteration
        if (i == n)
            break;

        i++;
    } while (next_permutation(str.begin(), str.end()));

    // print string after nth iteration
    cout << str;
}

// Driver code
int main()
{
    string str = "GEEKSFORGEEKS";
    long int n = 100;
    nPermute(str, n);
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
EEEEFGGRKSOSK
{% endhighlight %}
* Find n-th lexicographically permutation of a string | Set 2
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

