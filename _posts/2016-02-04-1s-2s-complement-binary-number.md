---
layout: post
title: 1's and 2's complement of a Binary Number
---
* Given a Binary Number as string, print its 1’s and 2’s complements.
* 1’s complement of a binary number is another binary number obtained by toggling all bits in it, i.e., transforming the 0 bit to 1 and the 1 bit to 0.
* Examples:
{% highlight cpp %}
1's complement of "0111" is "1000"
1's complement of "1100" is  "0011"
{% endhighlight %}
* 2’s complement of a binary number is 1 added to the 1’s complement of the binary number. Examples:
{% highlight cpp %}
2's complement of "0111" is  "1001"
2's complement of "1100" is  "0100"
{% endhighlight %}
* For one’s complement, we simply need to flip all bits.
* For 2’s complement, we first find one’s complement. We traverse the one’s complement starting from LSB (least significant bit), and look for 0. We flip all 1’s (change to 0) until we find a 0. Finally, we flip the found 0. For example, 2’s complement of “01000” is “11000” (Note that we first find one’s complement of 01000 as 10111).   If there are all 1’s (in one’s complement), we add an extra 1 in the string. For example, 2’s complement of “000” is “1000” (1’s complement of “000” is “111”).
* Below is C++ implementation.
{% highlight c %}
// C++ program to print 1's and 2's complement of
// a binary number
#include <bits/stdc++.h>
using namespace std;

// Returns '0' for '1' and '1' for '0'
char flip(char c) {return (c == '0')? '1': '0';}

// Print 1's and 2's complement of binary number
// represented by "bin"
void printOneAndTwosComplement(string bin)
{
    int n = bin.length();
    int i;

    string ones, twos;
    ones = twos = "";

    //  for ones complement flip every bit
    for (i = 0; i < n; i++)
        ones += flip(bin[i]);

    //  for two's complement go from right to left in
    //  ones complement and if we get 1 make, we make
    //  them 0 and keep going left when we get first
    //  0, make that 1 and go out of loop
    twos = ones;
    for (i = n - 1; i >= 0; i--)
    {
        if (ones[i] == '1')
            twos[i] = '0';
        else
        {
            twos[i] = '1';
            break;
        }
    }

    // If No break : all are 1  as in 111  or  11111;
    // in such case, add extra 1 at beginning
    if (i == -1)
        twos = '1' + twos;


    cout << "1's complement: " << ones << endl;
    cout << "2's complement: " << twos << endl;
}

// Driver program
int main()
{
    string bin = "1100";
    printOneAndTwosComplement(bin);
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
1's complement: 0011
2's complement: 0100
{% endhighlight %}
* Thanks to Utkarsh Trivedi for above solution.
* As a side note, signed numbers generally use 2’s complement representation. Positive values are stored as it is and negative values are stored in their 2’s complement form. One extra bit is required to indicate whether number is positive or negative. For example char is 8 bits in C. If 2’s complement representation is used for char, then 127 is stored as it is, i.e., 01111111 where first 0 indicates positive. But -127 is stored as 10000001.
* Related Post : Efficient method for 2’s complement of a binary string
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.
* References: http://qa.geeksforgeeks.org/6439/write-program-calculate-ones-and-twos-complement-of-number http://geeksquiz.com/whats-difference-between-1s-complement-and-2s-complement/

