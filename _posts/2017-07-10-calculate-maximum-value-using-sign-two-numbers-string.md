---
layout: post
title: Calculate maximum value using '+' or '*' sign between two numbers in a string
---
* Given a string of numbers, the task is to find the maximum value from the string, you can add a ‘+’ or ‘*’ sign between any two numbers.
* Examples:
{% highlight cpp %}
Input : 01231
Output : 
((((0 + 1) + 2) * 3) + 1) = 10
In above manner, we get the maximum value i.e. 10

Input : 891
Output :73
As 8*9*1 = 72 and 8*9+1 = 73.So, 73 is maximum.
{% endhighlight %}
* Asked in : Facebook
* The task is pretty simple as we can get the maximum value on multiplying all values but the point is to handle the case of 0 and 1 i.e. On multiplying with 0 and 1 we get the lower value as compared to on adding with 0 and 1. So, use ‘*’ sign between any two numbers(except numbers containing 0 and 1) and use ‘+’ if any of the number is 0 and 1.
{% highlight cpp %}
// C++ program to find maximum value
#include <bits/stdc++.h>

using namespace std;

// Function to calculate the value
int calcMaxValue(string str)
{
    // Store first character as integer
    // in result
    int res = str[0] -'0';

    // Start traversing the string
    for (int i = 1; i < str.length(); i++)
    {
        // Check if any of the two numbers
        // is 0 or 1, If yes then add current
        // element
        if (str[i] == '0' || str[i] == '1' ||
            res == 1 )
            res += (str[i]-'0');

        // Else multiply
        else
            res *= (str[i]-'0');
    }

    // Return maximum value
    return res;
}

// Drivers code
int main()
{
    string str = "01891";
    cout << calcMaxValue(str);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to find maximum value

public class GFG 
{
    // Mehod to calculate the value
    static int calcMaxValue(String str)
    {
        // Store first character as integer
        // in result
        int res = str.charAt(0) -'0';
     
        // Start traversing the string
        for (int i = 1; i < str.length(); i++)
        {
            // Check if any of the two numbers
            // is 0 or 1, If yes then add current
            // element
            if (str.charAt(i) == '0' || str.charAt(i) == '1' ||
                res == 1 )
                res += (str.charAt(i)-'0');
     
            // Else multiply
            else
                res *= (str.charAt(i)-'0');
        }
     
        // Return maximum value
        return res;
    }
    
    // Driver Method
    public static void main(String[] args)
    {
        String str = "01891";
        System.out.println(calcMaxValue(str));
    }
}
{% endhighlight %}
{% highlight cpp %}
82
{% endhighlight %}
* Above program consider the case of small inputs i.e. upto which C/C++ can handle the range of maximum value.
* Reference : https://www.careercup.com/question?id=5745795300065280
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

