---
layout: post
title: Converting Roman Numerals to Decimal lying between 1 to 3999
---
* Given a Romal numeral, find its corresponding decimal value.
* Example :
{% highlight cpp %}
Input : IX
Output : 9

Input : XL
Output : 40

Input : MCMIV
Output :  1904
M is a thousand, CM is nine hundred 
and IV is four
{% endhighlight %}
* Roman numerals are based on below symbols.
{% highlight cpp %}
SYMBOL       VALUE
I             1
IV            4
V             5
IX            9
X             10
XL            40
L             50
XC            90
C             100
CD            400
D             500
CM            900 
M             1000
{% endhighlight %}
* A number in Roman Numerals is a string of these symbols written in descending order(e.g. M’s first, followed by D’s, etc.). However, in a few specific cases, to avoid four characters being repeated in succession (such as IIII or XXXX), subtractive notation is often used as follows:
* Algorithm to convert Roman Numerals to Integer Number :
* Following is the implementation of the above algorithm:
{% highlight cpp %}
// Program to convert Roman Numerals to Numbers
#include<bits/stdc++.h>
using namespace std;

// This function returns value of a Roman symbol
int value(char r)
{
    if (r == 'I')
        return 1;
    if (r == 'V')
        return 5;
    if (r == 'X')
        return 10;
    if (r == 'L')
        return 50;
    if (r == 'C')
        return 100;
    if (r == 'D')
        return 500;
    if (r == 'M')
        return 1000;

    return -1;
}

// Returns decimal value of roman numaral
int romanToDecimal(string &str)
{
    // Initialize result
    int res = 0;

    // Traverse given input
    for (int i=0; i<str.length(); i++)
    {
        // Getting value of symbol s[i]
        int s1 = value(str[i]);

        if (i+1 < str.length())
        {
            // Getting value of symbol s[i+1]
            int s2 = value(str[i+1]);

            // Comparing both values
            if (s1 >= s2)
            {
                // Value of current symbol is greater
                // or equal to the next symbol
                res = res + s1;
            }
            else
            {
                res = res + s2 - s1;
                i++; // Value of current symbol is
                     // less than the next symbol
            }
        }
        else
        {
            res = res + s1;
            i++;
        }
    }
    return res;
}

// Driver Program
int main()
{
    // Considering inputs given are valid
    string str ="MCMIV";
    cout << "Integer form of Roman Numeral is "
         << romanToDecimal(str) << endl;

    return 0;
}
{% endhighlight %}
{% highlight java %}
// Program to convert Roman Numerals to Numbers
import java.util.*;

public class RomanToNumber
{
    // This function returns value of a Roman symbol
    int value(char r)
    {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }

    // Finds decimal value of a given romal numeral
    int romanToDecimal(String str)
    {
        // Initialize result
        int res = 0;

        for (int i=0; i<str.length(); i++)
        {
            // Getting value of symbol s[i]
            int s1 = value(str.charAt(i));

            // Getting value of symbol s[i+1]
            if (i+1 <str.length())
            {
                int s2 = value(str.charAt(i+1));

                // Comparing both values
                if (s1 >= s2)
                {
                    // Value of current symbol is greater
                    // or equalto the next symbol
                    res = res + s1;
                }
                else
                {
                    res = res + s2 - s1;
                    i++; // Value of current symbol is
                    // less than the next symbol
                }
            }
            else
            {
                res = res + s1;
                i++;
            }
        }

        return res;
    }

    // Driver method
    public static void main(String args[])
    {
        RomanToNumber ob = new RomanToNumber();

        // Considering inputs given are valid
        String str = "MCMIV";
        System.out.println("Integer form of Roman Numeral" +
                           " is " + ob.romanToDecimal(str));
    }
}
{% endhighlight %}
{% highlight python %}
# Python program to convert Roman Numerals
# to Numbers

# This function returns value of each Roman symbol
def value(r):
    if (r == 'I'):
        return 1
    if (r == 'V'):
        return 5
    if (r == 'X'):
        return 10
    if (r == 'L'):
        return 50
    if (r == 'C'):
        return 100
    if (r == 'D'):
        return 500
    if (r == 'M'):
        return 1000
    return -1

def romanToDecimal(str):
    res = 0
    i = 0

    while (i < len(str)):

        # Getting value of symbol s[i]
        s1 = value(str[i])

        if (i+1 < len(str)):

            # Getting value of symbol s[i+1]
            s2 = value(str[i+1])

            # Comparing both values
            if (s1 >= s2):

                # Value of current symbol is greater
                # or equal to the next symbol
                res = res + s1
                i = i + 1
            else:

                # Value of current symbol is greater
                # or equal to the next symbol
                res = res + s2 - s1
                i = i + 2
        else:
            res = res + s1
            i = i + 1

    return res

# Driver code
print("Integer form of Roman Numeral is"),
print(romanToDecimal("MCMIV"))
{% endhighlight %}
{% highlight cpp %}
Integer form of Roman Numeral is 1904
{% endhighlight %}
* References: https://en.wikipedia.org/wiki/Roman_numerals
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

