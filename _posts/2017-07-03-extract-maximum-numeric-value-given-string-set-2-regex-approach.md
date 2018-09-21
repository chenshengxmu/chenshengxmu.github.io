---
layout: post
title: Extract maximum numeric value from a given string | Set 2 (Regex approach)
---
* Given an alphanumeric string, extract maximum numeric value from that string.
* Examples:
{% highlight cpp %}
Input : 100klh564abc365bg
Output : 564
Maximum numeric value among 100, 564 
and 365 is 564.
Input : abchsd0365sdhs
Output : 365
{% endhighlight %}
* In Set 1, we have discussed general approach for extract numeric value from given string.In this post, we will discuss regular expression approach for same.
* Below is one of the regular expression for at least one numeric digit.
{% highlight cpp %}
\d+
{% endhighlight %}
* So Regex solution is simple:
{% highlight java %}
// Java regex program to extract the maximum value

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class GFG 
{
    // Method to extract the maximum value
    static int extractMaximum(String str)
    {
        // regular expression for atleast one numeric digit
        String regex = "\\d+";
        
        // compiling regex
        Pattern p = Pattern.compile(regex);
        
        // Matcher object
        Matcher m = p.matcher(str);
        
        // initialize MAX = 0
        int MAX = 0;
        
        // loop over matcher
        while(m.find())
        {
            // convert numeric string to integer
            int num = Integer.parseInt(m.group());
            
            // compare num with MAX, update MAX if num > MAX
            if(num > MAX)
                MAX = num;
        }
         
        return MAX;    
    }

    public static void main (String[] args)
    {
        String str = "100klh564abc365bg";
        
        System.out.println(extractMaximum(str));
    }
}
{% endhighlight %}
* Output:
{% highlight cpp %}
564
{% endhighlight %}
* But above program wouldn’t work if number is greater that integer range. You can try parseLong() method for numbers upto long range.But to handle the case of large numbers(greater than long range) we can take help of BigInteger class in java. Below is the java program to demonstrate the same.
{% highlight java %}
// Java regex program to extract the maximum value
// in case of large numbers

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class GFG 
{
    // Method to extract the maximum value
    static BigInteger extractMaximum(String str)
    {
        // regular expression for atleast one numeric digit
        String regex = "\\d+";
        
        // compiling regex
        Pattern p = Pattern.compile(regex);
        
        // Matcher object
        Matcher m = p.matcher(str);
        
        // initialize MAX = 0
        BigInteger MAX = BigInteger.ZERO;
        
        // loop over matcher
        while(m.find())
        {
            // convert numeric string to BigIntegr
            BigInteger num = new BigInteger(m.group());
            
            // compare num with MAX, update MAX if num > MAX
            if(num.compareTo(MAX) > 0)
                MAX = num;
        }
         
        return MAX;    
    }

    public static void main (String[] args)
    {
        String str = "100klh564231315151313151315abc365bg";
        
        System.out.println(extractMaximum(str));
    }
}
{% endhighlight %}
* Output:
{% highlight cpp %}
564231315151313151315
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

