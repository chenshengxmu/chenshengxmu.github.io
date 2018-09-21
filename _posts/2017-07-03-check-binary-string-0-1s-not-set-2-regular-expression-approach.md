---
layout: post
title: Check if a binary string has a 0 between 1s or not | Set 2 (Regular Expression Approach)
---
* Given a string of 0 and 1, we need to check that the given string is valid or not. The given string is valid when there is no zero is present in between 1’s. For example, 1111, 0000111110, 1111000 are valid strings but 01010011, 01010, 101 are not.
* Examples:
{% highlight cpp %}
Input : 100
Output : VALID

Input : 1110001
Output : NOT VALID
There is 0 between 1s

Input : 00011
Output : VALID
{% endhighlight %}
* In Set 1, we have discussed general approach for validity of string.In this post, we will discuss regular expression approach for same and it is simple.
* As we know that in a string if there is zero between 1’s, than string is not valid.Hence below is one of the regular expression for invalid string pattern.
{% highlight cpp %}
10+1
{% endhighlight %}
* So here is the simple regex algorithm.
{% highlight java %}
// Java regex program to check for valid string

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class GFG 
{
    // Method to check for valid string
    static boolean checkString(String str)
    {
        // regular expression for invalid string
        String regex = "10+1";
        
        // compiling regex
        Pattern p = Pattern.compile(regex);
        
        // Matcher object
        Matcher m = p.matcher(str);
        
        // loop over matcher
        while(m.find())
        {
            // if match found,
            // then string is invalid
            return false;
        }
         
        // if match doesn't found
        // then string is valid
        return true;    
    }

    // Driver method
    public static void main (String[] args)
    {
        String str = "00011111111100000";
        
        System.out.println(checkString(str) ? "VALID" : "NOT VALID");
    }
}
{% endhighlight %}
* Output:
{% highlight cpp %}
VALID
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

