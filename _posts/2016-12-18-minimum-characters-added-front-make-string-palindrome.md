---
layout: post
title: Minimum characters to be added at front to make string palindrome
---
* Given a string str we need to tell minimum characters to be added at front of string to make string palindrome.
* Examples:
{% highlight cpp %}
Input  : str = "ABC"
Output : 2
We can make above string palindrome as "CBABC"
by adding 'B' and 'C' at front.

Input  : str = "AACECAAAA";
Output : 2
We can make above string palindrome as AAAACECAAAA
by adding two A's at front of string.
{% endhighlight %}
* A brute force way to solve this problem is to keep adding characters from last one by one at front and keep checking whether current string is palindrome or not, at max we need to check characters equal to half of length of string because in worst case half of the string need to be added at front to make string palindrome.
* We can solve this problem efficiently in O(n) time using lps array of KMP algorithm. First we concat string by concatenating given string, a special character and reverse of given string then we will get lps array for this concatenated string, recall that each index of lps array represent longest proper prefix which is also suffix. We can use this lps array for solving the problem.
{% highlight cpp %}
For string = AACECAAAA
Concatenated String = AACECAAAA$AAAACECAA
LPS array will be {0, 1, 0, 0, 0, 1, 2, 2, 2, 
                   0, 1, 2, 2, 2, 3, 4, 5, 6, 7}
{% endhighlight %}
* Here we are only interested in the last value of this lps array because it shows us the largest suffix of the reversed string that matches the prefix of the original string i.e these many characters already satisfy the palindrome property. Finally minimum number of character needed to make the string a palindrome is length of the input string minus last entry of our lps array. Pease see below code for better understanding
{% highlight cpp %}
// C++ program for getting minimum character to be
// added at front to make string palindrome
#include <bits/stdc++.h>
using namespace std;

// returns vector lps for given string str
vector<int> computeLPSArray(string str)
{
    int M = str.length();
    vector<int> lps(M);

    int len = 0;
    lps[0] = 0; // lps[0] is always 0

    // the loop calculates lps[i] for i = 1 to M-1
    int i = 1;
    while (i < M)
    {
        if (str[i] == str[len])
        {
            len++;
            lps[i] = len;
            i++;
        }
        else // (str[i] != str[len])
        {
            // This is tricky. Consider the example.
            // AAACAAAA and i = 7. The idea is similar
            // to search step.
            if (len != 0)
            {
                len = lps[len-1];

                // Also, note that we do not increment
                // i here
            }
            else // if (len == 0)
            {
                lps[i] = 0;
                i++;
            }
        }
    }
    return lps;
}

// Method returns minimum character to be added at
// front to make string palindrome
int getMinCharToAddedToMakeStringPalin(string str)
{
    string revStr = str;
    reverse(revStr.begin(), revStr.end());

    // Get concatenation of string, special character
    // and reverse string
    string concat = str + "$" + revStr;

    //  Get LPS array of this concatenated string
    vector<int> lps = computeLPSArray(concat);

    // By subtracting last entry of lps vector from
    // string length, we will get our result
    return (str.length() - lps.back());
}

// Driver program to test above functions
int main()
{
    string str = "AACECAAAA";
    cout << getMinCharToAddedToMakeStringPalin(str);
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
2
{% endhighlight %}
* Efficient Approach : Start checking the string each time if it is palindrome, and if not, then delete the last character and check again. After deleting count number of characters from the last i.e., the characters to be added to front, there will be a string which will be palindrome.
{% highlight cpp %}
#include<bits/stdc++.h>
using namespace std;

// function for checking string is palindrome or not
bool ispalindrome(string s)
{
    int l = s.length();
    int j;
    
    for(int i = 0, j = l - 1; i <= j; i++, j--)
    {
        if(s[i] != s[j])
            return false;
    }
    return true;
}

// Driver code
int main()
{
    string s = "BABABAA";
    int cnt = 0;
    int flag = 0;
    
    while(s.length()>0)
    {
        // if string becomes palindrome then break
        if(ispalindrome(s))
        {
            flag = 1;
             break;
        }
        else
        {
        cnt++;
        
        // erase the last element of the string
        s.erase(s.begin() + s.length() - 1);
        }
    }
    
    // print the number of insertion at front
    if(flag)
        cout << cnt;
}
{% endhighlight %}
* Thank you Sanny Kumar for suggesting this approach.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

