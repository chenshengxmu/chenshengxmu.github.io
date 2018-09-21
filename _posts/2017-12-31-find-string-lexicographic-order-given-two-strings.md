---
layout: post
title: Find a string in lexicographic order which is in between given two strings
---
* Given two strings S and T, find a string of the same length which is lexicographically greater than S and smaller than T. Print “-1” if no such string is formed.(S > T) Note: string S = s1s2… sn is said to be lexicographically smaller than string T = t1t2… tn, if there exists an i, such that s1 = t1, s2 = t2, … si – 1 = ti – 1, si < ti.
* Examples:
{% highlight cpp %}
Input : S = "aaa", T = "ccc"
Output : aab
Explanation: 
Here, 'b' is greater than any 
letter in S[]('a') and smaller 
than any letter in T[]('c').

Input : S = "abcde", T = "abcdf"
Output : -1
Explanation: 
There is no other string between
S and T.
{% endhighlight %}
* Approach: Find a string which is lexicographically greater than string S and check if it is smaller than string T, if yes print the string next else print “-1”. To find string, iterate the string S in the reverse order, if the last letter is not ‘z’, increase the letter by one (to move to next letter). If it is ‘z’, change it to ‘a’ and move to the second last character. Compare the resultant string with string T, if both strings are equal print ‘-1’, else print the resultant string.
* Below is the implementation of above approach:
{% highlight cpp %}
// CPP program to find the string
// in lexicographic order which is
// in between given two strings
#include <bits/stdc++.h>
using namespace std;

// Function to find the lexicographically  
// next string
string lexNext(string s, int n)
{   
    // Iterate from last character
    for (int i = n - 1; i >= 0; i--) 
    {   
        // If not 'z', increase by one
        if (s[i] != 'z') 
        {
            s[i]++;
            return s;
        }
        
        // if 'z', change it to 'a'
        s[i] = 'a'; 
    }
}

// Driver Code
int main()
{
    string S = "abcdeg", T = "abcfgh";
    int n = S.length();
    string res = lexNext(S, n);

    // If not equal, print the 
    // resultant string
    if (res != T) 
        cout << res << endl;    
    else
        cout << "-1" << endl;
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
abcdeh
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

