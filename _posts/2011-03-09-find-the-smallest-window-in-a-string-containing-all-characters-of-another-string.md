---
layout: post
title: Find the smallest window in a string containing all characters of another string
---
* Given two strings string1 and string2, find the smallest substring in string1 containing all characters of string2 efficiently. For Example:
{% highlight cpp %}
Input :  string = "this is a test string"
         pattern = "tist"
Output :  Minimum window is "t stri"
Explanation: "t stri" contains all the characters
              of pattern.

Input :  string = "geeksforgeeks"
         pattern = "ork" 
Output :  Minimum window is "ksfor"
{% endhighlight %}
* Method 1 ( Brute force solution ) 1- Generate all substrings of string1 (“this is a test string”) 2- For each substring, check whether the substring contains all characters of string2 (“tist”) 3- Finally, print the smallest substring containing all characters of string2.
*   Method 2 ( Efficient Solution )
{% highlight cpp %}
1- First check if length of string is less than
   the length of given pattern, if yes
       then "no such window can exist ".
2- Store the occurrence of characters of given 
   pattern in a hash_pat[].
3- Start matching the characters of pattern with 
   the characters of string i.e. increment count 
   if a character matches
4- Check if (count == length of pattern ) this 
   means a window is found
5- If such window found, try to minimize it by 
   removing extra characters from beginning of
   current window.
6- Update min_length.
7- Print the minimum length window.
{% endhighlight %}
* Diagram to explain above algorithm:

![img](https://www.geeksforgeeks.org/wp-content/uploads/smallest-window.png)
* Below is program to implement above algorithm
{% highlight cpp %}
// C++ program to find smallest window containing
// all characters of a pattern.
#include<bits/stdc++.h>
using namespace std;

const int no_of_chars = 256;

// Function to find smallest window containing
// all characters of 'pat'
string findSubString(string str, string pat)
{
	int len1 = str.length();
	int len2 = pat.length();

	// check if string's length is less than pattern's
	// length. If yes then no such window can exist
	if (len1 < len2)
	{
		cout << "No such window exists";
		return "";
	}

	int hash_pat[no_of_chars] = {0};
	int hash_str[no_of_chars] = {0};

	// store occurrence ofs characters of pattern
	for (int i = 0; i < len2; i++)
		hash_pat[pat[i]]++;

	int start = 0, start_index = -1, min_len = INT_MAX;

	// start traversing the string
	int count = 0; // count of characters
	for (int j = 0; j < len1 ; j++)
	{
		// count occurrence of characters of string
		hash_str[str[j]]++;

		// If string's char matches with pattern's char
		// then increment count
		if (hash_pat[str[j]] != 0 &&
			hash_str[str[j]] <= hash_pat[str[j]] )
			count++;

		// if all the characters are matched
		if (count == len2)
		{
			// Try to minimize the window i.e., check if
			// any character is occurring more no. of times
			// than its occurrence in pattern, if yes
			// then remove it from starting and also remove
			// the useless characters.
			while ( hash_str[str[start]] > hash_pat[str[start]]
				|| hash_pat[str[start]] == 0)
			{

				if (hash_str[str[start]] > hash_pat[str[start]])
					hash_str[str[start]]--;
				start++;
			}

			// update window size
			int len_window = j - start + 1;
			if (min_len > len_window)
			{
				min_len = len_window;
				start_index = start;
			}
		}
	}

	// If no window found
	if (start_index == -1)
	{
	cout << "No such window exists";
	return "";
	}

	// Return substring starting from start_index
	// and length min_len
	return str.substr(start_index, min_len);
}

// Driver code
int main()
{
	string str = "this is a test string";
	string pat = "tist";

	cout << "Smallest window is : n"
		<< findSubString(str, pat);
	return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to find smallest window containing
// all characters of a pattern.

public class GFG 
{
	static final int no_of_chars = 256;
	
	// Function to find smallest window containing
	// all characters of 'pat'
	static String findSubString(String str, String pat)
	{
	    int len1 = str.length();
	    int len2 = pat.length();
	 
	    // check if string's length is less than pattern's
	    // length. If yes then no such window can exist
	    if (len1 < len2)
	    {
	        System.out.println("No such window exists");
	        return "";
	    }
	 
	    int hash_pat[] = new int[no_of_chars];
	    int hash_str[] = new int[no_of_chars];
	 
	    // store occurrence ofs characters of pattern
	    for (int i = 0; i < len2; i++)
	        hash_pat[pat.charAt(i)]++;
	 
	    int start = 0, start_index = -1, min_len = Integer.MAX_VALUE;
	 
	    // start traversing the string
	    int count = 0;  // count of characters
	    for (int j = 0; j < len1 ; j++)
	    {
	        // count occurrence of characters of string
	        hash_str[str.charAt(j)]++;
	 
	        // If string's char matches with pattern's char
	        // then increment count
	        if (hash_pat[str.charAt(j)] != 0 &&
	            hash_str[str.charAt(j)] <= hash_pat[str.charAt(j)] )
	            count++;
	 
	        // if all the characters are matched
	        if (count == len2)
	        {
	            // Try to minimize the window i.e., check if
	            // any character is occurring more no. of times
	            // than its occurrence  in pattern, if yes
	            // then remove it from starting and also remove
	            // the useless characters.
	            while ( hash_str[str.charAt(start)] > hash_pat[str.charAt(start)]
	                   || hash_pat[str.charAt(start)] == 0)
	            {
	 
	                if (hash_str[str.charAt(start)] > hash_pat[str.charAt(start)])
	                    hash_str[str.charAt(start)]--;
	                start++;
	            }
	 
	            // update window size
	            int len_window = j - start + 1;
	            if (min_len > len_window)
	            {
	                min_len = len_window;
	                start_index = start;
	            }
	        }
	    }
	 
	    // If no window found
	    if (start_index == -1)
	    {
	       System.out.println("No such window exists");
	       return "";
	    }
	 
	    // Return substring starting from start_index
	    // and length min_len
	    return str.substring(start_index, start_index + min_len);
	}
	
	// Driver Method
	public static void main(String[] args)
	{
		String str = "this is a test string";
	    String pat = "tist";
	 
	   System.out.print("Smallest window is :  n" +
	                    findSubString(str, pat));
	}
}
{% endhighlight %}
{% highlight cpp %}
Smallest window is : 
t stri
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

