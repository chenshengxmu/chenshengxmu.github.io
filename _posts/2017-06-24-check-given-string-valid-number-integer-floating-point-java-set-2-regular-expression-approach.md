---
layout: post
title: Check if a given string is a valid number (Integer or Floating Point) in Java | SET 2 (Regular Expression approach)
---
* In Set 1, we have discussed general approach to check whether a string is a valid number or not. In this post, we will discuss regular expression approach to check for a number.
* Examples:
{% highlight cpp %}
Input : str = "11.5"
Output : true

Input : str = "abc"
Output : false

Input : str = "2e10"
Output : true

Input : 10e5.4
Output : false
{% endhighlight %}
* Check if a given string is a valid Integer
* For integer number : Below is the regular definition for an integer number.
{% highlight cpp %}
sign -> + | - | epsilon
digit -> 0 | 1 | .... | 9
num -> sign digit digit*
{% endhighlight %}
* Hence one of the regular expression for an integer number is
{% highlight cpp %}
[+-]?[0-9][0-9]*
{% endhighlight %}
{% highlight java %}
// Java program to check whether given string
// is a valid integer number using regex

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class GFG 
{
    public static void main (String[] args)
    {
        String input1 = "abc";
        String input2 = "1234";
        
        // regular expression for an integer number
        String regex = "[+-]?[0-9][0-9]*";
        
        // compiling regex
        Pattern p = Pattern.compile(regex);
        
        // Creates a matcher that will match input1 against regex
        Matcher m = p.matcher(input1);
        
        // If match found and equal to input1
        if(m.find() && m.group().equals(input1))
            System.out.println(input1 + " is a valid integer number");
        else
            System.out.println(input1 + " is not a valid integer number");
        
        // Creates a matcher that will match input2 against regex
        m = p.matcher(input2);
        
        // If match found and equal to input2
        if(m.find() && m.group().equals(input2))
                System.out.println(input2 + " is a valid integer number");    
        else
            System.out.println(input2 + " is not a valid integer number");
    }
}
{% endhighlight %}
* Output:
{% highlight cpp %}
abc is not a valid integer number
1234 is a valid integer number
{% endhighlight %}
* Below are other short-hands regular expression for an integer number
{% highlight cpp %}
[+-]?[0-9]+
[+-]?\d\d*
[+-]?\d+
{% endhighlight %}
* Check if a given string is a valid floating point number
* For floating point number : Below is the regular definition for a floating point number.
{% highlight cpp %}
sign -> + | - | epsilon
digit -> 0 | 1 | .... | 9
digits -> digit digit*
optional_fraction -> . digits | epsilon
optional_exponent -> ((E | e) (+ | - | epsilon) digits) | epsilon
num -> sign digits optional_fraction optional_exponent
{% endhighlight %}
* Hence one of the regular expression for a floating number is
{% highlight cpp %}
[+-]?[0-9]+(\.[0-9]+)?([Ee][+-]?[0-9]+)?
{% endhighlight %}
{% highlight java %}
//Java program to check whether given string
// is a valid floating point number using regex

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class GFG 
{
    public static void main (String[] args)
    {
        String input1 = "10e5.4";
        String input2 = "2e10";
        
        // regular expression for a floating point number
        String regex = "[+-]?[0-9]+(\\.[0-9]+)?([Ee][+-]?[0-9]+)?";
        
        // compiling regex
        Pattern p = Pattern.compile(regex);
        
        // Creates a matcher that will match input1 against regex
        Matcher m = p.matcher(input1);
        
        // If match found and equal to input1
        if(m.find() && m.group().equals(input1))
            System.out.println(input1 + " is a valid float number");
        else
            System.out.println(input1 + " is not a valid float number");
        
        // Creates a matcher that will match input2 against regex
        m = p.matcher(input2);
        
        // If match found and equal to input2
        if(m.find() && m.group().equals(input2))
                System.out.println(input2 + " is a valid float number");    
        else
            System.out.println(input2 + " is not a valid float number");
    }
}
{% endhighlight %}
* Output:
{% highlight cpp %}
10e5.4 is not a valid float number
2e10 is a valid float number
{% endhighlight %}
* Below is other short-hand regular expression for a float number
{% highlight cpp %}
[+-]?\d+(\.\d+)?([Ee][+-]?\d+)?
{% endhighlight %}
* Related Article : Check if a given string is a valid number (Integer or Floating Point) in Java
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

