---
layout: post
title: Count number of strings (made of R, G and B) using given combination
---
* We need to make a string of size n. Each character of the string is either ‘R’, ‘B’ or ‘G’. In the final string there needs to be at least r number of ‘R’, at least b number of ‘B’ and at least g number of ‘G’ (such that r + g + b <= n). We need to find number of such strings possible.
* Examples:
{% highlight cpp %}
Input : n = 4, r = 1, 
        b = 1, g = 1.
Output: 36 
No. of 'R' >= 1, 
No. of ‘G’ >= 1, 
No. of ‘B’ >= 1 and 
(No. of ‘R’) + (No. of ‘B’) + (No. of ‘G’) = n
then following cases are possible:
1. RBGR and its 12 permutation
2. RBGB and its 12 permutation
3. RBGG and its 12 permutation
Hence answer is 36.
{% endhighlight %}
* Asked in : Directi
{% highlight cpp %}
// C++ program to count number of possible strings
// with n characters.
#include<bits/stdc++.h>
using namespace std;

// Function to calculate number of strings
int possibleStrings( int n, int r, int b, int g)
{
    // Store factorial of numbers up to n
    // for further computation
    int fact[n+1];
    fact[0] = 1;
    for (int i = 1; i <= n; i++)
        fact[i] = fact[i-1] * i;

    // Find the remaining values to be added
    int left = n - (r+g+b);
    int sum = 0;

    // Make all possible combinations
    // of R, B and G for the remaining value
    for (int i = 0; i <= left; i++)
    {
        for (int j = 0; j<= left-i; j++)
        {
            int k = left - (i+j);

            // Compute permutation of each combination
            // one by one and add them.
            sum = sum + fact[n] /
                       (fact[i+r]*fact[j+b]*fact[k+g]);
        }
    }

    // Return total no. of strings/permutation
    return sum;
}

// Drivers code
int main()
{
    int n = 4, r = 2;
    int b = 0, g = 1;
    cout << possibleStrings(n, r, b, g);
    return 0;
}
{% endhighlight %}
{% highlight cpp %}
22
{% endhighlight %}
* To handle n with large numbers, we can use the concept of Large Factorial.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

