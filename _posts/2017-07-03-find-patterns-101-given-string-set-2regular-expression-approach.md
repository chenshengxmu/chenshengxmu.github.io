---
layout: post
title: Find all the patterns of "1(0+)1" in a given string | SET 2(Regular Expression Approach)
---
* In Set 1, we have discussed general approach for counting the patterns of the form 1(0+)1 where (0+) represents any non-empty consecutive sequence of 0’s.In this post, we will discuss regular expression approach to count the same.
* Examples:
{% highlight cpp %}
Input : 1101001
Output : 2

Input : 100001abc101
Output : 2
{% endhighlight %}
* Below is one of the regular expression for above pattern
{% highlight cpp %}
10+1
{% endhighlight %}
* Hence, whenever we found a match, we increase counter for counting the pattern.As last character of a match will always ‘1’, we have to again start searching from that index.
{% highlight java %}
//Java program to count the patterns 
// of the form 1(0+)1 using Regex

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class GFG 
{
    static int patternCount(String str) 
    {
        // regular expression for the pattern
        String regex = "10+1";
        
        // compiling regex
        Pattern p = Pattern.compile(regex);
                
        // Matcher object
        Matcher m = p.matcher(str);
        
        // counter
        int counter = 0;
                
        // whenever match found
        // increment counter
        while(m.find())
        {
            // As last character of current match
            // is always one, starting match from that index
            m.region(m.end()-1, str.length());
            
            counter++;
        }
                
        return counter;
    }
    
    // Driver Method
    public static void main (String[] args)
    {
        String str = "1001ab010abc01001";
        System.out.println(patternCount(str));
    }
}
{% endhighlight %}
* Output:
{% highlight cpp %}
2
{% endhighlight %}
* Related Articles :
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

