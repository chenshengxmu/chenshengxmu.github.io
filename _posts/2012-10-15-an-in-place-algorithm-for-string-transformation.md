---
layout: post
title: An in-place algorithm for String Transformation
---
* Given a string, move all even positioned elements to end of string. While moving elements, keep the relative order of all even positioned and odd positioned elements same. For example, if the given string is “a1b2c3d4e5f6g7h8i9j1k2l3m4”, convert it to “abcdefghijklm1234567891234” in-place and in O(n) time complexity.
* Below are the steps:
* 1. Cut out the largest prefix sub-string of size of the form 3^k + 1. In this step, we find the largest non-negative integer k such that 3^k+1 is smaller than or equal to n (length of string)
* 2. Apply cycle leader iteration algorithm ( it has been discussed below ), starting with index 1, 3, 9…… to this sub-string. Cycle leader iteration algorithm moves all the items of this sub-string to their correct positions, i.e. all the alphabets are shifted to the left half of the sub-string and all the digits are shifted to the right half of this sub-string.
* 3. Process the remaining sub-string recursively using steps#1 and #2.
* 4. Now, we only need to join the processed sub-strings together. Start from any end ( say from left ), pick two sub-strings and apply the below steps:
* ….4.1 Reverse the second half of first sub-string. ….4.2 Reverse the first half of second sub-string. ….4.3 Reverse the second half of first sub-string and first half of second sub-string together.
* 5. Repeat step#4 until all sub-strings are joined. It is similar to k-way merging where first sub-string is joined with second. The resultant is merged with third and so on.
* Let us understand it with an example:
* Please note that we have used values like 10, 11 12 in the below example. Consider these values as single characters only. These values are used for better readability.
{% highlight cpp %}
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
a 1 b 2 c 3 d 4 e 5 f  6  g  7  h  8  i  9  j  10 k  11 l  12 m  13
{% endhighlight %}
* After breaking into size of the form 3^k + 1, two sub-strings are formed of size 10 each. The third sub-string is formed of size 4 and the fourth sub-string is formed of size 2.
{% highlight cpp %}
0 1 2 3 4 5 6 7 8 9         
a 1 b 2 c 3 d 4 e 5         

10 11 12 13 14 15 16 17 18 19          
f  6  g  7  h  8  i  9  j  10           

20 21 22 23 
k  11 l  12 

24 25
m  13
{% endhighlight %}
* After applying cycle leader iteration algorithm to first sub-string:
{% highlight cpp %}
0 1 2 3 4 5 6 7 8 9          
a b c d e 1 2 3 4 5          

10 11 12 13 14 15 16 17 18 19          
f  6  g  7  h  8  i  9  j  10 

20 21 22 23 
k  11 l  12 

24 25
m  13
{% endhighlight %}
* After applying cycle leader iteration algorithm to second sub-string:
{% highlight cpp %}
0 1 2 3 4 5 6 7 8 9          
a b c d e 1 2 3 4 5          

10 11 12 13 14 15 16 17 18 19           
f  g  h  i  j  6  7  8  9  10 

20 21 22 23 
k  11 l  12 

24 25
m 13
{% endhighlight %}
* After applying cycle leader iteration algorithm to third sub-string:
{% highlight cpp %}
0 1 2 3 4 5 6 7 8 9          
a b c d e 1 2 3 4 5          

10 11 12 13 14 15 16 17 18 19            
f  g  h  i  j  6  7  8  9  10

20 21 22 23 
k  l  11 12 

24 25
m  13
{% endhighlight %}
* After applying cycle leader iteration algorithm to fourth sub-string:
{% highlight cpp %}
0 1 2 3 4 5 6 7 8 9  
a b c d e 1 2 3 4 5  

10 11 12 13 14 15 16 17 18 19             
f  g  h  i  j  6  7  8  9  10   

20 21 22 23 
k  l  11 12 

24 25
m  13
{% endhighlight %}
* Joining first sub-string and second sub-string: 1. Second half of first sub-string and first half of second sub-string reversed.
{% highlight cpp %}
0 1 2 3 4 5 6 7 8 9          
a b c d e 5 4 3 2 1            <--------- First Sub-string  

10 11 12 13 14 15 16 17 18 19             
j  i  h  g  f  6  7  8  9  10  <--------- Second Sub-string  

20 21 22 23 
k  l  11 12 

24 25
m  13
{% endhighlight %}
* 2. Second half of first sub-string and first half of second sub-string reversed together( They are merged, i.e. there are only three sub-strings now ).
{% highlight cpp %}
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
a b c d e f g h i j 1  2  3  4  5  6  7  8  9  10

20 21 22 23 
k  l  11 12 

24 25
m  13
{% endhighlight %}
* Joining first sub-string and second sub-string: 1. Second half of first sub-string and first half of second sub-string reversed.
{% highlight cpp %}
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
a b c d e f g h i j 10 9  8  7  6  5  4  3  2  1 <--------- First Sub-string  

20 21 22 23 
l  k  11 12                                      <--------- Second Sub-string

24 25
m  13
{% endhighlight %}
* 2. Second half of first sub-string and first half of second sub-string reversed together( They are merged, i.e. there are only two sub-strings now ).
{% highlight cpp %}
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23  
a b c d e f g h i j k  l  1  2  3  4  5  6  7  8  9  10 11 12  

24 25
m  13
{% endhighlight %}
* Joining first sub-string and second sub-string: 1. Second half of first sub-string and first half of second sub-string reversed.
{% highlight cpp %}
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 
a b c d e f g h i j k  l  12 11 10 9  8  7  6  5  4  3  2  1 <----- First Sub-string

24 25
m  13   <----- Second Sub-string
{% endhighlight %}
* 2. Second half of first sub-string and first half of second sub-string reversed together( They are merged, i.e. there is only one sub-string now ).
{% highlight cpp %}
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
a b c d e f g h i j k  l  m  1  2  3  4  5  6  7  8  9  10 11 12 13
{% endhighlight %}
* Since all sub-strings have been joined together, we are done.
* How does cycle leader iteration algorithm work?
* Let us understand it with an example:
{% highlight cpp %}
Input:
0 1 2 3 4 5 6 7 8 9
a 1 b 2 c 3 d 4 e 5

Output:
0 1 2 3 4 5 6 7 8 9 
a b c d e 1 2 3 4 5

Old index    New index
0		0
1		5
2		1
3		6
4		2
5		7
6		3
7		8
8		4
9		9
{% endhighlight %}
* Let len be the length of the string. If we observe carefully, we find that the new index is given by below formula:
{% highlight cpp %}
if( oldIndex is odd )
	newIndex = len / 2 + oldIndex / 2;
else
        newIndex = oldIndex / 2;
{% endhighlight %}
* So, the problem reduces to shifting the elements to new indexes based on the above formula.
* Cycle leader iteration algorithm will be applied starting from the indices of the form 3^k, starting with k = 0.
* Below are the steps:
* 1. Find new position for item at position i. Before putting this item at new position, keep the back-up of element at new position. Now, put the item at new position.
* 2. Repeat step#1 for new position until a cycle is completed, i.e. until the procedure comes back to the starting position.
* 3. Apply cycle leader iteration algorithm to the next index of the form 3^k. Repeat this step until 3^k < len.
* Consider input array of size 28:
* The first cycle leader iteration, starting with index 1:
* 1->14->7->17->22->11->19->23->25->26->13->20->10->5->16->8->4->2->1
* The second cycle leader iteration, starting with index 3:
* 3->15->21->24->12->6->3
* The third cycle leader iteration, starting with index 9:
* 9->18->9
* Based on the above algorithm, below is the code:
{% highlight cpp %}
#include <stdio.h>
#include <string.h>
#include <math.h>

// A utility function to swap characters
void swap ( char* a, char* b )
{
    char t = *a;
    *a = *b;
    *b = t;
}

// A utility function to reverse string str[low..high]
void reverse ( char* str, int low, int high )
{
    while ( low < high )
    {
        swap( &str[low], &str[high] );
        ++low;
        --high;
    }
}

// Cycle leader algorithm to move all even positioned elements
// at the end.
void cycleLeader ( char* str, int shift, int len )
{
    int j;
    char item;

    for (int i = 1; i < len; i *= 3 )
    {
        j = i;

        item = str[j + shift];
        do
        {
            // odd index
            if ( j & 1 )
                j = len / 2 + j / 2;
            // even index
            else
                j /= 2;

            // keep the back-up of element at new position
            swap (&str[j + shift], &item);
        }
        while ( j != i );
    }
}

// The main function to transform a string. This function mainly uses
// cycleLeader() to transform
void moveNumberToSecondHalf( char* str )
{
    int k, lenFirst;

    int lenRemaining = strlen( str );
    int shift = 0;

    while ( lenRemaining )
    {
        k = 0;

        // Step 1: Find the largest prefix subarray of the form 3^k + 1
        while ( pow( 3, k ) + 1 <= lenRemaining )
            k++;
        lenFirst = pow( 3, k - 1 ) + 1;
        lenRemaining -= lenFirst;

        // Step 2: Apply cycle leader algorithm for the largest subarrau
        cycleLeader ( str, shift, lenFirst );

        // Step 4.1: Reverse the second half of first subarray
        reverse ( str, shift / 2, shift - 1 );

        // Step 4.2: Reverse the first half of second sub-string.
        reverse ( str, shift, shift + lenFirst / 2 - 1 );

        // Step 4.3 Reverse the second half of first sub-string and first
        // half of second sub-string together
        reverse ( str, shift / 2, shift + lenFirst / 2 - 1 );

        // Increase the length of first subarray
        shift += lenFirst;
    }
}

// Driver program to test above function
int main()
{
    char str[] = "a1b2c3d4e5f6g7";
    moveNumberToSecondHalf( str );
    printf( "%s", str );
    return 0;
}
{% endhighlight %}
* Click here to see various test cases.
* Notes: 1. If the array size is already in the form 3^k + 1, We can directly apply cycle leader iteration algorithm. There is no need of joining.
* 2. Cycle leader iteration algorithm is only applicable to arrays of size of the form 3^k + 1.
* How is the time complexity O(n) ? Each item in a cycle is shifted at most once. Thus time complexity of the cycle leader algorithm is O(n). The time complexity of the reverse operation is O(n). We will soon update the mathematical proof of the time complexity of the algorithm.
* Exercise: Given string in the form “abcdefg1234567”, convert it to “a1b2c3d4e5f6g7” in-place and in O(n) time complexity.
* References: A Simple In-Place Algorithm for In-Shu?e.
* __Aashish Barnwal.Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

