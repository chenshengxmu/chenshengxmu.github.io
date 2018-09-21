---
layout: post
title: Find the first repeated character in a string
---
* Given a string, find the first repeated character in it. We need to find the character that occurs more than once and whose index of first occurrence is smallest.
* Examples:
{% highlight cpp %}
Input:  ch = "geeksforgeeks"
Output: e 
e is the first element that repeats

Input:  str = "hello geeks"
Output: l 
l is the first element that repeats
{% endhighlight %}
* Simple Solution: The solution is to run two nested loops. Start traversing from left side. For every character, check if it repeats or not. If the character repeats, increment count of repeating characters. When the count becomes k, return the character. Time Complexity of this solution is O(n2)
* We can Use Sorting to solve the problem in O(n Log n) time. Following are detailed steps. 1) Copy the given array to an auxiliary array temp[]. 2) Sort the temp array using a O(nLogn) time sorting algorithm. 3) Scan the input array from left to right. For every element, count its occurrences in temp[] using binary search. As soon as we find a characterthat occurs more than once, we return the character.
* This step can be done in O(n Log n) time.
* An efficient solution is to use Hashing to solve this in O(n) time on average.
{% highlight cpp %}
// CPP program to find the first
// repeated character in a string
#include <bits/stdc++.h>
using namespace std;

// Returns first repeating character in str.
char firstRepeating(string &str)
{
    // Creates an empty hashset
    unordered_set<char> h;

    // Traverse the input array from left to right
    for (int i=0; i<str.length(); i++)
    {
        char c = str[i];

        // If element is already in hash set, update x
        // and then break
        if (h.find(c) != h.end())
            return c;

        else // Else add element to hash set
            h.insert(c);
    }

    // If there was no repeated character
    return '\0';
}

// Driver method to test above method
int main ()
{
    string str = "geeksforgeeks";
    cout << firstRepeating(str);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to find the first
// repeated character in a string
import java.util.*;

class Main
{
    // This function prints the first repeated
    // character in str[]
    static char firstRepeating(char str[])
    {
        // Creates an empty hashset
        HashSet<Character> h = new HashSet<>();

        // Traverse the input array from left to right
        for (int i=0; i<=str.length-1; i++)
        {
            char c = str[i];

            // If element is already in hash set, update x
            // and then break
            if (h.contains(c))
                return c;

            else // Else add element to hash set
                h.add(c);
        }

        return '\0';
    }

    // Driver method to test above method
    public static void main (String[] args)
    {
        String str = "geeksforgeeks";
        char[] arr = str.toCharArray();
        System.out.println(firstRepeating(arr));
    }
}
{% endhighlight %}
{% highlight python %}
# Python program to find the first
# repeated character in a string
def firstRepeatedChar(str):

    h = {}  # Create empty hash

    # Traverse each characters in string
    # in lower case order
    for ch in str:

        # If character is already present
        # in hash, return char
        if ch in h:
            return ch;

        # Add ch to hash
        else:
            h[ch] = 0

    return '\0'


# Driver code
print(firstRepeatedChar("geeksforgeeks"))
{% endhighlight %}
{% highlight cpp %}
e
{% endhighlight %}
* Further Optimization : Size of alphabet is typically small and fixed. In case of ASCII, size is 256. So we can create a fixed size array and use character ASCII values as index.
* Similar Problem: finding first non-repeated character in a string.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

