---
layout: post
title: Print all pairs of anagrams in a given array of strings
---
* Given an array of strings, find all anagram pairs in the given array. Example:
{% highlight cpp %}
Input: arr[] =  {"geeksquiz", "geeksforgeeks", "abcd",
                 "forgeeksgeeks", "zuiqkeegs"};
Output: (geeksforgeeks, forgeeksgeeks), (geeksquiz, zuiqkeegs)
{% endhighlight %}
* We can find whether two strings are anagram or not in linear time using count array (see method 2 of this).
* One simple idea to find whether all anagram pairs is to run two nested loops. The outer loop picks all strings one by one. The inner loop checks whether remaining strings are anagram of the string picked by outer loop. Below is the implementation of this approach :
{% highlight cpp %}
#include <bits/stdc++.h>
using namespace std;
#define NO_OF_CHARS 256

/* function to check whether two strings are anagram of each other */
bool areAnagram(string str1, string str2)
{
    // Create two count arrays and initialize all values as 0
    int count[NO_OF_CHARS] = {0};
    int i;

    // For each character in input strings, increment count in
    // the corresponding count array
    for (i = 0; str1[i] && str2[i];  i++)
    {
        count[str1[i]]++;
        count[str2[i]]--;
    }

    // If both strings are of different length. Removing this condition
    // will make the program fail for strings like "aaca" and "aca"
    if (str1[i] || str2[i])
      return false;

    // See if there is any non-zero value in count array
    for (i = 0; i < NO_OF_CHARS; i++)
        if (count[i])
            return false;
     return true;
}

// This function prints all anagram pairs in a given array of strigns
void findAllAnagrams(string arr[], int n)
{
    for (int i = 0; i < n; i++)
        for (int j = i+1; j < n; j++)
            if (areAnagram(arr[i], arr[j]))
                cout << arr[i] << " is anagram of " << arr[j] << endl;
}


/* Driver program to test to pront printDups*/
int main()
{
    string arr[] = {"geeksquiz", "geeksforgeeks", "abcd", 
                    "forgeeksgeeks", "zuiqkeegs"};
    int n = sizeof(arr)/sizeof(arr[0]);
    findAllAnagrams(arr, n);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to Print all pairs of 
// anagrams in a given array of strings
public class GFG 
{
    static final int NO_OF_CHARS = 256;
    
    /* function to check whether two 
    strings are anagram of each other */
    static boolean areAnagram(String str1, String str2)
    {
        // Create two count arrays and initialize
        // all values as 0
        int[] count = new int[NO_OF_CHARS];
        int i;

        // For each character in input strings, 
        // increment count in the corresponding 
        // count array
        for (i = 0; i < str1.length() && i < str2.length();
                                                   i++)
        {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }

        // If both strings are of different length.
        // Removing this condition will make the program 
        // fail for strings like "aaca" and "aca"
        if (str1.length() != str2.length())
          return false;

        // See if there is any non-zero value in 
        // count array
        for (i = 0; i < NO_OF_CHARS; i++)
            if (count[i] != 0)
                return false;
         return true;
    }

    // This function prints all anagram pairs in a 
    // given array of strigns
    static void findAllAnagrams(String arr[], int n)
    {
        for (int i = 0; i < n; i++)
            for (int j = i+1; j < n; j++)
                if (areAnagram(arr[i], arr[j]))
                    System.out.println(arr[i] + 
                       " is anagram of " + arr[j]);
    }

    /* Driver program to test to pront printDups*/
    public static void main(String args[])
    {
        String arr[] = {"geeksquiz", "geeksforgeeks",
                        "abcd", "forgeeksgeeks", 
                        "zuiqkeegs"};
        int n = arr.length;
        findAllAnagrams(arr, n);
    }
}
// This code is contributed by Sumit Ghosh
{% endhighlight %}
{% highlight cpp %}
geeksquiz is anagram of zuiqkeegs
geeksforgeeks is anagram of forgeeksgeeks
{% endhighlight %}
* The time complexity of the above solution is O(n2*m) where n is number of strings and m is maximum length of a string.
* Optimizations: We can optimize the above solution using following approaches. 1) Using sorting: We can sort array of strings so that all anagrams come together. Then print all anagrams by linearly traversing the sorted array. The time complexity of this solution is O(mnLogn) (We would be doing O(nLogn) comparisons in sorting and a comparison would take O(m) time)
* 2) Using Hashing: We can build a hash function like XOR or sum of ASCII values of all characters for a string. Using such a hash function, we can build a hash table. While building the hash table, we can check if a value is already hashed. If yes, we can call areAnagrams() to check if two strings are actually anagrams (Note that xor or sum of ASCII values is not sufficient, see Kaushik Lele’s comment here)
* This article is contributed by Abhishek. Please write comments if you find anything incorrect or want to share more information about above topic.

