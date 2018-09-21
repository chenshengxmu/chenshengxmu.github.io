---
layout: post
title: Lexicographically smallest string obtained after concatenating array
---
* Given n strings, concatenate them in an order that produces the lexicographically smallest possible string.
* Examples:
{% highlight cpp %}
Input :  a[] = ["c", "cb", "cba"]
Output : cbacbc
Possible strings are ccbcba, ccbacb, 
cbccba, cbcbac, cbacbc and cbaccb. 
Among all these strings, cbacbc is 
the lexicographically smallest.

Input :  a[] = ["aa", "ab", "aaa"]
Output : aaaaaab
{% endhighlight %}
* One might think that sorting the given strings in the lexicographical order and then concatenating them produces the correct output. This approach produces the correct output for inputs like [“a”, “ab”, “abc”]. However, applying this method on [“c”, “cb”, “cba”] produces the wrong input and hence this approach is incorrect.
* The correct approach is to use a regular sorting algorithm. When two strings a and b are compared to decide if they have to be swapped or not, do not check if a is lexicographically smaller than b or not. Instead check if appending b at the end of a produces a lexicographically smaller string or appending a at the end of b does. This approach works because we want the concatenated string to be lexicographically small, not the individual strings to be in the lexicographical order.
{% highlight cpp %}
// CPP code to find the lexicographically
// smallest string
#include <bits/stdc++.h>
using namespace std;

// Compares two strings by checking if 
// which of the two concatenations causes
// lexicographically smaller string.
bool compare(string a, string b)
{
    return (a+b < b+a);
}

string lexSmallest(string a[], int n)
{
    // Sort strings using above compare()
    sort(a, a+n, compare);

    // Concatenating sorted strings
    string answer = "";
    for (int i = 0; i < n; i++)
        answer += a[i];

    return answer;
}

// Driver code
int main()
{
    string a[] = { "c", "cb", "cba" };
    int n = sizeof(a)/sizeof(a[0]);
    cout << lexSmallest(a, n);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java code to find the lexicographically
// smallest string

class GFG {
    
// function to sort the
// array of string
static void sort(String a[], int n)
{
    
    //sort the array
    for(int i = 0;i < n;i++)
    {
        for(int j = i + 1;j < n;j++)
        {
            
            // comparing which of the
            // two concatenation causes
            // lexiographically smaller
            // string
            if((a[i] + a[j]).compareTo(a[j] + a[i]) > 0)
            {
                String s = a[i];
                a[i] = a[j];
                a[j] = s;
            }
        }
    }
}
    
static String lexsmallest(String a[], int n)
{
    
    // Sort strings
    sort(a,n);

    // Concatenating sorted strings
    String answer = "";
    for (int i = 0; i < n; i++)
        answer += a[i];

    return answer;
}

// Driver code
public static void main(String args[])
{
    String a[] = {"c", "cb", "cba"};
    int n = 3;
    System.out.println("lexiographically smallest string = "
                                      + lexsmallest(a, n));

}
}

// This code is contributed by Arnab Kundu
{% endhighlight %}
{% highlight cpp %}
cbacbc
{% endhighlight %}
* Time complexity : The above code runs inO(M * N * logN) where N is number of strings and M is maximum length of a string.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

