---
layout: post
title: Convert characters of a string to opposite case
---
* Given a string, convert the characters of the string into opposite case,i.e. if a character is lower case than convert it into upper case and vice-versa. Examples:
{% highlight cpp %}
Input : geeksForgEeks
Output : GEEKSfORGeEKS

Input : hello every one
Output : HELLO EVERY ONE
{% endhighlight %}
* ASCII values  of alphabets: A – Z = 65 to 90, a – z = 97 to 122 Steps:
{% highlight cpp %}
// CPP program to Convert characters 
// of a string to opposite case
#include<iostream>
using namespace std;
 
// Function to convert characters 
// of a string to opposite case
void convertOpposite(string &str)
{
    int ln = str.length();
     
    // Conversion according to ASCII values
    for (int i=0; i<ln; i++)
    {
        if (str[i]>='a' && str[i]<='z')
        //Convert lowercase to uppercase
            str[i] = str[i] - 32;
        else if(str[i]>='A' && str[i]<='Z')
        //Convert uppercase to lowercase
            str[i] = str[i] + 32;
    }
}
 
// Driver function
int main()
{
    string str = "GeEkSfOrGeEkS";
     
    // Calling the Function
    convertOpposite(str);
     
    cout << str;
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to Convert characters 
// of a string to opposite case
class Test{
     
     // Method to convert characters 
     // of a string to opposite case
     static void convertOpposite(StringBuffer str)
     {
        int ln = str.length();
           
        // Conversion using predefined methods
        for (int i=0; i<ln; i++)
        {
            Character c = str.charAt(i);
            if (Character.isLowerCase(c))
                str.replace(i, i+1, Character.toUpperCase(c)+"");
            else
                str.replace(i, i+1, Character.toLowerCase(c)+"");
           
        }
     }
     
     public static void main(String[] args) 
     {
         StringBuffer str = new StringBuffer("GeEkSfOrGeEkS");
         // Calling the Method
         convertOpposite(str);
         
         System.out.println(str);
        }
 }
// This code is contributed by Gaurav Miglani
{% endhighlight %}
{% highlight cpp %}
gEeKsFoRgEeKs
{% endhighlight %}
* Note: This program can alternatively be done using C++ inbuilt functions – Character.toLowerCase(char) and Character.toUpperCase(char).
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

