---
layout: post
title: Minimum insertions to form a palindrome with permutations allowed
---
* Given a string of lowercase letters. Find minimum characters to be inserted in string so that it can become palindrome. We can change positions of characters in string.
* Examples:
{% highlight cpp %}
Input : geeksforgeeks
Output : 2
geeksforgeeks can be changed as:
geeksroforskeeg
geeksorfroskeeg
and many more

Input : aabbc
Output : 0
aabbc can be changed as:
abcba
bacab
{% endhighlight %}
* A palindromic string can have one odd character only when length of string is odd otherwise all characters occur even number of times. So, we have to find characters which occur odd times in a string.
* The idea is to count occurrence of each character in a string. As palindromic string can have one character which occur odd times so number of insertion will be one less then count of characters which occur odd times. And if string is already palindrome, we do not need to add any character so result will be 0.
{% highlight cpp %}
// CPP program to find minimum number
// of insertions to make a string
// palindrome
#include <bits/stdc++.h>
using namespace std;

// Function will return number of
// characters to be added
int minInsertion(string str)
{
    // To store string length
    int n = str.length();

    // To store number of characters
    // occurring odd number of times
    int res = 0;

    // To store count of each
    // character
    int count[26] = { 0 };

    // To store occurrence of each
    // character
    for (int i = 0; i < n; i++)
        count[str[i] - 'a']++;

    // To count characters with odd
    // occurrence
    for (int i = 0; i < 26; i++)
        if (count[i] % 2 == 1)
            res++;

    // As one character can be odd return
    // res - 1 but if string is already
    // palindrome return 0
    return (res == 0) ? 0 : res - 1;
}

// Driver program
int main()
{
    string str = "geeksforgeeks";
    cout << minInsertion(str);

    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to find minimum number
// of insertions to make a string
// palindrome
public class Palindrome {

    // Function will return number of
    // characters to be added
    static int minInsertion(String str)
    {
        // To store string length
        int n = str.length();

        // To store number of characters
        // occurring odd number of times
        int res = 0;

        // To store count of each
        // character
        int[] count = new int[26];

        // To store occurrence of each
        // character
        for (int i = 0; i < n; i++)
            count[str.charAt(i) - 'a']++;

        // To count characters with odd
        // occurrence
        for (int i = 0; i < 26; i++) {
            if (count[i] % 2 == 1)
                res++;
        }

        // As one character can be odd return
        // res - 1 but if string is already
        // palindrome return 0
        return (res == 0) ? 0 : res - 1;
    }

    // Driver program
    public static void main(String[] args)
    {
        String str = "geeksforgeeks";
        System.out.println(minInsertion(str));
    }
}
{% endhighlight %}
* Output:
{% highlight cpp %}
2
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

