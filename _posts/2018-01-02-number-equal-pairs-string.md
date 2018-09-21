---
layout: post
title: Count number of equal pairs in a string
---
* Given a string s, find the number of pairs of characters that are same. Pairs (s[i], s[j]), (s[j], s[i]), (s[i], s[i]), (s[j], s[j]) should be considered different.
* Examples :
{% highlight cpp %}
Input: air
Output: 3
Explanation :
3 pairs that are equal are (a, a), (i, i) and (r, r)

Input : geeksforgeeks
Output : 31
{% endhighlight %}
* The naive approach will be you to run two nested for loops and find out all pairs and keep a count of all pairs. But this is not efficient enough for longer length of strings.
* For an efficient approach, we need to count the number of equal pairs in linear time. Since pairs (x, y) and pairs (y, x) are considered different. We need to use a hash table to store the count of all occurences of a character.So we know if a character occurs twice, then it will have 4 pairs – (i, i), (j, j), (i, j), (j, i). So using a hash function, store the occurrence of each character, then for each character the number of pairs will be occurrence^2. Hash table will be 256 in length as we have 256 characters.
* Below is the implementation of the above approach :
{% highlight cpp %}
// CPP program to count the number of pairs
#include <bits/stdc++.h>
using namespace std;
#define MAX 256

// Function to count the number of equal pairs
int countPairs(string s)
{
    // Hash table
    int cnt[MAX] = { 0 };

    // Traverse the string and count occurrence
    for (int i = 0; i < s.length(); i++)
        cnt[s[i]]++;

    // Stores the answer
    int ans = 0;

    // Traverse and check the occurrence of every character
    for (int i = 0; i < MAX; i++)
        ans += cnt[i] * cnt[i];

    return ans;
}

// Driver Code
int main()
{
    string s = "geeksforgeeks";
    cout << countPairs(s);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to count the number of pairs
import java.io.*;

class GFG {

    static int MAX = 256;
    
    // Function to count the number of equal pairs
    static int countPairs(String s)
    {
        // Hash table
        int cnt[] = new int[MAX];
    
        // Traverse the string and count occurrence
        for (int i = 0; i < s.length(); i++)
            cnt[s.charAt(i)]++;
    
        // Stores the answer
        int ans = 0;
    
        // Traverse and check the occurrence
        // of every character
        for (int i = 0; i < MAX; i++)
            ans += cnt[i] * cnt[i];
    
        return ans;
    }
    
    // Driver Code
    public static void main (String[] args)
    {
        String s = "geeksforgeeks";
        System.out.println(countPairs(s));
    }
}

// This code is contributed by vt_m
{% endhighlight %}
{% highlight cpp %}
31
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

