---
layout: post
title: Generate all binary strings from given pattern
---
* Given a string containing of ‘0’, ‘1’ and ‘?’ wildcard characters, generate all binary strings that can be formed by replacing each wildcard character by ‘0’ or ‘1’. Example :
{% highlight cpp %}
Input str = "1??0?101"
Output: 
        10000101
        10001101
        10100101
        10101101
        11000101
        11001101
        11100101
        11101101
{% endhighlight %}
* Method 1 (Using Recursion) We pass index of next character to the recursive function. If the current character is a wildcard character ‘?’, we replace it by ‘0’ or ‘1’ and recurse for remaining characters. We print the string if we reaches its end.
* Below is recursive the implementation.
{% highlight cpp %}
// Recursive C++ program to generate all binary strings
// formed by replacing each wildcard character by 0 or 1
#include <iostream>
using namespace std;

// Recursive function to generate all binary strings
// formed by replacing each wildcard character by 0 or 1
void print(string str, int index)
{
    if (index == str.size())
    {
        cout << str << endl;
        return;
    }

    if (str[index] == '?')
    {
        // replace '?' by '0' and recurse
        str[index] = '0';
        print(str, index + 1);

        // replace '?' by '1' and recurse
        str[index] = '1';
        print(str, index + 1);

        // No need to backtrack as string is passed
        // by value to the function
    }
    else
        print(str, index + 1);
}

// Driver code to test above function
int main()
{
    string str = "1??0?101";

    print(str, 0);

    return 0;
}
{% endhighlight %}
{% highlight java %}
// Recursive Java program to generate all 
// binary strings formed by replacing 
// each wildcard character by 0 or 1 
import java.util.*;
import java.lang.*;
import java.io.*;

class binStr
{   
    // Recursive function to generate all binary
    // strings formed by replacing each wildcard
    // character by 0 or 1 
    public static void print(char str[], int index)
    {
        if (index == str.length)
        {
            System.out.println(str);
            return;
        }

        if (str[index] == '?')
        {
            // replace '?' by '0' and recurse
            str[index] = '0';
            print(str, index + 1);
            
            // replace '?' by '1' and recurse
            str[index] = '1';
            print(str, index + 1);
            
            // NOTE: Need to backtrack as string
            // is passed by reference to the
            // function
            str[index] = '?';
        }
        else
            print(str, index + 1);
    }

    // driver code
    public static void main (String[] args)
    {
        String input = "1??0?101";
        char[] str = input.toCharArray();
        print(str, 0);
    }
}

// This code is contributed by Chhavi
{% endhighlight %}
{% highlight cpp %}
10000101
10001101
10100101
10101101
11000101
11001101
11100101
11101101
{% endhighlight %}
*   Method 2 (Using Queue) We can also achieve this by using iteration. The idea is to use queue. We find position of first occurrence of wildcard character in the input string and replace it by ‘0’ , then ‘1’ and push both strings into the queue. Then we pop next string from the queue, and repeat the process till queue is empty. If no wildcard characters are left, we simply print the string.
* Iterative C++ implementation using queue.
{% highlight cpp %}
// Iterative C++ program to generate all binary
// strings formed by replacing each wildcard
// character by 0 or 1
#include <iostream>
#include <queue>
using namespace std;

// Iterative function to generate all binary strings
// formed by replacing each wildcard character by 0
// or 1
void print(string str)
{
    queue<string> q;
    q.push(str);

    while (!q.empty())
    {
        string str = q.front();

        // find position of first occurrence of wildcard
        size_t index = str.find('?');

        // If no matches were found,
        // find returns string::npos
        if(index != string::npos)
        {
            // replace '?' by '0' and push string into queue
            str[index] = '0';
            q.push(str);

            // replace '?' by '1' and push string into queue
            str[index] = '1';
            q.push(str);
        }

        else
            // If no wildcard characters are left,
            // print the string.
            cout << str << endl;

        q.pop();
    }
}

// Driver code to test above function
int main()
{
    string str = "1??0?101";

    print(str);

    return 0;
}
{% endhighlight %}
{% highlight cpp %}
10000101
10001101
10100101
10101101
11000101
11001101
11100101
11101101
{% endhighlight %}

