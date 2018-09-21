---
layout: post
title: Reverse vowels in a given string
---
* Given a string, your task is to reverse only the vowels of string.
* Examples:
{% highlight cpp %}
Input : hello
Output : holle

Input : hello world
Output : hollo werld
{% endhighlight %}
* One simple solution is to store all the vowels while scanning the string and placing the vowels in the reverse order in another iteration of string.
{% highlight cpp %}
// C++ program to reverse order of vowels
#include<bits/stdc++.h>
using namespace std;

// utility function to check for vowel
bool isVowel(char c)
{
    return (c=='a' || c=='A' || c=='e' ||
            c=='E' || c=='i' || c=='I' ||
            c=='o' || c=='O' || c=='u' ||
            c=='U');
}

// Function to reverse order of vowels
string reverseVowel(string str)
{
    int j=0;
    // Storing the vowels separately
    string vowel;
    for (int i=0; str[i]!='\0'; i++)
        if (isVowel(str[i]))
            vowel[j++] = str[i];

    // Placing the vowels in the reverse
    // order in the string
    for (int i=0; str[i]!='\0'; i++)
        if (isVowel(str[i]))
            str[i] = vowel[--j] ;

    return str;
}

// Driver function
int main()
{
    string str = "hello world";
    cout << reverseVowel(str);
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
hollo werld
{% endhighlight %}
* Time complexity : O(n) where n = length of string Auxiliary Space : O(v) where v = number of vowels in string
* A better solution is to use two pointers scanning from beginning and end of the array respectively and manipulate vowels pointed by these pointers.
{% highlight cpp %}
// C++ program to reverse order of vowels
#include<bits/stdc++.h>
using namespace std;

// utility function to check for vowel
bool isVowel(char c)
{
    return (c=='a' || c=='A' || c=='e' ||
            c=='E' || c=='i' || c=='I' ||
            c=='o' || c=='O' || c=='u' ||
            c=='U');
}

// Function to reverse order of vowels
string reverseVowel(string str)
{
    // Start two indexes from two corners
    // and move toward each other
    int i = 0;
    int j = str.length()-1;
    while (i < j)
    {
        if (!isVowel(str[i]))
        {
            i++;
            continue;
        }
        if (!isVowel(str[j]))
        {
            j--;
            continue;
        }

        // swapping
        swap(str[i], str[j]);

        i++;
        j--;
    }

    return str;
}

// Driver function
int main()
{
    string str = "hello world";
    cout << reverseVowel(str);
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
hollo werld
{% endhighlight %}
* Time complexity : O(n) where n = length of string Auxiliary Space : O(1)
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

