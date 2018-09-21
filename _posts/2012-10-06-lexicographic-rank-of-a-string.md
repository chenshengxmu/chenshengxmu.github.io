---
layout: post
title: Lexicographic rank of a string
---
* Given a string, find its rank among all its permutations sorted lexicographically. For example, rank of “abc” is 1, rank of “acb” is 2, and rank of “cba” is 6.
* Examples:
{% highlight cpp %}
Input : str[] = "acb"
Output : Rank = 2

Input : str[] = "string"
Output : Rank = 598

Input : str[] = "cba"
Output : Rank = 6
{% endhighlight %}
* For simplicity, let us assume that the string does not contain any duplicated characters.
* One simple solution is to initialize rank as 1, generate all permutations in lexicographic order. After generating a permutation, check if the generated permutation is same as given string, if same, then return rank, if not, then increment the rank by 1. The time complexity of this solution will be exponential in worst case. Following is an efficient solution.
* Let the given string be “STRING”. In the input string, ‘S’ is the first character. There are total 6 characters and 4 of them are smaller than ‘S’. So there can be 4 * 5! smaller strings where first character is smaller than ‘S’, like following
* R X X X X X I X X X X X N X X X X X G X X X X X
* Now let us Fix S’ and find the smaller strings staring with ‘S’.
* Repeat the same process for T, rank is 4*5! + 4*4! +…
* Now fix T and repeat the same process for R, rank is 4*5! + 4*4! + 3*3! +…
* Now fix R and repeat the same process for I, rank is 4*5! + 4*4! + 3*3! + 1*2! +…
* Now fix I and repeat the same process for N, rank is 4*5! + 4*4! + 3*3! + 1*2! + 1*1! +…
* Now fix N and repeat the same process for G, rank is 4*5! + 4*4! + 3*3! + 1*2! + 1*1! + 0*0!
* Rank = 4*5! + 4*4! + 3*3! + 1*2! + 1*1! + 0*0! = 597
* Note that the above computations find count of smaller strings. Therefore rank of given string is count of smaller strings plus 1. The final rank = 1 + 597 = 598
{% highlight c %}
#include <stdio.h>
#include <string.h>

// A utility function to find factorial of n
int fact(int n)
{
    return (n <= 1)? 1 :n * fact(n-1);
}

// A utility function to count smaller characters on right
// of arr[low]
int findSmallerInRight(char* str, int low, int high)
{
    int countRight = 0, i;

    for (i = low+1; i <= high; ++i)
        if (str[i] < str[low])
            ++countRight;

    return countRight;
}

// A function to find rank of a string in all permutations
// of characters
int findRank (char* str)
{
    int len = strlen(str);
    int mul = fact(len);
    int rank = 1;
    int countRight;

    int i;
    for (i = 0; i < len; ++i)
    {
        mul /= len - i;

        // count number of chars smaller than str[i]
        // fron str[i+1] to str[len-1]
        countRight = findSmallerInRight(str, i, len-1);

        rank += countRight * mul ;
    }

    return rank;
}

// Driver program to test above function
int main()
{
    char str[] = "string";
    printf ("%d", findRank(str));
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to find lexicographic rank 
// of a string
import java.io.*;
import java.util.*;

class GFG{
    
    // A utility function to find factorial of n
    static int fact(int n)
    {
        return (n <= 1)? 1 :n * fact(n-1);
    }
 
    // A utility function to count smaller 
    // characters on right of arr[low]
    static int findSmallerInRight(String str, int low,
                                            int high)
    {
        int countRight = 0, i;
 
        for (i = low + 1; i <= high; ++i)
            if (str.charAt(i) < str.charAt(low))
                ++countRight;
 
        return countRight;
    }
 
    // A function to find rank of a string in 
    // all permutations of characters
    static int findRank (String str)
    {
        int len = str.length();
        int mul = fact(len);
        int rank = 1;
        int countRight;
 
        for (int i = 0; i < len; ++i)
        {
            mul /= len - i;
 
            // count number of chars smaller 
            // than str[i] from str[i+1] to
            // str[len-1]
            countRight = findSmallerInRight(str, i, len-1);
 
            rank += countRight * mul ;
        }
        
        return rank;
    }
 
    // Driver program to test above function
    public static void main(String[] args)
    {
        String str = "string";
        System.out.println (findRank(str));
    }
}

// This code is contributed by Nikita Tiwari.
{% endhighlight %}
{% highlight python %}
# Python program to find lexicographic 
# rank of a string

# A utility function to find factorial
# of n
def fact(n) :
    f = 1
    while n >= 1 :
        f = f * n
        n = n - 1
    return f
    
# A utility function to count smaller 
# characters on right of arr[low]
def findSmallerInRight(st, low, high) :
    
    countRight = 0
    i = low + 1
    while i <= high :
        if st[i] < st[low] :
            countRight = countRight + 1
        i = i + 1
 
    return countRight
    
# A function to find rank of a string
# in all permutations of characters
def findRank (st) :
    ln = len(st)
    mul = fact(ln)
    rank = 1
    i = 0 
 
    while i < ln :
        
        mul = mul / (ln - i)
        
        # count number of chars smaller 
        # than str[i] fron str[i+1] to
        # str[len-1]
        countRight = findSmallerInRight(st, i, ln-1)
 
        rank = rank + countRight * mul
        i = i + 1
        
    return rank
    
    
# Driver program to test above function
st = "string"
print (findRank(st))

# This code is contributed by Nikita Tiwari.
{% endhighlight %}
{% highlight cpp %}
598
{% endhighlight %}
* The time complexity of the above solution is O(n^2). We can reduce the time complexity to O(n) by creating an auxiliary array of size 256. See following code.
{% highlight c %}
// A O(n) solution for finding rank of string
#include <stdio.h>
#include <string.h>
#define MAX_CHAR 256

// A utility function to find factorial of n
int fact(int n)
{
    return (n <= 1)? 1 :n * fact(n-1);
}

// Construct a count array where value at every index
// contains count of smaller characters in whole string
void populateAndIncreaseCount (int* count, char* str)
{
    int i;

    for( i = 0; str[i]; ++i )
        ++count[ str[i] ];

    for( i = 1; i < MAX_CHAR; ++i )
        count[i] += count[i-1];
}

// Removes a character ch from count[] array
// constructed by populateAndIncreaseCount()
void updatecount (int* count, char ch)
{
    int i;
    for( i = ch; i < MAX_CHAR; ++i )
        --count[i];
}

// A function to find rank of a string in all permutations
// of characters
int findRank(char* str)
{
    int len = strlen(str);
    int mul = fact(len);
    int rank = 1, i;

    // all elements of count[] are initialized with 0
    int count[MAX_CHAR] = {0}; 

    // Populate the count array such that count[i] 
    // contains count of characters which are present
    // in str and are smaller than i
    populateAndIncreaseCount( count, str );

    for (i = 0; i < len; ++i)
    {
        mul /= len - i;

        // count number of chars smaller than str[i]
        // fron str[i+1] to str[len-1]
        rank += count[ str[i] - 1] * mul;

        // Reduce count of characters greater than str[i]
        updatecount (count, str[i]);
    }

    return rank;
}

// Driver program to test above function
int main()
{
    char str[] = "string";
    printf ("%d", findRank(str));
    return 0;
}
{% endhighlight %}
* The above programs don’t work for duplicate characters. To make them work for duplicate characters, find all the characters that are smaller (include equal this time also), do the same as above but, this time divide the rank so formed by p! where p is the count of occurrences of the repeating character.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

