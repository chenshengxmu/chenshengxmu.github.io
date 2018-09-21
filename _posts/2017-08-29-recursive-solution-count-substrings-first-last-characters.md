---
layout: post
title: Recursive solution to count substrings with same first and last characters
---
* We are given a string S, we need to find count of all contiguous substrings starting and ending with same character.
* Examples :
{% highlight cpp %}
Input  : S = "abcab"
Output : 7
There are 15 substrings of "abcab"
a, ab, abc, abca, abcab, b, bc, bca
bcab, c, ca, cab, a, ab, b
Out of the above substrings, there 
are 7 substrings : a, abca, b, bcab, 
c, a and b.

Input  : S = "aba"
Output : 4
The substrings are a, b, a and aba
{% endhighlight %}
* We have discussed different solutions in below post.
* Count substrings with same first and last characters
* In this article, a simple recursive solution is discussed.
{% highlight cpp %}
// c++ program to count substrings with same
// first and last characters
#include <iostream>
#include <string>
using namespace std;

/* Function to count subtrings with same first and 
  last characters*/
int countSubstrs(string str, int i, int j, int n)
{
    // base cases
    if (n == 1)
        return 1;
    if (n <= 0)
        return 0;

    int res =  countSubstrs(str, i + 1, j, n - 1) +  
               countSubstrs(str, i, j - 1, n - 1) -
               countSubstrs(str, i + 1, j - 1, n - 2);            

    if (str[i] == str[j])
        res++; 

    return res;
}

// driver code
int main()
{
    string str = "abcab";
    int n = str.length();
    cout << countSubstrs(str, 0, n - 1, n);
}
{% endhighlight %}
{% highlight java %}
// Java program to count substrings 
// with same first and last characters

class GFG
{
    // Function to count subtrings
    // with same first and 
    // last characters
    static int countSubstrs(String str, int i, 
                                         int j, int n)
    {
        // base cases
        if (n == 1)
            return 1;
        if (n <= 0)
            return 0;
    
        int res = countSubstrs(str, i + 1, j, n - 1) + 
                countSubstrs(str, i, j - 1, n - 1) -
                countSubstrs(str, i + 1, j - 1, n - 2);         
    
        if (str.charAt(i) == str.charAt(j))
            res++; 
    
        return res;
    }
    
    // Driver code
    public static void main (String[] args)
    {
        String str = "abcab";
        int n = str.length();
        System.out.print(countSubstrs(str, 0, n - 1, n));
    }
}

// This code is contributed by Anant Agarwal.
{% endhighlight %}
{% highlight python %}
# Python 3 program to count substrings with same
# first and last characters

# Function to count subtrings with same first and 
# last characters
def countSubstrs(str, i, j, n):

    # base cases
    if (n == 1):
        return 1
    if (n <= 0):
        return 0

    res = (countSubstrs(str, i + 1, j, n - 1) 
        + countSubstrs(str, i, j - 1, n - 1) 
        - countSubstrs(str, i + 1, j - 1, n - 2))     

    if (str[i] == str[j]):
        res += 1

    return res

# driver code
str = "abcab"
n = len(str)
print(countSubstrs(str, 0, n - 1, n))

# This code is contributed by Smitha
{% endhighlight %}
* Output:
{% highlight cpp %}
7
{% endhighlight %}
* The time complexity of above solution is exponential. In Worst case, we may end up doing O(3n) operations.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

