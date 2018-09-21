---
layout: post
title: Case conversion (Lower to Upper and Vice Versa) of a string using BitWise operators in C/C++
---
* Given a string, write a function that converts it either from lower to upper case or from upper to lower case using the bitwise operators &(AND), |(OR), ~(NOT) in place and returns the string.
* Many of us know that Bitwise manipulations are faster than performing arithmetic operations for a compiler as the data is stored in binary form 0’s and 1’s.
* Examples:
{% highlight cpp %}
Input : "LowerToUpPer"
Output : "LOWERTOUPPER"
   Letters already in the uppercase remains the same. 
   while rest get converted to uppercase.

Input : "UPPerTOloweR"
Output : "uppertolower"
   Letters already in the lowercase remains the same.
   while rest get converted to lowercase.
{% endhighlight %}
* 1.Lower to Upper Case This method simply subtracts a value of 32 from the ASCII value of lowercase letter by Bitwise ANDing (&) with negation (~) of 32 converting the letter to uppercase.
{% highlight cpp %}
// C++ program to convert a string from
// lower to upper case.
#include<stdio.h>

const int x = 32;

// Converts a string to uppercase
char *toUpperCase(char *a)
{
    for (int i=0; a[i]!='\0'; i++)
        a[i] = a[i] & ~x;

    return a;
}

// Driver Code
int main()
{
    char str[] = "SanjaYKannA";

    //Here it's recommended to use character array
    //as it's stored in read-write area.
    //If a pointer is used it's stored
    //in read-only memory as a string literal.

    printf("%s", toUpperCase(str));

    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
SANJAYKANNA
{% endhighlight %}
* 2.Upper to Lower Case Similarly, it adds a value of 32 to the ASCII value of uppercase letter by Bitwise ORing (|) with 32 converting the letter to lowercase.
{% highlight cpp %}
// C++ program to convert a string from
// upper to lower case.
#include<stdio.h>
const int x = 32;

// Converts a string to lowercase
char * toLowerCase(char *a)
{
    for (int i=0; a[i]!='\0'; i++)
        a[i] = a[i] | x;

    return a;
}

// Driver Code
int main()
{
    char str[] = "SanjaYKannA";
    printf("%s", toLowerCase(str));
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
sanjaykanna
{% endhighlight %}
* Explanation: The ASCII table is constructed in such way that the binary representation of lowercase letters is almost identical of binary representation of uppercase letters.
* Character ‘A’ is integer 65 = (0100 0001)2, while character ‘a’ is integer 97 = (0110 0001)2. The difference between the ASCII values of ‘a’ and ‘A’ is 32.
* So we can easily change the case of the letters either from Upper to lower or lower to upper by adding or subtracting the difference from the letters using bitwise operators as shown above.
* Exercise: Implement a function that change the case of a string such that GeeksFoRgeekS turns gEEKSfOrGEEKs .
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

