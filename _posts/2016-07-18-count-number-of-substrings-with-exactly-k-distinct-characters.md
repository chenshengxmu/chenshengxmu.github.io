---
layout: post
title: Count number of substrings with exactly k distinct characters
---
* Given a string of lowercase alphabets, count all possible substrings (not necessarily distinct) that has exactly k distinct characters. Examples:
{% highlight cpp %}
Input: abc, k = 2
Output: 2
Possible substrings are {"ab", "bc"}

Input: aba, k = 2
Output: 3
Possible substrings are {"ab", "ba", "aba"}

Input: aa, k = 1
Output: 3
Possible substrings are {"a", "a", "aa"}
{% endhighlight %}
* Method 1 (Brute Force)
* If the length of string is n, then there can be n*(n+1)/2 possible substrings. A simple way is to generate all the substring and check each one whether it has exactly k unique characters or not. If we apply this brute force, it would take O(n*n) to generate all substrings and O(n) to do a check on each one. Thus overall it would go O(n*n*n).
* Method 2
* The problem can be solved in O(n*n). Idea is to maintain a hash table while generating substring and checking the number of unique characters using that hash table. The implementation below assume that the input string contains only characters from ‘a’ to ‘z’.
* Implementation
{% highlight cpp %}
// C++ program to count number of substrings with
// exactly k distinct characters in a given string
#include<bits/stdc++.h>
using namespace std;

// Function to count number of substrings
// with exactly k unique characters
int countkDist(string str, int k)
{
    int n = str.length();

    // Initialize result
    int res = 0;

    // To store count of characters from 'a' to 'z'
    int cnt[26];

    // Consider all substrings beginning with
    // str[i]
    for (int i = 0; i < n; i++)
    {
        int dist_count = 0;

        // Initializing array with 0
        memset(cnt, 0, sizeof(cnt));

        // Consider all substrings between str[i..j]
        for (int j=i; j<n; j++)
        {
            // If this is a new character for this
            // substring, increment dist_count.
            if (cnt[str[j] - 'a'] == 0)
                dist_count++;

            // Increment count of current character
            cnt[str[j] - 'a']++;

            // If distinct character count becomes k,
            // then increment result.
            if (dist_count == k)
                res++;
            if(dist_count > k) break;
        }
    }

    return res;
}

// Driver Program
int main()
{
    string str = "abcbaa";
    int k = 3;
    cout << "Total substrings with exactly "
         << k <<" distinct characters :"
         << countkDist(str, k) << endl;
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to CountKSubStr number of substrings
// with exactly distinct characters in a given string
import java.util.Arrays;

public class CountKSubStr
{
    // Function to count number of substrings
    // with exactly k unique characters
    int countkDist(String str, int k)
    {
        // Initialize result
        int res = 0;

        int n = str.length();

        // To store count of characters from 'a' to 'z'
        int cnt[] = new int[26];

        // Consider all substrings beginning with
        // str[i]
        for (int i = 0; i < n; i++)
        {
            int dist_count = 0;

            // Initializing count array with 0
            Arrays.fill(cnt, 0);

            // Consider all substrings between str[i..j]
            for (int j=i; j<n; j++)
            {
                // If this is a new character for this
                // substring, increment dist_count.
                if (cnt[str.charAt(j) - 'a'] == 0)
                    dist_count++;

                // Increment count of current character
                cnt[str.charAt(j) - 'a']++;

                // If distinct character count becomes k,
                // then increment result.
                if (dist_count == k)
                    res++;
            }
        }

        return res;
    }

    // Driver Program
    public static void main(String[] args)
    {
        CountKSubStr ob = new CountKSubStr();
        String ch = "abcbaa";
        int k = 3;
        System.out.println("Total substrings with exactly " +
                           k +    " distinct characters : "
                           + ob.countkDist(ch, k));
    }
}
{% endhighlight %}
{% highlight cpp %}
Total substrings with exactly 3 distinct characters : 8
{% endhighlight %}
* Time Complexity : O(n*n)
* Exercise (Further Optimization): The above code resets count array “cnt[]” in every iteration of outer loop. This can be very costly for large alphabet size. Can we modify the above program such that cnt[] is not reset every time?
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

