---
layout: post
title: Generate n-bit Gray Codes
---
* Given a number n, generate bit patterns from 0 to 2^n-1 such that successive patterns differ by one bit.
* Examples:
{% highlight cpp %}
Following is 2-bit sequence (n = 2)
  00 01 11 10
Following is 3-bit sequence (n = 3)
  000 001 011 010 110 111 101 100
And Following is 4-bit sequence (n = 4)
  0000 0001 0011 0010 0110 0111 0101 0100 1100 1101 1111 
  1110 1010 1011 1001 1000
{% endhighlight %}
* The above sequences are Gray Codes of different widths. Following is an interesting pattern in Gray Codes.
* n-bit Gray Codes can be generated from list of (n-1)-bit Gray codes using following steps. 1) Let the list of (n-1)-bit Gray codes be L1. Create another list L2 which is reverse of L1. 2) Modify the list L1 by prefixing a ‘0’ in all codes of L1. 3) Modify the list L2 by prefixing a ‘1’ in all codes of L2. 4) Concatenate L1 and L2. The concatenated list is required list of n-bit Gray codes.
* For example, following are steps for generating the 3-bit Gray code list from the list of 2-bit Gray code list. L1 = {00, 01, 11, 10} (List of 2-bit Gray Codes) L2 = {10, 11, 01, 00} (Reverse of L1) Prefix all entries of L1 with ‘0’, L1 becomes {000, 001, 011, 010} Prefix all entries of L2 with ‘1’, L2 becomes {110, 111, 101, 100} Concatenate L1 and L2, we get {000, 001, 011, 010, 110, 111, 101, 100}
* To generate n-bit Gray codes, we start from list of 1 bit Gray codes. The list of 1 bit Gray code is {0, 1}. We repeat above steps to generate 2 bit Gray codes from 1 bit Gray codes, then 3-bit Gray codes from 2-bit Gray codes till the number of bits becomes equal to n. Following is C++ implementation of this approach.
{% highlight cpp %}
// C++ program to generate n-bit Gray codes
#include <iostream>
#include <string>
#include <vector>
using namespace std;

// This function generates all n bit Gray codes and prints the
// generated codes
void generateGrayarr(int n)
{
    // base case
    if (n <= 0)
        return;

    // 'arr' will store all generated codes
    vector<string> arr;

    // start with one-bit pattern
    arr.push_back("0");
    arr.push_back("1");

    // Every iteration of this loop generates 2*i codes from previously
    // generated i codes.
    int i, j;
    for (i = 2; i < (1<<n); i = i<<1)
    {
        // Enter the prviously generated codes again in arr[] in reverse
        // order. Nor arr[] has double number of codes.
        for (j = i-1 ; j >= 0 ; j--)
            arr.push_back(arr[j]);

        // append 0 to the first half
        for (j = 0 ; j < i ; j++)
            arr[j] = "0" + arr[j];

        // append 1 to the second half
        for (j = i ; j < 2*i ; j++)
            arr[j] = "1" + arr[j];
    }

    // print contents of arr[]
    for (i = 0 ; i < arr.size() ; i++ )
        cout << arr[i] << endl;
}

// Driver program to test above function
int main()
{
    generateGrayarr(4);
    return 0;
}
{% endhighlight %}
* Output
{% highlight cpp %}
000
001
011
010
110
111
101
100
{% endhighlight %}
* This article is compiled by Ravi Chandra Enaganti. Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

