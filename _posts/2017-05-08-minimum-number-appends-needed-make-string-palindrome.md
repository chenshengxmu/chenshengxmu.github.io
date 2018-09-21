---
layout: post
title: Minimum number of Appends needed to make a string palindrome
---
* Given a string s we need to tell minimum characters to be appended (insertion at end) to make a string palindrome.
* Examples:
{% highlight cpp %}
Input : s = "abede"
Output : 2
We can make string palindrome as "abedeba"
by adding ba at the end of the string.

Input : s = "aabb"
Output : 2
We can make string palindrome as"aabbaa"
by adding aa at the end of the string.
{% endhighlight %}
* The solution can be achieved by removing characters from the beginning of the string one by one and checking if the string is palindrome or not.
* For Example, consider the above string, s = “abede”.
* We check if the string is palindrome or not.
* The result is false, then we remove the character from the beginning of string and now string becomes “bede”.
* We check if the string is palindrome or not. The result is again false, then we remove the character from the beginning of string and now string becomes “ede”.
* We check if the string is palindrome or not. The result is true, so the output becomes 2 which is the number of characters removed from the string.
{% highlight c %}
// C program to find minimum number of appends
// needed to make a string Palindrome
#include<stdio.h>
#include<string.h>
#include<stdbool.h>

// Checking if the string is palindrome or not
bool isPalindrome(char *str)
{
    int len = strlen(str);

    // single character is always palindrome
    if (len == 1)
        return true;

    // pointing to first character
    char *ptr1 = str;

    // pointing to last character
    char *ptr2 = str+len-1;

    while (ptr2 > ptr1)
    {
        if (*ptr1 != *ptr2)
            return false;
        ptr1++;
        ptr2--;
    }

    return true;
}

// Recursive function to count number of appends
int noOfAppends(char s[])
{
    if (isPalindrome(s))
        return 0;

    // Removing first character of string by
    // incrementing base address pointer.
    s++;

    return 1 + noOfAppends(s);
}

// Driver program to test above functions
int main()
{
    char s[] = "abede";
    printf("%d\n", noOfAppends(s));
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
2
{% endhighlight %}
* Related Article : Dynamic Programming | Set 28 (Minimum insertions to form a palindrome)
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

