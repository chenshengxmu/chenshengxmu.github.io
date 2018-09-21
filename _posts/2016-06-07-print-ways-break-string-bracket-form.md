---
layout: post
title: Print all ways to break a string in bracket form
---
* Given a string, find all ways to to break the given string in bracket form. Enclose each substring within a parenthesis.
* Examples:
{% highlight cpp %}
Input : abc
Output: (a)(b)(c)
        (a)(bc)
        (ab)(c)
        (abc)


Input : abcd
Output : (a)(b)(c)(d)
         (a)(b)(cd)
         (a)(bc)(d)
         (a)(bcd)
         (ab)(c)(d)
         (ab)(cd)
         (abc)(d)
         (abcd)
{% endhighlight %}
* We strongly recommend you to minimize your browser and try this yourself first.
* The idea is to use recursion. We maintain two parameters – index of the next character to be processed and the output string so far. We start from index of next character to be processed, append substring formed by unprocessed string to the output string and recurse on remaining string until we process the whole string. We use std::substr to form the output string. substr(pos, n) returns a substring of length n that starts at position pos of current string.
* Below diagram shows recursion tree for input string “abc”. Each node on the diagram shows processed string (marked by green) and unprocessed string (marked by red).

![img](https://www.geeksforgeeks.org/wp-content/uploads/image12.png)
* Below is its implementation-
{% highlight cpp %}
// C++ Program to find all combinations of Non-
// overlapping substrings formed from given
// string
#include <iostream>
using namespace std;

// find all combinations of non-overlapping
// substrings formed by input string str
// index – index of the next character to
//          be processed
// out - output string so far
void findCombinations(string str, int index,
                      string out)
{
    if (index == str.length())
        cout << out << endl;

    for (int i = index; i < str.length(); i++)

        // append substring formed by str[index,
        // i] to output string
        findCombinations(str, i + 1, out +
          "(" + str.substr(index, i+1-index) + ")" );
}

// Driver Code
int main()
{
    // input string
    string str = "abcd";

    findCombinations(str, 0, "");

    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to find all combinations of Non-
// overlapping substrings formed from given
// string

class GFG 
{
    // find all combinations of non-overlapping
    // substrings formed by input string str
    static void findCombinations(String str, int index,
                                 String out)
    {
        if (index == str.length())
            System.out.println(out);
 
        for (int i = index; i < str.length(); i++)
 
            // append substring formed by str[index,
            // i] to output string
            findCombinations(str, i + 1, out +
                "(" + str.substring(index, i+1) + ")" );
    }
    
    // driver program
	public static void main (String[] args) 
	{
		// input string
        String str = "abcd";
        findCombinations(str, 0, "");
	}
}

// Contributed by Pramod Kumar
{% endhighlight %}
{% highlight cpp %}
(a)(b)(c)(d)
(a)(b)(cd)
(a)(bc)(d)
(a)(bcd)
(ab)(c)(d)
(ab)(cd)
(abc)(d)
(abcd)
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above

