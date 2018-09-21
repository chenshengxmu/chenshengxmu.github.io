---
layout: post
title: Evaluate a boolean expression represented as string
---
* Given a string consisting of only 0, 1, A, B, C where A = AND B = OR C = XOR Calculate the value of the string assuming no order of precedence and evaluation is done from left to right.
* Constraints – The length of string will be odd. It will always be a valid string. Example, 1AA0 will not be given as an input.
* Examples:
{% highlight cpp %}
Input : 1A0B1
Output : 1
1 AND 0 OR 1 = 1

Input : 1C1B1B0A0
Output : 0
{% endhighlight %}
* Source : Microsoft online round for internship 2017
* The idea is to traverse all operands by jumping a character after every iteration. For current operand str[i], check values of str[i+1] and str[i+2], accordingly decide the value of current subexpression.
{% highlight cpp %}
// C++ program to evaluate value of an expression.
#include <bits/stdc++.h>

using namespace std;

int evaluateBoolExpr(string s)
{
    int n = s.length();

    // Traverse all operands by jumping
    // a character after every iteration.
    for (int i = 0; i < n; i += 2) {

        // If operator next to current operand
        // is AND.
        if (s[i + 1] == 'A') {
            if (s[i + 2] == '0'|| s[i] == '0')
                s[i + 2] = '0';
            else
                s[i + 2] = '1';
        }

        // If operator next to current operand
        // is OR.
        else if (s[i + 1] == 'B') {
            if (s[i + 2] == '1'|| s[i] == '1')
                s[i + 2] = '1';
            else
                s[i + 2] = '0';
        }

        // If operator next to current operand
        // is XOR (Assuming a valid input)
        else {
            if (s[i + 2] == s[i])
                s[i + 2] = '0';
            else
                s[i + 2] = '1';
        }
    }
    return s[n - 1] -'0';
}

// Driver code
int main()
{
    string s = "1C1B1B0A0";
    cout << evaluateBoolExpr(s);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to evaluate value of an expression.
public class Evaluate_BoolExp {
    
    // Evaluates boolean expression
    // and returns the result
    static int evaluateBoolExpr(StringBuffer s)
    {
        int n = s.length();
     
        // Traverse all operands by jumping
        // a character after every iteration.
        for (int i = 0; i < n; i += 2) {
     
            // If operator next to current operand
            // is AND.
            if( i + 1 < n && i + 2 < n)
            {
                if (s.charAt(i + 1) == 'A') {
                    if (s.charAt(i + 2) == '0' || 
                            s.charAt(i) == 0)
                        s.setCharAt(i + 2, '0');
                    else
                        s.setCharAt(i + 2, '1');
                }
         
                // If operator next to current operand
                // is OR.
                else if ((i + 1) < n && 
                           s.charAt(i + 1 ) == 'B') {
                    if (s.charAt(i + 2) == '1' ||
                          s.charAt(i) == '1')
                        s.setCharAt(i + 2, '1');
                    else
                        s.setCharAt(i + 2, '0');
                }
                
                // If operator next to current operand
                // is XOR (Assuming a valid input)
                else {
                    if (s.charAt(i + 2) == s.charAt(i))
                        s.setCharAt(i + 2, '0');
                    else
                        s.setCharAt(i + 2 ,'1');
                }
            }
        }
        return s.charAt(n - 1) - '0';
    }
     
    // Driver code
    public static void main(String[] args) 
    {
        String s = "1C1B1B0A0";
        StringBuffer sb = new StringBuffer(s);
        System.out.println(evaluateBoolExpr(sb));
    }
}
// This code is contributed by Sumit Ghosh
{% endhighlight %}
{% highlight cpp %}
0
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

