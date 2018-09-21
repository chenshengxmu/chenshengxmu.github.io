---
layout: post
title: Smallest window that contains all characters of string itself
---
* Given a string, find the smallest window length with all distinct characters of the given string. For eg. str = “aabcbcdbca”, then the result would be 4 as of the smallest window will be “dbca” .
* Examples:
{% highlight cpp %}
Input  : aabcbcdbca
Output : dcba
Explanation : 
dbca of length 4 is the smallest 
window with highest number of distinct
characters.         

Input : aaab
Output : ab
Explanation : 
ab of length 2 is the smallest window 
with highest number of distinct characters.
{% endhighlight %}
* Above problem states that we have to find the smallest window that contains all the distinct characters of the given string even if the smallest string contains repeating elements.
* For example, in “aabcbcdb”, the smallest string that contains all the characters is “abcbcd”. This problem reduces to Find the smallest window in a string containing all characters of another string.
* In that problem we find the smallest window that contains all the characters of given pattern.
* 1- Count all distinct characters in given string.
* 2- Now follow the algorithm discussed in below post. https://www.geeksforgeeks.org/find-the-smallest-window-in-a-string-containing-all-characters-of-another-string/ We basically maintain a window of characters. Whenever the window contains all characters of given string, we shrink the window from left side to remove extra characters and then compare its length with smallest window fount so far.
{% highlight cpp %}
// C++ program to find the smallest window containing
// all characters of a pattern.
#include<bits/stdc++.h>
using namespace std;

const int MAX_CHARS = 256;

// Function to find smallest window containing
// all distinct characters
string findSubString(string str)
{
    int n = str.length();

    // Count all distinct characters.
    int dist_count = 0;
    bool visited[MAX_CHARS] = {false};
    for (int i=0; i<n; i++)
    {
        if (visited[str[i]] == false)
        {
            visited[str[i]] = true;
            dist_count++;
        }
    }

    // Now follow the algorithm discussed in below
    // post. We basically maintain a window of characters
    // that contains all characters of given string.
    // https://www.geeksforgeeks.org/find-the-smallest-window-in-a-string-containing-all-characters-of-another-string/
    int start = 0, start_index = -1, min_len = INT_MAX;

    int count = 0;
    int curr_count[MAX_CHARS] = {0};
    for (int j=0; j<n; j++)
    {
        // Count occurrence of characters of string
        curr_count[str[j]]++;

        // If any distinct character matched,
        // then increment count
        if (curr_count[str[j]] == 1 )
            count++;

        // if all the characters are matched
        if (count == dist_count)
        {
            // Try to minimize the window i.e., check if
            // any character is occurring more no. of times
            // than its occurrence in pattern, if yes
            // then remove it from starting and also remove
            // the useless characters.
            while (curr_count[str[start]] > 1)
            {
                if (curr_count[str[start]] > 1)
                    curr_count[str[start]]--;
                start++;
            }

            // Update window size
            int len_window = j - start + 1;
            if (min_len > len_window)
            {
                min_len = len_window;
                start_index = start;
            }
        }
    }

    // Return substring starting from start_index
    // and length min_len
    return str.substr(start_index, min_len);
}

// Driver code
int main()
{
    string str = "aabcbcdbca";
    cout << "Smallest window containing all distinct"
            " characters is " << findSubString(str);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to find the smallest window containing
// all characters of a pattern.
import java.util.Arrays;
public class GFG {

    static final int MAX_CHARS = 256;
     
    // Function to find smallest window containing
    // all distinct characters
    static String findSubString(String str)
    {
        int n = str.length();
     
        // Count all distinct characters.
        int dist_count = 0;
        
        boolean[] visited = new boolean[MAX_CHARS];
        Arrays.fill(visited, false);
        for (int i=0; i<n; i++)
        {
            if (visited[str.charAt(i)] == false)
            {
                visited[str.charAt(i)] = true;
                dist_count++;
            }
        }
     
        // Now follow the algorithm discussed in below
        // post. We basically maintain a window of characters
        // that contains all characters of given string.
        // https://www.geeksforgeeks.org/find-the-smallest-window-in-a-string-containing-all-characters-of-another-string/ 
        int start = 0, start_index = -1;
        int min_len = Integer.MAX_VALUE;
     
        int count = 0;
        int[] curr_count =  new int[MAX_CHARS];
        for (int j=0; j<n; j++)
        {
            // Count occurrence of characters of string
            curr_count[str.charAt(j)]++;
     
            // If any distinct character matched,
            // then increment count
            if (curr_count[str.charAt(j)] == 1 )
                count++;
     
            // if all the characters are matched
            if (count == dist_count)
            {
                // Try to minimize the window i.e., check if
                // any character is occurring more no. of times
                // than its occurrence in pattern, if yes
                // then remove it from starting and also remove
                // the useless characters.
                while (curr_count[str.charAt(start)] > 1)
                {
                    if (curr_count[str.charAt(start)] > 1)
                        curr_count[str.charAt(start)]--;
                    start++;
                }
                
                // Update window size
                int len_window = j - start + 1;
                if (min_len > len_window)
                {
                    min_len = len_window;
                    start_index = start;
                }
            }
        }
        // Return substring starting from start_index
        // and length min_len
        return str.substring(start_index, start_index+min_len);
    }
     
    // Driver code
    public static void main(String args[])
    {
        String str = "aabcbcdbca";
        System.out.println("Smallest window containing all distinct"
               + " characters is " + findSubString(str));
    }
}
// This code is contributed by Sumit Ghosh
{% endhighlight %}
{% highlight cpp %}
Smallest window containing all distinct characters is dbca
{% endhighlight %}
* Related Article : Length of the smallest sub-string consisting of maximum distinct characters
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

