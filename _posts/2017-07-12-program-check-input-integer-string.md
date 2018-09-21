---
layout: post
title: Program to check if input is an integer or a string
---
* Write a function to check whether a given input is an integer or a string.
* Definition of an integer :
{% highlight cpp %}
Every element should be a valid digit, i.e '0-9'.
{% endhighlight %}
* Definition of a string :
{% highlight cpp %}
Any one element should be an invalid digit, i.e any symbol other than '0-9'.
{% endhighlight %}
* Examples:
{% highlight cpp %}
Input : 127
Output : Integer
Explanation : All digits are in the range '0-9'.

Input : 199.7
Output : String
Explanation : A dot is present. 

Input : 122B
Output : String
Explanation : A alphabet is present.
{% endhighlight %}
* The idea is to use isdigit() function and is_numeric() function.. Below is the implementation of above idea.
{% highlight cpp %}
// CPP program to check if a given string
// is a valid integer
#include <iostream>
using namespace std;

// Returns true if s is a number else false
bool isNumber(string s)
{
    for (int i = 0; i < s.length(); i++)
        if (isdigit(s[i]) == false)
            return false;

    return true;
}

// Driver code
int main()
{
    // Saving the input in a string
    string str = "6790";

    // Function returns 1 if all elements
    // are in range '0-9'
    if (isNumber(str))
        cout << "Integer";

    // Function returns 0 if the input is
    // not an integer
    else
        cout << "String";
}
{% endhighlight %}
{% highlight java %}
// Java program to check if a given 
// string is a valid integer
import java.io.*;

public class GFG{

    // Returns true if s is 
    // a number else false
    static boolean isNumber(String s)
    {
        for (int i = 0; i < s.length(); i++)
        if (Character.isDigit(s.charAt(i)) 
            == false)
            return false;

        return true;
    }

    // Driver code
    static public void main (String[] args)
    {
        // Saving the input in a string
          String str = "6790";

        // Function returns 1 if all elements
        // are in range '0 - 9'
        if (isNumber(str))
            System.out.println("Integer");

        // Function returns 0 if the 
        // input is not an integer
        else
            System.out.println("String");
        
    }
}

// This code is contributed by vt_m.
{% endhighlight %}
{% highlight cpp %}
Integer
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

