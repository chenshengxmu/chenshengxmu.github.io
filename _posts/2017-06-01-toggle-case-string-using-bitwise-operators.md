---
layout: post
title: Toggle case of a string using Bitwise Operators
---
* Given a string, write a function that returns toggle case of a string using the bitwise operators in place.
* In ASCII codes, character ‘A’ is integer 65 = (0100 0001)2, while character ‘a’ is integer 97 = (0110 0001)2. Similarly, character ‘D’ is integer 68 = (0100 0100)2, while character ‘d’ is integer 100 = (0110 0100)2.
* As we can see, only sixth least significant bit is different in ASCII code of ‘A’ and ‘a’. Similar behavior can be seen in ASCII code of ‘D’ and ‘d’. Therefore, we need to toggle this bit for toggling case.
* Examples:
{% highlight cpp %}
Input : "GeekSfOrgEEKs"
Output : "gEEKsFoRGeekS"                  

Input : "StRinG"
Output : "sTrINg"
{% endhighlight %}
* The ASCII table is constructed in such way that the binary representation of lowercase letters is almost identical of binary representation of uppercase letters.
* Toggling Case The integer with 6th LSB as 1 is 32 (0010 0000). Therefore, bitwise XORing of a character with 32 will toggle the 6th LSB of character and hence, will toggle its case. If character is upper case, it will be converted to lower case and vice versa.
{% highlight cpp %}
// C program to get toggle case of a string
#include <stdio.h>

// tOGGLE cASE = swaps CAPS to lower
// case and lower case to CAPS
char *toggleCase(char *a)
{
    for (int i=0; a[i]!='\0'; i++) {

        // Bitwise EXOR with 32
        a[i] ^= 32;
    }

    return a;
}

// Driver Code
int main()
{
    char str[] = "CheRrY";
    printf("Toggle case: %s\n", toggleCase(str));
    printf("Original string: %s", toggleCase(str));
    return 0;
}
{% endhighlight %}
{% highlight java %}
// program to get toggle case of a string

public class Test
{
    
    static int x=32;
    
    // tOGGLE cASE = swaps CAPS to lower
    // case and lower case to CAPS
    static String toggleCase(char[] a)
    {
        for (int i=0; i<a.length; i++) {
      
            // Bitwise EXOR with 32
            a[i]^=32;
        }
        return new String(a);
    }
    
    /* Driver program */
    public static void main(String[] args) 
    {
        String str = "CheRrY";
        System.out.print("Toggle case: ");
        str = toggleCase(str.toCharArray());
        System.out.println(str);
        
        System.out.print("Original string: ");
        str = toggleCase(str.toCharArray());
        System.out.println(str);    
    }
}
{% endhighlight %}
{% highlight cpp %}
Toggle case: cHErRy
Original string: CheRrY
{% endhighlight %}
* Thanks to Kumar Gaurav for improving the solution.
* Similar Article : Case conversion of a string using BitWise operators in C/C++
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

