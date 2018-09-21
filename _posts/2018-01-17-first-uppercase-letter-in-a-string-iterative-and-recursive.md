---
layout: post
title: First uppercase letter in a string (Iterative and Recursive)
---
* Given a string find its first uppercase letter
* Examples :
{% highlight cpp %}
Input : geeksforgeeKs
Output : K

Input  : geekS
Output : S
{% endhighlight %}
* Method 1: linear search Using linear search, find the first character which is capital
{% highlight cpp %}
// C++ program to find the first
// uppercase letter using linear search
#include <bits/stdc++.h>
using namespace std;

// Function to find string which has
// first character of each word.
char first(string str)
{
    for (int i = 0; i < str.length(); i++)
        if (isupper(str[i]))
            return str[i];
    return 0;
}

// Driver code
int main()
{
    string str = "geeksforGeeKS";
    char res = first(str);
    if (res == 0)
        cout << "No uppercase letter";
    else
        cout << res << "\n";
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to find the first
// uppercase letter using linear search
import java.io.*;
import java.util.*;

class GFG {

    // Function to find string which has
    // first character of each word.
    static char first(String str)
    {
        for (int i = 0; i < str.length(); i++)
            if (Character.isUpperCase(str.charAt(i)))
                return str.charAt(i);
        return 0;
    }
    
    // Driver program 
    public static void main(String args[])
    {
        String str = "geeksforGeeKS";
        char res = first(str);
        if (res == 0)
            System.out.println("No uppercase letter");
        else
            System.out.println(res);
    }
}


// This code is contributed
// by Nikita Tiwari.
{% endhighlight %}
{% highlight python %}
# Python3 program to find the first
# uppercase letter using linear search

# Function to find string which has
# first character of each word.
def first(str) :
    
    for i in range(0, len(str)) :
        
        if (str[i].istitle()) :
            return str[i]
            
    return 0


# Driver code
str = "geeksforGeeKS"
res = first(str)

if (res == 0) :
    print("No uppercase letter")
    
else :
    print(res)
    
    
# This code is contributed by Nikita Tiwari
{% endhighlight %}
{% highlight cpp %}
G
{% endhighlight %}
* Method 2 (Using recursion) Recursively traverse the string and if any uppercase is found return that character
{% highlight cpp %}
// C++ program to find the
// first uppercase letter.
#include <bits/stdc++.h>
using namespace std;

// Function to find string which has
// first character of each word.
char first(string str, int i=0)
{
    if (str[i] == '\0')
         return 0;
    if (isupper(str[i])) 
            return str[i];
    return first(str, i+1);
}

// Driver code
int main()
{
    string str = "geeksforGeeKS";
    char res = first(str);
    if (res == 0)
        cout << "No uppercase letter";
    else
        cout << res << "\n";
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to find the
// first uppercase letter.
import java.io.*;

class GFG {
    
    // Function to find string which has
    // first character of each word.
    static char first(String str, int i)
    {
        if (str.charAt(i) == '\0')
            return 0;
        if (Character.isUpperCase(str.charAt(i))) 
                return str.charAt(i);
        return first(str, i + 1);
    }
    
    // Driver code
    public static void main(String args[])
    {
        String str = "geeksforGeeKS";
        char res = first(str,0);
        if (res == 0)
            System.out.println("No uppercase letter");
        else
            System.out.println (res );
    }
}

// This code is contributed 
// by Nikita Tiwari.
{% endhighlight %}
{% highlight python %}
# Python 3 program to find the
# first uppercase letter.
#include <bits/stdc++.h>

# Function to find string which has
# first character of each word.
def first(str, i):

    if (str[i] == '\0'):
        return 0
    if (str[i].isupper()):
        return str[i]
    return first(str, i+1)

# Driver code
str = "geeksforGeeKS"
res = first(str,0)
if (res == 0):
    print("No uppercase letter")
else:
    print(res)

# This code is contributed 
# by Smitha
{% endhighlight %}
{% highlight cpp %}
G
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

