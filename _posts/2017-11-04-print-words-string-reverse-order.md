---
layout: post
title: Print words of a string in reverse order
---
* Let there be a string say “I AM A GEEK”. So, the output should be “GEEK A AM I” . This can done in many ways. One of the solutions is given in Reverse words in a string .
* Examples:
{% highlight cpp %}
Input : I AM A GEEK
Output : GEEK A AM I

Input : GfG IS THE BEST
Output : BEST THE IS GfG
{% endhighlight %}
* This can be done in more simpler way by using the property of the “%s format specifier” .
* Property: %s will get all the values until it gets NULL i.e. ‘\0’.
* Example: char String[] = “I AM A GEEK” is stored as shown in the image below :
* Approach: Traverse the string from the last character, and move towards the first character. While traversing, if a space character is encountered, put a NULL in that position and print the remaining string just after the NULL character. Repeat this until the loop is over and when the loop ends, print the string, the %s will make the printing of characters until it encounters the first NULL character.
* Let us see the approach with the help of diagrams:
* step 1: Traverse from the last character until it encounters a space character .
* Step 2: Put a NULL character at the position of space character and print the string after it.
* Step 3: At the end, the loop ends when it reaches the first character, so print the remaining characters, it will be printed the first NULL character, hence the first word will be pprinted.
{% highlight cpp %}
// C++ program to print reverse 
// of words in a string.
#include<iostream>

using namespace std;

string wordReverse(string str)
{
    int i = str.length() - 1;
    int start, end = i + 1;
    string result = "";
    
    while(i >= 0)
    {
        if(str[i] == ' ')
        {
            start = i + 1;
            while(start != end)
                result += str[start++];
            
            result += ' ';
            
            end = i;
        }
        i--;
    }
    start = 0;
    while(start != end)
        result += str[start++];
    
    return result;
}

// Driver code
int main()
{
    string str = "I AM A GEEK";
    
    cout << wordReverse(str);
    
    return 0;
}

// This code is contributed 
// by Imam
{% endhighlight %}
{% highlight c %}
// C program to print reverse of words in
// a string.
#include <stdio.h>
#include <string.h>

void printReverse(char str[])
{
    int length = strlen(str);

    // Traverse string from end
    int i;
    for (i = length - 1; i >= 0; i--) {
        if (str[i] == ' ') {

            // putting the NULL character at the 
            // position of space characters for
            // next iteration.         
            str[i] = '\0';

            // Start from next charatcer     
            printf("%s ", &(str[i]) + 1);
        }
    }

    // printing the last word
    printf("%s", str);
}

// Driver code
int main()
{
    char str[] = "I AM A GEEK";
    printReverse(str);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// java program to print reverse 
// of words in a string.
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG
{
static String wordReverse(String str)
{
    int i = str.length() - 1;
    int start, end = i + 1;
    String result = "";
    
    while(i >= 0)
    {
        if(str.charAt(i) == ' ')
        {
            start = i + 1;
            while(start != end)
                result += str.charAt(start++);
            
            result += ' ';
            
            end = i;
        }
        i--;
    }
    
    start = 0;
    while(start != end)
        result += str.charAt(start++);
    
    return result;
}

// Driver code
public static void main(String[] args)
{
    String str = "I AM A GEEK";
    
    System.out.print(wordReverse(str));
}
}

// This code is contributed 
// by Akanksha Rai(Abby_akku)
{% endhighlight %}
{% highlight cpp %}
GEEK A AM I
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

