---
layout: post
title: Binary representation of next greater number with same number of 1's and 0's
---
* Given a binary input that represents binary representation of positive number n, find binary representation of smallest number greater than n with same number of 1’s and 0’s as in binary representation of n. If no such number can be formed, print “no greater number”.
* The binary input may be and may not fit even in unsigned long long int.
* Examples:
{% highlight cpp %}
Input : 10010
Output : 10100
Here n = (18)10 = (10010)2
next greater = (20)10 = (10100)2
Binary representation of 20 contains same number of
1's and 0's as in 18.

Input : 111000011100111110
Output :  111000011101001111
{% endhighlight %}
* This problem simply boils down to finding next permutation of a given string. We can find the next_permutation() of the input binary number.
* Below is an algorithm to find next permutation in binary string.
* Below is C++ implementation of above steps.
{% highlight cpp %}
// C++ program to find next permutation in a
// binary string.
#include <bits/stdc++.h>
using namespace std;

// Function to find the next greater number
// with same number of 1's and 0's
string nextGreaterWithSameDigits(string bnum)
{
    int l = bnum.size();
    int i;
    for (int i=l-2; i>=1; i--)
    {
        // locate first 'i' from end such that
        // bnum[i]=='0' and bnum[i+1]=='1'
        // swap these value and break;
        if (bnum.at(i) == '0' &&
           bnum.at(i+1) == '1')
        {
            char ch = bnum.at(i);
            bnum.at(i) = bnum.at(i+1);
            bnum.at(i+1) = ch;
            break;
        }
    }

    // if no swapping performed
    if (i == 0)
        "no greater number";

    // Since we want the smallest next value,
    // shift all 1's at the end in the binary
    // substring starting from index 'i+2'
    int j = i+2, k = l-1;
    while (j < k)
    {
        if (bnum.at(j) == '1' && bnum.at(k) == '0')
        {
            char ch = bnum.at(j);
            bnum.at(j) = bnum.at(k);
            bnum.at(k) = ch;
            j++;
            k--;
        }

        // special case while swapping if '0'
        // occurs then break
        else if (bnum.at(i) == '0')
            break;

        else
            j++;

    }

    // required next greater number
    return bnum;
}

// Driver program to test above
int main()
{
    string bnum = "10010";
    cout << "Binary representation of next greater number = "
         << nextGreaterWithSameDigits(bnum);
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
Binary representation of next greater number = 10100
{% endhighlight %}
* Time Complexity : O(n) where n is number of bits in input.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

