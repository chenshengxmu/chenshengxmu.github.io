---
layout: post
title: Efficient method for 2's complement of a binary string
---
* Given a Binary Number as string, print its 2’s complements.
* 2’s complement of a binary number is 1 added to the 1’s complement of the binary number. Note that 1’s complement is simply flip of given binary number. Examples:
{% highlight cpp %}
2's complement of "0111" is  "1001"
2's complement of "1100" is  "0100"
{% endhighlight %}
* We have discussed 1’s and 2’s complements in below post.
* 1’s and 2’s complement of a Binary Number.
* The method discussed in above post traverses binary string twice to find 2’s complement, first finds 1’s complement, then finds 2’s complement using 1’s complement
* In this post an efficient method for 2’s complement is discussed that traverses string only once. We traverse the string from last till the single 1 is not traversed and after that flip all values of string i.e. 0 to 1 and 1 to 0.
* Note: Here to handle the corner case i.e. if 1 doesn’t exist in the string then just append 1 in the starting of string.
* Illustration :
{% highlight cpp %}
Input:  str = "1000100"
Output:        0111100
Explanation: Starts traversing the string from last,
we got first '1' at index 4 then just flip the bits 
of 0 to 3 indexes to make the 2's complement. 

Input:  str =  "0000"
Output:        10000
Explanation: As there is no 1 in the string so just 
append '1' at starting.
{% endhighlight %}
{% highlight cpp %}
// An efficient C++ program to find 2's complement
#include<bits/stdc++.h>
using namespace std;

// Function to find two's complement
string findTwoscomplement(string str)
{
    int n = str.length();

    // Traverse the string to get first '1' from
    // the last of string
    int i;
    for (i = n-1 ; i >= 0 ; i--)
        if (str[i] == '1')
            break;

    // If there exists no '1' concatenate 1 at the
    // starting of string
    if (i == -1)
        return '1' + str;

    // Continue traversal after the position of
    // first '1'
    for (int k = i-1 ; k >= 0; k--)
    {
        //Just flip the values
        if (str[k] == '1')
            str[k] = '0';
        else
            str[k] = '1';
    }

    // return the modified string
    return str;;
}

// Driver code
int main()
{
    string str = "00000101";
    cout << findTwoscomplement(str);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// An efficient Java program to find 2's complement

class Test
{
    // Method to find two's complement
    static String findTwoscomplement(StringBuffer str)
    {
        int n = str.length();
     
        // Traverse the string to get first '1' from
        // the last of string
        int i;
        for (i = n-1 ; i >= 0 ; i--)
            if (str.charAt(i) == '1')
                break;
     
        // If there exists no '1' concat 1 at the
        // starting of string
        if (i == -1)
            return "1" + str;
     
        // Continue traversal after the position of
        // first '1'
        for (int k = i-1 ; k >= 0; k--)
        {
            //Just flip the values
            if (str.charAt(k) == '1')
                str.replace(k, k+1, "0");
            else
                str.replace(k, k+1, "1");
        }
     
        // return the modified string
        return str.toString();
    }
    
    // Driver method
    public static void main(String[] args) 
    {
        StringBuffer str = new StringBuffer("00000101");
        System.out.println(findTwoscomplement(str));
    }
}
{% endhighlight %}
{% highlight cpp %}
11111011
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

