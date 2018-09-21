---
layout: post
title: Repeated subsequence of length 2 or more
---
* Given a string, find if there is any subsequence of length 2 or more that repeats itself such that the two subsequence don’t have same character at same position, i.e., any 0’th or 1st character in the two subsequences shouldn’t have the same index in the original string.
* Example.
{% highlight cpp %}
Input: ABCABD
Output: Repeated Subsequence Exists (A B is repeated) 

Input: ABBB
Output: Repeated Subsequence Exists (B B is repeated)

Input: AAB
Output: Repeated Subsequence Doesn't Exist (Note that 
A B cannot be considered as repeating because B is at
same position in two subsequences).

Input: AABBC
Output: Repeated Subsequence Exists (A B is repeated)

Input: ABCDACB
Output: Repeated Subsequence Exists (A B is repeated)

Input: ABCD
Output: Repeated Subsequence Doesn't Exist
{% endhighlight %}
* The problem is classic variation of longest common subsequence problem. We have discussed Dynamic programming solution here. Dynamic programming solution takes O(n2) time and space.
* In this post, O(n) time and space approach is discussed.
* The idea is to remove all the non-repeated characters from the string and check if the resultant string is palindrome or not. If the remaining string is palindrome then it is not repeated, else there is a repetition. One special case we need to handle for inputs like “AAA”, which are palindrome but their repeated subsequence exists. Repeated subsequence exists for a palindrome string if it is of odd length and its middle letter is same as left(or right) character.
* Below is C++ implementation of above idea.
{% highlight c %}
// C++ program to check if any repeated
// subsequence exists in the string
#include <bits/stdc++.h>
#define MAX_CHAR 256
using namespace std;

// A function to check if a string str is palindrome
bool isPalindrome(char str[], int l, int h)
{
    // l and h are leftmost and rightmost corners of str
    // Keep comparing characters while they are same
    while (h > l)
        if (str[l++] != str[h--])
            return false;

    return true;
}

// The main function that checks if repeated
// subsequence exists in the string
int check(char str[])
{
    // Find length of input string
    int n = strlen(str);

    // Create an array to store all characters and their
    // frequencies in str[]
    int freq[MAX_CHAR] = { 0 };

    // Traverse the input string and store frequencies
    // of all characters in freq[] array.
    for (int i = 0; i < n; i++)
    {
        freq[str[i]]++;

        // If the character count is more than 2
        // we found a repetition
        if (freq[str[i]] > 2)
            return true;
    }

    // In-place remove non-repeating characters
    // from the string
    int k = 0;
    for (int i = 0; i < n; i++)
        if (freq[str[i]] > 1)
            str[k++] = str[i];
    str[k] = '&#092;&#048;';

    // check if the resultant string is palindrome
    if (isPalindrome(str, 0, k-1))
    {
        // special case - if length is odd
        // return true if the middle characer is
        // same as previous one
        if (k & 1)
            return str[k/2] == str[k/2 - 1];

        // return false if string is a palindrome
        return false;
    }

    // return true if string is not a palindrome
    return true;
}

// Driver code
int main()
{
    char str[] = "ABCABD";

    if (check(str))
        cout << "Repeated Subsequence Exists";
    else
        cout << "Repeated Subsequence Doesn't Exists";

    return 0;
}
{% endhighlight %}
* Output :
{% highlight cpp %}
Repeated Subsequence Exists
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above

