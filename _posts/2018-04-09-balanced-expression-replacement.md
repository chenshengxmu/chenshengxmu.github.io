---
layout: post
title: Balanced expression with replacement
---
* Given a string that contains only the following => ‘{‘, ‘}’, ‘(‘, ‘)’, ‘[’, ‘]’. At some places there is ‘X’ in place of any bracket. Determine whether by replacing all ‘X’s with appropriate bracket, is it possible to make a valid bracket sequence.
* Prerequisite: Balanced Parenthesis Expression
* Examples:
{% highlight cpp %}
Input : S = "{(X[X])}"
Output : Balanced
The balanced expression after 
replacing X with suitable bracket is:
{([[]])}.

Input : [{X}(X)]
Output : Not balanced
No substitution of X with any bracket
results in a balanced expression.
{% endhighlight %}
* Approach: We have discussed a solution on verifying whether given parenthesis expression is balanced or not. Following the same approach described in the article, a stack data structure is used for verifying whether given expression is balanced or not. For each type of character in string, the operations to be performed on stack are:
* Also check for the case when stack is empty and current element is a closing bracket. In that case, the expression is not balanced.
* Implementation:
{% highlight cpp %}
// CPP program to determine whether given 
// expression is balanced/ parenthesis 
// expression or not.
#include <bits/stdc++.h>
using namespace std;

// Function to check if two brackets are matching
// or not.
int isMatching(char a, char b)
{
    if ((a == '{' && b == '}') || (a == '[' && b == ']')
        || (a == '(' && b == ')') || a == 'X')
        return 1;
    return 0;
}

// Recursive function to check if given expression
// is balanced or not.
int isBalanced(string s, stack<char> ele, int ind)
{

    // Base case.
    // If the string is balanced then all the opening
    // brackets had been popped and stack should be
    // empty after string is traversed completely.
    if (ind == s.length()) 
        return ele.empty();

    // variable to store element at the top of the stack.
    char topEle;

    // variable to store result of recursive call.
    int res;

    // Case 1: When current element is an opening bracket
    // then push that element in the stack.
    if (s[ind] == '{' || s[ind] == '(' || s[ind] == '[') {
        ele.push(s[ind]);
        return isBalanced(s, ele, ind + 1);
    }

    // Case 2: When current element is a closing bracket
    // then check for matching bracket at the top of the
    // stack.
    else if (s[ind] == '}' || s[ind] == ')' || s[ind] == ']') {

        // If stack is empty then there is no matching opening
        // bracket for current closing bracket and the
        // expression is not balanced.
        if (ele.empty()) 
            return 0;

        topEle = ele.top();
        ele.pop();

        // Check bracket is matching or not.
        if (!isMatching(topEle, s[ind])) 
            return 0;
        
        return isBalanced(s, ele, ind + 1);
    }

    // Case 3: If current element is 'X' then check
    // for both the cases when 'X' could be opening
    // or closing bracket.
    else if (s[ind] == 'X') {
        stack<char> tmp = ele;
        tmp.push(s[ind]);
        res = isBalanced(s, tmp, ind + 1);
        if (res)
            return 1;
        if (ele.empty())
            return 0;
        ele.pop();
        return isBalanced(s, ele, ind + 1);
    }
}

int main()
{
    string s = "{(X}[]";
    stack<char> ele;
    if (isBalanced(s, ele, 0)) 
        cout << "Balanced";    
    else 
        cout << "Not Balanced";    
    return 0;
}
{% endhighlight %}
{% highlight cpp %}
Balanced
{% endhighlight %}
* Time Complexity: O((2^n)*n) Auxiliary Space: O(N)
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

