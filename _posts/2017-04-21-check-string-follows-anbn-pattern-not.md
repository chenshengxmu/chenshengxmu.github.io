---
layout: post
title: Check if a string follows a^nb^n pattern or not
---
* Given a string str, return true string follows pattern anbn, i.e., it has a’s followed by b’s such that the number of a’s and b’s are same.
{% highlight cpp %}
Input : str = "aabb"
Output : Yes

Input : str = "abab"
Output : No

Input : str = "aabbb"
Output : No
{% endhighlight %}
* The idea is to first count a’s. If number of a’s is not equal to half of string’s length, then return false. Else check if all remaining characters are b’s or not.
* Below is the implementation of above idea :
{% highlight cpp %}
// C++ program to check if a string is of
// the form a^nb^n.
#include<iostream>
using namespace std;

// Returns true str is of the form a^nb^n.
bool isAnBn(string str)
{
   int n = str.length();

   // After this loop 'i' has count of a's
   int i;
   for (i=0; i<n; i++)
      if (str[i] != 'a')
         break;

   // Since counts of a's and b's should
   // be equal, a should apear exactly
   // n/2 times
   if (i*2 != n)
      return false;

   // Rest of the characters must be all 'b'
   int j;
   for (j=i; j<n; j++)
      if (str[j] != 'b')
         return false;

   return true;
}

// Driver code
int main()
{
    string str = "abab";
    isAnBn(str) ? cout << "Yes"
                : cout << "No";
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to check if a string is of
// the form a^nb^n.
import java.util.*;
import java.lang.*;
import java.io.*;

class CheckPattern
{
    public static boolean isAnBn(String s)
    {
        int l = s.length();
        
        // Only even length strings will have same number of a's and b's
        if (l%2 == 1)
        {
            return false;
        }
        // Set two pointers, one from the left and another from right
        int i = 0;
        int j = l-1;
        
        // Compare the characters till the center
        while (i<j)
        {
            if(s.charAt(i) != 'a' || s.charAt(j) != 'b')
            {
                return false;
            }
            i++;
            j--;
        }
        return true;    
    }
    
    public static void main (String[] args) throws java.lang.Exception
    {
        String s = "abab";
        
        // Function call
        boolean value = isAnBn(s);
        if(value == true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

// Code contributed by Shivani Sanjay Shinde.
{% endhighlight %}
{% highlight cpp %}
No
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

