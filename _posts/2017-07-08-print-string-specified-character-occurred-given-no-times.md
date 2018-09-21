---
layout: post
title: Print the string after the specified character has occurred given no. of times
---
* Given a string, a character, and a count, the task is to print the string after the specified character has occurred count number of times.Print “Empty string” in case of any unsatisfying conditions.(Given character is not present, or present but less than given count, or given count completes on last index). If given count is 0, then given character doesn’t matter, just print the whole string.
* Examples:
{% highlight cpp %}
Input  :  str = "This is demo string" 
          char = i,    
          count = 3
Output :  ng

Input :  str = "geeksforgeeks"
         char = e, 
         count = 2
Output : ksforgeeks
{% endhighlight %}
* Asked in: Oracle
* Implementation: 1- Start traversing the string.
* 2- Print the string after the index till the string gets traversed in the loop. 3- If index has reached to the last, then print “Empty string”.
{% highlight cpp %}
// C++ program for above implementation
#include <iostream>
using namespace std;

// Function to print the string
void printString(string str, char ch, int count)
{
    int occ = 0, i;

    // If given count is 0
    // print the given string and return
    if (count == 0) {
        cout << str;
        return;
    }

    // Start traversing the string
    for (i = 0; i < str.length(); i++) {

        // Increment occ if current char is equal
        // to given character
        if (str[i] == ch)
            occ++;

        // Break the loop if given character has
        // been occurred given no. of times
        if (occ == count)
            break;
    }

    // Print the string after the occurrence
    // of given character given no. of times
    if (i < str.length() - 1)
        cout << str.substr(i + 1, str.length() - (i + 1));

    // Otherwise string is empty
    else
        cout << "Empty string";
}

// Drivers code
int main()
{
    string str = "geeks for geeks";
    printString(str, 'e', 2);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program for above implementation

public class GFG 
{
    // Method to print the string
    static void printString(String str, char ch, int count)
    {
        int occ = 0, i;
     
        // If given count is 0
        // print the given string and return
        if (count == 0) {
            System.out.println(str);
            return;
        }
     
        // Start traversing the string
        for (i = 0; i < str.length(); i++) {
     
            // Increment occ if current char is equal
            // to given character
            if (str.charAt(i) == ch)
                occ++;
     
            // Break the loop if given character has
            // been occurred given no. of times
            if (occ == count)
                break;
        }
     
        // Print the string after the occurrence
        // of given character given no. of times
        if (i < str.length() - 1)
            System.out.println(str.substring(i + 1));
     
        // Otherwise string is empty
        else
            System.out.println("Empty string");
    }
    
    // Driver Method
    public static void main(String[] args)
    {
        String str = "geeks for geeks";
        printString(str, 'e', 2);
    }
}
{% endhighlight %}
{% highlight cpp %}
ks for geeks
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

