---
layout: post
title: Lexicographically smallest string whose hamming distance from given string is exactly K
---
* Given a lowercase string A of length N and an integer K, find the lexicographically smallest string B of the same length as A such that hamming distance between A and B is exactly K.
* Examples:
{% highlight cpp %}
Input : A = "pqrs", k = 1.
Output : aqrs
We can differ by at most one
character. So we put 'a' in the
beginning to make the result 
lexicographically smallest.

Input : A = "pqrs", k = 2.
Output : aars
{% endhighlight %}
* We start from left to right, if character at current position of string A is ‘a’, then we assign current position of string B character ‘a’. This position will not contribute towards hamming distance. If character at this position in A is not equal to ‘a’, then also we will assign current position of string B character ‘a’, now this will contribute towards hamming distance and this can be done atmost k times because Hamming distance have to be equal to K, if this is already done K times, we will assign this position of B same character as A. If after previous step, hamming distance between A and B is K, we aare done otherwise we have to make more changes to B. Now we will start from right to left in B, and if character at current position is equal to corresponding character of A, change character of B to ‘b’, hence increasing the hamming distanceby one, we will do it until hamming distance becomes equal to K.
* Below is C++ implementation of this approach:
{% highlight cpp %}
// CPP program to find Lexicographically
// smallest string whose hamming distance
// from given string is exactly K
#include <bits/stdc++.h>
using namespace std;

// function to find Lexicographically
// smallest string with hamming distance k
void findString(string str, int n, int k)
{
    // If k is 0, output input string
    if (k == 0) {
        cout << str << endl;
        return;
    }

    // Copying input string into output
    // string
    string str2 = str;
    int p = 0;

    // Traverse all the character of the
    // string
    for (int i = 0; i < n; i++) {
    
        // If current charcter is not 'a'
        if (str2[i] != 'a') {
    
            // copy character 'a' to 
            // output string
            str2[i] = 'a';
            p++;

            // If hamming distance became k,
            // break;
            if (p == k)
                break;
        }
    }

    // If k is less than p
    if (p < k) {
        
        // Traversing string in reverse 
        // order
        for (int i = n - 1; i >= 0; i--)
            if (str[i] == 'a') {
                str2[i] = 'b';
                p++;

                if (p == k)
                    break;
            }
    }

    cout << str2 << endl;
}

// Driven Program
int main()
{
    string str = "pqrs";
    int n = str.length();
    int k = 2;

    findString(str, n, k);

    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
aars
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

