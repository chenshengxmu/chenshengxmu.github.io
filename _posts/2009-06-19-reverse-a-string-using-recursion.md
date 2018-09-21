---
layout: post
title: Print reverse of a string using recursion
---
* Write a recursive C function to print reverse of a given string. Program:
{% highlight c %}
// C program to reverse a string using recursion
# include <stdio.h>

/* Function to print reverse of the passed string */
void reverse(char *str)
{
   if (*str)
   {
       reverse(str+1);
       printf("%c", *str);
   }
}

/* Driver program to test above function */
int main()
{
   char a[] = "Geeks for Geeks";
   reverse(a);
   return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to reverse a string using recursion

class StringReverse
{
    /* Function to print reverse of the passed string */
    void reverse(String str)
    {
        if ((str==null)||(str.length() <= 1))
           System.out.println(str);
        else
        {
            System.out.print(str.charAt(str.length()-1));
            reverse(str.substring(0,str.length()-1));
        }
    }
    
    /* Driver program to test above function */
    public static void main(String[] args) 
    {
        String str = "Geeks for Geeks";
        StringReverse obj = new StringReverse();
        obj.reverse(str);
    }    
}
{% endhighlight %}
{% highlight python %}
# Python program to reverse a string using recursion

# Function to print reverse of the passed string
def reverse(string):
    if len(string) == 0:
        return
    
    temp = string[0]
    reverse(string[1:])
    print(temp, end='')

# Driver program to test above function
string = "Geeks for Geeks"
reverse(string)

# A single line statement to reverse string in python
# string[::-1]

# This code is contributed by Bhavya Jain
{% endhighlight %}
{% highlight cpp %}
skeeG rof skeeG
{% endhighlight %}
* Explanation: Recursive function (reverse) takes string pointer (str) as input and calls itself with next location to passed pointer (str+1). Recursion continues this way, when pointer reaches ‘\0’, all functions accumulated in stack print char at passed location (str) and return one by one.
* Time Complexity: O(n)
* See Reverse a string for other methods to reverse string.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

