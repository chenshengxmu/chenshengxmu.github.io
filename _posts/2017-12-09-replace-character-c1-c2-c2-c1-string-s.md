---
layout: post
title: Replace a character c1 with c2 and c2 with c1 in a string S
---
* Given a string S, c1 and c2. Replace character c1 with c2 and c2 with c1. Examples:
{% highlight cpp %}
Input : grrksfoegrrks,
        c1 = e, c2 = r 
Output : geeksforgeeks 

Input : ratul,
        c1 = t, c2 = h 
Output : rahul
{% endhighlight %}
* Traverse through the string and check for the occurrences of c1 and c2. If c1 is found then replace it with c2 and else if c2 is found replace it with c1.
{% highlight cpp %}
// CPP program to replace c1 with c2
// and c2 with c1
#include <bits/stdc++.h>
using namespace std;
string replace(string s, char c1, char c2)
{
    int l = s.length();

    // loop to traverse in the string
    for (int i = 0; i < l; i++) {

        // check for c1 and replace
        if (s[i] == c1)
            s[i] = c2;

        else if (s[i] == c2)
            s[i] = c1;
    }
    return s;
}

// Driver code to check the above function
int main()
{
    string s = "grrksfoegrrks";
    char c1 = 'e', c2 = 'r';
    cout << replace(s, c1, c2);
    return 0;
}
{% endhighlight %}
{% highlight cpp %}
geeksforgeeks
{% endhighlight %}
* Time Complexity: O(n)
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

