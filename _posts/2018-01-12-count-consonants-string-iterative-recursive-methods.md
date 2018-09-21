---
layout: post
title: Count consonants in a string (Iterative and recursive methods)
---
* Given a string, count total number of consonants in it. A consonant is a English alphabet character that is not vowel (a, e, i, o and u). Examples of constants are b, c, d, f, g, ..
* Examples :
{% highlight cpp %}
Input : abc de
Output : 3
There are three consonants b, c and d.

Input : geeksforgeeks portal
Output : 12
{% endhighlight %}
* 1. Iterative Method
{% highlight cpp %}
// Iterative CPP program to count total number
// of consonants 
#include <iostream>
using namespace std;

// Function to check for consonant
bool isConsonant(char ch)
{
    // To handle lower case
    ch = toupper(ch);

    return !(ch == 'A' || ch == 'E' || 
            ch == 'I' || ch == 'O' || 
            ch == 'U') && ch >= 65 && ch <= 90;
}

int totalConsonants(string str)
{
    int count = 0;
    for (int i = 0; i < str.length(); i++) 

        // To check is character is Consonant
        if (isConsonant(str[i]))
            ++count;
    return count;
}

// Driver code
int main()
{
    string str = "abc de";
    cout << totalConsonants(str);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Iterative Java program
// to count total number
// of consonants 

import java.io.*;

class GFG {

    // Function to check for consonant
    static boolean isConsonant(char ch)
    {
        // To handle lower case
        ch = Character.toUpperCase(ch);
     
        return !(ch == 'A' || ch == 'E' || 
                ch == 'I' || ch == 'O' || 
                ch == 'U') && ch >= 65 && ch <= 90;
    }
 
    static int totalConsonants(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++) 
     
            // To check is character is Consonant
            if (isConsonant(str.charAt(i)))
                ++count;
        return count;
    }
    
    // Driver code
    public static void main(String args[])
    {
        String str = "abc de";
        System.out.println( totalConsonants(str));
    }
}

// This code is contributed by Nikita Tiwari.
{% endhighlight %}
{% highlight python %}
# Iterative Python3 program to count 
# total number of consonants 

# Function to check for consonant
def isConsonant(ch):
    
    # To handle lower case
    ch = ch.upper()

    return not (ch == 'A' or ch == 'E' or 
                ch == 'I' or ch == 'O' or 
                ch == 'U') and ord(ch) >= 65 and ord(ch) <= 90

def totalConsonants(string):
    
    count = 0
    
    for i in range(len(string)):

        # To check is character is Consonant
        if (isConsonant(string[i])):
            count += 1
            
    return count

# Driver code
string = "abc de"
print(totalConsonants(string))


# This code id contributed by Ansu Kumari.
{% endhighlight %}
{% highlight cpp %}
3
{% endhighlight %}
* 2. Recursive Method
{% highlight cpp %}
// Recursive CPP program to count total number
// of consonants 
#include <iostream>
using namespace std;

// Function to check for consonant
bool isConsonant(char ch)
{
    // To handle lower case
    ch = toupper(ch);

    return !(ch == 'A' || ch == 'E' || 
            ch == 'I' || ch == 'O' || 
            ch == 'U') && ch >= 65 && ch <= 90;
}

// to count total number of consonants from 
// 0 to n-1
int totalConsonants(string str, int n)
{
    if (n == 1)
        return isConsonant(str[0]);

    return totalConsonants(str, n - 1) + 
           isConsonant(str[n-1]);
}

// Driver code
int main()
{
    string str = "abc de";
    cout << totalConsonants(str, str.length());
    return 0;
}
{% endhighlight %}
{% highlight python %}
# Recursive Python3 program to count 
# total number of consonants 

# Function to check for consonant
def isConsonant(ch):
    
    # To handle lower case
    ch = ch.upper()

    return not (ch == 'A' or ch == 'E' or 
                ch == 'I' or ch == 'O' or 
                ch == 'U') and ord(ch) >= 65 and ord(ch) <= 90

# To count total number of  
# consonants from 0 to n-1
def totalConsonants(string, n):
    
    if n == 1:
        return isConsonant(string[0])

    return totalConsonants(string, n - 1) + isConsonant(string[n-1])


# Driver code
string = "abc de"
print(totalConsonants(string, len(string)))


# This code is contributed by Ansu Kuamri.
{% endhighlight %}
{% highlight cpp %}
3
{% endhighlight %}
* Illustration of recursive method:
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

