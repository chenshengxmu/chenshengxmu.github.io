---
layout: post
title: Count Uppercase, Lowercase, special character and numeric values
---
* Given a string, write a program to count the occurrence of Lowercase characters, Uppercase characters, Special characters and Numeric values.
* Examples:
{% highlight cpp %}
Input : #GeeKs01fOr@gEEks07
Output : 
Upper case letters : 5
Lower case letters : 8
Numbers : 4
Special Characters : 2

Input : *GeEkS4GeEkS*
Output :
Upper case letters : 6
Lower case letters : 4
Numbers : 1
Special Characters : 2
{% endhighlight %}
* Approach : Step 1: Scan a string str from 0 to length-1. Step 2: check one character at a time on the basis of ASCII values if(str[i] >= 65 and str[i] =97 and str[i] =48 and str[i] <=57) number else special character step 3: Print all the counters.
{% highlight cpp %}
// C++ program to count the uppercase,
// lowercase, special characters 
// and numeric values
#include<iostream>
using namespace std;

// Function to count uppercase, lowercase,
// special characters and numbers
void Count(string str)
{
    int upper = 0, lower = 0, number = 0, special = 0;
    for (int i = 0; i < str.length(); i++)
    {
        if (str[i] >= 'A' && str[i] <= 'Z')
            upper++;
        else if (str[i] >= 'a' && str[i] <= 'z')
            lower++;
        else if (str[i]>= '0' && str[i]<= '9')
            number++;
        else
            special++;
    }
    cout << "Upper case letters: " << upper << endl;
    cout << "Lower case letters : " << lower << endl;
    cout << "Number : " << number << endl;
    cout << "Special characters : " << special << endl;
}

// Driver function
int main()
{
    string str = "#GeeKs01fOr@gEEks07";
    Count(str);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to count the uppercase,
// lowercase, special characters 
// and numeric values
import java.io.*;

class Count
{
    public static void main(String args[])
    {
        String str = "#GeeKs01fOr@gEEks07";
        int upper = 0, lower = 0, number = 0, special = 0;

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upper++;
            else if (ch >= 'a' && ch <= 'z')
                lower++;
            else if (ch >= '0' && ch <= '9')
                number++;
            else
                special++;
        }

        System.out.println("Lower case letters : " + lower);
        System.out.println("Upper case letters : " + upper);
        System.out.println("Number : " + number);
        System.out.println("Special characters : " + special);
    }
}
{% endhighlight %}
{% highlight cpp %}
Upper case letters: 5
Lower case letters : 8
Number : 4
Special characters : 2
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

