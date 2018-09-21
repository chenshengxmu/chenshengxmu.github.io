---
layout: post
title: Find maximum depth of nested parenthesis in a string
---
* We are given a string having parenthesis like below      “( ((X)) (((Y))) )” We need to find the maximum depth of balanced parenthesis, like 4 in above example. Since ‘Y’ is surrounded by 4 balanced parenthesis.
* If parenthesis are unbalanced then return -1. Examples :
{% highlight cpp %}
Input : S = "( a(b) (c) (d(e(f)g)h) I (j(k)l)m)";
Output : 4

Input : S = "( p((q)) ((s)t) )";
Output : 3

Input : S = "";
Output : 0

Input : S = "b) (c) ()";
Output : -1 

Input : S = "(b) ((c) ()"
Output : -1
{% endhighlight %}
* Method 1 (Uses Stack) A simple solution is to use a stack that keeps track of current open brackets.
{% highlight cpp %}
1) Create a stack. 
2) Traverse the string, do following for every character
     a) If current character is ‘(’ push it to the stack .
     b) If character is ‘)’, pop an element.
     c) Maintain maximum count during the traversal.
{% endhighlight %}
* Time Complexity : O(n) Auxiliary Space : O(n)
* Method 2 ( O(1) auxiliary space ) This can also be done without using stack.
{% highlight cpp %}
1) Take two variables max and current_max, initialize both of them as 0.
2) Traverse the string, do following for every character
    a) If current character is ‘(’, increment current_max and 
       update max value if required.
    b) If character is ‘)’. Check if current_max is positive or
       not (this condition ensure that parenthesis are balanced). 
       If positive that means we previously had a ‘(’ character 
       so decrement current_max without worry. 
       If not positive then the parenthesis are not balanced. 
       Thus return -1. 
3) If current_max is not 0, then return -1 to ensure that the parenthesis
   are balanced. Else return max
{% endhighlight %}
* Below is the implementation of above algorithm.
{% highlight c %}
// A C++ program to find the maximum depth of nested
// parenthesis in a given expression
#include <iostream>
using namespace std;

// function takes a string and returns the
// maximum depth nested parenthesis
int maxDepth(string S)
{
    int current_max = 0; // current count
    int max = 0;    // overall maximum count
    int n = S.length();

    // Traverse the input string
    for (int i = 0; i< n; i++)
    {
        if (S[i] == '(')
        {
            current_max++;

            // update max if required
            if (current_max> max)
                max = current_max;
        }
        else if (S[i] == ')')
        {
            if (current_max>0)
                current_max--;
            else
                return -1;
        }
    }

    // finally check for unbalanced string
    if (current_max != 0)
        return -1;

    return max;
}

// Driver program
int main()
{
    string s = "( ((X)) (((Y))) )";
    cout << maxDepth(s);
    return 0;
}
{% endhighlight %}
{% highlight python %}
# A Python program to find the maximum depth of nested
# parenthesis in a given expression

# function takes a string and returns the
# maximum depth nested parenthesis
def maxDepth(S):
    current_max = 0
    max = 0
    n = len(S)

    # Traverse the input string
    for i in xrange(n):
        if S[i] == '(':
            current_max += 1

            if current_max > max:
                max = current_max
        elif S[i] == ')':
            if current_max > 0:
                current_max -= 1
            else:
                return -1

    # finally check for unbalanced string
    if current_max != 0:
        return -1

    return max

# Driver program
s = "( ((X)) (((Y))) )"
print maxDepth(s)

# This code is contributed by BHAVYA JAIN
{% endhighlight %}
{% highlight cpp %}
4
{% endhighlight %}
* Time Complexity : O(n) Auxiliary Space : O(1)
* This article is contributed by Gaurav Sharma. Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

