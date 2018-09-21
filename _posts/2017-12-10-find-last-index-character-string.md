---
layout: post
title: Find last index of a character in a string
---
* Given a string str and a character x, find last index of x in str.
* Examples :
{% highlight cpp %}
Input : str = "geeks", x = 'e'
Output : 2
Last index of 'e' in "geeks" is: 2 

Input : str = "Hello world!", x = 'o'
Output : 7
Last index of 'o' is: 7
{% endhighlight %}
* Method 1 (Simple : Traverse from left) : Traverse given string from left to right and keep updating index whenever x matches with current character.
{% highlight cpp %}
// CPP program to find last index of
// character x in given string.
#include <iostream>
using namespace std;

// Returns last index of x if it is present.
// Else returns -1.
int findLastIndex(string& str, char x)
{
    int index = -1;
    for (int i = 0; i < str.length(); i++)
        if (str[i] == x)
            index = i;
    return index;
}

// Driver code
int main()
{
    // String in which char is to be found
    string str = "geeksforgeeks";

    // char whose index is to be found
    char x = 'e';
    int index = findLastIndex(str, x);
    if (index == -1)
        cout << "Character not found";
    else
        cout << "Last index is " << index;
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to find last index
// of character x in given string.
import java.io.*;

class GFG {
 
// Returns last index of x if
// it is present Else returns -1.
static int findLastIndex(String str, Character x)
{
    int index = -1;
    for (int i = 0; i < str.length(); i++)
        if (str.charAt(i) == x)
            index = i;
    return index;
}
 
// Driver code
public static void main(String[] args)
{
    // String in which char is to be found
    String str = "geeksforgeeks";

    // char whose index is to be found
    Character x = 'e';

    int index = findLastIndex(str, x);
    if (index == -1)
        System.out.println("Character not found");
    else
        System.out.println("Last index is " + index);
}
}

/* This code is contributed by Prerna Saini */
{% endhighlight %}
{% highlight python %}
# A Python program to find last
# index of character x in given
# string.

# Returns last index of x if it
# is present. Else returns -1.
def findLastIndex(str, x):
    index = -1
    for i in range(0, len(str)):
        if str[i] == x:
            index = i
    return index

# Driver program

# String in which char is to be found
str = "geeksforgeeks"

# char whose index is to be found
x = 'e'

index = findLastIndex(str, x)

if index == -1:
    print("Character not found")
else:
    print('Last index is', index)

# This code is contributed by shrikant13.
{% endhighlight %}
{% highlight cpp %}
Last index is 10
{% endhighlight %}
* Time Complexity : Θ(n)
* Method 2 (Efficient : Traverse from right) : In above method 1, we always traverse complete string. In this method, we can avoid complete traversal in all those cases when x is present. The idea is to traverse from right side and stop as soon as we find character.
{% highlight cpp %}
// Simple CPP program to find last index of
// character x in given string.
#include <iostream>
using namespace std;

// Returns last index of x if it is present.
// Else returns -1.
int findLastIndex(string& str, char x)
{
    // Traverse from right
    for (int i = str.length() - 1; i >= 0; i--)
        if (str[i] == x)
            return i;

    return -1;
}

// Driver code
int main()
{
    string str = "geeksforgeeks";
    char x = 'e';
    int index = findLastIndex(str, x);
    if (index == -1)
        cout << "Character not found";
    else
        cout << "Last index is " << index;
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java code to find last index
// character x in given string.
import java.io.*;
class GFG {
 
// Returns last index of x if
// it is present. Else returns -1.
static int findLastIndex(String str, Character x)
{
    // Traverse from right
    for (int i = str.length() - 1; i >= 0; i--)
        if (str.charAt(i) == x)
            return i;

    return -1;
}
 
// Driver code
public static void main(String[] args)
{
    String str = "geeksforgeeks";
    Character x = 'e';
    int index = findLastIndex(str, x);
    if (index == -1)
        System.out.println("Character not found");
    else
        System.out.println("Last index is " + index);
}
}
// This code is contributed by Prerna Saini
{% endhighlight %}
{% highlight python %}
# Simple Python3 program to find last
# index of character x in given string.

# Returns last index of x if it is 
# present. Else returns -1.
def findLastIndex(str, x):

    # Traverse from right
    for i in range(len(str) - 1, -1,-1):
        if (str[i] == x):
            return i

    return -1

# Driver code
str = "geeksforgeeks"
x = 'e'
index = findLastIndex(str, x)

if (index == -1):
    print("Character not found")
else:
    print("Last index is " ,index)

# This code is contributed by Smitha
{% endhighlight %}
{% highlight cpp %}
Last index is 10
{% endhighlight %}
* Time Complexity : O(n)
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

