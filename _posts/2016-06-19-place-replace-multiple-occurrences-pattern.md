---
layout: post
title: In-place replace multiple occurrences of a pattern
---
* Given a string and a pattern, replace multiple occurrences of a pattern by character ‘X’. The conversion should be in-place and solution should replace multiple consecutive (and non-overlapping) occurrences of a pattern by a single ‘X’.
{% highlight cpp %}
String – GeeksForGeeks
Pattern – Geeks
Output: XforX
 
String – GeeksGeeks
Pattern – Geeks
Output: X

String – aaaa
Pattern – aa
Output: X

String – aaaaa
Pattern – aa
Output: Xa
{% endhighlight %}
* The idea is to maintain two index i and j for in-place replacement. Index i always points to next character in the output string. Index j traverses the string and searches for one or more pattern match. If a match is found, we put character ‘X’ at index i and increment index i by 1 and index j by length of the pattern. Index i is increment only once if we find multiple consecutive occurrences of the pattern. If the pattern is not found, we copy current character at index j to index i and increment both i and j by 1. Since pattern length is always more than equal to 1 and replacement is only 1 character long, we would never overwrite unprocessed characters i.e j >= i is invariant.
{% highlight cpp %}
// C++ program to in-place replace multiple
// occurrences of a pattern by character ‘X’
#include <bits/stdc++.h>
using namespace std;

// returns true if pattern is prefix of str
bool compare(char* str, char* pattern)
{
    for (int i = 0; pattern[i]; i++)
        if (str[i] != pattern[i])
            return false;
    return true;
}

// Function to in-place replace multiple
// occurrences of a pattern by character ‘X’
void replacePattern(char *str, char* pattern)
{
    // If pattern is null or empty string,
    // nothing needs to be done
    if (pattern == NULL)
        return;

    int len = strlen(pattern);
    if (len == 0)
       return;

    int i = 0, j = 0;
    int count;

    // for each character
    while (str[j])
    {
        count = 0;

        // compare str[j..j+len] with pattern
        while (compare(str+j, pattern))
        {
            // increment j by length of pattern
            j = j + len;
            count++;
        }

        // If single or multiple occurrences of pattern
        // is found, replace it by character 'X'
        if (count > 0)
            str[i++] = 'X';

        // copy character at current position j
        // to position i and increment i and j
        if (str[j])
            str[i++] = str[j++];
    }

    // add a null character to terminate string
    str[i] = '\0';
}

// Driver code
int main()
{
    char str[] = "GeeksforGeeks";
    char pattern[] = "Geeks";

    replacePattern(str, pattern);
    cout << str;

    return 0;
}
{% endhighlight %}
* Output :
{% highlight cpp %}
XforX
{% endhighlight %}
* The time complexity of above algorithm is O(n*m), where n is length of string and m is length of the pattern.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above

