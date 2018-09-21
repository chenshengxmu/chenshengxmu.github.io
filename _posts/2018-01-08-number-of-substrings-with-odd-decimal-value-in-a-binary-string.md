---
layout: post
title: Number of substrings with odd decimal value in a binary string
---
* Given a binary string containing only 0’s and 1’s. Write a program to find number of sub-strings of this string whose decimal representation is odd.
* Examples :
{% highlight cpp %}
Input : 101
Output : 3
Explanation : Substrigs with odd decimal 
              representation are:
              {1, 1, 101}

Input : 1101
Output : 6
Explanation : Substrigs with odd decimal 
              representation are:
              {1, 1, 1, 11, 101, 1011}
{% endhighlight %}
* Brute force Approach: The simplest approach to solve above problem is to generate all possible substrings of the given string and convert them to decimal and check if the decimal representation is odd or not. You may refer to this article for binary to decimal conversion.
* Time Complexity: O(n*n)
* Efficient approach: An efficient approach is to observe that if the last digit of a binary number is 1 then it is odd otherwise it is even. So our problem now is reduced to check all substrings with value at last index as 1. We can easily solve this problem in single traversal by traversing from the end. If the value of i-th index in the string is 1 then there is i odd substrings before this index. But this also includes strings with leading zero’s. So to handle this we can take an auxiliary array to keep count of number of 1’s before ith index. We count only pairs of 1s.
* Below is the implementation of this approach:
{% highlight cpp %}
// CPP program to count substrings
// with odd decimal value
#include<iostream>
using namespace std;

// function to count number of substrings 
// with odd decimal representation
int countSubstr(string s)
{   
    int n = s.length();
    
    // auxiliary array to store count 
    // of 1's before ith index
    int auxArr[n] = {0};
    
    if (s[0] == '1')
        auxArr[0] = 1;
    
    // store  count of 1's before 
    // i-th  index
    for (int i=1; i<n; i++)
    {
        if (s[i] == '1')
            auxArr[i] = auxArr[i-1]+1;
        else
            auxArr[i] = auxArr[i-1];
    }
    
    // variable to store answer
    int count = 0;
    
    // traverse the string reversely to 
    // calculate number of odd substrings 
    // before i-th index
    for (int i=n-1; i>=0; i--)    
        if (s[i] == '1')
            count += auxArr[i];    
    
    return count;
}

// Driver code
int main()
{
    string s = "1101";    
    cout << countSubstr(s);    
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to count substrings
// with odd decimal value
import java.io.*;
import java.util.*;

class GFG {
   
// function to count number of substrings 
// with odd decimal representation
static int countSubstr(String s)
{ 
    int n = s.length();
    
    // auxiliary array to store count 
    // of 1's before ith index
    int[] auxArr=new int[n];
    
    if (s.charAt(0) == '1')
        auxArr[0] = 1;
    
    // store count of 1's before 
    // i-th index
    for (int i=1; i<n; i++)
    {
        if (s.charAt(i) == '1')
            auxArr[i] = auxArr[i-1]+1;
        else
            auxArr[i] = auxArr[i-1];
    }
    
    // variable to store answer
    int count = 0;
    
    // traverse the string reversely to 
    // calculate number of odd substrings 
    // before i-th index
    for (int i=n-1; i>=0; i--) 
        if (s.charAt(i) == '1')
            count += auxArr[i]; 
    
    return count;
}

public static void main (String[] args) {
     String s = "1101"; 
    System.out.println(countSubstr(s));
    
    }
}

// This code is contributed by Gitanjali.
{% endhighlight %}
{% highlight python %}
# python program to count substrings
# with odd decimal value
import math 

# function to count number of substrings 
# with odd decimal representation
def countSubstr( s):

    n = len(s)
    
    # auxiliary array to store count 
    # of 1's before ith index
    auxArr= [0 for i in range(n)]
    
    if (s[0] == '1'):
        auxArr[0] = 1
    
    # store count of 1's before 
    # i-th index
    for i in range(0,n):
        
      if (s[i] == '1'):
            auxArr[i] = auxArr[i-1]+1
      else:
            auxArr[i] = auxArr[i-1]
    
    
    # variable to store answer
    count = 0
    
    # traverse the string reversely to 
    # calculate number of odd substrings 
    # before i-th index
    for i in range(n-1,-1,-1): 
        if (s[i] == '1'):
            count += auxArr[i] 
    
    return count
# Driver method
s = "1101"
print (countSubstr(s))

# This code is contributed by Gitanjali.
{% endhighlight %}
{% highlight cpp %}
6
{% endhighlight %}
* Time Complexity: O(n) Auxiliary Space: O(n)
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

