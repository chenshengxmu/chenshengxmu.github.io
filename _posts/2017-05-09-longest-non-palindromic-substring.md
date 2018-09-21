---
layout: post
title: Longest Non-palindromic substring
---
* Given a string of size n. The task is to find the length of the largest substring which is not palindrome.
* Examples:
{% highlight cpp %}
Input : abba 
Output : 3
Here maximum length non-palindromic substring is
'abb' which is of length '3'. There could be other
non-palindromic sub-strings also of length three 
like 'bba' in this case.

Input : a
Output : 0
{% endhighlight %}
* A simple solution is to consider every substring and check if it is palindrome or not. Finally return length of the longest non-palindromic substring.
* An efficient solution is based on below approach.
{% highlight cpp %}
Check for the case where all characters of
the string are same or not.
    If yes, then answer will be '0'.
Else check whether the given string of size 
'n' is palindrome or not. 
    If yes, then answer will be 'n-1'
Else answer will be 'n'
{% endhighlight %}
{% highlight cpp %}
// C++ implementation to find maximum length
// substring which is not palindrome
#include <bits/stdc++.h>
using namespace std;

// utility function to check whether
// a string is palindrome or not
bool isPalindrome(string str)
{
    // Check for palindrome.
    int n = str.size();
    for (int i=0; i < n/2; i++)
        if (str.at(i) != str.at(n-i-1))
            return false;

    // palindrome string
    return true;
}

// function to find maximum length
// substring which is not palindrome
int maxLengthNonPalinSubstring(string str)
{
    int n = str.size();
    char ch = str.at(0);

    // to check whether all characters
    // of the string are same or not
    int i = 1;
    for (i=1; i<n; i++)
        if (str.at(i) != ch)
            break;

    // All characters are same, we can't
    // make a non-palindromic string.
    if (i == n)
        return 0;

    // If string is palindrome, we can make
    // it non-palindrome by removing any
    // corner character
    if (isPalindrome(str))
        return n-1;

    // Complete string is not a palindrome.
    return n;
}

// Driver program to test above
int main()
{
    string str = "abba";
    cout << "Maximum length = "
         << maxLengthNonPalinSubstring(str);
    return 0;
}
{% endhighlight %}
{% highlight java %}
//Java implementation to find maximum length
//substring which is not palindrome
public class GFG
{
    // utility function to check whether
    // a string is palindrome or not
    static Boolean isPalindrome(String str)
    {
        int n = str.length();

        // Check for palindrome.
        for (int i = 0; i < n/2; i++)
            if (str.charAt(i) != str.charAt(n-i-1))
                return false;

        // palindrome string
        return true;
    }

    // function to find maximum length
    // substring which is not palindrome
    static int maxLengthNonPalinSubstring(String str)
    {
        int n = str.length();
        char ch = str.charAt(0);

        // to check whether all characters
        // of the string are same or not
        int i = 1;
        for (i = 1; i < n; i++)
            if(str.charAt(i) != ch)
                break;

        // All characters are same, we can't
        // make a non-palindromic string.
        if (i == n)
            return 0;

        // If string is palindrome, we can make
        // it non-palindrome by removing any
        // corner character
        if (isPalindrome(str))
            return n-1;

        // Complete string is not a palindrome.
        return n;
    }

    // Driver Program to test above function
    public static void main(String args[])
    {
        String str = "abba";
        System.out.println("Maximum Length = "
             + maxLengthNonPalinSubstring(str));
    }
}
// This code is contributed by Sumit Ghosh
{% endhighlight %}
{% highlight cpp %}
Maximum length = 3
{% endhighlight %}
* Time Complexity: O(n)
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

