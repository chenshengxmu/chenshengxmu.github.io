---
layout: post
title: Print the string by ignoring alternate occurrences of any character
---
* Given a string of both uppercase and lowercase alphabets, the task is to print the string with alternate occurrences of any character dropped(including space and consider upper and lowercase as same).
* Examples:
{% highlight cpp %}
Input : It is a long day Dear.
Output : It sa longdy ear.
Print first I and then ignore next i.
Similarly print first space then 
ignore next space.


Input : Geeks for geeks
Output : Geks fore
{% endhighlight %}
* Asked in: Microsoft
* As we have to print characters in alternate manner, so start traversing the string and perform following two steps:-
{% highlight cpp %}
// C++ program to print the string in given pattern
#include <bits/stdc++.h>
using namespace std;

// Function to print the string
void printStringAlternate(string str)
{
    unordered_map<char, int> occ;

    // Start traversing the string
    for (int i = 0; i < str.length(); i++) {

        // Convert uppercase to lowercase
        char temp = tolower(str[i]);

        // Increment occurrence count
        occ[temp]++;

        // If count is odd then print the character
        if (occ[temp] & 1)
            cout << str[i];
    }

    cout << endl;
}

// Drivers code
int main()
{
    string str = "Geeks for geeks";
    string str2 = "It is a long day Dear";

    printStringAlternate(str);
    printStringAlternate(str2);

    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to print the string in given pattern
import java.io.*;

class GFG 
{
    // Function to print the string
    static void printStringAlternate(String str)
    {
        int[] occ = new int[122];
        
        // Convert uppercase to lowercase
        String s = str.toLowerCase();
 
        // Start traversing the string
        for (int i = 0; i < str.length(); i++) 
        {
            
            char temp = s.charAt(i);
 
            // Increment occurrence count
            occ[temp]++;
 
            // If count is odd then print the character
            if (occ[temp]%2 != 0)
                System.out.print(str.charAt(i));
        }
        System.out.println();
    }
    
    // driver program
    public static void main (String[] args) 
    {
        String str1 = "Geeks for geeks";
        String str2 = "It is a long day Dear";
        printStringAlternate(str1);
        printStringAlternate(str2);
    }
}

// Contributed by Pramod Kumar
{% endhighlight %}
{% highlight cpp %}
Geks fore
It sa longdy ear
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

