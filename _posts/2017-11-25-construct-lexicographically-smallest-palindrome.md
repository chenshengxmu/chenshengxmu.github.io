---
layout: post
title: Construct lexicographically smallest palindrome
---
* Given a string of lowercase alphabets. Some of characters of given string got corrupted and are now represented by *. We can replace * with any of lowercase alphabets. You have to construct lexicographically smallest palindrome string. If it is not possible to construct a palindrome print “Not Possible”.
* Examples:
{% highlight cpp %}
Input : str[] = "bc*b" 
Output : bccb

Input : str[] = "bc*a*cb"
Output : bcaaacb

Input : str[] = "bac*cb"
Output : Not Possible
{% endhighlight %}
* Start traversing the string from both end. Say with i=0, j=strlen-1, keep increasing i and decreasing j after every single iteration till i exceeds j. Now at any intermediate position we have five possible case :
* After i exceeds j means we have got our required palindrome. Else we got “Not possible” as result.
{% highlight cpp %}
// CPP for constructing smallest palindrome
#include <bits/stdc++.h>
using namespace std;

// function for printing palindrome
string constructPalin(string str, int len)
{
    int i = 0, j = len - 1;

    // iterate till i<j
    for (; i < j; i++, j--) {

        // continue if str[i]==str[j]
        if (str[i] == str[j] && str[i] != '*')
            continue;

        // update str[i]=str[j]='a' if both are '*'
        else if (str[i] == str[j] && str[i] == '*') {
            str[i] = 'a';
            str[j] = 'a';
            continue;
        }

        // update str[i]=str[j] if only str[i]='*'
        else if (str[i] == '*') {
            str[i] = str[j];
            continue;
        }

        // update str[j]=str[i] if only str[j]='*'
        else if (str[j] == '*') {
            str[j] = str[i];
            continue;
        }

        // else print not possible and return
        cout << "Not Possible";
        return "";
    }
    return str;
}

// driver program
int main()
{
    string str = "bca*xc**b";
    int len = str.size();
    cout << constructPalin(str, len);
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
bcacxcacb
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

