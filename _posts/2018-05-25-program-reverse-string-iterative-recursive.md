---
layout: post
title: Program to reverse a string (Iterative and Recursive)
---
* Given a string, write a recursive program to reverse it.

![img](https://www.geeksforgeeks.org/wp-content/uploads/string-reverse.jpg)
* Method 1 (Using Stack)
{% highlight cpp %}
// C++ program to reverse a string using stack
#include <bits/stdc++.h>
using namespace std;

void recursiveReverse(string &str)
{
   stack<char> st;
   for (int i=0; i<str.length(); i++)
       st.push(str[i]);

   for (int i=0; i<str.length(); i++) {
       str[i] = st.top();
       st.pop();
   }       
}

// Driver program
int main()
{
    string str = "geeksforgeeks";
    recursiveReverse(str);
    cout << str;
    return 0;
}
{% endhighlight %}
{% highlight cpp %}
skeegrofskeeg
{% endhighlight %}
* Time complexity : O(n) Auxiliary Space : O(n)
* Method 2 (Iterative)
{% highlight cpp %}
// A Simple Iterative C++ program to reverse
// a string
#include <bits/stdc++.h>
using namespace std;

// Function to reverse a string
void reverseStr(string& str)
{
    int n = str.length();

    // Swap character starting from two
    // corners
    for (int i = 0; i < n / 2; i++)
        swap(str[i], str[n - i - 1]);
}

// Driver program
int main()
{
    string str = "geeksforgeeks";
    reverseStr(str);
    cout << str;
    return 0;
}
{% endhighlight %}
{% highlight java %}
// A Simple Java program 
// to reverse a string
import java.util.Scanner;

public class reverseStr
{
// Function to reverse 
// a string
void stringReverse()
{
    String str = "geeksforgeeks";
    int length = str.length();
    StringBuffer revString = new StringBuffer();
    for (int i = length - 1; 
             i >= 0; i--) 
    {
        revString.append(str.charAt(i));
    }
    System.out.println(revString);
}

// Driver Code
public static void main(String []args)
{
    reverseStr s= new reverseStr();
    s.stringReverse();
}
}

// This code is contributed 
// by prabhat kumar singh
{% endhighlight %}
{% highlight python %}
# A Simple python program 
# to reverse a string

# Function to
# reverse a string
def reverseStr(str):
    n = len(str)
    
    # initialising a empty
    # string 'str1'
    str1 = ''
    i = n - 1
    while i >= 0:
        
        # copy str 
        # to str1
        str1 += str[i]
        i -= 1
    print(str1)     

# Driver Code 
def main():
    str = "geeksforgeeks";
    reverseStr(str);
    
if __name__=="__main__":
    main()     
    
# This code is contributed 
# by prabhat kumar singh
{% endhighlight %}
{% highlight cpp %}
skeegrofskeeg
{% endhighlight %}
* Time complexity : O(n) Auxiliary Space : O(1)
* Method 3 (Iterative using two pointers)
{% highlight cpp %}
// A Simple Iterative C++ program to reverse
// a string
#include <bits/stdc++.h>
using namespace std;

// Function to reverse a string
void reverseStr(string& str)
{
    int n = str.length();

    // Swap character starting from two
    // corners
    for (int i=0, j=n-1; i<j; i++,j--)
        swap(str[i], str[j]);  
}

// Driver program
int main()
{
    string str = "geeksforgeeks";
    reverseStr(str);
    cout << str;
    return 0;
}
{% endhighlight %}
{% highlight cpp %}
skeegrofskeeg
{% endhighlight %}
* Time complexity : O(n) Auxiliary Space : O(1)
* Method 4 (Recursive)
{% highlight cpp %}
// Recursive C++ program to reverse a string
#include <bits/stdc++.h>
using namespace std;

void recursiveReverse(string &str, int i = 0)
{
    int n = str.length();
    if (i == n / 2)
        return;
    swap(str[i], str[n - i - 1]);
    recursiveReverse(str, i + 1);
}

// Driver program
int main()
{
    string str = "geeksforgeeks";
    recursiveReverse(str);
    cout << str;
    return 0;
}
{% endhighlight %}
{% highlight cpp %}
skeegrofskeeg
{% endhighlight %}
* Time complexity : O(n) Auxiliary Space : O(n)
* Method 5 (Library function)
{% highlight cpp %}
// A quickly written program for reversing a string
// using reverse()
#include<bits/stdc++.h>
using namespace std;
int main()
{
   string str = "geeksforgeeks";
    
   // Reverse str[beign..end]
   reverse(str.begin(),str.end());
    
   cout << str;
   return 0;
}
{% endhighlight %}
{% highlight python %}
# A Simple python program 
# to reverse a string

# Function to 
# reverse a string
def reverseStr(str):
    
    # print the string
    # from last
    print(str[::-1])     

# Driver Code 
def main():
    str = "geeksforgeeks";
    reverseStr(str);
    
if __name__=="__main__":
    main()     
    
# This code is contributed 
# by prabhat kumar singh
{% endhighlight %}
{% highlight cpp %}
skeegrofskeeg
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

