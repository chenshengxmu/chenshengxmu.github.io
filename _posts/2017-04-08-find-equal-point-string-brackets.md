---
layout: post
title: Find an equal point in a string of brackets
---
* Given a string of brackets, the task is to find an index k which decides the number of opening brackets is equal to the number of closing brackets. String must be consists of only opening and closing brackets i.e. ‘(‘ and ‘)’.
* An equal point is an index such that the number of opening brackets before it is equal to the number of closing brackets from and after.
* Examples:
{% highlight cpp %}
Input : str = "(())))("
Output:   4
After index 4, string splits into (())
and ))(. Number of opening brackets in the 
first part is equal to number of closing 
brackets in the second part.

Input : str = "))"
Output: 2
As after 2nd position i.e. )) and "empty"
string will be split into these two parts:
So, in this number of opening brackets i.e.
0 in the first part is equal to number of 
closing brackets in the second part i.e. 
also 0.
{% endhighlight %}
* Asked in : Amazon
{% highlight cpp %}
// C++ program to find an index k which
// decides the number of opening brackets
// is equal to the number of closing brackets
#include<bits/stdc++.h>
using namespace std;

// Function to find an equal index
int findIndex(string str)
{
    int len = str.length();
    int open[len+1], close[len+1];
    int index = -1;
    memset(open, 0, sizeof (open));
    memset(close, 0, sizeof (close));

    open[0] = 0;
    close[len] = 0;
    if (str[0]=='(')
        open[1] = 1;
    if (str[len-1] == ')')
        close[len-1] = 1;

    // Store the number of opening brackets
    // at each index
    for (int i = 1; i < len; i++)
    {
        if ( str[i] == '(' )
            open[i+1] = open[i] + 1;
        else
            open[i+1] = open[i];
    }

    // Store the number of closing brackets
    // at each index
    for (int i = len-2; i >= 0; i--)
    {
        if ( str[i] == ')' )
            close[i] = close[i+1] + 1;
        else
            close[i] = close[i+1];
    }

    // check if there is no opening or closing
    // brackets
    if (open[len] == 0)
        return len;
    if (close[0] == 0)
        return 0;

    // check if there is any index at which
    // both brackets are equal
    for (int i=0; i<=len; i++)
        if (open[i] == close[i])
            index = i;

    return index;
}

// Driver code
int main()
{
    string str = "(()))(()()())))";
    cout << findIndex(str);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to find an index k which
// decides the number of opening brackets
// is equal to the number of closing brackets

public class GFG 
{
    // Method to find an equal index
    static int findIndex(String str)
    {
        int len = str.length();
        int open[] = new int[len+1];
        int    close[] = new int[len+1];
        int index = -1;
     
        open[0] = 0;
        close[len] = 0;
        if (str.charAt(0)=='(')
            open[1] = 1;
        if (str.charAt(len-1) == ')')
            close[len-1] = 1;
     
        // Store the number of opening brackets
        // at each index
        for (int i = 1; i < len; i++)
        {
            if ( str.charAt(i) == '(' )
                open[i+1] = open[i] + 1;
            else
                open[i+1] = open[i];
        }
     
        // Store the number of closing brackets
        // at each index
        for (int i = len-2; i >= 0; i--)
        {
            if ( str.charAt(i) == ')' )
                close[i] = close[i+1] + 1;
            else
                close[i] = close[i+1];
        }
     
        // check if there is no opening or closing
        // brackets
        if (open[len] == 0)
            return len;
        if (close[0] == 0)
            return 0;
    
        // check if there is any index at which
        // both brackets are equal
        for (int i=0; i<=len; i++)
            if (open[i] == close[i])
                index = i;
     
        return index;
    }
    
    // Driver Method
    public static void main(String[] args)
    {
        String str = "(()))(()()())))";
        System.out.println(findIndex(str));
    }
}
{% endhighlight %}
{% highlight python %}
# Method to find an equal index
def findIndex(str):
    l = len(str)
    open = [None] * (l + 1)
    close = [None] * (l + 1)
    index = -1
    
    open[0] = 0
    close[l] = 0
    if (str[0]=='('):
        open[1] = 1
    if (str[l - 1] == ')'):
        close[l - 1] = 1
    
    # Store the number of
    # opening brackets
    # at each index
    for i in range(1, l):
        if (str[i] == '('):
            open[i + 1] = open[i] + 1
        else:
            open[i + 1] = open[i]
    
    # Store the number
    # of closing brackets
    # at each index
    for i in range(l - 2, -1, -1):
        if ( str[i] == ')'):
            close[i] = close[i + 1] + 1
        else:
            close[i] = close[i + 1]
    
    # check if there is no 
    # opening or closing brackets
    if (open[l] == 0):
        return len
    if (close[0] == 0):
        return 0
    
    # check if there is any 
    # index at which both
    # brackets are equal
    for i in range(l + 1):
        if (open[i] == close[i]):
            index = i
    
    return index
    
# Driver Code
str = "(()))(()()())))"
print(findIndex(str))

# This code is contributed 
# by ChitraNayal
{% endhighlight %}
{% highlight cpp %}
9
{% endhighlight %}
* Time Complexity : O(n)
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

