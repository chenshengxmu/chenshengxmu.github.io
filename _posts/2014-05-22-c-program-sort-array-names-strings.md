---
layout: post
title: C Program to Sort an array of names or strings
---
* Given an array of strings, write a C function to sort them alphabetically.
* The idea is to use qsort() in C and write a comparison function that uses strcmp() to compare two strings.
{% highlight c %}
#include <stdlib.h>
#include <stdio.h>
#include <string.h>

static int myCompare (const void * a, const void * b)
{
    return strcmp (*(const char **) a, *(const char **) b);
}

void sort(const char *arr[], int n)
{
    qsort (arr, n, sizeof (const char *), myCompare);
}

int main ()
{
    const char *arr[] = {"GeeksforGeeks", "GeeksQuiz", "CLanguage"};
    int n = sizeof(arr)/sizeof(arr[0]);
    int i;

    printf("Given array is\n");
    for (i = 0; i < n; i++)
        printf("%d: %s \n", i, arr[i]);

    sort(arr, n);

    printf("\nSorted array is\n");
    for (i = 0; i < n; i++)
        printf("%d: %s \n", i, arr[i]);

    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
Given array is
0: GeeksforGeeks
1: GeeksQuiz
2: CLanguage

Sorted array is
0: CLanguage
1: GeeksQuiz
2: GeeksforGeekss
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above

