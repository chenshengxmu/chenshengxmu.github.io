---
layout: post
title: Print all possible strings that can be made by placing spaces
---
* Given a string you need to print all possible strings that can be made by placing spaces (zero or one) in between them Examples :
{% highlight cpp %}
Input :  str[] = "ABC"
Output : ABC
         AB C
         A BC
         A B C

Input : str[] = "ABCD"
Output : ABCD
         A BCD
         AB CD
         A B CD
         ABC D
         A BC D
         AB C D
         A B C D
{% endhighlight %}
* If we take a closer look, we can notice that this problem boils down to Power Set problem. We basically need to generate all subsets where every element is a different space.
{% highlight cpp %}
// C++ program to print all strings that can be
// made by placing spaces
#include <bits/stdc++.h>
using namespace std;

void printSubsequences(string str)
{
    int n = str.length();
    unsigned int opsize = pow(2, n - 1);

    for (int counter = 0; counter < opsize; counter++) {
        for (int j = 0; j < n; j++) {

            cout << str[j];
            if (counter & (1 << j))
                cout << " ";
        }
        cout << endl;
    }
}

// Driver code
int main()
{
    string str = "ABC";
    printSubsequences(str);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to print all strings that can be
// made by placing spaces
import java.util.*;
class GFG
{
static void printSubsequences(String s)
{
    char[] str= s.toCharArray();
    int n = str.length;
    int opsize = (int)(Math.pow(2, n - 1));

    for (int counter = 0; counter < opsize; counter++) {
        for (int j = 0; j < n; j++) {

            System.out.print(str[j]);
            if ((counter & (1 << j)) > 0)
                System.out.print(" ");
        }
        System.out.println();
    }
}

// Driver code
public static void main(String[] args)
{
    String str = "AB";
    printSubsequences(str);
}
}

/* This code is contributed by Mr. Somesh Awasthi */
{% endhighlight %}
{% highlight cpp %}
ABC
A BC
AB C
A B C
{% endhighlight %}
* Asked in: Amazon
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

