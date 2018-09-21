---
layout: post
title: C++ Program to print all palindromes in a given range
---
* Given a range of numbers, print all palindromes in the given range. For example if the given range is {10, 115}, then output should be {11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111}
* We can run a loop from min to max and check every number for palindrome. If number is palindrome, we can simply print it.
{% highlight cpp %}
#include<iostream>
using namespace std;

// A function to check if n is palindrome
int isPalindrome(int n)
{
    // Find reverse of n
    int rev = 0;
    for (int i = n; i > 0; i /= 10)
        rev = rev*10 + i%10;

    // If n and rev are same, then n is palindrome
    return (n==rev);
}

// prints palindrome between min and max
void countPal(int min, int max)
{
    for (int i = min; i <= max; i++)
        if (isPalindrome(i))
          cout << i << " ";
}

// Driver program to test above function
int main()
{
    countPal(100, 2000);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java Program to print all 
// palindromes in a given range

class GFG
{
    
    // A function to check
    // if n is palindrome
    static int isPalindrome(int n)
    {
        
        // Find reverse of n
        int rev = 0;
        for (int i = n; i > 0; i /= 10)
            rev = rev * 10 + i % 10;
            
        // If n and rev are same, 
        // then n is palindrome
        return(n == rev) ? 1 : 0;
    }
    
    // prints palindrome between
    // min and max
    static void countPal(int min, int max)
    {
        for (int i = min; i <= max; i++)
            if (isPalindrome(i)==1)
                System.out.print(i + " ");
    }
    
    // Driver Code
    public static void main(String args[])
    {
        countPal(100, 2000);
    }
}

// This code is contributed by Taritra Saha.
{% endhighlight %}
{% highlight cpp %}
101 111 121 131 141 151 161 171 181 191 202 212
222 232 242 252 262 272 282 292 303 313 323 333
343 353 363 373 383 393 404 414 424 434 444 454
464 474 484 494 505 515 525 535 545 555 565 575
585 595 606 616 626 636 646 656 666 676 686 696
707 717 727 737 747 757 767 777 787 797 808 818
828 838 848 858 868 878 888 898 909 919 929 939
949 959 969 979 989 999 1001 1111 1221 1331 1441
1551 1661 1771 1881 1991
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above

