---
layout: post
title: Cost to Balance the parantheses
---
* Parenthesis are said to be balanced when every opening brace has a closing brace like “()()” or “(())” or “(()())” etc. Incorrect balancing includes “)(” or “))((”  etc. The task here is to correct the sequence of parenthesis in such a way that it is done in minimum cost. And shifting of parenthesis by over one parentheses costs 1. If the parenthesis can’t be balanced then print -1.
* Examples :
* Input : () Output : 0 Explanation : Already balanced
* Input : ))(( Output : 4 Explanation : Firstly, ) at position 1st goes to the last position, costing 3, so we get )((). Then, ) at position 1st goes to the 2nd position costing 1. So, finally we get ()(). Therefore, the total cost is 4.
* Algorithm :
* Below is the implementation of above approach :
{% highlight cpp %}
// CPP code to calculate the minimum cost
// to make the given parentheses balanced
#include <bits/stdc++.h>
using namespace std;

int costToBalance(string s)
{
    if (s.length() == 0)
        cout << 0 << endl;

    // To store absolute count of
    // balanced and unbalanced parenthesis
    int ans = 0;

    // o(open bracket) stores count of '(' and
    // c(close bracket) stores count of ')'
    int o = 0, c = 0;

    for (int i = 0; i < s.length(); i++) {
        if (s[i] == '(')
            o++;
        if (s[i] == ')')
            c++;
    }

    if (o != c)
        return -1;

    int a[s.size()];
    if (s[0] == '(')
        a[0] = 1;
    else
        a[0] = -1;

    if (a[0] < 0)
        ans += abs(a[0]);

    for (int i = 1; i < s.length(); i++) {
        if (s[i] == '(')
            a[i] = a[i - 1] + 1;
        else
            a[i] = a[i - 1] - 1;
        if (a[i] < 0)
            ans += abs(a[i]);
    }

    return ans;
}

// Driver code
int main()
{
    string s;
    s = ")))(((";

    cout << costToBalance(s) << endl;

    s = "))((";
    cout << costToBalance(s) << endl;

    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java code to calculate the 
// minimum cost to make the 
// given parentheses balanced
import java.io.*;

class GFG
{
    static int costToBalance(String s)
    {
        if (s.length() == 0)
            System.out.println(0);
    
        // To store absolute count 
        // of balanced and unbalanced 
        // parenthesis
        int ans = 0;
    
        // o(open bracket) stores count
        // of '(' and c(close bracket) 
        // stores count of ')'
        int o = 0, c = 0;
    
        for (int i = 0; i < s.length(); i++) 
        {
            if (s.charAt(i) == '(')
                o++;
            if (s.charAt(i) == ')')
                c++;
        }
    
        if (o != c)
            return -1;
    
        int []a = new int[s.length()];
        if (s.charAt(0) == '(')
            a[0] = 1;
        else
            a[0] = -1;
    
        if (a[0] < 0)
            ans += Math.abs(a[0]);
    
        for (int i = 1; i < s.length(); i++) 
        {
            if (s.charAt(i) == '(')
                a[i] = a[i - 1] + 1;
            else
                a[i] = a[i - 1] - 1;
            if (a[i] < 0)
                ans += Math.abs(a[i]);
        }
    
        return ans;
    }
    
    // Driver code
    public static void main(String args[])
    {
        String s;
        s = ")))(((";
    
        System.out.println(costToBalance(s));
    
        s = "))((";
        System.out.println(costToBalance(s));
    }
}

// This code is contributed by
// Manish Shaw(manishshaw1)
{% endhighlight %}
{% highlight cpp %}
9
4
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

