---
layout: post
title: URLify a given string (Replace spaces is %20)
---
* Write a method to replace all the spaces in a string with ‘%20’. You may assume that the string has sufficient space at the end to hold the additional characters, and that you are given the “true” length of the string.
* Examples:
{% highlight cpp %}
Input : "Mr John Smith", 13
Output : Mr%20John%20Smith

Input : "Mr John Smith   ", 13
Output : Mr%20John%20Smith
{% endhighlight %}
* A simple solution is to create an auxiliary string and copy characters one by one. Whenever a space is encountered, place %20 in place of it.
* A better solution to do in-place assuming that we have extra space in input string. We fist count number of spaces in input string. Using this count, we can find length of the modified (or result) string. After computing new length we fill the string in-place from end.
{% highlight c %}
// C++ program to replace spaces with %20
#include<stdio.h>

// Maximum length of string after modifications.
const int MAX = 1000;

// Replaces spaces with %20 in-place and returns
// new length of modified string. It returns -1
// if modified string cannot be stored in str[]
int replaceSpaces(char str[])
{
    // count spaces and find current length
    int space_count = 0, i;
    for (i = 0; str[i]; i++)
        if (str[i] == ' ')
            space_count++;

    // Remove trailing spaces
    while (str[i-1] == ' ')
    {
       space_count--;
       i--;
    }

    // Find new length.
    int new_length = i + space_count * 2 + 1;

    // New length must be smaller than length
    // of string provided.
    if (new_length > MAX)
        return -1;

    // Start filling character from end
    int index = new_length - 1;

    // Fill string termination.
    str[index--] = '\0';

    // Fill rest of the string from end
    for (int j=i-1; j>=0; j--)
    {
        // inserts %20 in place of space
        if (str[j] == ' ')
        {
            str[index] = '0';
            str[index - 1] = '2';
            str[index - 2] = '%';
            index = index - 3;
        }
        else
        {
            str[index] = str[j];
            index--;
        }
    }

    return new_length;
}

// Driver code
int main()
{
    char str[MAX] = "Mr John Smith   ";

    // Prints the replaced string
    int new_length = replaceSpaces(str);
    for (int i=0; i<new_length; i++)
        printf("%c", str[i]);
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
Mr%20John%20Smith
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

