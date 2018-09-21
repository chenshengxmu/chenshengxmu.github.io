---
layout: post
title: Distinct strings with odd and even changes allowed
---
* Given an array of lower case strings, the task is to find the number of strings that are distinct. Two strings are distinct if on applying the following operations on one string the second string cannot be formed.
* Examples:
{% highlight cpp %}
Input  : arr[] = {"abcd", "cbad", "bacd"}
Output : 2
The 2nd string can be converted to the 1st by swapping 
the first and third characters. So there are 2 distinct 
strings as the third string cannot be converted to the 
first.

Input  : arr[] = {"abc", "cba"}
Output : 1
{% endhighlight %}
* A simple solution is to run two loops. The outer loop picks a string and inner loop checks if there is a previously string which can be converted to current string by doing allowed transformations. This solution requires O(n2m) time where n is number of strings and m is maximum number of characters in any string.
* An efficient solution generate an encoded string for every input string. The encoded has counts of even and odd positioned characters separated by a separator. Two strings are considered distinct if their encoded strings are same else not. Once we have a way to encode string, the problem reduces to counting distinct encoded strings. This is a typical problem of hashing. We create hash set and one by one store encodings of strings. If an encoding already exists, we ignore string. Else we store encoding in hash and increment count of distinct strings.
{% highlight cpp %}
// C++ program to count distinct strings with
// even odd swapping allowed.
#include<bits/stdc++.h>
using namespace std;
const int MAX_CHAR = 26;

// Returns encoding of string that can be used for hashing.
// The idea is to return same encoding for strings which 
// can become same after swapping a even positioned character
// with other even characters OR swapping an odd character
// with other odd characters.
string encodeString(string str)
{
    // hashEven stores the count of even indexed character
    // for each string hashOdd stores the count of odd
    // indexed characters for each string
    int hashEven[MAX_CHAR] = {0};
    int hashOdd[MAX_CHAR] = {0};

    // creating hash for each string
    for (int i=0; i<str.length(); i++)
    {
        char c = str[i];
        if (i&1) // If index of current character is odd
           hashOdd[c-'a']++;
        else
           hashEven[c-'a']++;
    }

    // For every character from 'a' to 'z', we store its
    // count at even position followed by a separator,
    // followed by count at odd position.
    string encoding = "";
    for (int i=0; i<MAX_CHAR; i++)
    {
       encoding += to_string(hashEven[i]);
       encoding += to_string('-');
       encoding += to_string(hashOdd[i]);
       encoding += to_string('-');
    }
    return encoding;
}

// This function basically uses a hashing based set to
// store strings which are distinct according to accoding
// to criteria given in question.
int countDistinct(string input[], int n)
{
    int countDist = 0;  // Initialize result

    // Create an empty set and store all distinct
    // strings in it.
    unordered_set<string> s;
    for (int i=0; i<n; i++)
    {
       // If this encoding appears first time, increment
       // count of distinct encodings.
       if (s.find(encodeString(input[i])) == s.end())
       {
           s.insert(encodeString(input[i]));
           countDist++;
       }
    }

    return countDist;
}

// Driver code
int main()
{
    string input[] = {"abcd", "acbd", "adcb", "cdba",
                      "bcda", "badc"};
    int n = sizeof(input)/sizeof(input[0]);

    cout << countDistinct(input, n);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to count distinct strings with
// even odd swapping allowed.
import java.util.HashSet;
import java.util.Set;
class GFG {
static int MAX_CHAR = 26;

    static String encodeString(char[] str) {
        // hashEven stores the count of even indexed character
        // for each string hashOdd stores the count of odd
        // indexed characters for each string
        int hashEven[] = new int[MAX_CHAR];
        int hashOdd[] = new int[MAX_CHAR];

        // creating hash for each string
        for (int i = 0; i < str.length; i++) {
            char c = str[i];
            if ((i & 1) != 0) // If index of current character is odd
                hashOdd[c-'a']++;
            else
                hashEven[c-'a']++;

        }


        // For every character from 'a' to 'z', we store its
        // count at even position followed by a separator,
        // followed by count at odd position.
        String encoding = "";
        for (int i = 0; i < MAX_CHAR; i++) {
            encoding += (hashEven[i]);
            encoding += ('-');
            encoding += (hashOdd[i]);
            encoding += ('-');
        }
        return encoding;
    }

    // This function basically uses a hashing based set to
// store strings which are distinct according to accoding
// to criteria given in question.
    static int countDistinct(String input[], int n) {
        int countDist = 0; // Initialize result

        // Create an empty set and store all distinct
        // strings in it.
        Set<String> s = new HashSet<>();
        for (int i = 0; i < n; i++) {
            // If this encoding appears first time, increment
            // count of distinct encodings.
            if (!s.contains(encodeString(input[i].toCharArray()))) {
                s.add(encodeString(input[i].toCharArray()));
                countDist++;
            }
        }

        return countDist;
    }

    public static void main(String[] args) {
        String input[] = {"abcd", "acbd", "adcb", "cdba",
                "bcda", "badc"};
        int n = input.length;

        System.out.println(countDistinct(input, n));
    }
}
{% endhighlight %}
{% highlight cpp %}
4
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above

