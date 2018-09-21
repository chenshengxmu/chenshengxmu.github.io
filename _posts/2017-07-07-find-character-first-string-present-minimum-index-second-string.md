---
layout: post
title: Find the character in first string that is present at minimum index in second string
---
* Given a string str and another string patt. Find the character in patt that is present at the minimum index in str. If no character of patt is present in str then print ‘No character present’.
* Examples:
{% highlight cpp %}
Input : str = "geeksforgeeks"
        patt = "set"
Output : e
Both e and s of patt are present in str,
but e is present at minimum index, which is 1.

Input : str = "adcffaet"
        patt = "onkl"
Output : No character present
{% endhighlight %}
* Source: OLA Interview Experience | Set 12.
* Naive Approach: Using two lopp, find the first index of each character of patt in str. Print the character having the minimum index. If no character of patt is present in str then print “No character present”.
{% highlight cpp %}
// C++ implementation to find the character in 
// first string that is present at minimum index
// in second string
#include <bits/stdc++.h>
using namespace std;

// function to find the minimum index character
void printMinIndexChar(string str, string patt)
{
    // to store the index of character having
    // minimum index
    int minIndex = INT_MAX;

    // lengths of the two strings
    int m = str.size();
    int n = patt.size();

    // traverse 'patt'
    for (int i = 0; i < n; i++) {

        // for each character of 'patt' traverse 'str'
        for (int j = 0; j < m; j++) {

            // if patt[i] is found in 'str', check if
            // it has the minimum index or not. If yes, 
            // then update 'minIndex' and break
            if (patt[i] == str[j] && j < minIndex) {
                minIndex = j;
                break;
            }
        }
    }

    // print the minimum index character
    if (minIndex != INT_MAX)
        cout << "Minimum Index Character = "
             << str[minIndex];

    // if no character of 'patt' is present in 'str'
    else
        cout << "No character present";
}

// Driver program to test above
int main()
{
    string str = "geeksforgeeks";
    string patt = "set";
    printMinIndexChar(str, patt);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java implementation to find the character in 
// first string that is present at minimum index
// in second string

public class GFG 
{
    // method to find the minimum index character
    static void printMinIndexChar(String str, String patt)
    {
        // to store the index of character having
        // minimum index
        int minIndex = Integer.MAX_VALUE;
     
        // lengths of the two strings
        int m = str.length();
        int n = patt.length();
     
        // traverse 'patt'
        for (int i = 0; i < n; i++) {
     
            // for each character of 'patt' traverse 'str'
            for (int j = 0; j < m; j++) {
     
                // if patt.charAt(i)is found in 'str', check if
                // it has the minimum index or not. If yes, 
                // then update 'minIndex' and break
                if (patt.charAt(i)== str.charAt(j) && j < minIndex) {
                    minIndex = j;
                    break;
                }
            }
        }
     
        // print the minimum index character
        if (minIndex != Integer.MAX_VALUE)
            System.out.println("Minimum Index Character = " +
                                str.charAt(minIndex));
     
        // if no character of 'patt' is present in 'str'
        else
            System.out.println("No character present");
    }
    
    // Driver Method
    public static void main(String[] args)
    {
        String str = "geeksforgeeks";
        String patt = "set";
        printMinIndexChar(str, patt);
    }
}
{% endhighlight %}
{% highlight cpp %}
Minimum Index Character = e
{% endhighlight %}
* Time Complexity: O(mn), where m and n are the lengths of the two strings. Auxiliary Space: O(1)
*  
* Method 2 Efficient Approach(Hashing): Create a hash table with (key, value) tuple represented as (character, index) tuple. Store the first index of each character of str in the hash table. Now, for each character of patt check if it is present in the hash table or not. If present then get its index from the hash table and update minIndex(minimum index encountered so far). For no matching character print “No character present”. Hash table is implemented using unordered_set in C++.
{% highlight cpp %}
// C++ implementation to find the character in first 
// string that is present at minimum index in second
// string
#include <bits/stdc++.h>
using namespace std;

// function to find the minimum index character
void printMinIndexChar(string str, string patt)
{
    // unordered_map 'um' implemented as hash table
    unordered_map<char, int> um;

    // to store the index of charcter having
    // minimum index
    int minIndex = INT_MAX;

    // lengths of the two strings
    int m = str.size();
    int n = patt.size();-

    // store the first index of each character of 'str'
    for (int i = 0; i < m; i++)
        if (um.find(str[i]) == um.end())
            um[str[i]] = i;

    // traverse the string 'patt'
    for (int i = 0; i < n; i++)

        // if patt[i] is found in 'um', check if 
        // it has the minimum index or not accordingly 
        // update 'minIndex'
        if (um.find(patt[i]) != um.end() && 
            um[patt[i]] < minIndex)
            minIndex = um[patt[i]];

    // print the minimum index character
    if (minIndex != INT_MAX)
        cout << "Minimum Index Character = "
             << str[minIndex];

    // if no character of 'patt' is present in 'str'
    else
        cout << "No character present";
}

// Driver program to test above
int main()
{
    string str = "geeksforgeeks";
    string patt = "set";
    printMinIndexChar(str, patt);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java implementation to find the character in 
// first string that is present at minimum index
// in second string

import java.util.HashMap;

public class GFG 
{
    // method to find the minimum index character
    static void printMinIndexChar(String str, String patt)
    {
        // map to store the first index of each character of 'str'
        HashMap<Character, Integer> hm = new HashMap<>();
        
        // to store the index of character having
        // minimum index
        int minIndex = Integer.MAX_VALUE;
     
        // lengths of the two strings
        int m = str.length();
        int n = patt.length();
     
        // store the first index of each character of 'str'
        for (int i = 0; i < m; i++)
            if(!hm.containsKey(str.charAt(i)))
                hm.put(str.charAt(i),i);
     
        // traverse the string 'patt'
        for (int i = 0; i < n; i++)
            // if patt[i] is found in 'um', check if 
            // it has the minimum index or not accordingly 
            // update 'minIndex'
            if (hm.containsKey(patt.charAt(i)) && 
                hm.get(patt.charAt(i)) < minIndex)
                minIndex = hm.get(patt.charAt(i));
     
        // print the minimum index character
        if (minIndex != Integer.MAX_VALUE)
            System.out.println("Minimum Index Character = " +
                                str.charAt(minIndex));
     
        // if no character of 'patt' is present in 'str'
        else
            System.out.println("No character present");
    }
    
    // Driver Method
    public static void main(String[] args)
    {
        String str = "geeksforgeeks";
        String patt = "set";
        printMinIndexChar(str, patt);
    }
}
{% endhighlight %}
{% highlight cpp %}
Minimum Index Character = e
{% endhighlight %}
* Time Complexity: O(m + n), where m and n are the lengths of the two strings. Auxiliary Space: O(d), where d is the size of hash table, which is the count of distinct characters in str.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

