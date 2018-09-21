---
layout: post
title: Find i'th Index character in a binary string obtained after n iterations
---
* Given a decimal number m, convert it into a binary string and apply n iterations, in each iteration 0 becomes “01” and 1 becomes “10”. Find ith(based indexing) index character in the string after nth iteration.
* Examples :
{% highlight cpp %}
Input : m = 5, n = 2, i = 3
Output : 1

Input :m = 3, n = 3, i = 6
Output : 1
{% endhighlight %}
* 1. Change a decimal number into binary and store in string s. 2. Run loop n times in each iteration. Run another loop of string length s to convert 0 to “01” and 1 to “10” and store in another string s1. After completion of each iteration, assign string s1 to s. 3. At last Return the value of ith index in string s.
{% highlight cpp %}
// C++ Program to find ith character in 
// a binary string.
#include <bits/stdc++.h>
using namespace std;

// Function to store binary Representation
void binary_conversion(string &s, int m) {
  while (m) {
    int tmp = m % 2;
    s += tmp + '0';
    m = m / 2;
  }
  reverse(s.begin(), s.end());
}

// Function to find ith character
int find_character(int n, int m, int i) {

  string s;

  // Function to change decimal to binary
  binary_conversion(s, m);

  string s1 = "";
  for (int x = 0; x < n; x++) {
    for (int y = 0; y < s.length(); y++) {
      if (s[y] == '1') 
        s1 += "10";
      else 
        s1 += "01";      
    }

    // Assign s1 string in s string
    s = s1;
    s1 = "";
  }
  return s[i] - '0';
}

// Driver Function
int main() {
  int m = 5, n = 2, i = 8;
  cout << find_character(n, m, i);
  return 0;
}
{% endhighlight %}
{% highlight java %}
// Java Program to find ith 
// character in a binary String.
import java.io.*;
import java.util.Arrays;

class GFG
{
static String s = "";
static String ReverseString(String s)
{
    char[] arr = s.toCharArray();
    for(int i = 0;
            i < arr.length / 2; i++)
    {
        char temp = arr[i]; 
        arr[i] = arr[arr.length - i -1]; 
        arr[arr.length - i - 1] = temp; 
    }
    return new String(arr);
}

// Function to store
// binary Representation
static void binary_conversion(int m) 
{
    while (m != 0) 
    {
        int tmp = m % 2;
        s += Integer.toString(tmp);
        m = (int)(m / 2);
    }
    
    s = ReverseString(s);
}

// Function to find 
// ith character
static int find_character(int n, 
                          int m, 
                          int i) 
{     
    // Function to change
    // decimal to binary
    binary_conversion(m);

    String s1 = "";
    for (int x = 0; x < n; x++) 
    {
        for (int y = 0; 
                 y < s.length(); y++) 
        {
            if (s.charAt(y) == '1') 
            s1 += "10";
            else
            s1 += "01";     
        }
        
        // Assign s1 String 
        // in s String
        s = s1;
        s1 = "";
    }
    
    return s.charAt(i) - '0';
}

// Driver Code
public static void main(String args[])
{
    int m = 5, n = 2, i = 8;
    System.out.print(
               find_character(n, m, i));
}
}

// This code is contributed by 
// Manish Shaw(manishshaw1)
{% endhighlight %}
{% highlight cpp %}
1
{% endhighlight %}
* Refer Set-2 for an optimized solution.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

