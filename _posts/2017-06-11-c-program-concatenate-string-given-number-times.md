---
layout: post
title: C++ program to concatenate a string given number of times
---
* Write a function which returns a new string which is made by concatenating a given string n number of times.
* Examples:
{% highlight cpp %}
Input : str = "geeks"
         n  = 3
Output : str = "geeksgeeksgeeks"
We concatenate "geeks" 3 times

Input : str = "for"
         n  = 2
Output : str = "forfor"
We concatenate "for" 2 times
{% endhighlight %}
{% highlight cpp %}
// C++ program to concatenate given string
// n number of times
#include <bits/stdc++.h>
#include <string>
using namespace std;

// Function which return string by concatenating it.
string repeat(string s, int n)
{
    // Copying given string to temparory string.
    string s1 = s;

    for (int i=1; i<n;i++)
        s += s1; // Concatinating strings

    return s;
}

// Driver code
int main()
{
    string s = "geeks";
    int n = 3;
    cout << repeat(s, n) << endl;;
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to concatenate given
// string n number of times

class GFG {
    
    // Function which return string by
    // concatenating it.
    static String repeat(String s, int n)
    {
        
        // Copying given string to 
        // temparory string.
        String s1 = s;
    
        for (int i = 1; i < n; i++)
        
            // Concatinating strings
            s += s1; 
    
        return s;
    }
    
    // Driver code
    public static void main(String[] args)
    {
        String s = "geeks";
        int n = 3;
        System.out.println(repeat(s, n));
    }
}

// This code is contributed by Smitha
{% endhighlight %}
{% highlight python %}
# Python 3 program to concatenate
# given string n number of times

# Function which return string by
# concatenating it.
def repeat(s, n):

    # Copying given string to 
    # temparory string.
    s1 = s

    for i in range(1, n):
        
        # Concatinating strings
        s += s1 

    return s

# Driver code
s = "geeks"
n = 3
print(repeat(s, n))

# This code is contributed 
# by Smitha
{% endhighlight %}
{% highlight cpp %}
geeksgeeksgeeks
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

