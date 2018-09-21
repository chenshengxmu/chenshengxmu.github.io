---
layout: post
title: Missing characters to make a string Pangram
---
* Pangram is a sentence containing every letter in the English alphabet. Given a string, find all characters that are missing from the string, i.e., the characters that can make string a Pangram. We need to print output in alphabetic order.
* Examples:
{% highlight cpp %}
Input : welcome to geeksforgeeks
Output : abdhijnpquvxyz

Input : The quick brown fox jumps
Output : adglvyz
{% endhighlight %}
* We have discussed Pangram Checking. The idea is similar, we traverse given string and mark all visited characters. At the end, we print all those characters which are not visited.
* Lowercase and Uppercase character are considered same.
{% highlight java %}
// C++ program to find characters that needs
// to be added to make Pangram
#include<bits/stdc++.h>
using namespace std;
const int MAX_CHAR = 26;

// Returns characters that needs to be added
// to make str
string missingChars(string str)
{
    // A boolean array to store characters
    // present in string.
    bool present[MAX_CHAR] = {false};

    // Traverse string and mark characters
    // present in string.
    for (int i=0; i<str.length(); i++)
    {
        if (str[i] >= 'a' && str[i] <= 'z')
            present[str[i]-'a'] = true;
        else if (str[i] >= 'A' && str[i] <= 'Z')
            present[str[i]-'A'] = true;
    }

    // Store missing characters in alphabetic
    // order.
    string res = "";
    for (int i=0; i<MAX_CHAR; i++)
        if (present[i] == false)
            res.push_back((char)(i+'a'));

    return res;
}

// Driver program
int main()
{
    string str = "The quick brown fox jumps "
                 "over the dog";
    cout << missingChars(str);
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
alyz
{% endhighlight %}
* Time Complexity : O(n) Auxiliary Space : O(1)
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

