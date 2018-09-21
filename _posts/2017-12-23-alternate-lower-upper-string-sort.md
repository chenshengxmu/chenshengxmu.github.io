---
layout: post
title: Alternate Lower Upper String Sort
---
* Given a string containing lowercase and uppercase letters.sort it in such a manner such that the uppercase and lowercase letter comes in an alternate manner but in sorted way.
* Examples:
{% highlight cpp %}
Input : bAwutndekWEdkd
Output :AbEdWddekkntuw
Explanation:
Here we can see that letter ‘A’, ’E’, ’W’ are sorted 
as well as letters “b, d, d, d, e, k, k, n, t, u, w” are sorted 
but both appears alternately in the string as far as possible.

Input :abbfDDhGFBvdFDGBNDasZVDFjkb
Output :BaBaDbDbDbDdDfFhFjFkGsGvNVZ
{% endhighlight %}
* 1) Count lower case characters in an array lCount[] 2) Count upper case characters in another array uCount[] 3) Modify string using lCount[] and uCount[]
{% highlight cpp %}
// C++ program for unusul string sorting
#include <bits/stdc++.h>
using namespace std;
#define MAX 26

// Function for alternate sorting of string
void alternateSort(string& s)
{
    int n = s.length();

    // Count occurrences of individual lower case and
    // upper case characters
    int lCount[MAX] = { 0 }, uCount[MAX] = { 0 };
    for (int i = 0; i < n; i++) {
        if (isupper(s[i]))
            uCount[s[i] - 'A']++;
        else
            lCount[s[i] - 'a']++;
    }

    // Traverse through count arrays and one by one
    // pick characters.  Below loop takes O(n) time
    // considering the MAX is constant.
    int i = 0, j = 0, k = 0;
    while (k < n) {
        while (i < MAX && uCount[i] == 0)
            i++;
        if (i < MAX) {
            s[k++] = 'A' + i;
            uCount[i]--;
        }

        while (j < MAX && lCount[j] == 0)
            j++;
        if (j < MAX) {
            s[k++] = 'a' + j;
            lCount[j]--;
        }
    }
}

// Driver code
int main()
{
    string str = "bAwutndekWEdkd";
    alternateSort(str);
    cout << str << "\n";
}
{% endhighlight %}
{% highlight java %}
// Java program for
// unusual string sorting
import java.util.*;
import java.lang.*;

public class GfG{

private final static int MAX = 100;

// Function for alternate
// sorting of string
public static String alternateSort(String s1)
{
    int n = s1.length();

    char[] s = s1.toCharArray();

    // Count occurrences of 
    // individual lower case and
    // upper case characters
    int[] lCount = new int[MAX];
    int[] uCount = new int[MAX];

    for (int i = 0; i < n; i++) {

        if (Character.isUpperCase(s[i]))
            uCount[s[i] - 'A']++;
        else
            lCount[s[i] - 'a']++;
    }

    // Traverse through count
    // arrays and one by one
    // pick characters. 
    // Below loop takes O(n) time
    // considering the MAX is constant.
    int i = 0, j = 0, k = 0;
    while (k < n) 
    {

        while (i < MAX && uCount[i] == 0)
                i++;

        if (i < MAX) {
                s[k++] = (char)('A' + i);
                uCount[i]--;
            }

        while (j < MAX && lCount[j] == 0)
                j++;

        if (j < MAX) {
                s[k++] = (char)('a' + j);
                lCount[j]--;
            }
        }
        
        return (new String(s));
    }
    
// Driver function 
public static void main(String argc[]){

    String str = "bAwutndekWEdkd";
    System.out.println(alternateSort(str));
}
    
}


// This code is contributed by Sagar Shukla
{% endhighlight %}
{% highlight cpp %}
AbEdWddekkntuw
{% endhighlight %}
* Time Complexity : O(n)
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

