---
layout: post
title: Check if binary representations of two numbers are anagram
---
* Given two numbers you are required to check whether they are anagrams of each other or not in binary representation.
* Examples:
{% highlight cpp %}
Input : a = 8, b = 4 
Output : Yes
Binary representations of both
numbers have same 0s and 1s.

Input : a = 4, b = 5
Output : No
{% endhighlight %}
* Simple Approach:
{% highlight cpp %}
// A simple C++ program to check if binary
// representations of two numbers are anagram.
#include <bits/stdc++.h>
#define ull unsigned long long int
using namespace std;

const int SIZE = 8 * sizeof(ull);

bool bit_anagram_check(ull a, ull b)
{
    // Find reverse binary representation of a
    // and store it in binary_a[]
    int i = 0, binary_a[SIZE] = { 0 };
    while (a > 0) {
        binary_a[i] = a % 2;
        a /= 2;
        i++;
    }

    // Find reverse binary representation of b
    // and store it in binary_a[]
    int j = 0, binary_b[SIZE] = { 0 };
    while (b > 0) {
        binary_b[j] = b % 2;
        b /= 2;
        j++;
    }

    // Sort two binary representations
    sort(binary_a, binary_a + SIZE);
    sort(binary_b, binary_b + SIZE);

    // Compare two sorted binary representations
    for (int i = 0; i < SIZE; i++)
        if (binary_a[i] != binary_b[i]) 
            return false;

    return true;
}

// Driver code
int main()
{
    ull a = 8, b = 4;
    cout << bit_anagram_check(a, b) << endl;
    return 0;
}
{% endhighlight %}
{% highlight java %}
// A simple Java program to check if binary
// representations of two numbers are anagram
import java.io.*;
import java.util.*;

class GFG 
{
    public static int SIZE = 8;
    
    // Function to check if binary representation
    // of two numbers are anagram
    static int bit_anagram_check(long a, long b)
    {
        // Find reverse binary representation of a
        // and store it in binary_a[]
        int i = 0;
        long[] binary_a = new long[SIZE];
        Arrays.fill(binary_a, 0);
        while (a > 0) 
        {
            binary_a[i] = a%2;
            a /= 2;
            i++;
        }
 
        // Find reverse binary representation of b
        // and store it in binary_a[]
        int j = 0;
        long[] binary_b = new long[SIZE];
        Arrays.fill(binary_b, 0);
        while (b > 0) 
        {
            binary_b[j] = b%2;
            b /= 2;
            j++;
        }
 
        // Sort two binary representations
        Arrays.sort(binary_a);
        Arrays.sort(binary_b);
 
        // Compare two sorted binary representations
        for (i = 0; i < SIZE; i++)
            if (binary_a[i] != binary_b[i]) 
                return 0;
 
        return 1;
    }

    // driver program
	public static void main (String[] args) 
	{
		long a = 8, b = 4;
        System.out.println(bit_anagram_check(a, b));
	}
}

// Contributed by Pramod Kumar
{% endhighlight %}
{% highlight cpp %}
1
{% endhighlight %}
* Time Complexity : O (n log n) Auxiliary Space : O (1) Although Auxiliary Space is O(1) still SIZE array spaces are getting used to store binary representation of each number.
*  
* Efficient Approach: Just measure the number of 1’s present in the bit representation of both the numbers, if number of 1’s present in their bit representation are same then they are anagrams in their bit representation else they are not.
{% highlight cpp %}
// An efficient C++ program to check if binary
// representations of two numbers are anagram.
#include <bits/stdc++.h>
#define ull unsigned long long int
using namespace std;

// Returns true if binary representations of
// a and b are anagram.
bool bit_anagram_check(ull a, ull b)
{
    // _popcnt64(a) gives number of 1's present
    // in binary representation of a.
    return (_popcnt64(a) == _popcnt64(b))
}

int main()
{
    ull a = 8, b = 4;
    cout << bit_anagram_check(a, b) << endl;
    return 0;
}
{% endhighlight %}
{% highlight java %}
// An efficient Java program to check if binary
// representations of two numbers are anagram
import java.io.*;

class GFG 
{
    // Function returns true if binary representations of
    // a and b are anagram
    static boolean bit_anagram_check(long a, long b)
    {
        // Long.bitCount(a) gives number of 1's present
        // in binary representation of a
        return (Long.bitCount(a) == Long.bitCount(b));
    }
    
    // driver program
	public static void main (String[] args) 
	{
		long a = 8, b = 4;
		if(bit_anagram_check(a, b))
            System.out.println("1");
        else
            System.out.println("0");
	}
}

// Contributed by Pramod Kumar
{% endhighlight %}
{% highlight cpp %}
1
{% endhighlight %}
* Note that the above code uses GCC specific functions. If we wish to write code for other compilers, we may use Count set bits in an integer.
* Time Complexity : O (1) Auxiliary Space : O (1) No extra space is getting used.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

