---
layout: post
title: Check whether two strings are anagram of each other
---
* Write a function to check whether two given strings are anagram of each other or not. An anagram of a string is another string that contains same characters, only the order of characters can be different. For example, “abcd” and “dabc” are anagram of each other.

![img](https://www.geeksforgeeks.org/wp-content/uploads/Check-whether-two-strings-are-anagram-of-each-other.png)
* Method 1 (Use Sorting) 1) Sort both strings 2) Compare the sorted strings
{% highlight cpp %}
// C/C++ program to check whether two strings are anagrams
// of each other
#include <stdio.h>
#include <string.h>

/* Function prototype for string a given string using 
   quick sort */
void quickSort(char *arr, int si, int ei);

/* function to check whether two strings are anagram of 
   each other */
bool areAnagram(char *str1, char *str2)
{
    // Get lenghts of both strings
    int n1 = strlen(str1);
    int n2 = strlen(str2);

    // If length of both strings is not same, then they 
    // cannot be anagram
    if (n1 != n2)
      return false;

    // Sort both strings
    quickSort(str1, 0, n1 - 1);
    quickSort(str2, 0, n2 - 1);

    // Compare sorted strings
    for (int i = 0; i < n1;  i++)
       if (str1[i] != str2[i])
         return false;

    return true;
}

// Following functions (exchange and partition are needed
// for quickSort)
void exchange(char *a, char *b)
{
    char temp;
    temp = *a;
    *a   = *b;
    *b   = temp;
}

int partition(char A[], int si, int ei)
{
    char x = A[ei];
    int i = (si - 1);
    int j;

    for (j = si; j <= ei - 1; j++)
    {
        if(A[j] <= x)
        {
            i++;
            exchange(&A[i], &A[j]);
        }
    }
    exchange (&A[i + 1], &A[ei]);
    return (i + 1);
}

/* Implementation of Quick Sort
A[] --> Array to be sorted
si  --> Starting index
ei  --> Ending index
*/
void quickSort(char A[], int si, int ei)
{
    int pi;    /* Partitioning index */
    if(si < ei)
    {
        pi = partition(A, si, ei);
        quickSort(A, si, pi - 1);
        quickSort(A, pi + 1, ei);
    }
}

/* Driver program to test to print printDups*/
int main()
{
    char str1[] = "test";
    char str2[] = "ttew";
    if (areAnagram(str1, str2))
      printf("The two strings are anagram of each other");
    else
      printf("The two strings are not anagram of each other");

    return 0;
}
{% endhighlight %}
{% highlight java %}
// JAVA program to check whether two strings
// are anagrams of each other
import java.io.*;

class GFG{
    
    /* function to check whether two strings are 
    anagram of each other */
    static boolean areAnagram(char[] str1, char[] str2)
    {
        // Get lenghts of both strings
        int n1 = str1.length;
        int n2 = str2.length;
 
        // If length of both strings is not same,
        // then they cannot be anagram
        if (n1 != n2)
            return false;
 
        // Sort both strings
        quickSort(str1, 0, n1 - 1);
        quickSort(str2, 0, n2 - 1);
 
        // Compare sorted strings
        for (int i = 0; i < n1;  i++)
            if (str1[i] != str2[i])
                return false;
 
        return true;
    }
 
    // Following functions (exchange and partition 
    // are needed for quickSort)
    static void exchange(char A[],int a, int b)
    {
        char temp;
        temp = A[a];
        A[a]   = A[b];
        A[b]   = temp;
    }
 
    static int partition(char A[], int si, int ei)
    {
        char x = A[ei];
        int i = (si - 1);
        int j;
     
        for (j = si; j <= ei - 1; j++)
        {
            if(A[j] <= x)
            {
                i++;
                exchange(A, i, j);
            }
        }
        exchange (A, i+1 , ei);
        return (i + 1);
    }
 
    /* Implementation of Quick Sort
    A[] --> Array to be sorted
    si  --> Starting index
    ei  --> Ending index
    */
    static void quickSort(char A[], int si, int ei)
    {
        int pi;    /* Partitioning index */
        if(si < ei)
        {
            pi = partition(A, si, ei);
            quickSort(A, si, pi - 1);
            quickSort(A, pi + 1, ei);
        }
    }
 
    /* Driver program to test to print printDups*/
    public static void main(String args[])
    {
        char str1[] = {'t','e','s','t'};
        char str2[] = {'t','t','e','w'};
        if (areAnagram(str1, str2))
            System.out.println("The two strings are"+
                             " anagram of each other");
        else
            System.out.println("The two strings are not"+
                               " anagram of each other");
    }
}

//This code is contributed by Nikita Tiwari.
{% endhighlight %}
{% highlight python %}
# Python program to check whether two strings are
# anagrams of each other

# Utility functions
def toList(string):
    tmp = []
    for i in string:
        tmp.append(i)
    return tmp

def toString(List):
    return ''.join(List)

# function to check whether two strings are anagram
# of each other
def areAnagram(str1, str2):
    # Get lengths of both strings
    n1 = len(str1)
    n2 = len(str2)

    # If lenght of both strings is not same, then
    # they cannot be anagram
    if n1 != n2:
        return 0

    # Sort both strings
    str1 = quickSort(str1, 0, n1 - 1)
    str2 = quickSort(str2, 0, n2 - 1)

    # Compare sorted strings
    for i in xrange(n1):
        if str1[i] != str2[i]:
            return 0

    return 1

# Following functions (exchange and partition are
# needed for quickSort)
def exchange(a, b):
    return b, a

def partition(A, si, ei):
    x = A[ei]
    i = si - 1

    for j in xrange(si, ei):
        if A[j] <= x:
            i+=1
            A[i], A[j] = exchange(A[i], A[j])
    A[i+1], A[ei] = exchange(A[i+1], A[ei])
    return i + 1

# Implementation of Quick Sort
# A[] --> Array to be sorted
# si  --> Starting index
# ei  --> Ending index
def quickSort(string, si, ei):
    A = toList(string)
    pi = 0
    if si < ei:
        pi = partition(A, si, ei)
        quickSort(A, si, pi-1)
        quickSort(A, pi+1, ei)

    return toString(A)

# Driver program to test the above function
str1 = "test"
str2 = "ttew"
if areAnagram(str1, str2):
    print "The two strings are anagram of each other"
else:
    print "The two strings are not anagram of each other"

# This code is contributed by Bhavya Jain
{% endhighlight %}
{% highlight cpp %}
The two strings are not anagram of each other
{% endhighlight %}
* Time Complexity: Time complexity of this method depends upon the sorting technique used. In the above implementation, quickSort is used which may be O(n^2) in worst case. If we use a O(nLogn) sorting algorithm like merge sort, then the complexity becomes O(nLogn)
* Method 2 (Count characters) This method assumes that the set of possible characters in both strings is small. In the following implementation, it is assumed that the characters are stored using 8 bit and there can be 256 possible characters. 1) Create count arrays of size 256 for both strings. Initialize all values in count arrays as 0. 2) Iterate through every character of both strings and increment the count of character in the corresponding count arrays. 3) Compare count arrays. If both count arrays are same, then return true.
{% highlight cpp %}
# include <stdio.h>
# define NO_OF_CHARS 256

/* function to check whether two strings are anagram of 
   each other */
bool areAnagram(char *str1, char *str2)
{
    // Create 2 count arrays and initialize all values as 0
    int count1[NO_OF_CHARS] = {0};
    int count2[NO_OF_CHARS] = {0};
    int i;

    // For each character in input strings, increment count in
    // the corresponding count array
    for (i = 0; str1[i] && str2[i];  i++)
    {
        count1[str1[i]]++;
        count2[str2[i]]++;
    }

    // If both strings are of different length. Removing this
    // condition will make the program fail for strings like
    // "aaca" and "aca"
    if (str1[i] || str2[i])
      return false;

    // Compare count arrays
    for (i = 0; i < NO_OF_CHARS; i++)
        if (count1[i] != count2[i])
            return false;

    return true;
}

/* Driver program to test to print printDups*/
int main()
{
    char str1[] = "geeksforgeeks";
    char str2[] = "forgeeksgeeks";
    if ( areAnagram(str1, str2) )
      printf("The two strings are anagram of each other");
    else
      printf("The two strings are not anagram of each other");

    return 0;
}
{% endhighlight %}
{% highlight java %}
// JAVA program to check if two strings
// are anagrams of each other
import java.io.*;
import java.util.*;

class GFG{
    
    static int NO_OF_CHARS = 256;
    
    /* function to check whether two strings
    are anagram of each other */
    static boolean areAnagram(char str1[], char str2[])
    {
        // Create 2 count arrays and initialize
        // all values as 0
        int count1[] = new int [NO_OF_CHARS];
        Arrays.fill(count1, 0);
        int count2[] = new int [NO_OF_CHARS];
        Arrays.fill(count2, 0);
        int i;
 
        // For each character in input strings,
        // increment count in the corresponding
        // count array
        for (i = 0; i <str1.length && i < str2.length ;
                                                 i++)
        {
            count1[str1[i]]++;
            count2[str2[i]]++;
        }
 
        // If both strings are of different length.
        // Removing this condition will make the program 
        // fail for strings like "aaca" and "aca"
        if (str1.length != str2.length)
            return false;
 
        // Compare count arrays
        for (i = 0; i < NO_OF_CHARS; i++)
            if (count1[i] != count2[i])
                return false;
 
        return true;
    }
 
    /* Driver program to test to print printDups*/
    public static void main(String args[])
    {
        char str1[] = ("geeksforgeeks").toCharArray();
        char str2[] = ("forgeeksgeeks").toCharArray();
        
        if ( areAnagram(str1, str2) )
            System.out.println("The two strings are" +
                               "anagram of each other");
        else
            System.out.println("The two strings are not"+
                               " anagram of each other");
    }
}

// This code is contributed by Nikita Tiwari.
{% endhighlight %}
{% highlight python %}
# Python program to check if two strings are anagrams of
# each other
NO_OF_CHARS = 256

# Function to check whether two strings are anagram of
# each other
def areAnagram(str1, str2):

    # Create two count arrays and initialize all values as 0
    count1 = [0] * NO_OF_CHARS
    count2 = [0] * NO_OF_CHARS

    # For each character in input strings, increment count
    # in the corresponding count array
    for i in str1:
        count1[ord(i)]+=1

    for i in str2:
        count2[ord(i)]+=1

    # If both strings are of different length. Removing this
    # condition will make the program fail for strings like
    # "aaca" and "aca"
    if len(str1) != len(str2):
        return 0

    # Compare count arrays
    for i in xrange(NO_OF_CHARS):
        if count1[i] != count2[i]:
            return 0

    return 1

# Driver program to test the above functions
str1 = "geeksforgeeks"
str2 = "forgeeksgeeks"
if areAnagram(str1, str2):
    print "The two strings are anagram of each other"
else:
    print "The two strings are not anagram of each other"

# This code is contributed by Bhavya Jain
{% endhighlight %}
{% highlight cpp %}
The two strings are anagram of each other
{% endhighlight %}
* The above implementation can be further to use only one count array instead of two. We can increment the value in count array for characters in str1 and decrement for characters in str2. Finally, if all count values are 0, then the two strings are anagram of each other. Thanks to Ace for suggesting this optimization.
{% highlight cpp %}
bool areAnagram(char *str1, char *str2)
{
    // Create a count array and initialize all values as 0
    int count[NO_OF_CHARS] = {0};
    int i;

    // For each character in input strings, increment count in
    // the corresponding count array
    for (i = 0; str1[i] && str2[i];  i++)
    {
        count[str1[i]]++;
        count[str2[i]]--;
    }

    // If both strings are of different length. Removing this condition
    // will make the program fail for strings like "aaca" and "aca"
    if (str1[i] || str2[i])
      return false;

    // See if there is any non-zero value in count array
    for (i = 0; i < NO_OF_CHARS; i++)
        if (count[i])
            return false;
     return true;
}
{% endhighlight %}
* If the possible set of characters contains only English alphabets, then we can reduce the size of arrays to 52 and use str[i] – ‘A’ as an index for count arrays. This will further optimize this method.
* Time Complexity: O(n)
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

