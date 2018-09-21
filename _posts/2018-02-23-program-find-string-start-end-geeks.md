---
layout: post
title: Find if a string starts and ends with another given string
---
* Given a string str and a corner string cs, we need to find out whether the string str starts and ends with the corner string cs or not.
* Examples:
{% highlight cpp %}
Input : str = "geeksmanishgeeks", cs = "geeks"
Output : Yes

Input : str = "shreya dhatwalia", cs = "abc"
Output : No
{% endhighlight %}
* Algorithm
{% highlight cpp %}
// CPP program to find if a given corner string
// is present at corners.
#include <bits/stdc++.h>
using namespace std;

bool isCornerPresent(string str, string corner)
{
    int n = str.length();
    int cl = corner.length();

    // If length of corner string is more, it 
    // cannot be present at corners.
    if (n < cl)
       return false;

    // Return true if corner string is present at
    // both corners of given string.
    return (str.substr(0, cl).compare(corner) == 0 &&
            str.substr(n-cl, cl).compare(corner) == 0);
}

// Driver code
int main()
{
   string str = "geeksforgeeks";
   string corner = "geeks";
   if (isCornerPresent(str, corner))
      cout << "Yes";
   else
      cout << "No";
   return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to find if a given corner
// string is present at corners.
import java.io.*;
class GFG {
    
    static boolean isCornerPresent(String str, 
                                   String corner)
    {
        int n = str.length();
        int cl = corner.length();

        // If length of corner string 
        // is more, it cannot be present 
        // at corners.
        if (n < cl)
        return false;

        // Return true if corner string 
        // is present at both corners 
        // of given string.
        return (str.substring(0, cl).equals(corner) &&
                str.substring(n - cl, n).equals(corner));
    }
    
    // Driver Code
    public static void main (String[] args)
    {
        String str = "geeksforgeeks";
        String corner = "geeks";
        if (isCornerPresent(str, corner))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

// This code is contributed by Manish_100
{% endhighlight %}
{% highlight python %}
# Python program to find 
# if a given corner string 
# is present at corners.

def isCornerPresent(str, corner) :

    n = len(str)
    cl = len(corner)

    # If length of corner 
    # string is more, it 
    # cannot be present 
    # at corners.
    if (n < cl) :
        return False

    # Return true if corner 
    # string is present at 
    # both corners of given
    # string.
    return ((str[: cl] == corner) and 
            (str[n - cl :] == corner))

# Driver Code
str = "geeksforgeeks"
corner = "geeks"
if (isCornerPresent(str, corner)) :
    print ("Yes")
else :
    print ("No")

# This code is contributed by 
# Manish Shaw(manishshaw1)
{% endhighlight %}
{% highlight cpp %}
Yes
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

