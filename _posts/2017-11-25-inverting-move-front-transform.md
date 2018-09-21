---
layout: post
title: Inverting the Move to Front Transform
---
* Prerequisite:Move To Front Data Transform Algorithm
* The main idea behind inverse of MTF Transform:
* 1. To compute inverse of MTF Transform is to undo the MTF Transform and recover the original string. We have with us “input_arr” which is the MTF transform and “n” which is the number of elements in “input_arr”.
* 2. Our task is to maintain an ordered list of characters (a to z, in our example) and read in “ith”element from “input_arr” one at a time.
* 3.Then, taking that element as index j, print “jth” character in the list.
{% highlight cpp %}
Illustration for "[15 1 14 1 14 1]"
List initially contains English alphabets in order.
We move characters at indexes depicted by input 
to front of the list one by one.

input arr chars   output str  list
15                p           abcdefghijklmnopqrstuvwxyz
1                 pa          pabcdefghijklmnoqrstuvwxyz
14                pan         apbcdefghijklmnoqrstuvwxyz
1                 pana        napbcdefghijklmoqrstuvwxyz
14                panam       anpbcdefghijklmoqrstuvwxyz
1                 panama      manpbcdefghijkloqrstuvwxyz
{% endhighlight %}
* Examples:
{% highlight cpp %}
Input : arr[] = {15, 1, 14, 1, 14, 1}
Output : panama

Input : arr[] = {6, 5, 0, 10, 18, 8, 15, 18, 
                6, 6, 0, 6, 6};
Output : geeksforgeeks
{% endhighlight %}
* Following is the code for idea explained above:
{% highlight c %}
// C program to find Inverse of Move to Front
// Transform of a given string
#include<stdio.h>
#include<stdlib.h>
#include<string.h>

// Takes index of printed character as argument
// to bring that character to the front of the list
void moveToFront(int index, char *list)
{
    char record[27];
    strcpy(record, list);

    // Characters pushed one position right
    // in the list up until index
    strncpy(list+1, record, index);

    // Character at index stored at 0th position
    list[0] = record[index];
}

// Move to Front Decoding
void mtfDecode(int arr[], int n)
{
    // Maintains an ordered list of legal symbols
    char list[] = "abcdefghijklmnopqrstuvwxyz";

    int i;
    printf("\nInverse of Move to Front Transform: ");
    for (i = 0; i < n; i++)
    {
        // Printing characters of Inverse MTF as output
        printf("%c", list[arr[i]]);

        // Moves the printed character to the front 
        // of the list
        moveToFront(arr[i], list);
    }
}

// Driver program to test functions above
int main()
{
    // MTF transform and number of elements in it.
    int arr[] = {15, 1, 14, 1, 14, 1};
    int n = sizeof(arr)/sizeof(arr[0]);

    // Computes Inverse of Move to Front transform
    // of given text
    mtfDecode(arr, n);

    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
Inverse of Move to Front Transform: panama
{% endhighlight %}
* Time Complexity: O(n^2)
* Exercise: Implement MTF encoding and decoding together in one program and check if the original message is recovered.
* Source: http://www.cs.princeton.edu/courses/archive/fall07/cos226/assignments/burrows.html
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

