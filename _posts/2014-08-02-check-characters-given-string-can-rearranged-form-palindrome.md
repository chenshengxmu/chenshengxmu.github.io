---
layout: post
title: Check if characters of a given string can be rearranged to form a palindrome
---
* Given a string, Check if characters of the given string can be rearranged to form a palindrome. For example characters of “geeksogeeks” can be rearranged to form a palindrome “geeksoskeeg”, but characters of “geeksforgeeks” cannot be rearranged to form a palindrome.
* A set of characters can form a palindrome if at most one character occurs odd number of times and all characters occur even number of times.
* A simple solution is to run two loops, the outer loop picks all characters one by one, the inner loop counts number of occurrences of the picked character. We keep track of odd counts. Time complexity of this solution is O(n2).
* We can do it in O(n) time using a count array. Following are detailed steps. 1) Create a count array of alphabet size which is typically 256. Initialize all values of count array as 0. 2) Traverse the given string and increment count of every character. 3) Traverse the count array and if the count array has more than one odd values, return false. Otherwise return true.
* Below is the implementation of above approach.
{% highlight cpp %}
// C++ implementation to check if
// characters of a given string can
// be rearranged to form a palindrome
#include<bits/stdc++.h>
using namespace std;
#define NO_OF_CHARS 256
 
/* function to check whether characters of a string can form 
   a palindrome */
bool canFormPalindrome(string str)
{
    // Create a count array and initialize all 
    // values as 0
    int count[NO_OF_CHARS] = {0};
 
    // For each character in input strings,
    // increment count in the corresponding
    // count array
    for (int i = 0; str[i];  i++)
        count[str[i]]++;
 
    // Count odd occurring characters
    int odd = 0;
    for (int i = 0; i < NO_OF_CHARS; i++)
    {
        if (count[i] & 1)
            odd++;

        if (odd > 1)
            return false;
    }
 
    // Return true if odd count is 0 or 1, 
    return true;
}
 
/* Driver program*/
int main()
{
  canFormPalindrome("geeksforgeeks")? cout << "Yes\n": 
                                     cout << "No\n";
  canFormPalindrome("geeksogeeks")? cout << "Yes\n": 
                                    cout << "No\n";
  return 0;
}
{% endhighlight %}
{% highlight java %}
// Java implementation to check if
// characters of a given string can
// be rearranged to form a palindrome
import java.io.*;
import java.util.*;
import java.math.*;

class GFG {

static int NO_OF_CHARS = 256;

    /* function to check whether characters 
    of a string can form a palindrome */
    static boolean canFormPalindrome(String str) {
    
    // Create a count array and initialize all
    // values as 0
    int count[] = new int[NO_OF_CHARS];
    Arrays.fill(count, 0);

    // For each character in input strings,
    // increment count in the corresponding
    // count array
    for (int i = 0; i < str.length(); i++)
    count[(int)(str.charAt(i))]++;

    // Count odd occurring characters
    int odd = 0;
    for (int i = 0; i < NO_OF_CHARS; i++) 
    {
    if ((count[i] & 1) == 1)
        odd++;

    if (odd > 1)
        return false;
    }

    // Return true if odd count is 0 or 1,
    return true;
}

// Driver program
public static void main(String args[])
{
    if (canFormPalindrome("geeksforgeeks"))
    System.out.println("Yes");
    else
    System.out.println("No");

    if (canFormPalindrome("geeksogeeks"))
    System.out.println("Yes");
    else
    System.out.println("No");
}
}

// This code is contributed by Nikita Tiwari.
{% endhighlight %}
{% highlight python %}
# Python3 implementation to check if
# characters of a given string can
# be rearranged to form a palindrome

NO_OF_CHARS = 256

# function to check whether characters
# of a string can form a palindrome 
def canFormPalindrome(st) :

    # Create a count array and initialize  
    # all values as 0
    count = [0] * (NO_OF_CHARS)

    # For each character in input strings,
    # increment count in the corresponding
    # count array
    for i in range( 0, len(st)) :
        count[ord(st[i])] = count[ord(st[i])] + 1

    # Count odd occurring characters
    odd = 0
    
    for i in range(0, NO_OF_CHARS ) :
        if (count[i] & 1) :
            odd = odd + 1

        if (odd > 1) :
            return False
            
    # Return true if odd count is 0 or 1, 
    return True

# Driver program
if(canFormPalindrome("geeksforgeeks")) :
    print("Yes")
else :
    print("No")
    
if(canFormPalindrome("geeksogeeks")) :
    print("Yes")
else :
    print("No")

# This code is contributed by Nikita Tiwari.
{% endhighlight %}
{% highlight cpp %}
No
Yes
{% endhighlight %}
* This article is contributed by Abhishek. Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above

