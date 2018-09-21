---
layout: post
title: Count characters at same position as in English alphabet
---
* Given a string of lower and uppercase characters, the task is to find that how many characters are at same position as in English alphabet.
* Examples:
{% highlight cpp %}
Input:  ABcED 
Output :  3
First three characters are at same position
as in English alphabets.

Input:  geeksforgeeks 
Output :  1
Only 'f' is at same position as in English
alphabet

Input :  alphabetical 
Output :  3
{% endhighlight %}
* For this we can have simple approach:
{% highlight cpp %}
1) Initialize result as 0.
2) Travers input string and do following for every 
   character str[i]
     a) If 'i' is same as str[i] - 'a' or same as 
        str[i] - 'A', then do result++
3) Return result
{% endhighlight %}
{% highlight cpp %}
// C++ program to find number of characters at same
// position as in English alphabets
#include<bits/stdc++.h>
using namespace std;

int findCount(string str)
{
    int result = 0;

    // Travers input string
    for (int i = 0 ; i < str.size(); i++)

        // Check that index of characters of string is
        // same as of English alphabets by using ASCII
        // values and the fact that all lower case
        // alphabatic characters come together in same
        // order in ASCII table.  And same is true for
        // upper case.
        if (i == (str[i] - 'a') || i == (str[i] - 'A'))
            result++;


    return result;
}

// Driver code
int main()
{
    string str = "AbgdeF";
    cout << findCount(str);
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
5
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

