---
layout: post
title: Put spaces between words starting with capital letters
---
* You are given an array of characters which is basically a sentence. However there is no space between different words and the first letter of every word is in uppercase. You need to print this sentence after following amendments: (i) Put a single space between these words. (ii) Convert the uppercase letters to lowercase.
* Examples:
{% highlight cpp %}
Input : BruceWayneIsBatman
Output : bruce wayne is batman

Input :  You
Output :  you
{% endhighlight %}
* We check if the current character is in uppercase then print ” “(space) and convert it into lowercase.
{% highlight cpp %}
// C++ program to put spaces between words starting
// with capital letters.
#include <iostream>
using namespace std;

// Function to amend the sentence
void amendSentence(string str)
{
    // Traverse the string
    for(int i=0; i < str.length(); i++)
    {
        // Convert to lowercase if its
        // an uppercase character
        if (str[i]>='A' && str[i]<='Z')
        {
            str[i]=str[i]+32;

            // Print space before it
            // if its an uppercase character
            if (i != 0)
                cout << " ";

            // Print the character
            cout << str[i];
        }

        // if lowercase character
        // then just print
        else
            cout << str[i];
    }
}

// Driver code
int main()
{
    string str ="BruceWayneIsBatman";
    amendSentence(str);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to put spaces between words starting
// with capital letters.

import java.util.*;
import java.lang.*;
import java.io.*;

class AddSpaceinSentence
{
    // Function to amend the sentence
    public static void amendSentence(String sstr)
    {
        char[] str=sstr.toCharArray();
        
        // Traverse the string
        for (int i=0; i < str.length; i++)
        {
            // Convert to lowercase if its
            // an uppercase character
            if (str[i]>='A' && str[i]<='Z')
            {
                str[i] = (char)(str[i]+32);
                
                // Print space before it
                // if its an uppercase character
                if (i != 0)
                    System.out.print(" ");
    
                // Print the character
                System.out.print(str[i]);
            }
    
            // if lowercase character
            // then just print
            else
            System.out.print(str[i]);
        }
    }     
    
    // Driver Code
    public static void main (String[] args) 
    {
        String str ="BruceWayneIsBatman";
        amendSentence(str);
    }
}
{% endhighlight %}
{% highlight cpp %}
bruce wayne is batman
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

