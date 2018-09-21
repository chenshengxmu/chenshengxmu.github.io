---
layout: post
title: Remove consecutive vowels from string
---
* Given a string s of lowercase letters, we need to remove consecutive vowels from the string
* Note : Sentence should not contain two consecutive vowels ( a, e, i, o, u).
* Examples :
{% highlight cpp %}
Input: geeks for geeks
Output: geks for geks

Input : your article is in queue 
Output : yor article is in qu
{% endhighlight %}
* Approach: Iterate string using a loop and check for the repetitiveness of vowels in a given sentence and in case if consecutive vowels are found then delete the vowel till coming next consonant and printing the updated string.
{% highlight cpp %}
// C++ program for printing sentence
// without repetitive vowels
#include <bits/stdc++.h>
using namespace std;

// function which returns True or False
// for occurrence of a vowel
bool is_vow(char c)
{
    // this compares vowel with 
    // character 'c'
    return (c == 'a') || (c == 'e') || 
           (c == 'i') || (c == 'o') || 
           (c == 'u');
}

// function to print resultant string
void removeVowels(string str)
{
    // print 1st character
    printf("%c", str[0]);

    // loop to check for each character
    for (int i = 1; str[i]; i++)

        // comparison of consecutive characters
        if ((!is_vow(str[i - 1])) || 
            (!is_vow(str[i])))
            printf("%c", str[i]);
}

// Driver Code
int main()
{
    char str[] = " geeks for geeks";
    removeVowels(str);
}

// This code is contributed by Abhinav96
{% endhighlight %}
{% highlight java %}
// Java program for printing sentence
// without repetitive vowels
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG
{ 
    // function which returns
    // True or False for
    // occurrence of a vowel
    static boolean is_vow(char c)
    {
        // this compares vowel 
        // with character 'c'
        return (c == 'a') || (c == 'e') || 
               (c == 'i') || (c == 'o') || 
               (c == 'u');
    }
    
    // function to print
    // resultant string
    static void removeVowels(String str)
    {
        // print 1st character
        System.out.print(str.charAt(0));
    
        // loop to check for 
        // each character
        for (int i = 1; 
                 i < str.length(); i++)
    
            // comparison of 
            // consecutive characters
            if ((!is_vow(str.charAt(i - 1))) || 
                (!is_vow(str.charAt(i))))
                System.out.print(str.charAt(i));
    }
    
    // Driver Code
    public static void main(String[] args)
    {
        String str = "geeks for geeks";
        removeVowels(str);
    }
}
{% endhighlight %}
{% highlight cpp %}
geks for geks
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

