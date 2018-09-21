---
layout: post
title: Perfect reversible string
---
* You are given a string ‘str’, the task is to check that reverses of all possible substrings of ‘str’ are present in ‘str’ or not.
* Examples:
{% highlight cpp %}
Input : str = "ab"
Output: "NO"
// all substrings are "a","b","ab" but reverse
// of "ab" is not present in str

Input : str = "aba"
Output: "YES"

Input : str = "abab"
Output: "NO"
// All substrings are "a", "b", "a", "b", "ab", 
// "ba", "ab", "aba", "bab", "abab" but reverse of
// "abab" is not present in str
{% endhighlight %}
* A simple solution for this problem is to generate all possible substrings of ‘st’ and check if their reverse exist in the ‘str’ linearly.
* An efficient solution for this problem is based on the fact that reverse of all substrings of ‘str’ will exist in ‘str’ if and only if the entire string ‘str’ is palindrome. We can justify this fact by considering the whole string, a reverse of it will exist only if it is palindrome. And if a string is palindrome, then all reverse of all substrings exist.
* Below is implementation of above idea.
{% highlight cpp %}
// C++ program to check if a string is perfect
// reversible or nor
#include<bits/stdc++.h>
using namespace std;

// This function basically checks if string is 
// palindrome or not
bool isReversible(string str)
{
     int i = 0, j = str.length()-1;

     // iterate from left and right
     while (i < j)
     {
        if (str[i] != str[j])
            return false;
        i++;
        j--;
     }
     return true;
}

// Driver program to run the case
int main()
{
  string str="aba";
  if (isReversible(str))
      cout << "YES";
  else
      cout << "NO";
  return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to check
// if a string is perfect
// reversible or nor
import java.io.*;

class GFG
{

// This function basically 
// checks if string is 
// palindrome or not
static boolean isReversible(String str)
{
    int i = 0, j = str.length() - 1;

    // iterate from
    // left and right
    while (i < j)
    {
        if (str.charAt(i) != str.charAt(j))
            return false;
        i++;
        j--;
    }
    return true;
}

// Driver Code
public static void main (String[] args) 
{
    String str = "aba";
    if (isReversible(str))
        System.out.print("YES");
    else
        System.out.print( "NO");
}
}

// This code is contributed
// by anuj_67.
{% endhighlight %}
* Output:
{% highlight cpp %}
YES
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

