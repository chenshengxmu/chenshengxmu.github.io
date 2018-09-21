---
layout: post
title: Check divisibility of binary string by 2^k
---
* Given a binary string and a number k, task is to check whether the binary string is evenly divisible by 2k or not.
* Examples :
{% highlight cpp %}
Input : 11000  k = 2
Output : Yes
Explanation :
(11000)2 = (24)10
24 is evenly divisible by 2k i.e. 4.
 
Input : 10101  k = 3
Output : No
Explanation : 
(10101)2 = (21)10
21 is not evenly divisible by 2k i.e. 8.
{% endhighlight %}
* Naive Approach : Compute the binary string into decimal and then simply check whether it is divisible by 2k. But, this approach is not feasible for long binary string as time complexity will be high for computing decimal number from binary string and then dividing it by 2k.
* Efficient Approach : In the binary string, check for last k bits. If the all the last k bits are 0, then the binary number is evenly divisible by 2k else it is not evenly divisible. Time complexity using this approach is O(k).
* Below is the implementation of the approach.
{% highlight cpp %}
// C++ implementation to check whether
// given binary number is evenly
// divisible by 2^k or not
#include <bits/stdc++.h>
using namespace std;

// function to check whether
// given binary number is 
// evenly divisible by 2^k or not
bool isDivisible(char str[], int k)
{
    int n = strlen(str);
    int c = 0;
    
    // count of number of 0 from last
    for (int i = 0; i < k; i++)    
        if (str[n - i - 1] == '0')         
            c++;
    
    // if count = k, number is evenly 
    // divisible, so returns true else 
    // false
    return (c == k);
}

// Driver program to test above
int main()
{
    // first example
    char str1[] = "10101100";
    int k = 2;
    if (isDivisible(str1, k))
        cout << "Yes" << endl;
    else
        cout << "No"
             << "\n";

    // Second example
    char str2[] = "111010100";
    k = 2;
    if (isDivisible(str2, k))
        cout << "Yes" << endl;
    else
        cout << "No" << endl;

    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java implementation to check whether
// given binary number is evenly
// divisible by 2^k or not
class GFG {
    
    // function to check whether
    // given binary number is 
    // evenly divisible by 2^k or not
    static boolean isDivisible(String str, int k)
    {
        int n = str.length();
        int c = 0;
    
        // count of number of 0 from last
        for (int i = 0; i < k; i++) 
            if (str.charAt(n - i - 1) == '0')         
                c++;
    
        // if count = k, number is evenly 
        // divisible, so returns true else 
        // false
        return (c == k);
    }

    // Driver program to test above
    public static void main(String args[])
    { 
        
        // first example
        String str1 = "10101100";
        int k = 2;
        if (isDivisible(str1, k) == true)
            System.out.println("Yes");
        else
            System.out.println("No");

    // Second example
        String str2 = "111010100";
        k = 2;
        if (isDivisible(str2, k) == true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

// This code is contributed by JaideepPyne.
{% endhighlight %}
{% highlight python %}
# Python 3 implementation to check
# whether given binary number is
# evenly divisible by 2^k or not

# function to check whether
# given binary number is 
# evenly divisible by 2^k or not
def isDivisible(str, k):
    n = len(str)
    c = 0
    
    # count of number of 0 from last
    for i in range(0, k):
        if (str[n - i - 1] == '0'):     
            c += 1
    
    # if count = k, number is evenly 
    # divisible, so returns true else 
    # false
    return (c == k)

# Driver program to test above
# first example
str1 = "10101100"
k = 2
if (isDivisible(str1, k)):
    print("Yes")
else:
    print("No")

# Second example
str2 = "111010100"
k = 2
if (isDivisible(str2, k)):
    print("Yes")
else:
    print("No")

# This code is contributed by Smitha
{% endhighlight %}
{% highlight cpp %}
Yes
Yes
{% endhighlight %}
* Time Complexity: O(k)
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

