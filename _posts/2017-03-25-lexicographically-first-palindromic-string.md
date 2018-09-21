---
layout: post
title: Lexicographically first palindromic string
---
* Rearrange the characters of the given string to form a lexicographically first palindromic string. If no such string exists display message “no palindromic string”.
* Examples:
{% highlight cpp %}
Input : malayalam
Output : aalmymlaa

Input : apple
Output : no palindromic string
{% endhighlight %}
* Simple Approach: 1. Sort the string characters in alphabetical(ascending) order. 2. One be one find lexicographically next permutation of the given string. 3. The first permutation which is palindrome is the answer.
* Efficient Approach: Properties for palindromic string: 1. If length of string is even, then the frequency of each character in the string must be even. 2. If the length is odd then there should be one character whose frequency is odd and all other chars must have even frequency and at-least one occurrence of the odd character must be present in the middle of the string.
* Algorithm 1. Store frequency of each character in the given string 2. Check whether a palindromic string can be formed or not using the properties of palindromic string mentioned above. 3. If palindromic string cannot be formed, return “No Palindromic String”. 4. Else we create three strings and then return front_str + odd_str + rear_str.
* Below is implementation of above steps.
{% highlight cpp %}
// C++ program to find first palindromic permutation
// of given string
#include <bits/stdc++.h>
using namespace std;

const char MAX_CHAR = 26;

// Function to count frequency of each char in the
// string. freq[0] for 'a',...., freq[25] for 'z'
void countFreq(string str, int freq[], int len)
{
    for (int i=0; i<len; i++)
        freq[str.at(i) - 'a']++;
}

// Cases to check whether a palindr0mic
// string can be formed or not
bool canMakePalindrome(int freq[], int len)
{
    // count_odd to count no of
    // chars with odd frequency
    int count_odd = 0;
    for (int i=0; i<MAX_CHAR; i++)
        if (freq[i]%2 != 0)
            count_odd++;

    // For even length string
    // no odd freq character
    if (len%2 == 0)
    {
        if (count_odd > 0)
            return false;
        else
            return true;
    }

    // For odd length string
    // one odd freq character
    if (count_odd != 1)
        return false;

    return true;
}

// Function to find odd freq char and
// reducing its freq by 1returns "" if odd freq
// char is not present
string findOddAndRemoveItsFreq(int freq[])
{
    string odd_str = "";
    for (int i=0; i<MAX_CHAR; i++)
    {
        if (freq[i]%2 != 0)
        {
            freq[i]--;
            odd_str = odd_str + (char)(i+'a');
            return odd_str;
        }
    }
    return odd_str;
}

// To find lexicographically first palindromic
// string.
string findPalindromicString(string str)
{
    int len = str.length();

    int freq[MAX_CHAR] = {0};
    countFreq(str, freq, len);

    if (!canMakePalindrome(freq, len))
        return "No Palindromic String";

    // Assigning odd freq character if present
    // else empty string.
    string odd_str = findOddAndRemoveItsFreq(freq);

    string front_str = "", rear_str = " ";

    // Traverse characters in increasing order
    for (int i=0; i<MAX_CHAR; i++)
    {
        string temp = "";
        if (freq[i] != 0)
        {
            char ch = (char)(i + 'a');

            // Divide all occurrences into two
            // halves. Note that odd character
            // is removed by findOddAndRemoveItsFreq()
            for (int j=1; j<=freq[i]/2; j++)
                temp = temp + ch;

            // creating front string
            front_str = front_str + temp;

            // creating rear string
            rear_str = temp + rear_str;
        }
    }

    // Final palindromic string which is
    // lexicographically first
    return (front_str + odd_str + rear_str);
}

// Driver program
int main()
{
    string str = "malayalam";
    cout << findPalindromicString(str);
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
aalmymlaa
{% endhighlight %}
* Time Complexity : O(n) where n is length of input string. Assuming that size of string alphabet is constant.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

