---
layout: post
title: C program to Replace a word in a text by another given word
---
* Given three strings ‘str’, ‘oldW’ and ‘newW’. The task is find all occurrences of the word ‘oldW’ and replace then with word ‘newW’. Examples:
{% highlight cpp %}
Input : str[] = "xxforxx xx for xx", 
        oldW[] = "xx", 
        newW[] = "geeks"
Output : geeksforgeeks geeks for geeks
{% endhighlight %}
* The idea is to traverse the original string and count the number of times old word occurs in the string. Now make a new string of sufficient size so that new word can be replaced. Now copy original string to new string with replacement of word.
{% highlight c %}
// C program to search and replace
// all occurrences of a word with
// other word.
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

// Function to replace a string with another
// string
char *replaceWord(const char *s, const char *oldW,
                                 const char *newW)
{
    char *result;
    int i, cnt = 0;
    int newWlen = strlen(newW);
    int oldWlen = strlen(oldW);

    // Counting the number of times old word
    // occur in the string
    for (i = 0; s[i] != '\0'; i++)
    {
        if (strstr(&s[i], oldW) == &s[i])
        {
            cnt++;

            // Jumping to index after the old word.
            i += oldWlen - 1;
        }
    }

    // Making new string of enough length
    result = (char *)malloc(i + cnt * (newWlen - oldWlen) + 1);

    i = 0;
    while (*s)
    {
        // compare the substring with the result
        if (strstr(s, oldW) == s)
        {
            strcpy(&result[i], newW);
            i += newWlen;
            s += oldWlen;
        }
        else
            result[i++] = *s++;
    }

    result[i] = '\0';
    return result;
}

// Driver Program
int main()
{
    char str[] = "xxforxx";
    char c[] = "xx";
    char d[] = "Geeks";

    char *result = NULL;

    // oldW string
    printf("Old string: %sn", str);

    result = replaceWord(str, c, d);
    printf("New String: %sn", result);

    free(result);
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
Old string: xxforxx
New String: GeeksforGeeks
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

