---
layout: post
title: Replace all occurrences of string AB with C without using extra space
---
* Given a string str that may contain one more occurrences of “AB”. Replace all occurrences of “AB” with “C” in str.
* Examples:
{% highlight cpp %}
Input  : str = "helloABworld"
Output : str = "helloCworld"

Input  : str = "fghABsdfABysu"
Output : str = "fghCsdfCysu"
{% endhighlight %}
* A simple solution is to find all occurrences of “AB”. For every occurrence, replace it with C and more all characters one position back.
{% highlight cpp %}
// C++ program to replace all occurrences of "AB"
// with "C"
#include <bits/stdc++.h>

void translate(char* str)
{
    if (str[0] == '')
        return;

    // Start traversing from second chracter
    for (int i=1; str[i] != ''; i++)
    {
        // If previous character is 'A' and
        // current character is 'B"
        if (str[i-1]=='A' && str[i]=='B')
        {
            // Replace previous character with
            // 'C' and move all subsequent
            // characters one position back
            str[i-1] = 'C';
            for (int j=i; str[j]!=''; j++)
                str[j] = str[j+1];
        }
    }
    return;
}

// Driver code
int main()
{
    char str[] = "helloABworldABGfG";
    translate(str);
    printf("The modified string is :\n");
    printf("%s", str);
}
{% endhighlight %}
{% highlight java %}
// Java program to replace all 
// occurrences of "AB" with "C"
import java.io.*;

class GFG {
    
    static void translate(char str[])
    {
        // Start traversing from second chracter
        for (int i = 1; i < str.length; i++)
        {
            // If previous character is 'A' and
            // current character is 'B"
            if (str[i - 1] == 'A' && str[i] == 'B')
            {
                // Replace previous character with
                // 'C' and move all subsequent
                // characters one position back
                str[i - 1] = 'C';
                int j;
                for (j = i; j < str.length - 1; j++)
                    str[j] = str[j + 1];
                str[j] = ' ';
                
            }
        }
        return;
    }
    
    // Driver code
    public static void main(String args[])
    {
        String st = "helloABworldABGfG";
        char str[] = st.toCharArray();
        translate(str);
        System.out.println("The modified string is :");
        System.out.println(str);
    }
}


// This code is contributed by Nikita Tiwari.
{% endhighlight %}
{% highlight python %}
# Python 3 program to replace all 
# occurrences of "AB" with "C"

def translate(st) :
    
    # Start traversing from second chracter
    for i in range(1, len(st)) :
        
        # If previous character is 'A' 
        # and current character is 'B"
        if (st[i - 1] == 'A' and st[i] == 'B') :
            
            # Replace previous character with
            # 'C' and move all subsequent
            # characters one position back
            st[i - 1] = 'C'
            
            for j in range(i, len(st) - 1) :
                st[j] = st[j + 1]
                
            st[len(st) - 1] = ' '
                
    return

# Driver code
st = list("helloABworldABGfG")
translate(st)

print("The modified string is :")
print(''.join(st))

# This code is contributed by Nikita Tiwari.
{% endhighlight %}
{% highlight cpp %}
The modified string is :
helloCworldCGfG
{% endhighlight %}
* Time Complexity : O(n2) Auxiliary Space : O(1)
* An efficient solution is to keep track of two indexes, one for modified string (i in below code) and other for original string (j in below code). If we find “AB” at current index j, we increment j by 2 and i by 1. Otherwise we increment both and copy character from j to i.
* Below is implementation of above idea.
{% highlight cpp %}
// Efficient C++ program to replace all occurrences
// of "AB" with "C"
#include <bits/stdc++.h>

void translate(char* str)
{
    int len = strlen(str);
    if (len < 2)
       return;

    int i = 0;  // Index in modified string
    int j = 0; // Index in original string

    // Traverse string
    while (j < len-1)
    {
        // Replace occurrence of "AB" with "C"
        if (str[j] == 'A' && str[j+1] == 'B')
        {
            // Increment j by 2
            j = j + 2;
            str[i++] = 'C';
            continue;
        }
        str[i++] = str[j++];
    }

    if (j == len-1)
      str[i++] = str[j];

    // add a null character to terminate string
    str[i] = '';
}

// Driver code
int main()
{
    char str[] = "helloABworldABGfG";
    translate(str);
    printf("The modified string is :\n");
    printf("%s", str);
}
{% endhighlight %}
{% highlight java %}
// Efficient Java program to replace 
// all occurrences of "AB" with "C"
import java.io.*;

class GFG {
    
    static void translate(char str[])
    {
        int len = str.length;
        if (len < 2)
        return;
    
        // Index in modified string
        int i = 0;
        
        // Index in original string
        int j = 0; 
    
        // Traverse string
        while (j < len - 1)
        {
            // Replace occurrence of "AB" with "C"
            if (str[j] == 'A' && str[j + 1] == 'B')
            {
                // Increment j by 2
                j = j + 2;
                str[i++] = 'C';
                continue;
            }
            str[i++] = str[j++];
        }
    
        if (j == len - 1)
        str[i++] = str[j];
    
        // add a null character to terminate string
        str[i] = ' ';
        str[len - 1]=' ';
    }
    
    // Driver code
    public static void main(String args[])
    {
        String st="helloABworldABGfG";
        char str[] = st.toCharArray();
        translate(str);
        System.out.println("The modified string is :");
        System.out.println(str);
    }
}


// This code is contributed 
// by Nikita Tiwari.
{% endhighlight %}
{% highlight python %}
# Python 3 program to replace all 
# occurrences of "AB" with "C"

def translate(st) :
    l = len(st)
    
    if (l < 2) :
        return

    i = 0 # Index in modified string
    j = 0 # Index in original string

    # Traverse string
    while (j < l - 1) :
        
        # Replace occurrence of "AB" with "C"
        if (st[j] == 'A' and st[j + 1] == 'B') :
            
            # Increment j by 2
            j += 2
            st[i] = 'C'
            i += 1
            continue
        
        st[i] = st[j]
        i += 1
        j += 1
    

    if (j == l - 1) :
        st[i] = st[j]
        i += 1

    # add a null character to
    # terminate string
    st[i] = ' '
    st[l-1] = ' '

# Driver code
st = list("helloABworldABGfG")
translate(st)

print("The modified string is :")
print(''.join(st))

# This code is contributed by Nikita Tiwari.
{% endhighlight %}
{% highlight cpp %}
The modified string is :
helloCworldCGfG
{% endhighlight %}
* Time Complexity : O(n) Auxiliary Space : O(1)
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

