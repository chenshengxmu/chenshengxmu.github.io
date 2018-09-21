---
layout: post
title: Function to copy string (Iterative and Recursive)
---
* Given two strings, copy one string to other using recursion. We basically need to write our own recursive version of strcpy in C/C++
* Examples:
{% highlight cpp %}
Input : s1 = "hello"
        s2 = "geeksforgeeks"
Output : s2 = "hello"

Input :  s1 = "geeksforgeeks"
         s2 = ""
Output : s2 = "geeksforgeeks"
{% endhighlight %}
* Iterative : Copy every character from s1 to s2 starting from index = 0 and in each call increase the index by 1 until s1 doesn’t reach to end;
{% highlight cpp %}
// Iterative CPP Program to copy one String  
// to another.
#include <bits/stdc++.h>
using namespace std;

// Function to copy one string to other
// assuming that other string has enough
// space.
void myCopy(char s1[], char s2[])
{
    int i = 0;
    for (i=0; s1[i] != '\0'; i++)
       s2[i] = s1[i];
    s2[i] = '\0';
}

// Driver function
int main()
{
    char s1[100] = "GEEKSFORGEEKS";
    char s2[100] = "";
    myCopy(s1, s2);
    cout << s2;
    return 0;
}
{% endhighlight %}
{% highlight cpp %}
GEEKSFORGEEKS
{% endhighlight %}
* Recursive : Copy every character from s1 to s2 starting from index = 0 and in each call increase the index by 1 until s1 doesn’t reach to end;
{% highlight cpp %}
// CPP Program to copy one String to 
// another using Recursion
#include <bits/stdc++.h>
using namespace std;

// Function to copy one string in to other
// using recursion
void myCopy(char s1[], char s2[], int index = 0)
{
    // copying each character from s1 to s2
    s2[index] = s1[index]; 

    // if string reach to end then stop 
    if (s1[index] == '\0')  
        return;

    // increase character index by one
    myCopy(s1, s2, index + 1); 
}

// Driver function
int main()
{
    char s1[100] = "GEEKSFORGEEKS";
    char s2[100] = "";
    myCopy(s1, s2);
    cout << s2;
    return 0;
}
{% endhighlight %}
{% highlight cpp %}
GEEKSFORGEEKS
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

