---
layout: post
title: Generate all rotations of a given string
---
* Given a string S. The task is to print all the possible rotated strings of the given string.
* Examples:
{% highlight cpp %}
Input : S = "geeks"
Output : geeks
         eeksg
         eksge
         ksgee
         sgeek

Input : S = "abc" 
Output : abc
         bca
         cab
{% endhighlight %}
* Below implementation of this approach:
{% highlight cpp %}
// A simple C++ program to generate all rotations
// of a given string
#include<bits/stdc++.h>
using namespace std;

// Print all the rotated string.
void printRotatedString(char str[])
{
    int len = strlen(str);

    // Generate all rotations one by one and print
    char temp[len];
    for (int i = 0; i < len; i++)
    {
        int j = i;  // Current index in str
        int k = 0;  // Current index in temp

        // Copying the second part from the point
        // of rotation.
        while (str[j] != '\0')
        {
            temp[k] = str[j];
            k++;
            j++;
        }

        // Copying the first part from the point
        // of rotation.
        j = 0;
        while (j < i)
        {
            temp[k] = str[j];
            j++;
            k++;
        }

        printf("%s\n", temp);
    }
}

// Driven Program
int main()
{
    char str[] = "geeks";
    printRotatedString(str);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// A simple Java program to generate all rotations
// of a given string	

class Test
{
	// Print all the rotated string.
	static void printRotatedString(String str)
	{
	    int len = str.length();
	 
	    // Generate all rotations one by one and print
	    StringBuffer sb; 
	    
	    for (int i = 0; i < len; i++)
	    {
	    	sb = new StringBuffer();
	    	
	        int j = i;  // Current index in str
	        int k = 0;  // Current index in temp
	 
	        // Copying the second part from the point
	        // of rotation.
	        for (int k2 = j; k2 < str.length(); k2++) {
	            sb.insert(k, str.charAt(j));
	        	k++;
	            j++;
		    }
	 
	        // Copying the first part from the point
	        // of rotation.
	        j = 0;
	        while (j < i)
	        {
	            sb.insert(k, str.charAt(j));
	            j++;
	            k++;
	        }
	 
	        System.out.println(sb);
	    }
	}
	
    // Driver method
    public static void main(String[] args) 
    {
    	String  str = new String("geeks");
        printRotatedString(str);
    }
}
{% endhighlight %}
{% highlight cpp %}
geeks
eeksg
eksge
ksgee
sgeek
{% endhighlight %}
*  
* The idea is based on the efficient method to check if strings are rotations of each other or not. We concatenate str with itself, i.e., we do str.str where . is concatenation operator. Now we traverse the concatenated string from 0 to n – 1 and print all substrings of size n.
* Below is implementation of this approach:
{% highlight cpp %}
// An efficient C++ program to print all
// rotations of a string.
#include<bits/stdc++.h>
using namespace std;

// Print all the rotated string.
void printRotatedString(char str[])
{
    int n = strlen(str);

    // Concatenate str with itself
    char temp[2*n + 1];
    strcpy(temp, str);
    strcat(temp, str);

    // Print all substrings of size n.
    // Note that size of temp is 2n
    for (int i = 0; i < n; i++)
    {
        for (int j=0; j != n; j++)
            printf("%c",temp[i + j]);
        printf("\n");
    }
}

// Driven Program
int main()
{
    char str[] = "geeks";
    printRotatedString(str);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// A simple Java program to generate all rotations
// of a given string	

class Test
{
	// Print all the rotated string.
	static void printRotatedString(String str)
	{
	    int n = str.length();
	  
	    StringBuffer sb = new StringBuffer(str);
	    // Concatenate str with itself
	    sb.append(str);
	 
	    // Print all substrings of size n.
	    // Note that size of sb is 2n
	    for (int i = 0; i < n; i++)
	    {
	        for (int j=0; j != n; j++)
	            System.out.print(sb.charAt(i + j));
	        System.out.println();
	    }
	}
	
    // Driver method
    public static void main(String[] args) 
    {
    	String  str = new String("geeks");
        printRotatedString(str);
    }
}
{% endhighlight %}
{% highlight cpp %}
geeks
eeksg
eksge
ksgee
sgeek
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

