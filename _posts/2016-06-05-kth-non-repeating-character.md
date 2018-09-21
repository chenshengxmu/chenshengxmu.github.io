---
layout: post
title: K'th Non-repeating Character
---
* Given a string and a number k, find the k’th non-repeating character in the string. Consider a large input string with lacs of characters and a small character set. How to find the character by only doing only one traversal of input string?
* Examples:
{% highlight cpp %}
Input : str = geeksforgeeks, k = 3
Output : r
First non-repeating character is f,
second is o and third is r.

Input : str = geeksforgeeks, k = 2
Output : o

Input : str = geeksforgeeks, k = 4
Output : Less than k non-repeating
         characters in input.
{% endhighlight %}
* This problem is mainly an extension of First non-repeating character problem.
* Method 1 (Simple : O(n2) A Simple Solution is to run two loops. Start traversing from left side. For every character, check if it repeats or not. If the character doesn’t repeat, increment count of non-repeating characters. When the count becomes k, return the character.
* Method 2 (O(n) but requires two traversals)
* Method 3 (O(n) and requires one traversal) The idea is to use two auxiliary arrays of size 256 (Assuming that characters are stored using 8 bits). The two arrays are:
{% highlight cpp %}
count[x] : Stores count of character 'x' in str.
           If x is not present, then it stores 0.

index[x] : Stores indexes of non-repeating characters
           in str. If a character 'x' is not  present
           or x is repeating, then it stores  a value
           that cannot be a valid index in str[]. For 
           example, length of string.
{% endhighlight %}
* Below is implementation of above idea.
{% highlight cpp %}
// C++ program to find k'th non-repeating character
// in a string
#include <bits/stdc++.h>
using namespace std;
const int MAX_CHAR = 256;

// Returns index of k'th non-repeating character in
// given string str[]
int kthNonRepeating(string str, int k)
{
    int n = str.length();

    // count[x] is going to store count of
    // character 'x' in str. If x is not present,
    // then it is going to store 0.
    int count[MAX_CHAR];

    // index[x] is going to store index of character
    // 'x' in str.  If x is not  present or x is
    // repeating, then it is going to store  a value
    // (for example, length of string) that cannot be
    // a valid index in str[]
    int index[MAX_CHAR];

    // Initialize counts of all characters and indexes
    // of non-repeating  characters.
    for (int i = 0; i < MAX_CHAR; i++)
    {
        count[i] = 0;
        index[i] = n;  // A value more than any index
                       // in str[]
    }

    // Traverse the input string
    for (int i = 0; i < n; i++)
    {
        // Find current character and increment its
        // count
        char x = str[i];
        ++count[x];

        // If this is first occurrence, then set value
        // in index as index of it.
        if (count[x] == 1)
            index[x] = i;

        // If character repeats, then remove it from
        // index[]
        if (count[x] == 2)
            index[x] = n;
    }

    // Sort index[] in increasing order.  This step
    // takes O(1) time as size of index is 256 only
    sort(index, index+MAX_CHAR);

    // After sorting, if index[k-1] is value, then 
    // return it, else return -1.
    return (index[k-1] != n)? index[k-1] : -1;
}

// Driver code
int main()
{
   string str = "geeksforgeeks";
   int k = 3;
   int res = kthNonRepeating(str, k);
   (res == -1)? cout << "There are less than k non-"
                        "repeating characters"
              : cout << "k'th non-repeating character"
                       " is  "<< str[res];
   return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to find k'th non-repeating character
// in a string

import java.util.Arrays;

class GFG 
{
    public static int MAX_CHAR = 256;
    
    // Returns index of k'th non-repeating character in
    // given string str[]
    static int kthNonRepeating(String str, int k)
    {
        int n = str.length();
 
        // count[x] is going to store count of
        // character 'x' in str. If x is not present,
        // then it is going to store 0.
        int[] count = new int[MAX_CHAR];
 
        // index[x] is going to store index of character
        // 'x' in str.  If x is not  present or x is
        // repeating, then it is going to store  a value
        // (for example, length of string) that cannot be
        // a valid index in str[]
        int[] index = new int[MAX_CHAR];
 
        // Initialize counts of all characters and indexes
        // of non-repeating  characters.
        for (int i = 0; i < MAX_CHAR; i++)
        {
            count[i] = 0;
            index[i] = n;  // A value more than any index
                           // in str[]
        }
 
        // Traverse the input string
        for (int i = 0; i < n; i++)
        {
            // Find current character and increment its
            // count
            char x = str.charAt(i);
            ++count[x];
 
            // If this is first occurrence, then set value
            // in index as index of it.
            if (count[x] == 1)
                index[x] = i;
 
            // If character repeats, then remove it from
            // index[]
            if (count[x] == 2)
                index[x] = n;
        }
 
        // Sort index[] in increasing order.  This step
        // takes O(1) time as size of index is 256 only
        Arrays.sort(index);
 
        // After sorting, if index[k-1] is value, then 
        // return it, else return -1.
        return (index[k-1] != n)? index[k-1] : -1;
    }
    
    // driver program
    public static void main (String[] args) 
    {
        String str = "geeksforgeeks";
        int k = 3;
        int res = kthNonRepeating(str, k);
        
        System.out.println(res == -1 ? "There are less than k non-repeating characters" :
                           "k'th non-repeating character is  " + str.charAt(res));
    }
}

// Contributed by Pramod Kumar
{% endhighlight %}
{% highlight cpp %}
k'th non-repeating character is r
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above

