---
layout: post
title: Print common characters of two Strings in alphabetical order
---
* Given two strings, print all the common characters in lexicographical order. If there are no common letters, print -1. All letters are lower case. Examples:
{% highlight cpp %}
Input : 
string1 : geeks
string2 : forgeeks
Output : eegks
Explanation: The letters that are common between 
the two strings are e(2 times), k(1 time) and 
s(1 time).
Hence the lexicographical output is "eegks"

Input : 
string1 : hhhhhello
string2 : gfghhmh
Output : hhh
{% endhighlight %}
* The idea is to use character count arrays. 1) Count occurrences of all characters from ‘a’ to ‘z’ in first and second strings. Store these counts in two arrays a1[] and a2[]. 2) Traverse a1[] and a2[] (Note size of both is 26). For every index i, print character ‘a’ + i number of times equal min(a1[i], a2[i]).
* Below is implementation of above steps.
{% highlight java %}
// Java program to print common characters
// of two Strings in alphabetical order
import java.io.*;
import java.util.*;

// Function to find similar characters
public class Simstrings
{
    static final int MAX_CHAR = 26;

    static void printCommon(String s1, String s2)
    {
       // two arrays of length 26 to store occurence
        // of a letters alphabetically for each string
        int[] a1 = new int[MAX_CHAR];
        int[] a2 = new int[MAX_CHAR];

        int length1 = s1.length();
        int length2 = s2.length();

        for (int i = 0 ; i < length1 ; i++)
           a1[s1.charAt(i) - 'a'] += 1;

        for (int i = 0 ; i < length2 ; i++)
           a2[s2.charAt(i) - 'a'] += 1;

        // If a common index is non-zero, it means
        // that the letter corresponding to that
        // index is common to both strings
        for (int i = 0 ; i < MAX_CHAR ; i++)
        {
            if (a1[i] != 0 && a2[i] != 0)
            {
                // Find the minimum of the occurence
                // of the character in both strings and print
                // the letter that many number of times
                for (int j = 0 ; j < Math.min(a1[i], a2[i]) ; j++)
                    System.out.print(((char)(i + 'a')));
            }
        }
    }

    // Driver code
    public static void main(String[] args) throws IOException
    {
        String s1 = "geeksforgeeks", s2 = "practiceforgeeks";
        printCommon(s1, s2);
    }
}
{% endhighlight %}
{% highlight python %}
# Python3 program to print common characters
# of two Strings in alphabetical order


# intializing a size of arrays
MAX_CHAR=26

# Function to find similar characters
def printCommon( s1, s2):
    # two arrays of length 26 to store occurence
    # of a letters alphabetically for each string
    a1 = [0 for i in range(MAX_CHAR)]
    a2 = [0 for i in range(MAX_CHAR)]

    length1 = len(s1)
    length2 = len(s2)

    for i in range(0,length1):
        a1[ord(s1[i]) - ord('a')] += 1

    for i in range(0,length2):
        a2[ord(s2[i]) - ord('a')] += 1

    # If a common index is non-zero, it means
    # that the letter corresponding to that
    # index is common to both strings
    for i in range(0,MAX_CHAR):
        if (a1[i] != 0 and a2[i] != 0):
            
            # Find the minimum of the occurence
            # of the character in both strings and print
            # the letter that many number of times
            for j in range(0,min(a1[i],a2[i])):
                ch = chr(ord('a')+i)
                print (ch, end='')
            

# Driver code
if __name__=="__main__":
    s1 = "geeksforgeeks"
    s2 = "practiceforgeeks"
    printCommon(s1, s2);

# This Code is contributed by Abhishek Sharma
{% endhighlight %}
{% highlight cpp %}
eeefgkors
{% endhighlight %}
* Time Complexity: If we consider n = length(larger string), then this algorithm runs in O(n) complexity.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

