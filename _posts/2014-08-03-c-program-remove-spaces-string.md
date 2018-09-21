---
layout: post
title: C++ Program to remove spaces from a string
---
* Given a string, remove all spaces from it. For example “g e e k” should be converted to “geek” and ” g e ” should be converted to “ge”.
* The idea is to traverse the string from left to right and ignore spaces while traversing. We need to keep track of two indexes, one for current character being red and other for current index in output.
{% highlight c %}
// C++ program to evaluate a given expression
#include <iostream>
using namespace std;

char *removeSpaces(char *str)
{
    int i = 0, j = 0;
    while (str[i])
    {
        if (str[i] != ' ')
           str[j++] = str[i];
        i++;
    }
    str[j] = '\0';
    return str;
}

// Driver program to test above function
int main()
{
    char str1[] = "gee    k   ";
    cout << removeSpaces(str1) << endl;

    char str2[] = " g e e k ";
    cout << removeSpaces(str2);
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
geek
geek
{% endhighlight %}
* Time complexity of above implementation is O(n) where n is number of characters in input string.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above

