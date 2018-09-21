---
layout: post
title: Maximum consecutive repeating character in string
---
* Given a string, the task is to find maximum consecutive repeating character in string.
* Note : We do not need to consider overall count, but the count of repeating that appear at one place.
* Examples:
{% highlight cpp %}
Input : str = "geeekk"
Output : e

Input : str = "aaaabbcbbb"
Output : a
{% endhighlight %}
* Asked in Amazon
* The Simple solution of this problem is to use two for loops. The outer loop considers current character, the inner loop counts occurrences of current character. If the count goes beyond current maximum count, we update the result.
{% highlight cpp %}
// C++ program to find the maximum consecutive
// repeating character in given string
#include<bits/stdc++.h>
using namespace std;

// function to find out the maximum repeating
// character in given string
char maxRepeating(string str)
{
    int len = str.length();
    int count = 0;

    // Find the maximum repeating character
    // starting from str[i]
    char res = str[0];
    for (int i=0; i<len; i++)
    {
        int cur_count = 1;
        for (int j=i+1; j<len; j++)
        {
            if (str[i] != str[j])
                break;
            cur_count++;
        }

        // Update result if required
        if (cur_count > count)
        {
            count = cur_count;
            res = str[i];
        }
    }
    return res;
}

// Driver code
int main()
{

    string str = "aaaabbaaccde";
    cout << maxRepeating(str);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to find the maximum consecutive
// repeating character in given string
public class GFG {
    
    // function to find out the maximum repeating
    // character in given string
    static char maxRepeating(String str)
    {
        int len = str.length();
        int count = 0;

        // Find the maximum repeating character
        // starting from str[i]
        char res = str.charAt(0);
        for (int i=0; i<len; i++)
        {
            int cur_count = 1;
            for (int j=i+1; j<len; j++)
            {
                if (str.charAt(i) != str.charAt(j))
                    break;
                cur_count++;
            }

            // Update result if required
            if (cur_count > count)
            {
                count = cur_count;
                res = str.charAt(i);
            }
        }
        return res;
    }

    // Driver code
    public static void main(String args[])
    {

        String str = "aaaabbaaccde";
        System.out.println(maxRepeating(str));
    }
}
// This code is contributed by Sumit Ghosh
{% endhighlight %}
{% highlight cpp %}
a
{% endhighlight %}
* Time Complexity : O(n^2) Space Complexity : O(1)
* An efficient solution is to run only one loop. The idea is to reset the count as 1 as soon as we find a character not matching with previous.
{% highlight cpp %}
// C++ program to find the maximum consecutive
// repeating character in given string
#include<bits/stdc++.h>
using namespace std;

// Returns the maximum repeating character in a
// given string
char maxRepeating(string str)
{
    int n = str.length();
    int count = 0;
    char res = str[0];
    int cur_count = 1;

    // Traverse string except last character
    for (int i=0; i<n; i++)
    {
        // If current character matches with next
        if (i < n-1 && str[i] == str[i+1])
            cur_count++;

        // If doesn't match, update result
        // (if required) and reset count
        else
        {
            if (cur_count > count)
            {
                count = cur_count;
                res = str[i];
            }
            cur_count = 1;
        }
    }

    return res;
}

// Driver code
int main()
{
    string str = "aaaabbaaccde";
    cout << maxRepeating(str);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to find the maximum consecutive
// repeating character in given string
class GFG {
    
    // function to find out the maximum repeating
    // character in given string
    static char maxRepeating(String str)
    {
        int n = str.length();
        int count = 0;
        char res = str.charAt(0);
        int cur_count = 1;

        // Traverse string except last character
        for (int i = 0; i < n; i++)
        {
            // If current character matches with next
            if (i < n - 1 && str.charAt(i) == str.charAt(i + 1))
                cur_count++;

            // If doesn't match, update result
            // (if required) and reset count
            else
            {
                if (cur_count > count)
                {
                    count = cur_count;
                    res = str.charAt(i);
                }
                cur_count = 1;
            }
        }
        return res;
    }

    // Driver code
    public static void main(String args[])
    {
        String str = "aaaabbaaccde";
        System.out.println(maxRepeating(str));
    }
}

// This code is contributed by Sudeep Mukherjee
{% endhighlight %}
* Output:
{% highlight cpp %}
a
{% endhighlight %}
* Time Complexity : O(n) Space Complexity : O(1)
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

