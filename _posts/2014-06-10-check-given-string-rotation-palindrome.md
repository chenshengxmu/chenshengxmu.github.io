---
layout: post
title: Check if a given string is a rotation of a palindrome
---
* Given a string, check if it is a rotation of a palindrome. For example your function should return true for “aab” as it is a rotation of “aba”.
* Examples:
{% highlight cpp %}
Input:  str = "aaaad"
Output: 1  
// "aaaad" is a rotation of a palindrome "aadaa"

Input:  str = "abcd"
Output: 0
// "abcd" is not a rotation of any palindrome.
{% endhighlight %}
* A Simple Solution is to take the input string, try every possible rotation of it and return true if a rotation is a palindrome. If no rotation is palindrome, then return false. Following is C++ implementation of this approach.
{% highlight cpp %}
#include<iostream>
#include<string>
using namespace std;

// A utility function to check if a string str is palindrome
bool isPalindrome(string str)
{
    // Start from leftmost and rightmost corners of str
    int l = 0;
    int h = str.length() - 1;

    // Keep comparing characters while they are same
    while (h > l)
        if (str[l++] != str[h--])
            return false;

    // If we reach here, then all characters were matching
    return true;
}

// Function to check if a given string is a rotation of a
// palindrome.
bool isRotationOfPalindrome(string str)
{
   // If string iteself is palindrome
   if (isPalindrome(str))
         return true;

   // Now try all rotations one by one
   int n = str.length();
   for (int i = 0; i < n-1; i++)
   {
       string str1 = str.substr(i+1, n-i-1);
       string str2 = str.substr(0, i+1);

       // Check if this rotation is palindrome
       if (isPalindrome(str1.append(str2)))
          return true;
   }
   return false;
}

// Driver program to test above function
int main()
{
    cout << isRotationOfPalindrome("aab") << endl;
    cout << isRotationOfPalindrome("abcde") << endl;
    cout << isRotationOfPalindrome("aaaad") << endl;
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to check if a given string
// is a rotation of a palindrome
import java.io.*;

class Palindrome
{
	// A utility function to check if a string str is palindrome
	static boolean isPalindrome(String str)
	{
		// Start from leftmost and rightmost corners of str
		int l = 0;
		int h = str.length() - 1;

		// Keep comparing characters while they are same
		while (h > l)
			if (str.charAt(l++) != str.charAt(h--))
				return false;

		// If we reach here, then all characters were matching
		return true;
	}
	
	// Function to check if a given string is a rotation of a
	// palindrome
	static boolean isRotationOfPalindrome(String str)
	{
		// If string iteself is palindrome
		if (isPalindrome(str))
			return true;

		// Now try all rotations one by one
		int n = str.length();
		for (int i = 0; i < n-1; i++)
		{
			String str1 = str.substring(i+1);
			String str2 = str.substring(0, i+1);

			// Check if this rotation is palindrome
			if (isPalindrome(str1 + str2))
				return true;
		}
		return false;
	}
	
	// driver program
	public static void main (String[] args) 
	{
		System.out.println((isRotationOfPalindrome("aab")) ? 1 : 0);
		System.out.println((isRotationOfPalindrome("abcde")) ? 1 : 0);
		System.out.println((isRotationOfPalindrome("aaaad")) ? 1 : 0);
	}
}

// Contributed by Pramod Kumar
{% endhighlight %}
{% highlight python %}
# Python program to check if a given string is a rotation
# of a palindrome

# A utility function to check if a string str is palindrome
def isPalindrome(string):

    # Start from leftmost and rightmost corners of str
    l = 0
    h = len(string) - 1

    # Keep comparing characters while they are same
    while h > l:
        l+=1
        h-=1
        if string[l-1] != string[h+1]:
            return False

    # If we reach here, then all characters were matching    
    return True

# Function to check if a given string is a rotation of a
# palindrome.
def isRotationOfPalindrome(string):

    # If string itself is palindrome
    if isPalindrome(string):
        return True

    # Now try all rotations one by one
    n = len(string)
    for i in xrange(n-1):
        string1 = string[i+1:n]
        string2 = string[0:i+1]

        # Check if this rotation is palindrome
        string1+=(string2)
        if isPalindrome(string1):
            return True

    return False

# Driver program
print "1" if isRotationOfPalindrome("aab") == True else "0"
print "1" if isRotationOfPalindrome("abcde") == True else "0"
print "1" if isRotationOfPalindrome("aaaad") == True else "0"

# This code is contributed by BHAVYA JAIN
{% endhighlight %}
{% highlight cpp %}
1
0
1
{% endhighlight %}
* Time Complexity: O(n2) Auxiliary Space: O(n) for storing rotations. Note that the above algorithm can be optimized to work in O(1) extra space as we can rotate a string in O(n) time and O(1) extra space.
* An Optimized Solution can work in O(n) time. The idea is similar to this post. Following are steps. 1) Let the given string be ‘str’ and length of string be ‘n’. Create a temporary string ‘temp’ which is of size 2n and contains str followed by str again. For example, let str be “aab”, temp would be “aabaab”. 2) Now the problem reduces to find a palindromic substring of length n in str. If there is palindromic substring of length n, then return true, else return false. We can find whether there is a palindromic substring of size n or not in O(n) time (See Longest palindromic substring)
* This article is contributed Abhay Rathi. Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above

