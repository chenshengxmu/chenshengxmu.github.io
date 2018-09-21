---
layout: post
title: String containing first letter of every word in a given string with spaces
---
* A String str is given which contains lowercase English letters and spaces. It may contain multiple spaces. Get first letter of every word and return the result as a string. The result should not contain any space.
* Examples:
{% highlight cpp %}
Input : str = "geeks for geeks"
Output : gfg

Input : str = "happy   coding"
Output : hc
{% endhighlight %}
* Source : https://www.geeksforgeeks.org/amazon-interview-set-8-2/
* The idea is to traverse each character of string str and maintain a boolean varible, which was initally set as true. Whenever we encounter space we set boolean varible as true. And if we encounter any character other than space, we will check boolean varible, if it was set as true then copy that charter to output string and set boolean varible as false. If boolean varible is set false, do nothing. Algorithm:
{% highlight cpp %}
1. Traverse string str. And initialize a variable v as true.
2. If str[i] == ' '. Set v as true.
3. If str[i] != ' '. Check if v is true or not.
   a) If true, copy str[i] to output string and set v as false.
   b) If false, do nothing.
{% endhighlight %}
{% highlight cpp %}
// C++ program to find the string which contain
// the first character of each word of another
// string.
#include<bits/stdc++.h>
using namespace std;

// Function to find string which has first
// character of each word.
string firstLetterWord(string str)
{
    string result = "";

    // Traverse the string.
    bool v = true;
    for (int i=0; i<str.length(); i++)
    {
        // If it is space, set v as true.
        if (str[i] == ' ')
            v = true;

        // Else check if v is true or not.
        // If true, copy character in output
        // string and set v as false.
        else if (str[i] != ' ' && v == true)
        {
            result.push_back(str[i]);
            v = false;
        }
    }

    return result;
}

// Driver cpde
int main()
{
    string str = "geeks for geeks";
    cout << firstLetterWord(str);
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
gfg
{% endhighlight %}
* Another Approach 1: This approach uses the StringBuilder class of Java. In this approach we will first split the input string based on the spaces. The spaces in the strings can be matched using regular expression. The splitted strings are stored in an array of string. Then we can simply append the first character of each splitted string in the String Builder object.
{% highlight java %}
// Java implementation of above approach

class GFG 
{
   private static StringBuilder charBuffer = new StringBuilder();
    
   public static String processWords(String input) 
   {
        /* we are splitting the input based on 
           spaces (s)+ : this regular expression 
           will handle scenarios where we have words 
           separated by multiple spaces */
        String s[] = input.split("(\s)+");
        
        for(String values : s) 
        {
           /* charAt(0) will pick only the first character 
              from the string and append to buffer */
            charBuffer.append(values.charAt(0));
        }
        
      return charBuffer.toString();
   }
   
   // main function
   public static void main (String[] args) 
   {
      String input = "geeks for geeks";
      System.out.println(processWords(input));
   }
}

// This code is contributed by Goutam Das
{% endhighlight %}
* Output:
{% highlight cpp %}
gfg
{% endhighlight %}
* Another Approach 2:Using boundary checker, refer https://www.geeksforgeeks.org/get-first-letter-word-string-using-regex-java/
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

