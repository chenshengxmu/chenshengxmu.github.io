---
layout: post
title: isupper() and islower() and their application in C++
---
* In C++, isupper() and islower() are predefined functions used for string and character handling.cstring.h is the header file required for string functions and cctype.h is the headerfile required for character functions.
* isupper() Function This function is used to check if the arguement contains any uppercase letters such as A, B, C, D……….Z.
{% highlight cpp %}
Syntax
int isupper(int x)
{% endhighlight %}
{% highlight cpp %}
// Program to check if a character is in 
// uppercase using islower()
#include <iostream>
#include <cctype>
using namespace std;
int main()
{
    char x;
    cin >> x;
    if (isupper(x)) 
        cout << "Uppercase";
    else 
        cout << "Not uppercase.";    
    return 0;
}
{% endhighlight %}
{% highlight cpp %}
Input : A
Output : Uppercase
{% endhighlight %}
{% highlight cpp %}
Input : a
Output : Not uppercase
{% endhighlight %}
* islower() Function This function is used to check if the arguement contains lowercase letters such as a, b, c, d, ……..z.
{% highlight cpp %}
Syntax
int islower(int x)
{% endhighlight %}
{% highlight cpp %}
// Program to check if a character is in 
// lowercase using islower()
#include <iostream>
#include <cctype>
using namespace std;
int main()
{
    char x;
    cin >> x;
    if (islower(x)) 
        cout << "Lowercase";
    else 
        cout << "Not Lowercase.";    

    return 0;
}
{% endhighlight %}
{% highlight cpp %}
Input:A
Output : Not Lowercase
{% endhighlight %}
{% highlight cpp %}
Input : a
Output : Lowercase
{% endhighlight %}
* Application of islower(), isupper(), tolower(), toupper() function. Given a string, task is to convert the characters in the string into opposite case, i.e. if a character is in lowercase, we need to convert it into uppercade and vice versa.
* Examples:
{% highlight cpp %}
Input : GeekS
Output :gEEKs

Input :Test Case
Output :tEST cASE
{% endhighlight %}
* 1. Traverse the given string character by character upto its length, check if character is in lowercase or uppercase using predefined function. 3. If lowercase, convert it to uppercase using toupper() function, if uppercase, convert it to lowercase using tolower() function. 4. Print the final string.
{% highlight cpp %}
// C++ program to toggle cases of a given
// string.
#include <iostream>
#include <cstring>
using namespace std;

// function to toggle cases of a string
void toggle(string& str)
{
    int length = str.length();
    for (int i = 0; i < length; i++) {
        int c = str[i];
        if (islower(c)) 
            str[i] = toupper(c);
        else if (isupper(c)) 
            str[i] = tolower(c);        
    }
}

// Driver Code
int main()
{
    string str = "GeekS";
    toggle(str);
    cout << str;
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
gEEKs
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

