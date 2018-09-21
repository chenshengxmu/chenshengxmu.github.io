---
layout: post
title: Decode a string recursively encoded as count followed by substring
---
* An encoded string (s) is given, the task is to decode it. The pattern in which the strings are encoded is as follows.
{% highlight cpp %}
<count>[sub_str] ==> The substring 'sub_str' 
                      appears count times.
{% endhighlight %}
* Examples:
{% highlight cpp %}
Input : str[] = "1[b]"
Output : b

Input : str[] = "2[ab]"
Output : abab

Input : str[] = "2[a2[b]]"
Output : abbabb

Input : str[] = "3[b2[ca]]"
Output : bcacabcacabcaca
{% endhighlight %}
* The idea is to use two stacks, one for integers and another for characters. Now, traverse the string,
* Below is implementation of this approach:
{% highlight cpp %}
// C++ program to decode a string recursively
// encoded as count followed substring
#include<bits/stdc++.h>
using namespace std;

// Returns decoded string for 'str'
string decode(string str)
{
    stack<int> integerstack;
    stack<char> stringstack;
    string temp = "", result = "";

    // Traversing the string
    for (int i = 0; i < str.length(); i++)
    {
        int count = 0;

        // If number, convert it into number
        // and push it into integerstack.
        if (str[i] >= '0' && str[i] <='9')
        {
            while (str[i] >= '0' && str[i] <= '9')
            {
                count = count * 10 + str[i] - '0';
                i++;
            }

            i--;
            integerstack.push(count);
        }

        // If closing bracket ']', pop elemment until
        // '[' opening bracket is not found in the
        // character stack.
        else if (str[i] == ']')
        {
            temp = "";
            count = 0;

            if (! integerstack.empty())
            {
                count = integerstack.top();
                integerstack.pop();
            }

            while (! stringstack.empty() && stringstack.top()!='[' )
            {
                temp = stringstack.top() + temp;
                stringstack.pop();
            }

            if (! stringstack.empty() && stringstack.top() == '[')
                stringstack.pop();

            // Repeating the popped string 'temo' count
            // number of times.
            for (int j = 0; j < count; j++)
                result = result + temp;

            // Push it in the character stack.
            for (int j = 0; j < result.length(); j++)
                stringstack.push(result[j]);

            result = "";
        }

        // If '[' opening bracket, push it into character stack.
        else if (str[i] == '[')
        {
            if (str[i-1] >= '0' && str[i-1] <= '9')
                stringstack.push(str[i]);

            else
            {
                stringstack.push(str[i]);
                integerstack.push(1);
            }
        }

        else
            stringstack.push(str[i]);
    }

    // Pop all the elmenet, make a string and return.
    while (! stringstack.empty())
    {
        result = stringstack.top() + result;
        stringstack.pop();
    }

    return result;
}

// Driven Program
int main()
{
    string str = "3[b2[ca]]";
    cout << decode(str) << endl;
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to decode a string recursively
// encoded as count followed substring

import java.util.Stack;

class Test
{
    // Returns decoded string for 'str'
    static String decode(String str)
    {
        Stack<Integer> integerstack = new Stack<>();
        Stack<Character> stringstack = new Stack<>();
        String temp = "", result = "";
     
        // Traversing the string
        for (int i = 0; i < str.length(); i++)
        {
            int count = 0;
     
            // If number, convert it into number
            // and push it into integerstack.
            if (Character.isDigit(str.charAt(i)))
            {
                while (Character.isDigit(str.charAt(i)))
                {
                    count = count * 10 + str.charAt(i) - '0';
                    i++;
                }
     
                i--;
                integerstack.push(count);
            }
     
            // If closing bracket ']', pop elemment until
            // '[' opening bracket is not found in the
            // character stack.
            else if (str.charAt(i) == ']')
            {
                temp = "";
                count = 0;
     
                if (!integerstack.isEmpty())
                {
                    count = integerstack.peek();
                    integerstack.pop();
                }
     
                while (!stringstack.isEmpty() && stringstack.peek()!='[' )
                {
                    temp = stringstack.peek() + temp;
                    stringstack.pop();
                }
     
                if (!stringstack.empty() && stringstack.peek() == '[')
                    stringstack.pop();
     
                // Repeating the popped string 'temo' count
                // number of times.
                for (int j = 0; j < count; j++)
                    result = result + temp;
     
                // Push it in the character stack.
                for (int j = 0; j < result.length(); j++)
                    stringstack.push(result.charAt(j));
     
                result = "";
            }
     
            // If '[' opening bracket, push it into character stack.
            else if (str.charAt(i) == '[')
            {
                if (Character.isDigit(str.charAt(i-1)))
                    stringstack.push(str.charAt(i));
     
                else
                {
                    stringstack.push(str.charAt(i));
                    integerstack.push(1);
                }
            }
     
            else
                stringstack.push(str.charAt(i));
        }
     
        // Pop all the elmenet, make a string and return.
        while (!stringstack.isEmpty())
        {
            result = stringstack.peek() + result;
            stringstack.pop();
        }
     
        return result;
    }

    // Driver method
    public static void main(String args[])
    {
        String str = "3[b2[ca]]";
        System.out.println(decode(str));
    }
}
{% endhighlight %}
{% highlight cpp %}
bcacabcacabcaca
{% endhighlight %}

