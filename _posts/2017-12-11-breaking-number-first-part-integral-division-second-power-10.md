---
layout: post
title: Breaking a number such that first part is integral division of second by a power of 10
---
* Given a very large number N, we need to count the total ways such that if we divide the number into two parts a and b, the first part a can be obtained by integral division of second b by some power p of 10 and p>=0. 1 <= No of digits in N <= .
* Examples:
{% highlight cpp %}
Input : 220
Output : 1
220 can be divided as a = 2 and b = 20
such that for p = 1, b/10 = a.


Input : 1111
Output : 2
We get answer 2 because we need to consider
integral division.
Let's consider the first partition a = 1,
b = 111. for p = 2, b/pow(10,p) = a thus
this is a valid partition.
now a = 11, b = 11. for p = 0, b/pow(10,p) 
= a thus this too is a valid combination.

Input : 2202200
Output : 2
for a = 2 b = 202200, p = 5 and
a = 220, b = 2200, p = 1
{% endhighlight %}
* Since the number can be very large to be contained even in a long long int we will store it as a string. According to the conditions mentioned in the problem, division is the floor function. A simple and inefficient approach will be to divide the string into two substrings then convert those to integer and perform division. An efficient method to do it will be to use the string compare function to match the most significant digits of the two strings and ignore the rest( floor function). Below is the implementation of this idea :
{% highlight cpp %}
#include <bits/stdc++.h>
using namespace std;

// c++ function to count ways to divide a
// string in two parts a and b such that
// b/pow(10, p) == a
int calculate(string N)
{
    int len = N.length();
    int l = (len) / 2;
    int count = 0;

    for (int i = 1; i <= l; i++) {

        // substring representing int a
        string s = N.substr(0, i);

        // no of digits in a
        int l1 = s.length();

        // consider only most significant 
        // l1 characters of remaining string 
        // for int b
        string t = N.substr(i, l1);

        // if any of a or b contains leading 0s
        // discard this combination
        if (s[0] == '0' || t[0] == '0')
            continue;

        // if both are equal
        if (s.compare(t) == 0) 
            count++;        
    }
    return count;
}

// driver function to test above function
int main()
{
    string N = "2202200";
    cout << calculate(N);
    return 0;
}
{% endhighlight %}
{% highlight python %}
# Python3 program to count ways to divide
# a string in two parts a and b such that
# b/pow(10, p) == a

def calculate( N ):
    length = len(N)
    l = int((length) / 2)
    count = 0
    
    for i in range(l + 1):
        
        # substring representing int a
        s = N[0: 0 + i]
        
        # no of digits in a
        l1 = len(s)
        
        # consider only most significant
        # l1 characters of remaining 
        # string for int b
        t = N[i: l1 + i]
        
        # if any of a or b contains 
        # leading 0s discard this 
        try:
            if s[0] == '0' or t[0] == '0':
                continue
        except:
            continue
        
        # if both are equal
        if s == t:
            count+=1
    return count
    
# driver code to test above function
N = str("2202200")
print(calculate(N))

# This code is contributed by "Sharad_Bhardwaj".
{% endhighlight %}
{% highlight cpp %}
2
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

