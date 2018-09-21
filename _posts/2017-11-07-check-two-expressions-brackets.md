---
layout: post
title: Check if two expressions with brackets are same
---
* Given two expressions in the form of strings. The task is to compare them and check if they are similar. Expressions consist of lowercase alphabets, ‘+’, ‘-‘ and ‘( )’.
* Examples:
{% highlight cpp %}
Input  : exp1 = "-(a+b+c)"
         exp2 = "-a-b-c"
Output : Yes

Input  : exp1 = "-(c+b+a)"
         exp2 = "-c-b-a"
Output : Yes

Input  : exp1 = "a-b-(c-d)"
         exp2 = "a-b-c-d"
Output : No
{% endhighlight %}
* It may be assumed that there are at most 26 operands from ‘a’ to ‘z’ and every operand appears only once.
* A simple idea behind is to keep a record of the Global and Local Sign(+/-) through the expression. The Global Sign here means the multiplicative sign at each operand. The resultant sign for an operand is local sign multiplied by the global sign at that operand.
* For example, the expression a+b-(c-d) is evaluated as (+)+a(+)+b(-)+c(-)-d => a + b – c + d. The global sign (represented inside bracket) is multiplied to the local sign for each operand.
* In the given solution, stack is used to keep record of the global signs. A count vector records the counts of the operands(lowercase Latin letters here). Two expressions are evaluated in opposite manners and finally, it is checked if the all entries in the count vector are zeros.
{% highlight cpp %}
// CPP program to check if two expressions
// evaluate to same.
#include <bits/stdc++.h>
using namespace std;

const int MAX_CHAR = 26;

// Return local sign of the operand. For example,
// in the expr a-b-(c), local signs of the operands
// are +a, -b, +c
bool adjSign(string s, int i)
{
    if (i == 0)
        return true;
    if (s[i - 1] == '-')
        return false;
    return true;
};

// Evaluate expressions into the count vector of 
// the 26 alphabets.If add is true, then add count
// to the count vector of the alphabets, else remove
// count from the count vector.
void eval(string s, vector<int>& v, bool add)
{
    // stack stores the global sign
    // for operands.
    stack<bool> stk;
    stk.push(true);

    // + means true
    // global sign is positive initially

    int i = 0;
    while (s[i] != '\0') {
        if (s[i] == '+' || s[i] == '-') {
            i++;
            continue;
        }
        if (s[i] == '(') {

            // global sign for the bracket is
            // pushed to the stack
            if (adjSign(s, i)) 
                stk.push(stk.top());
            else 
                stk.push(!stk.top());
        }

        // global sign is popped out which
        // was pushed in for the last bracket
        else if (s[i] == ')') 
            stk.pop();
        
        else {

            // global sign is positive (we use different 
            // values in two calls of functions so that
            // we finally check if all vector elements
            // are 0.
            if (stk.top())                 
                v[s[i] - 'a'] += (adjSign(s, i) ? add ? 1 : -1 : 
                                                  add ? -1 : 1);

            // global sign is negative here
            else                 
                v[s[i] - 'a'] += (adjSign(s, i) ? add ? -1 : 1 : 
                                                  add ? 1 : -1);
        }
        i++;
    }
};

// Returns true if expr1 and expr2 represent
// same expressions
bool areSame(string expr1, string expr2)
{
    // Create a vector for all operands and
    // initialize the vector as 0.
    vector<int> v(MAX_CHAR, 0);

    // Put signs of all operands in expr1
    eval(expr1, v, true);

    // Subtract signs of operands in expr2
    eval(expr2, v, false);

    // If expressions are same, vector must 
    // be 0.
    for (int i = 0; i < MAX_CHAR; i++) 
        if (v[i] != 0) 
            return false;

    return true;
}

// Driver code
int main()
{
    string expr1 = "-(a+b+c)", expr2 = "-a-b-c";
    if (areSame(expr1, expr2))
        cout << "Yes\n";
    else
        cout << "No\n";
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
YES
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

