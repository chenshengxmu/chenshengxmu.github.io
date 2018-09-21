---
layout: post
title: Count of 'GFG' Subsequences in the given string
---
* Given a string of length n of capital letters. The task is to find the count of ‘GFG’ subsequence in the given string.
* Examples:
{% highlight cpp %}
Input : str[] = "GFGFG"
Output : 4
GFGFG, GFGFG, GFGFG, GFGFG

Input : str[] = "ABCFGFPG"
Output : 1
{% endhighlight %}
* To find the number of “GFG” subsequences in the given string, observe for each ‘F’ if we know number of ‘G’ before and after it. Then the number of “GFG” subsequence for that ‘F’ is equal to product of number of ‘G’ before and after that ‘F’. So, the idea is to maintain an array, arr[], where arr[i] store number of ‘G’ before index i, if ith character of the string is ‘F’ and number of ‘F’ before index i, if the ith character is ‘G’. Also, we will calculate and store the number of “GFG” subsequence in result whenever we encounter ‘G’.
* Below is the implementation of this approach:
{% highlight cpp %}
// CPP Program to find the "GFG" subsequence in
// the given string
#include <bits/stdc++.h>
using namespace std;
#define MAX 100

// Print the count of "GFG" subsequence in the string
void countSubsequence(char s[], int n)
{
    int arr[MAX] = { 0 };
    int cntG = 0, cntF = 0, result = 0;

    // Traversing the given string
    for (int i = 0; i < n; i++) {
        switch (s[i]) {

        // If the character is 'G', increment
        // the count of 'G', increase the result
        // and update the array.
        case 'G':
            arr[i] = cntF;
            result += arr[i];
            cntG++;
            break;

        // If the character is 'F', increment
        // the count of 'F' and update the array.
        case 'F':
            arr[i] = cntG;
            cntF += arr[i];
            break;

        // Ignore other character.
        default:
            continue;
        }
    }

    cout << result << endl;
}

// Driven Program
int main()
{
    char s[] = "GFGFG";
    int n = strlen(s);
    countSubsequence(s, n);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java Program to find the "GFG" subsequence
// in the given string

public class GFG {

    static int max = 100;
        
    // Print the count of "GFG" subsequence
    // in the string
    static void countSubsequence(String s, int n)
    {
        int [] arr = new int[max];
        int cntG = 0, cntF = 0, result = 0;
    
        // Traversing the given string
        for (int i = 0; i < n; i++) {
            switch (s.charAt(i)) {
    
            // If the character is 'G', 
            // increment the count of 'G',
            // increase the result and 
            // update the array.
            case 'G':
                arr[i] = cntF;
                result += arr[i];
                cntG++;
                break;
    
            // If the character is 'F', 
            // increment the count of 'F'
            // and update the array.
            case 'F':
                arr[i] = cntG;
                cntF += arr[i];
                break;
    
            // Ignore other character.
            default:
                continue;
            }
        }
    
        System.out.println(result);
    }
    
    // Driver code    
    public static void main(String args[]) {
        String s= "GFGFG";
        int n = s.length();
        countSubsequence(s, n);
    }
}

// This code is contributed by Sam007
{% endhighlight %}
{% highlight cpp %}
4
{% endhighlight %}
* Time Complexity : O(n)
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

