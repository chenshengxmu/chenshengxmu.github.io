---
layout: post
title: Decode a median string to the original string
---
* Given a string s written in median form, change it back to the original string. Median letter in a string is the letter which is in the middle of the string. If the string’s length is even, the median letter is the left of the two middle letters. The given string is formed by writing down the median letter of the word, then deleting it and repeating the process until there are no letters left.
* Examples:
{% highlight cpp %}
Input: eekgs
Output: geeks 
Explanation: in the original string “geeks” 
can be written in median form by picking up 
e first then, again e, then k then g and at
the end s. As these are the median when the
median letter is picked and deleted. 

Input: abc 
Output: bac 
Explanation: median of bac is a, then median
of bc is b, then median of c is c.
{% endhighlight %}
* To find the answer we can iterate through the given encoded string from left to right and add each letter in the answer string, one letter to the begin, next letter to the end, next letter to begin and so on. If n is even than the first letter must be added to the begin and the second letter to the end. In the other case, the first letter to the end, second to the begin. We need to make it until we do not add all letters from the given string. Note: For strings with even length, when we add first character to begin and second character to end then the remaining string will always be of even length. Same is true for strings with odd lengths.
* Given below is the implementation of the above approach
{% highlight cpp %}
// C++ program to decode a median string
// to the original string

#include <bits/stdc++.h>
using namespace std;

// function to calculate the median back string
string decodeMedianString(string s)
{
    // length of string
    int l = s.length();

    // initialize a blank string
    string s1 = "";

    // Flag to check if length is even or odd
    bool isEven = (l % 2 == 0)? true : false;

    // traverse from first to last
    for (int i = 0; i < l; i += 2) {

        // if len is even then add first character
        // to beginning of new string and second
        // character to end
        if (isEven) {   
            s1 = s[i] + s1;
            s1 += s[i + 1];
        } else {

            // if current length is odd and is
            // greater than 1
            if (l - i > 1) {

                // add first character to end and
                // second character to beginning
                s1 += s[i];
                s1 = s[i + 1] + s1;
            } else {

                // if length is 1, add character  
                // to end
                s1 += s[i];
            }
        }
    }

    return s1;
}

// driver program 
int main()
{
    string s = "eekgs";
    cout << decodeMedianString(s);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// java program to decode a median
// string to the original string

public class GFG {
    
    // function to calculate the 
    // median back string
    static String decodeMedianString(String s)
    {
        
        // length of string
        int l = s.length();
    
        // initialize a blank string
        String s1 = "";
    
        // Flag to check if length is
        // even or odd
        boolean isEven = (l % 2 == 0) ?
                          true : false;
    
        // traverse from first to last
        for (int i = 0; i < l; i += 2)
        {
    
            // if len is even then add
            // first character to 
            // beginning of new string 
            // and second character to
            // end
            if (isEven) { 
                s1 = s.charAt(i) + s1;
                s1 += s.charAt(i+1);
            } 
            else {
    
                // if current length is
                // odd and is greater 
                // than 1
                if (l - i > 1) {
    
                    // add first character
                    // to end and second
                    // character to
                    // beginning
                    s1 += s.charAt(i);
                    s1 = s.charAt(i+1) + s1;
                } 
                else {
    
                    // if length is 1, 
                    // add character 
                    // to end
                    s1 += s.charAt(i);
                }
            }
        }
    
        return s1;
    }
    
    // Driver code
    public static void main(String args[])
    {
        String s = "eekgs";
        
        System.out.println(
                    decodeMedianString(s));
    }
}

// This code is contributed by Sam007.
{% endhighlight %}
{% highlight cpp %}
geeks
{% endhighlight %}
* Time complexity: O(n)
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

