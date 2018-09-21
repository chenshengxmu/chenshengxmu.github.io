---
layout: post
title: Identify and mark unmatched parenthesis in an expression
---
* Given an expression, find and mark matched and unmatched parenthesis in it. We need to replace all balanced opening parenthesis with 0, balanced closing parenthesis with 1 and all unbalanced with -1.
* Examples:
{% highlight cpp %}
Input : ((a) 
Output : -10a1

Input : (a))
Output : 0a1-1

Input  : (((abc))((d)))))
Output : 000abc1100d111-1-1
{% endhighlight %}
* The idea is based on stack. We run a loop from the start of the string upto end and for every ‘(‘, we push it into stack. If stack is empty and we encounter an closing bracket ‘)’ the we replace -1 at that index of the strig. Else we replace all opening brackets ‘(‘ with 0 and closing brackets with 1. Then pop from the stack.
{% highlight cpp %}
// CPP program to mark balanced and unbalanced
// parenthesis.
#include <bits/stdc++.h>
using namespace std;

void identifyParenthesis(string a)
{
    stack<int> st;

    // run the loop upto end of the string
    for (int i = 0; i < a.length(); i++) {

        // if a[i] is opening bracket then push 
        // into stack
        if (a[i] == '(') 
            st.push(i);
        
        // if a[i] is closing bracket ')' 
        else if (a[i] == ')') {

            // If this closing bracket is unmatched
            if (st.empty()) 
                a.replace(i, 1, "-1");
            
            else {

                // replace all opening brackets with 0
                // and closing brackets with 1
                a.replace(i, 1, "1");
                a.replace(st.top(), 1, "0");
                st.pop();
            }
        }
    }

    // if stack is not empty then pop out all
    // elements from it and replace -1 at that
    // index of the string
    while (!st.empty()) {
        a.replace(st.top(), 1, "-1");
        st.pop();
    }

    // print final string
    cout << a << endl;
}

// Driver code
int main()
{
    string str = "(a))";
    identifyParenthesis(str);
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
0a1-1
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

