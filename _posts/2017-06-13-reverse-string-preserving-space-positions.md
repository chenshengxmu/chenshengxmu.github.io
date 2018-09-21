---
layout: post
title: Reverse a string preserving space positions
---
* Write a program to Reverse the given string while preserving the position of spaces.
* Examples:
{% highlight cpp %}
Input  : "abc de"
Output : edc ba

Input : "intern at geeks"
Output : skeegt an retni

Input : "Help others"
Output : sreh topleH
{% endhighlight %}
* Below is the implementation of above steps.
{% highlight cpp %}
// C++ program to reverse a string preserving
// spaces.
#include<iostream>
using namespace std;

// Function to reverse the string
// and preserve the space position
string reverses(string str)
{
    // Mark spaces in result
    int n = str.size();
    string result(n, '');
    for (int i=0; i<n; i++)
        if (str[i] == ' ')
            result[i] = ' ';

    // Traverse input string from beginning
    // and put characters in result from end
    int j = n-1;
    for (int i = 0; i < str.length(); i++)
    {
        // Ignore spaces in input string
        if (str[i] != ' ')
        {
            // ignore spaces in result.
            if (result[j] == ' ')
                j--;

            result[j] = str[i];
            j--;
        }
    }

    return result;
}

// Driver code
int main()
{
    string str = "internship at geeks for geeks";
    cout << reverses(str) << endl;
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to reverse a string 
// preserving spaces.
public class ReverseStringPreserveSpace 
{ 
    // Function to reverse the string
    // and preserve the space position
    static void reverses(String str) { 
            
        char[] inputArray = str.toCharArray(); 
        char[] result = new char[inputArray.length]; 

        // Mark spaces in result
        for (int i = 0; i < inputArray.length; i++) { 
            if (inputArray[i] == ' ') { 
                result[i] = ' '; 
            } 
        } 
        
        // Traverse input string from beginning
        // and put characters in result from end
        int j = result.length - 1; 
        for (int i = 0; i < inputArray.length; i++) { 
            
                // Ignore spaces in input string
                if (inputArray[i] != ' ') { 
                                
                    // ignore spaces in result.
                    if (result[j] == ' ') { 
                        j--; 
                    }    
                    result[j] = inputArray[i]; 
                    j--; 
                } 
        } 
        System.out.println(String.valueOf(result)); 
    }    
    
    // driver function
    public static void main(String[] args) 
    { 
        reverses("internship at geeks for geeks"); 
    } 
}

// This code is contributed by Rishabh Jain
{% endhighlight %}
{% highlight cpp %}
skeegrofsk ee gtapi hsn retni
{% endhighlight %}
* Time complexity -> O(N) Space complexity -> O(N)
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

