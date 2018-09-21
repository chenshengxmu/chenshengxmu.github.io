---
layout: post
title: Reversing an Equation
---
* Given a mathematical equation using numbers/variables and +, -, *, /. Print the equation in reverse.
* Examples:
{% highlight cpp %}
Input : 20 - 3 + 5 * 2
Output : 2 * 5 + 3 - 20

Input : 25 + 3 - 2 * 11
Output : 11 * 2 - 3 + 25

Input : a + b * c - d / e
Output : e / d - c * b + a
{% endhighlight %}
* Approach : The approach to this problem is simple. We iterate the string from left to right and as soon we strike a symbol we insert the number and the symbol in the beginning of the resultant string.
{% highlight cpp %}
// CPP program to reverse an equation
#include <bits/stdc++.h>
using namespace std;

// Function to reverse order of words
string reverseEquation(string s)
{
    // Resultant string
    string result;
    int j = 0;
    for (int i = 0; i < s.length(); i++) {
        
        // A space marks the end of the word
        if (s[i] == '+' || s[i] == '-' || 
            s[i] == '/' || s[i] == '*') {
            
            // insert the word at the begining
            // of the result string
            result.insert(result.begin(), 
                s.begin() + j, s.begin() + i);
            j = i + 1;
            
            // insert the symbol
            result.insert(result.begin(), s[i]);
        }
    }
    
    // insert the last word in the string 
    // to the result string
    result.insert(result.begin(), s.begin() + j, 
                                     s.end());
    return result;
}

// driver code
int main()
{
    string s = "a+b*c-d/e";
    cout << reverseEquation(s) << endl;
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
e/d-c*b+a
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

