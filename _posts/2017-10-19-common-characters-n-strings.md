---
layout: post
title: Common characters in n strings
---
* Given n strings, find the common characters in all the strings. In simple words, find characters that appear in all the strings and display them in alphabetical order or lexicographical order.
* Note* we’ll be considering that the strings contain lower case letters only.
* Examples:
{% highlight cpp %}
Input :  geeksforgeeks
         gemkstones
         acknowledges
         aguelikes

Output : e g k s

Input :  apple 
         orange

Output : a e
{% endhighlight %}
* We’ll use two hash arrays of size 26 (for a-z, where 0 is a, and z is 25). The approach will be simple, if we have seen a character before we’ll mark it and if we haven’t then ignore the character because it is not a common one.
* Psuedocode :
{% highlight cpp %}
commonCharacters :
for i= 0 to n-1:

   // here m is length of ith string 
   for j = 0 to m-1:  
      if ( character seen before ) :
         mark the character
      else : 
         ignore it

display all the marked characters
{% endhighlight %}
{% highlight cpp %}
// CPP Program to find all the common characters
// in n strings
#include <bits/stdc++.h>
using namespace std;

const int MAX_CHAR = 26;

void commonCharacters(string str[], int n)
{
    // primary array for common characters 
    // we assume all characters are seen before.
    bool prim[MAX_CHAR];
    memset(prim, true, sizeof(prim));

    // for each string
    for (int i = 0; i < n; i++) {

        // secondary array for common characters
        // Initially marked false
        bool sec[MAX_CHAR] = { false };

        // for every character of ith string
        for (int j = 0; str[i][j]; j++) {

            // if character is present in all 
            // strings before, mark it.
            if (prim[str[i][j] - 'a'])
                sec[str[i][j] - 'a'] = true; 
        }

        // copy whole secondary array into primary
        memcpy(prim, sec, MAX_CHAR);
    }

    // displaying common characters
    for (int i = 0; i < 26; i++)
        if (prim[i])
            printf("%c ", i + 'a');
}

// Driver's Code
int main()
{
    string str[] = { "geeksforgeeks",
                    "gemkstones",
                    "acknowledges",
                    "aguelikes" };
    int n = sizeof(str)/sizeof(str[0]);
    commonCharacters(str, n);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java Program to find all the common characters
// in n strings
import java.util.*;
import java.lang.*;

class GFG {

    static int MAX_CHAR = 26;

    public static void commonCharacters(String str[],
                                               int n)
    {
        
        // primary array for common characters 
        // we assume all characters are seen before.
        Boolean[] prim = new Boolean[MAX_CHAR];
        Arrays.fill(prim, new Boolean(true));

        // for each string
        for (int i = 0; i < n; i++) {

            // secondary array for common characters
            // Initially marked false
            Boolean[] sec = new Boolean[MAX_CHAR];
            Arrays.fill(sec, new Boolean(false));

            // for every character of ith string
            for (int j = 0; j < str[i].length(); j++)
            {

                // if character is present in all 
                // strings before, mark it.
                if (prim[str[i].charAt(j) - 'a'])
                sec[str[i].charAt(j) - 'a'] = true; 
            }

            // copy whole secondary array into primary
            System.arraycopy(sec, 0, prim, 0, MAX_CHAR);
        }

        // displaying common characters
        for (int i = 0; i < 26; i++)
            if (prim[i]){
                System.out.print(Character.toChars(i 
                                               + 97));
                System.out.print(" ");
            } 
    }

    // Driver code
    public static void main(String[] args)
    {
        String str[] = { "geeksforgeeks",
                         "gemkstones",
                         "acknowledges",
                         "aguelikes" };
                         
        int n = str.length;
        commonCharacters(str, n);
    }
}

// This code is contributed by Prasad Kshirsagar
{% endhighlight %}
* Output:
{% highlight cpp %}
e g k s
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

