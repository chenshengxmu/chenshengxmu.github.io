---
layout: post
title: Check if given string can be split into four distinct strings
---
* Given a string, the task is to check if we can split it into 4 string such that each string is non-empty and different from each other.
* Examples:
{% highlight cpp %}
Input : str[] = "geeksforgeeks"
Output : Yes
"geeks", "for", "gee", "ks" are four 
distinct strings that can form from
given string.

Input : str[] = "aaabb"
Output : No
{% endhighlight %}
* Observe if the length of the string is greater than or equal to 10, then every time can split into four parts. Suppose, the length is of 10, then string of length 1, 2, 3, 4 can be made. For string having length less than 10, we can use brute force i.e iterate through the all possible ways of splitting the string and check each one.
{% highlight cpp %}
If length is more than 10
   return true
Else (If length is less than 10)
   Use Brute Force method to check
   if we can break it in four distinct
   strings.
{% endhighlight %}
* Below is C++ implementation of above idea.
{% highlight cpp %}
// C++ program to check if we can break a string
// into four distinct strings.
#include<bits/stdc++.h>
using namespace std;

// Return if the given string can be spilt or not.
bool check(string s)
{
    // We can always break a string of size 10 or
    // more into four distinct strings.
    if (s.size() >= 10)
        return true;

    // Brute Force
    for (int i =1; i < s.size(); i++)
    {
        for (int j = i + 1; j < s.size(); j++)
        {
            for (int k = j + 1; k < s.size(); k++)
            {
                // Making 4 string from the given string
                string s1 = s.substr(0, i);
                string s2 = s.substr(i, j - i);
                string s3 = s.substr(j, k - j);
                string s4 = s.substr(k, s.size() - k);

                // Checking if they are distinct or not.
                if (s1 != s2 && s1 != s3 && s1 != s4 &&
                        s2 != s3 && s2 != s4 && s3 != s4)
                    return true;
            }
        }
    }

    return false;
}

// Driven Program
int main()
{
    string str = "aaabb";

    (check(str))? (cout << "Yes" << endl):
                  (cout << "No" << endl);

    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
No
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

