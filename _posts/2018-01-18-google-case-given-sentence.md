---
layout: post
title: gOOGLE cASE of a given sentence
---
* Given a sentence, task is to rewrite in Google Case. It is a style of writing where we replace all lower case letters into upper case letters leaving the initial of all the words.
* Examples :
{% highlight cpp %}
Input : gEEks fOr GeeKs
Output : gEEKS fOR gEEKS 

Input : I got intern at geeksforgeeks
Output : i gOT iNTERN aT gEEKSFORGEEKS
{% endhighlight %}
* A simple solution is to the convert whole string into upper letter and then traverse the given string, while traversing we replace the initial of all words to small.
{% highlight java %}
// Java program to covert a 
// sentence to gOOGLE cASE.

class GFG
{
    static String convert(String str)
    {
        // empty strings
        String w = "", z = "";

        // convert input string to upper case
        str = str.toUpperCase() + " ";

        for (int i = 0; i < str.length(); i++) 
        {

            // checki if character is not a space
            // and adding it to string w
            char ch = str.charAt(i);
            if (ch != ' ')
                w = w + ch;
            else {

                // converting first character to lower
                // case and subsequent initial
                // letter of another word to lower case
                z = z + (Character.toLowerCase(w.charAt(0))) + 
                         w.substring(1) + " ";
                w = "";
            }
        }

        return z;
    }
    
    // Driver code
    public static void main(String[] args)
    {
        
        String str = "I got intern at geeksforgeeks";
        System.out.println(convert(str));
    }
}
{% endhighlight %}
{% highlight cpp %}
i gOT iNTERN aT gEEKSFORGEEKS
{% endhighlight %}
* The above solution requires two traversals of string. An efficient solution is to do in single traversal. The idea is to keep track of spaces. After every space, print character to lower, else print in upper.
{% highlight cpp %}
// CPP program to convert given 
// sentence to camel case.
#include <bits/stdc++.h>
using namespace std;

// Function to remove spaces and 
// convert into camel case
string convert(string s)
{
    int n = s.length();
    s[0] = tolower(s[0]);

    for (int i = 1; i < n; i++) 
    {

        // check for spaces in the sentence
        if (s[i] == ' ' && i < n) 
        {

            // conversion into upper case
            s[i + 1] = tolower(s[i + 1]);
            i++;
        }

        // If not space, copy character 
        else
            s[i] = toupper(s[i]);
    }

    // return string to main
    return s;
}

// Driver Code
int main()
{
    string str = "I get intern at geeksforgeeks";
    cout << convert(str);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to convert given
// sentence to camel case.
import java.io.*;

class GFG 
{
    // Function to remove spaces 
    // and convert into camel case
    static String convert(String s)
    {
        int n = s.length();
        String s1 = "";
        s1 = s1 + Character.toLowerCase(s.charAt(0));

        for (int i = 1; i < n; i++) 
        {
            // check for spaces in the sentence
            if (s.charAt(i) == ' ' && i < n) 
            {
                // conversion into upper case
                s1 = s1 + " " + Character.toLowerCase
                                (s.charAt(i + 1));
                i++;
                
            }
        
            // If not space, copy character 
            else
            s1= s1 + Character.toUpperCase(s.charAt(i));
            
        }

        // return string to main
        return s1;
       
    }
   
    // Driver code
    public static void main (String[] args) 
    {
        String str = "I get intern at geeksforgeeks";
        System.out.println(convert(str));
    }
}

// This code is contributed by Gitanjali.
{% endhighlight %}
{% highlight python %}
# Python program to convert given
# sentence to camel case.
import math

# Function to remove spaces 
# and convert into camel case
def convert( s):

        n = len(s)
        s1 = ""
        s1 = s1 + s[0].lower()
        i = 1
        while i < n:
            # check for spaces in the sentence
            if (s[i] == ' ' and i <= n): 
            
                # conversion into upper case
                s1 = s1 + " " + (s[i + 1]).lower()
                i = i + 1
                
            # If not space, copy character 
            else:
                s1 = s1 + (s[i]).upper()
            
            # increase index of string by s1
            i = i + 1
        
        # return string to main
        return s1
    
# Driver code
str = "I get intern at geeksforgeeks"
print(convert(str))

# This code is contributed by Gitanjali.
{% endhighlight %}
{% highlight cpp %}
i gET iNTERN aT gEEKSFORGEEKS
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

