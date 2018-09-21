---
layout: post
title: Given two strings, find if first string is a subsequence of second
---
* Given two strings str1 and str2, find if str1 is a subsequence of str2. A subsequence is a sequence that can be derived from another sequence by deleting some elements without changing the order of the remaining elements (source: wiki). Expected time complexity is linear.
* Examples :
{% highlight cpp %}
Input: str1 = "AXY", str2 = "ADXCPY"
Output: True (str1 is a subsequence of str2)

Input: str1 = "AXY", str2 = "YADXCP"
Output: False (str1 is not a subsequence of str2)

Input: str1 = "gksrek", str2 = "geeksforgeeks"
Output: True (str1 is a subsequence of str2)
{% endhighlight %}
* The idea is simple, we traverse both strings from one side to other side (say from rightmost character to leftmost). If we find a matching character, we move ahead in both strings. Otherwise we move ahead only in str2.
* Following is Recursive Implementationof the above idea.
{% highlight c %}
// Recursive C++ program to check if a string is subsequence of another string
#include<iostream>
#include<cstring>
using namespace std;

// Returns true if str1[] is a subsequence of str2[]. m is
// length of str1 and n is length of str2
bool isSubSequence(char str1[], char str2[], int m, int n)
{
    // Base Cases
    if (m == 0) return true;
    if (n == 0) return false;

    // If last characters of two strings are matching
    if (str1[m-1] == str2[n-1])
        return isSubSequence(str1, str2, m-1, n-1);

    // If last characters are not matching
    return isSubSequence(str1, str2, m, n-1);
}

// Driver program to test methods of graph class
int main()
{
    char str1[] = "gksrek";
    char str2[] = "geeksforgeeks";
    int m = strlen(str1);
    int n = strlen(str2);
    isSubSequence(str1, str2, m, n)? cout << "Yes ":
                                     cout << "No";
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Recursive Java program to check if a string
// is subsequence of another string
import java.io.*;

class SubSequence
{
    // Returns true if str1[] is a subsequence of str2[]
    // m is length of str1 and n is length of str2
    static boolean isSubSequence(String str1, String str2, int m, int n)
    {
        // Base Cases
        if (m == 0) 
            return true;
        if (n == 0) 
            return false;
            
        // If last characters of two strings are matching
        if (str1.charAt(m-1) == str2.charAt(n-1))
            return isSubSequence(str1, str2, m-1, n-1);

        // If last characters are not matching
        return isSubSequence(str1, str2, m, n-1);
    }
    
    // Driver program
    public static void main (String[] args) 
    {
        String str1 = "gksrek";
        String str2 = "geeksforgeeks";
        int m = str1.length();
        int n = str2.length();
        boolean res = isSubSequence(str1, str2, m, n);
        if(res)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

// Contributed by Pramod Kumar
{% endhighlight %}
{% highlight python %}
# Recursive Python program to check if a string is subsequence
# of another string

# Returns true if str1[] is a subsequence of str2[]. m is
# length of str1 and n is length of str2
def isSubSequence(string1, string2, m, n):
    # Base Cases
    if m == 0:    return True
    if n == 0:    return False

    # If last characters of two strings are matching
    if string1[m-1] == string2[n-1]:
        return isSubSequence(string1, string2, m-1, n-1)

    # If last characters are not matching
    return isSubSequence(string1, string2, m, n-1)

# Driver program to test the above function
string1 = "gksrek"
string2 = "geeksforgeeks"
m = len(string1)
n = len(string2)
if isSubSequence(string1, string2, m, n):
    print "Yes"
else:
    print "No"

# This code is contributed by BHAVYA JAIN
{% endhighlight %}
{% highlight cpp %}
Yes
{% endhighlight %}
* Following is the Iterative Implementation:
{% highlight c %}
// Iterative C++ program to check if a string is subsequence of another string
#include<iostream>
#include<cstring>
using namespace std;

// Returns true if str1[] is a subsequence of str2[]. m is
// length of str1 and n is length of str2
bool isSubSequence(char str1[], char str2[], int m, int n)
{
   int j = 0; // For index of str1 (or subsequence

   // Traverse str2 and str1, and compare current character 
   // of str2 with first unmatched char of str1, if matched 
   // then move ahead in str1
   for (int i=0; i<n&&j<m; i++)
       if (str1[j] == str2[i])
         j++;

   // If all characters of str1 were found in str2
   return (j==m);
}

// Driver program to test methods of graph class
int main()
{
    char str1[] = "gksrek";
    char str2[] = "geeksforgeeks";
    int m = strlen(str1);
    int n = strlen(str2);
    isSubSequence(str1, str2, m, n)? cout << "Yes ":
                                     cout << "No";
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Iterative Java program to check if a string 
// is subsequence of another string
import java.io.*;

class GFG {
    
    // Returns true if str1[] is a subsequence 
    // of str2[] m is length of str1 and n is
    // length of str2
    static boolean isSubSequence(String str1, 
                    String str2, int m, int n)
    {
        int j = 0;
        
        // Traverse str2 and str1, and compare 
        // current character of str2 with first
        // unmatched char of str1, if matched 
        // then move ahead in str1
        for (int i = 0; i < n && j < m; i++)
            if (str1.charAt(j) == str2.charAt(i))
                j++;

        // If all characters of str1 were found
        // in str2
        return (j == m); 
    }
    
    // Driver program to test methods of
    // graph class
    public static void main (String[] args) 
    {
        String str1 = "gksrek";
        String str2 = "geeksforgeeks";
        int m = str1.length();
        int n = str2.length();
        boolean res = isSubSequence(str1, str2, m, n);
        
        if(res)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

// This code is contributed by Pramod Kumar
{% endhighlight %}
{% highlight python %}
# Iterative Python program to check if a string is subsequence of another string

# Returns true if str1 is a subsequence of str2
# m is length of str1, n is length of str2
def isSubSequence(str1,str2,m,n):
    
    j = 0    # Index of str1
    i = 0    # Index of str2
    
    # Traverse both str1 and str2
    # Compare current character of str2 with 
    # first unmatched character of str1
    # If matched, then move ahead in str1
    
    while j<m and i<n:
        if str1[j] == str2[i]:    
            j = j+1    
        i = i + 1
        
    # If all characters of str1 matched, then j is equal to m
    return j==m
    
# Driver Program

str1 = "gksrek"
str2 = "geeksforgeeks"
m = len(str1)
n = len(str2)

print "Yes" if isSubSequence(str1,str2,m,n) else "No"

# Contributed by Harshit Agrawal
{% endhighlight %}
{% highlight cpp %}
Yes
{% endhighlight %}
* Time Complexity of both implementations above is O(n) where n is the length of str2.
* This article is contributed by Sachin Gupta. Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above

