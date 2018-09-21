---
layout: post
title: Rearrange a binary string as alternate x and y occurrences
---
* Given a binary string s and two integers x and y are given. Task is to arrange the given string in such a way so that ‘0’ comes X-time then ‘1’ comes Y-time and so on until one of the ‘0’ or ‘1’ is finished. Then concatenate rest of the string and print the final string. Given : x or y can not be 0
* Examples:
{% highlight cpp %}
Input : s = "0011"
        x = 1
        y = 1
Output : 0101
x is 1 and y is 1. So first we print
'0' one time the '1' one time and 
then we print '0', after printing '0',
all 0's are vanished from the given
string so we concatenate rest of the 
string which is '1'. 

Input : s = '1011011'
        x = 1
        y = 1
Output : 0101111
{% endhighlight %}
* 1. Count number of 0’s and 1’s in the string. 2. Run a loop until either one of the alphabets is finished.     2.1. First print ‘0’ upto x and decrement count of 0.     2.2. Then print ‘1’ upto y and decrement count of 1.
{% highlight cpp %}
// C++ program to arrange given string
#include <bits/stdc++.h>
using namespace std;

// Function which arrange the given string
void arrangeString(string str, int x, int y)
{
    int count_0 = 0;
    int count_1 = 0;
    int len = str.length();

    // Counting number of 0's and 1's in the
    // given string.
    for (int i = 0; i < len; i++) {
        if (str[i] == '0')
            count_0++;
        else
            count_1++;
    }

    // Printing first all 0's x-times
    // and decrement count of 0's x-times
    // and do the similar task with '1'
    while (count_0 > 0 || count_1 > 0) {
     for (int j = 0; j < x && count_0 > 0; j++) {
        if (count_0 > 0) {
           cout << "0";
           count_0--;
        }
     }
     for (int j = 0; j < y && count_1 > 0; j++) {
        if (count_1 > 0) {
           cout << "1";
           count_1--;
        }
      }
    }
}

// Driver Code
int main()
{
    string str = "01101101101101101000000";
    int x = 1;
    int y = 2;
    arrangeString(str, x, y);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to arrange given string
import java.io.*;

class GFG 
{
    // Function which arrange the given string
    static void arrangeString(String str, int x, int y)
    {
        int count_0 = 0;
        int count_1 = 0;
        int len = str.length();
    
        // Counting number of 0's and 1's in the
        // given string.
        for (int i = 0; i < len; i++) 
        {
            if (str.charAt(i) == '0')
                count_0++;
            else
                count_1++;
        }
    
        // Printing first all 0's x-times
        // and decrement count of 0's x-times
        // and do the similar task with '1'
        while (count_0 > 0 || count_1 > 0) 
        {
            for (int j = 0; j < x && count_0 > 0; j++)
            {
                if (count_0 > 0) 
                {
                    System.out.print ("0");
                    count_0--;
                }
            }
            for (int j = 0; j < y && count_1 > 0; j++)
            {
                if (count_1 > 0) 
                {
                    System.out.print("1");
                    count_1--;
                }
            }
        }
    }
    
    // Driver Code
    public static void main (String[] args) 
    {
        String str = "01101101101101101000000";
        int x = 1;
        int y = 2;
        arrangeString(str, x, y);

    }
}

// This code is contributed by vt_m.
{% endhighlight %}
{% highlight cpp %}
01101101101101101000000
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

