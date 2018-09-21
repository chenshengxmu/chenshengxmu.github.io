---
layout: post
title: Print reverse string after removing vowels
---
* Given a string s, print reverse of string and remove the characters from the reversed string where there are vowels in the original string.
* Examples:
{% highlight cpp %}
Input : geeksforgeeks
Output : segrfseg
Explanation :
Reversed string is skeegrofskeeg, removing characters 
from indexes 1, 2, 6, 9 & 10 (0 based indexing),
we get segrfseg .

Input :duck
Output :kud
{% endhighlight %}
* A simple solution is to first reverse the string, then traverse the reversed string and remove vowels.
* An efficient solution is to do both tasks in one traversal. Create an empty string r and traverse the original string s and assign the value to the string r. Check whether, at that index, the original string contains a consonant or not. If yes then print the element at that index from string r.
* Basic implementation of the above approach :
{% highlight cpp %}
// CPP Program for removing characters
// from reversed string where vowels are
// present in original string
#include <bits/stdc++.h>
using namespace std;

// Function for replacing the string
void replaceOriginal(string s, int n)
{
    // initialize a string of length n
    string r(n, ' ');

    // Traverse through all characters of string
    for (int i = 0; i < n; i++) {

        // assign the value to string r
        // from last index of string s
        r[i] = s[n - 1 - i];

        // if s[i] is a consonant then
        // print r[i]
        if (s[i] != 'a' && s[i] != 'e' && s[i] != 'i'
            && s[i] != 'o' && s[i] != 'u') {
            cout << r[i];
        }
    }
    cout << endl;
}

// Driver function
int main()
{
    string s = "geeksforgeeks";
    int n = s.length();
    replaceOriginal(s, n);

    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
segrfseg
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

