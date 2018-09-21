---
layout: post
title: Transform the string
---
* Given a string s, change the string s according to the rules provided below:
* Examples:
{% highlight cpp %}
Input : aBAcAba
Output :#b#C#B

Input :SunshinE!!
Output :#s#N#S#H#N!!
{% endhighlight %}
* Approach : First, create a new string by removing all the vowels from the given original string. Now, change the case of every alphabet in this string. Finally, add # in front of every alphabet in the string and this is required string.
{% highlight cpp %}
// CPP code to transform string
#include <bits/stdc++.h>
using namespace std;

// Function to change 
// character's case
string change_case(string a)
{
    int l = a.length();
    
    for(int i = 0 ; i < l ; i++)
    {
        // If character is lowercase 
        // change to uppercase
        if(a[i] >= 'a' && a[i] <= 'z')
            a[i] = (char)(65 + 
                   (int)(a[i] - 'a'));
            
        // If character is uppercase 
        // change to lowercase
        else if(a[i] >= 'A' && a[i] <= 'Z')
            a[i] = (char)(97 + 
                   (int)(a[i] - 'A'));
    }
    
    return a;
    
}

// Function to delete vowels
string delete_vowels(string a)
{
    string temp = "";
    int l = a.length();
    for(int i = 0 ; i < l ; i++)
    {
        //If character is consonant
        if(a[i] != 'a' && a[i] != 'e' && 
           a[i] != 'i' && a[i] != 'o' && 
           a[i] != 'u' && a[i] != 'A' && 
           a[i] != 'E' && a[i] != 'O' && 
           a[i] != 'U'&& a[i] != 'I')
            temp += a[i];
    }
    
    return temp;
    
}

// Function to insert "#"
string insert_hash(string a)
{
    string temp = "";
    int l = a.length();
    
    for(int i = 0 ; i < l ; i++)
    {
        // If character is not special
        if((a[i] >= 'a' && a[i] <= 'z') ||
           (a[i] >= 'A' && a[i] <= 'Z'))
            temp = temp + '#' + a[i];
        else
            temp = temp + a[i];
    }
    
    return temp;
    
}

// Function to transfrm string
void transformSting(string a)
{
    string b = delete_vowels(a);
    string c = change_case(b);
    string d = insert_hash(c);

    cout << d;
}

// Driver function
int main()
{
    string a = "SunshinE!!";
    
    // Calling function
    transformSting(a);
    
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java code to transform string
import java.io.*;

class Gfg
{
    // Function to change 
    // character's case
    public static String change_case(String a)
    {
        String temp = "";
        int l = a.length();
        
        for(int i = 0 ; i < l ; i++)
        {
            char ch=a.charAt(i);
            
            // If character is lowercase 
            // change to uppercase
            if(ch >= 'a' &&ch <= 'z')
            ch = (char)(65 + (int)(ch - 'a'));
            
            // If character is uppercase 
            // change to lowercase
            else if(ch >= 'A' &&ch <= 'Z')
            ch = (char)(97 + 
                 (int)(ch - 'A'));
            temp += ch;
        }
        
        return temp;
        
    }
    
    // Function to delete vowels
    public static String delete_vowels(String a)
    {
        String temp = "";
        int l = a.length();
        
        for(int i = 0 ; i < l ; i++)
        {
            char ch = a.charAt(i);
            
            // If character is consonant
            if(ch != 'a' && ch != 'e' && 
               ch != 'i' && ch != 'o' && 
               ch != 'u' && ch != 'A' && 
               ch != 'E' && ch != 'O' && 
               ch != 'U'&&ch != 'I')
               
                temp += ch;
        }
        
        return temp;
        
    }

    // Function to insert "#"
    public static String insert_hash(String a)
    {
        String temp = "";
        int l = a.length();
        char hash = '#';
        
        for(int i = 0 ; i < l ; i++)
        {
            char ch=a.charAt(i);
            
            // If character is not 
            // special character
            if((ch >= 'a' && ch <= 'z') || 
               (ch >= 'A' && ch <= 'Z'))
                temp = temp + hash + ch;
            else
                temp = temp + ch;
        }
        
        return temp;
        
    }
    
    // Function to transform string
    public static void transformString(String a)
    {
        String b = delete_vowels(a);
        String c = change_case(b);
        String d = insert_hash(c);
        
        System.out.println(d);
    }
    
    // Driver function
    public static void main (String args[])
    {
        String a = "SunshinE!!";
        
        // Calling function
        transformString(a);
    }
}
{% endhighlight %}
{% highlight python %}
# Python code to
# transform string

# def to change 
# character's case
def change_case(s) :
    
    a = list(s)
    l = len(s)
    
    for i in range(0, l) :
    
        # If character is 
        # lowercase change 
        # to uppercase
        if(a[i] >= 'a' and 
           a[i] <= 'z') :
            a[i] = s[i].upper()
            
        # If character is uppercase 
        # change to lowercase
        elif(a[i] >= 'A' and 
             a[i] <= 'Z') :
            a[i] = s[i].lower()

    return a

# def to delete vowels
def delete_vowels(s) :

    temp = ""
    a = list(s)
    l = len(s)
    for i in range(0, l) :
    
        # If character 
        # is consonant
        if(a[i] != 'a' and a[i] != 'e' and
           a[i] != 'i' and a[i] != 'o' and
           a[i] != 'u' and a[i] != 'A' and
           a[i] != 'E' and a[i] != 'O' and
           a[i] != 'U' and a[i] != 'I') :
            temp = temp + a[i]

    return temp 

# def to insert "#"
def insert_hash(s) :

    temp = ""
    a = list(s)
    l = len(s)
    
    for i in range(0, l) :
    
        # If character is
        # not special
        if((a[i] >= 'a' and
            a[i] <= 'z') or
        (a[i] >= 'A' and
            a[i] <= 'Z')) :
            temp = temp + '#' + a[i]
        else :
            temp = temp + a[i]
    
    return temp 

# def to 
# transfrm string
def transformSting(a) :

    b = delete_vowels(a)
    c = change_case(b)
    d = insert_hash(c)

    print (d)

# Driver Code
a = "SunshinE!!"

# Calling def
transformSting(a)

# This code is contributed by
# Manish Shaw(manishshaw1)
{% endhighlight %}
{% highlight cpp %}
#s#N#S#H#N!!
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

