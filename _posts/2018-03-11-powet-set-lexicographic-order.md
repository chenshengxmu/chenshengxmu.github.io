---
layout: post
title: Power Set in Lexicographic order
---
* This article is about generating Power set in lexicographical order.
* Examples :
{% highlight cpp %}
Input : abc
Output : a ab abc ac b bc c
{% endhighlight %}
* The idea is to sort array first. After sorting, one by one fix characters and recursively generates all subsets starting from them. After every recursive call, we remove last character so that next permutation can be generated.
{% highlight cpp %}
// CPP program to generate power set in
// lexicographic order.
#include <bits/stdc++.h>
using namespace std;

// str : Stores input string
// n : Length of str.
// curr : Stores current permutation
// index : Index in current permutation, curr
void permuteRec(string str, int n,
           int index = -1, string curr = "")
{
    // base case
    if (index == n) 
        return;

    cout << curr << "\n";
    for (int i = index + 1; i < n; i++) {

        curr += str[i];
        permuteRec(str, n, i, curr);
 
        // backtracking
        curr = curr.erase(curr.size() - 1); 
    }
    return;
}

// Generates power set in lexicographic
// order.
void powerSet(string str)
{
    sort(str.begin(), str.end());
    permuteRec(str, str.size());
}

// Driver code
int main()
{
    string str = "cab";
    powerSet(str);
    return 0;
}
{% endhighlight %}
{% highlight cpp %}
a
ab
abc
ac
b
bc
c
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

