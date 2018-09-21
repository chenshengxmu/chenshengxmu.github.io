---
layout: post
title: Min flips of continuous characters to make all characters same in a string
---
* Given a string consisting only of 1’s and 0’s. In one flip we can change any continuous sequence of this string. Find this minimum number of flips so the string consist of same characters only.
* Examples:
{% highlight cpp %}
Input : 00011110001110
Output : 2
We need to convert 1's sequence
so string consist of all 0's.

Input : 010101100011
Output : 4
{% endhighlight %}
* We need to find the min flips in string so all characters are equal. All we have to find numbers of sequence which consisting of 0’s or 1’s only. Then number of flips required will be half of this number as we can change all 0’s or all 1’s.
{% highlight cpp %}
// CPP program to find min flips in binary
// string to make all characters equal
#include <bits/stdc++.h>
using namespace std;

// To find min number of flips in binary string
int findFlips(char str[], int n)
{
    char last = ' '; int res = 0;

    for (int i = 0; i < n; i++) {

        // If last character is not equal
        // to str[i] increase res
        if (last != str[i])
            res++;
        last = str[i];
    }

    // To return min flips
    return res / 2;
}

// Driver program to check findFlips()
int main()
{
    char str[] = "00011110001110";
    int n = strlen(str);

    cout << findFlips(str, n);

    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to find min flips in binary
// string to make all characters equal
public class minFlips {

    // To find min number of flips in binary string
    static int findFlips(String str, int n)
    {
        char last = ' '; int res = 0;

        for (int i = 0; i < n; i++) {

            // If last character is not equal
            // to str[i] increase res
            if (last != str.charAt(i))
                res++;
            last = str.charAt(i);
        }

        // To return min flips
        return res / 2;
    }

    // Driver program to check findFlips()
    public static void main(String[] args)
    {
        String str = "00011110001110";
        int n = str.length();

        System.out.println(findFlips(str, n));
    }
}
{% endhighlight %}
{% highlight cpp %}
2
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

