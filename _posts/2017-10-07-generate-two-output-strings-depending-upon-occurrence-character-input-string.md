---
layout: post
title: Generate two output strings depending upon occurrence of character in input string.
---
* Given an input string str[], generate two output strings. One of which consists of those character which occurs only once in input string and second which consists of multi-time occurring characters. Output strings must be sorted.
* Examples:
{% highlight cpp %}
Input : str[] = "geeksforgeeks"
Output : String with characters occurring once:
for
String with characters occurring multiple times:
egks

Input : str[] = "geekspractice"
Output : String with characters occurring once:
agikprst
String with characters occurring multiple times:
ce
{% endhighlight %}
* Approach : We follow total two steps to generate the both output strings. Step 1: Create a count array and count occurrences of characters in the given input string. Step 2: Check count array for each position ‘i’ which leads to three possible conditions : a) If count value is 1, append character in first output string. b) If count value is greater than 1, append character in second output string. c) If count value is 0 do nothing.
* Time Complexity for above approach is O(n). Auxiliary Space required is O(1).
{% highlight cpp %}
// CPP program to print two strings
// made of character occurring once 
// and multiple times
#include <bits/stdc++.h>
using namespace std;

const int MAX_CHAR = 256;

// function to print two strings 
// generated from single string one
// with characters occurring onces 
// other with character occurring 
// multiple of times
void printDuo(string &str)
{
    // initialize hashtable with zero 
    // entry
    int countChar[MAX_CHAR] = { 0 };

    // perform hashing for input string
    int n = str.length();
    for (int i = 0; i < n; i++)
        countChar[str[i] - 'a']++;

    // generate string (str1) consisting 
    // char occurring once and string 
    // (str2) consisting char occurring 
    // multiple times
    string str1 = "", str2 = "";  
    for (int i = 0; i < MAX_CHAR; i++) {
        if (countChar[i] > 1)
            str2 = str2 + (char)(i + 'a');
        else if (countChar[i] == 1)
            str1 = str1 + (char)(i + 'a');
    }

    // print both strings
    cout << "String with characters occurring "
         <<  "once:\n";
    cout << str1 << "\n";
    cout << "String with characters occurring " 
         << "multiple times:\n";
    cout << str2 << "\n";
}

// driver program
int main()
{
    string str = "lovetocode";
    printDuo(str);
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
String with characters occurring once:
cdltv
String with characters occurring multiple times:
eo
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

