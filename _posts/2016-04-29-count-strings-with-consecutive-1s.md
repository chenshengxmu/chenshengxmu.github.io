---
layout: post
title: Count strings with consecutive 1's
---
* Given a number n, count number of n length strings with consecutive 1’s in them.
* Examples:
{% highlight cpp %}
Input  : n = 2
Output : 1
There are 4 strings of length 2, the
strings are 00, 01, 10 and 11. Only the 
string 11 has consecutive 1's.

Input  : n = 3
Output : 3
There are 8 strings of length 3, the
strings are 000, 001, 010, 011, 100, 
101, 110 and 111.  The strings with
consecutive 1's are 011, 110 and 111.

Input : n = 5
Output : 19
{% endhighlight %}
* The reverse problem of counting strings without consecutive 1’s can be solved using Dynamic Programming (See the solution here). We can use that solution and find the required count using below steps.
* 1) Compute number of binary strings without consecutive 1’s using the approach discussed here. Let this count be c.
* 2) Count of all possible binary strings with consecutive 1’s is 2^n where n is input length.
* 3) Total binary strings with consecutive 1 is 2^n – c.
* Below is implementation of above steps.
{% highlight c %}
// C++ program to count all distinct 
// binary strings with two consecutive 1's
#include <iostream>
using namespace std;

// Returns count of n length binary 
// strings with consecutive 1's
int countStrings(int n)
{
  // Count binary strings without consecutive 1's.
  // See the approach discussed on be
  // ( http://goo.gl/p8A3sW )
    int a[n], b[n];
    a[0] = b[0] = 1;
    for (int i = 1; i < n; i++)
    {
        a[i] = a[i-1] + b[i-1];
        b[i] = a[i-1];
    }

    // Subtract a[n-1]+b[n-1] from 2^n
    return (1<<n) - a[n-1] - b[n-1];
}

// Driver program to test above functions
int main()
{
    cout << countStrings(5) << endl;
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to count all distinct 
// binary strings with two consecutive 1's

class GFG {

    // Returns count of n length binary 
    // strings with consecutive 1's
    static int countStrings(int n)
    {
     // Count binary strings without consecutive 1's.
     // See the approach discussed on be
     // ( http://goo.gl/p8A3sW )
        int a[] = new int[n], b[] = new int[n];
        a[0] = b[0] = 1;

        for (int i = 1; i < n; i++) {
            a[i] = a[i - 1] + b[i - 1];
            b[i] = a[i - 1];
        }

       // Subtract a[n-1]+b[n-1]
 from 2^n
        return (1 << n) - a[n - 1] - b[n - 1];
    }

// Driver program to test above functions
   public static void main(String args[])
    {
        System.out.println(countStrings(5));
    }
}

//This code is contributed by Nikita tiwari.
{% endhighlight %}
{% highlight python %}
# Python 3 program to count all 
# distinct binary strings with 
# two consecutive 1's


# Returns count of n length
# binary strings with 
# consecutive 1's
def countStrings(n) :
    
    # Count binary strings without 
    # consecutive 1's.
    # See the approach discussed on be
    # ( http://goo.gl/p8A3sW )
    a = [0] * n
    b = [0] * n
    a[0] = b[0] = 1
    for i in range(1, n) :
        a[i] = a[i - 1] + b[i - 1]
        b[i] = a[i - 1]
    
    
    # Subtract a[n-1]+b[n-1] from 2^n
    return (1 << n) - a[n - 1] - b[n - 1]
    
# Driver program 
print(countStrings(5))


# This code is contributed
# by Nikita tiwari.
{% endhighlight %}
{% highlight cpp %}
19
{% endhighlight %}
* Optimization: Time complexity of above solution is O(n). We can optimize above solution to work in O(Logn).
* If we take a closer look at the pattern of counting strings without consecutive 1’s, we can observe that the count is actually (n+2)’th Fibonacci number for n >= 1. The Fibonacci Numbers are 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 141, ….
{% highlight cpp %}
n = 1, count = 0  = 21 - fib(3) 
n = 2, count = 1  = 22 - fib(4)
n = 3, count = 3  = 23 - fib(5)
n = 4, count = 8  = 24 - fib(6)
n = 5, count = 19 = 24 - fib(7)
................
{% endhighlight %}
* We can find n’th Fibonacci Number in O(Log n) time (See method 4 here).
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above

