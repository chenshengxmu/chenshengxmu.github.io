---
layout: post
title: Check if all occurrences of a character appear together
---
* Given a string s and a character c, find if all occurrences of c appear together in s or not. If the character c does not appear in the string at all, the answer is true.
* Examples
{% highlight cpp %}
Input: s = "1110000323", c = '1'
Output: Yes
All occurrences of '1' appear together in
"1110000323"

Input: s  = "3231131", c = '1'
Output: No
All occurrences of 1 are not together

Input: s  = "abcabc", c = 'c'
Output: No
All occurrences of 'c' are not together

Input: s  = "ababcc", c = 'c'
Output: Yes
All occurrences of 'c' are together
{% endhighlight %}
* The idea is to traverse given string, as soon as we find an occurrence of c, we keep traversing until we find a character which is not c. We also set a flag to indicate that one more occurrences of c are seen. If we see c again and flag is set, then we return false.
{% highlight cpp %}
// CPP program to find if all occurrences
// of a character appear together in a string.
#include <iostream>
#include <string>
using namespace std;

bool checkIfAllTogether(string s, char c)
{
    // To indicate if one or more occurrences
    // of 'c' are seen or not.
    bool oneSeen = false;

    // Traverse given string
    int i = 0, n = s.length();
    while (i < n) {

        // If current character is same as c,
        // we first check if c is already seen.         
        if (s[i] == c) {
            if (oneSeen == true)
                return false;

            // If this is very first appearance of c,
            // we traverse all consecutive occurrences.
            while (i < n && s[i] == c)
                i++;

            // To indicate that character is seen  once.
            oneSeen = true;
        }

        else
            i++;
    }
    return true;
}

// Driver program
int main()
{
    string s = "110029";
    if (checkIfAllTogether(s, '1'))
        cout << "Yes" << endl;
    else
        cout << "No" << endl;
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to find if all 
// occurrences of a character 
// appear together in a string.
import java.io.*;

class GFG {

static boolean checkIfAllTogether(String s,
                                    char c)
    {
        
        // To indicate if one or more 
        // occurrences of 'c' are seen
        // or not.
        boolean oneSeen = false;
    
        // Traverse given string
        int i = 0, n = s.length();
        while (i < n) 
        {
    
            // If current character is
            // same as c, we first check
            // if c is already seen.         
            if (s.charAt(i) == c) 
            {
                if (oneSeen == true)
                    return false;
    
                // If this is very first
                // appearance of c, we 
                // traverse all consecutive
                // occurrences.
                while (i < n && s.charAt(i) == c)
                    i++;
    
                // To indicate that character
                // is seen once.
                oneSeen = true;
            }
    
            else
                i++;
        }
        
        return true;
    }

    // Driver Code
    public static void main(String[] args)
    {

        String s = "110029";
        
        if (checkIfAllTogether(s, '1'))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

// This code is contributed by Sam007.
{% endhighlight %}
{% highlight python %}
# Python program to find 
# if all occurrences
# of a character appear
# together in a string.

# function to find 
# if all occurrences
# of a character appear
# together in a string.
def checkIfAllTogether(s, c) :
    
    # To indicate if one or
    # more occurrences of 
    # 'c' are seen or not.
    oneSeen = False

    # Traverse given string
    i = 0
    n = len(s)
    while (i < n) : 
        # If current character 
        # is same as c,
        # we first check 
        # if c is already seen.     
        if (s[i] == c) :     
            if (oneSeen == True) :
                return False
            # If this is very first
            # appearance of c,
            # we traverse all
            # consecutive occurrences.
            while (i < n and s[i] == c) :
                i = i + 1
            # To indicate that character
            # is seen once.
            oneSeen = True

        else :
            i = i + 1
    
    return True


# Driver Code
s = "110029";
if (checkIfAllTogether(s, '1')) :
    print ("Yes\n")
else :
    print ("No\n")

# This code is contributed by 
# Manish Shaw (manishshaw1)
{% endhighlight %}
{% highlight cpp %}
Yes
{% endhighlight %}
* The complexity of above program is O(n).
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

