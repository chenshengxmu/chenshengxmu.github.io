---
layout: post
title: Check if two strings are k-anagrams or not
---
* Given two strings of lowercase alphabets and a value k, the task is to find if two strings are K-anagrams of each other or not.
* Two strings are called k-anagrams if following two conditions are true.
* Examples :
{% highlight cpp %}
Input:  str1 = "anagram" , str2 = "grammar" , k = 3
Output:  Yes
Explanation: We can update maximum 3 values and 
it can be done in changing only 'r' to 'n' 
and 'm' to 'a' in str2.

Input:  str1 = "geeks", str2 = "eggkf", k = 1
Output:  No
Explanation: We can update or modify only 1 
value but there is a need of modifying 2 characters. 
i.e. g and f in str 2.
{% endhighlight %}
* Below is a solution to check if two strings are k-anagrams of each other or not.
{% highlight cpp %}
// C++ program to check if two strings are k anagram
// or not.
#include<bits/stdc++.h>
using namespace std;
const int MAX_CHAR = 26;

// Function to check that string is k-anagram or not
bool arekAnagrams(string str1, string str2, int k)
{
    // If both strings are not of equal
    // length then return false
    int n = str1.length();
    if (str2.length() != n)
        return false;

    int count1[MAX_CHAR] = {0};
    int count2[MAX_CHAR] = {0};

    // Store the occurrence of all characters
    // in a hash_array
    for (int i = 0; i < n; i++)
        count1[str1[i]-'a']++;
    for (int i = 0; i < n; i++)
        count2[str2[i]-'a']++;
     
    int count = 0;

    // Count number of characters that are
    // different in both strings
    for (int i = 0; i < MAX_CHAR; i++)
        if (count1[i] > count2[i])
            count = count + abs(count1[i]-count2[i]);

    // Return true if count is less than or
    // equal to k
    return (count <= k);
}

// Driver code
int main()
{
    string str1 = "anagram";
    string str2 = "grammar";
    int k = 2;
    if (arekAnagrams(str1, str2, k))
        cout << "Yes";
    else
        cout<< "No";
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to check if two strings are k anagram
// or not.
public class GFG {
     
    static final int MAX_CHAR = 26;

    // Function to check that string is k-anagram or not
    static boolean arekAnagrams(String str1, String str2, 
                                                 int k)
    {
        // If both strings are not of equal
        // length then return false
        int n = str1.length();
        if (str2.length() != n)
            return false;

        int[] count1 = new int[MAX_CHAR];
        int[] count2 = new int[MAX_CHAR];
        int count = 0;
       
        // Store the occurrence of all characters
        // in a hash_array
        for (int i = 0; i < n; i++)
            count1[str1.charAt(i) - 'a']++;
        for (int i = 0; i < n; i++)
            count2[str2.charAt(i) - 'a']++;

        // Count number of characters that are
        // different in both strings
        for (int i = 0; i < MAX_CHAR; i++)
            if (count1[i] > count2[i])
                count = count + Math.abs(count1[i] - 
                                          count2[i]);

        // Return true if count is less than or
        // equal to k
        return (count <= k);
    }

    // Driver code
    public static void main(String args[])
    {
        String str1 = "anagram";
        String str2 = "grammar";
        int k = 2;
        if (arekAnagrams(str1, str2, k))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
// This code is contributed by Sumit Ghosh
{% endhighlight %}
{% highlight cpp %}
Yes
{% endhighlight %}
* We can optimize above solution. Here we use only one count array to store counts of characters in str1. We traverse str2 and decrement occurrence of every character in count array that is present in str2. If we find a character that is not there in str1, we increment count of different characters. If count of different character become more than k, we return false.
{% highlight cpp %}
// Optimized C++ program to check if two strings
// are k anagram or not.
#include<bits/stdc++.h>
using namespace std;

const int MAX_CHAR = 26;

// Function to check if str1 and str2 are k-anagram
// or not
bool areKAnagrams(string str1, string str2, int k)
{
    // If both strings are not of equal
    // length then return false
    int n = str1.length();
    if (str2.length() != n)
        return false;

    int hash_str1[MAX_CHAR] = {0};

    // Store the occurrence of all characters
    // in a hash_array
    for (int i = 0; i < n ; i++)
        hash_str1[str1[i]-'a']++;

    // Store the occurrence of all characters
    // in a hash_array
    int count = 0;
    for (int i = 0; i < n ; i++)
    {
        if (hash_str1[str2[i]-'a'] > 0)
            hash_str1[str2[i]-'a']--;
        else
            count++;

        if (count > k)
            return false;
    }

    // Return true if count is less than or
    // equal to k
    return true;
}

// Driver code
int main()
{
    string str1 = "fodr";
    string str2 = "gork";
    int k = 2;
    if (areKAnagrams(str1, str2, k) == true)
        cout << "Yes";
    else
        cout << "No";
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Optimized Java program to check if two strings
// are k anagram or not.
public class GFG {
    
    static final int MAX_CHAR = 26;
     
    // Function to check if str1 and str2 are k-anagram
    // or not
    static boolean areKAnagrams(String str1, String str2, 
                                                  int k)
    {
        // If both strings are not of equal
        // length then return false
        int n = str1.length();
        if (str2.length() != n)
            return false;
     
        int[] hash_str1 = new int[MAX_CHAR];
     
        // Store the occurrence of all characters
        // in a hash_array
        for (int i = 0; i < n ; i++)
            hash_str1[str1.charAt(i)-'a']++;
     
        // Store the occurrence of all characters
        // in a hash_array
        int count = 0;
        for (int i = 0; i < n ; i++)
        {
            if (hash_str1[str2.charAt(i)-'a'] > 0)
                hash_str1[str2.charAt(i)-'a']--;
            else
                count++;
     
            if (count > k)
                return false;
        }
     
        // Return true if count is less than or
        // equal to k
        return true;
    }
     
    // Driver code
    public static void main(String args[])
    {
        String str1 = "fodr";
        String str2 = "gork";
        int k = 2;
        if (areKAnagrams(str1, str2, k) == true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
// This code is contributed by Sumit Ghosh
{% endhighlight %}
{% highlight cpp %}
Yes
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

