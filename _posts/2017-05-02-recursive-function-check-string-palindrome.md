---
layout: post
title: Recursive function to check if a string is palindrome
---
* Given a string, write a recursive function that check if the given string is palindrome, else not palindrome.
* Examples :
{% highlight cpp %}
Input : malayalam
Output : Yes
Reverse of malayalam is also
malayalam.

Input : max
Output : No
Reverse of max is not max.
{% endhighlight %}
* We have discussed an iterative function here.
* The idea of recursive function is simple :
{% highlight cpp %}
1) If there is only one character in string
   return true.
2) Else compare first and last characters
   and recur for remaining substring.
{% endhighlight %}
* Below is the implementation of above idea :
{% highlight c %}
// A recursive C program to 
// check whether a given number
// is palindrome or not
#include <stdio.h>
#include <string.h>
#include <stdbool.h>

// A recursive function that
// check a str[s..e] is
// palindrome or not.
bool isPalRec(char str[], 
              int s, int e)
{
    // If there is only one character
    if (s == e)
    return true;

    // If first and last
    // characters do not match
    if (str[s] != str[e])
    return false;

    // If there are more than 
    // two characters, check if 
    // middle substring is also 
    // palindrome or not.
    if (s < e + 1)
    return isPalRec(str, s + 1, e - 1);

    return true;
}

bool isPalindrome(char str[])
{
int n = strlen(str);

// An empty string is 
// considered as palindrome
if (n == 0)
    return true;

return isPalRec(str, 0, n - 1);
}

// Driver Code
int main()
{
    char str[] = "geeg";

    if (isPalindrome(str))
    printf("Yes");
    else
    printf("No");

    return 0;
}
{% endhighlight %}
{% highlight java %}
// A recursive JAVA program to 
// check whether a given String 
// is palindrome or not
import java.io.*;

class GFG
{
    // A recursive function that 
    // check a str(s..e) is 
    // palindrome or not.
    static boolean isPalRec(String str, 
                            int s, int e)
    {
        // If there is only one character
        if (s == e)
            return true;

        // If first and last 
        // characters do not match
        if ((str.charAt(s)) != (str.charAt(e)))
            return false;

        // If there are more than 
        // two characters, check if
        // middle substring is also
        // palindrome or not.
        if (s < e + 1)
            return isPalRec(str, s + 1, e - 1);

        return true;
    }

    static boolean isPalindrome(String str)
    {
        int n = str.length();

    // An empty string is 
    // considered as palindrome
        if (n == 0)
            return true;

        return isPalRec(str, 0, n - 1);
    }

    // Driver Code
    public static void main(String args[])
    {
        String str = "geeg";

        if (isPalindrome(str))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

// This code is contributed
// by Nikita Tiwari
{% endhighlight %}
{% highlight python %}
# A recursive Python program 
# to check whether a given 
# number is palindrome or not

# A recursive function that 
# check a str[s..e] is 
# palindrome or not.
def isPalRec(st, s, e) :
    
    # If there is only one character
    if (s == e):
        return True

    # If first and last
    # characters do not match
    if (st[s] != st[e]) :
        return False

    # If there are more than 
    # two characters, check if 
    # middle substring is also 
    # palindrome or not.
    if (s < e + 1) :
        return isPalRec(st, s + 1, e - 1);

    return True

def isPalindrome(st) :
    n = len(st)
    
    # An empty string is 
    # considered as palindrome
    if (n == 0) :
        return True
    
    return isPalRec(st, 0, n - 1);


# Driver Code
st = "geeg"
if (isPalindrome(st)) :
    print "Yes"
else :
    print "No"
    
# This code is contributed
# by Nikita Tiwari.
{% endhighlight %}
{% highlight cpp %}
Yes
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

