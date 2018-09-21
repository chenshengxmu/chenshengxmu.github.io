---
layout: post
title: Strings in C
---
* Strings are defined as an array of characters. The difference between a character array and a string is the string is terminated with a special character ‘\0’.
* Declaration of strings: Declaring a string is as simple as declaring a one dimensional array. Below is the basic syntax for declaring a string.
{% highlight cpp %}
char str_name[size];
{% endhighlight %}
* In the above syntax str_name is any name given to the string variable and size is used define the length of the string, i.e the number of characters strings will store. Please keep in mind that there is an extra terminating character which is the Null character (‘\0’) used to indicate termination of string which differs strings from normal character arrays.
{% highlight cpp %}
1. char str[] = "GeeksforGeeks";

2. char str[50] = "GeeksforGeeks";

3. char str[] = {'G','e','e','k','s','f','o','r','G','e','e','k','s','\0'};

4. char str[14] = {'G','e','e','k','s','f','o','r','G','e','e','k','s','\0'};
{% endhighlight %}
* Below is the memory representation of a string “Geeks”.
* Let us now look at a sample program to get a clear understanding of declaring and initializing a string in C and also how to print a string.
{% highlight c %}
// C program to illustrate strings

#include<stdio.h>

int main()
{   
    // declare and initialize string
    char str[] = "Geeks";
    
    // print string
    printf("%s",str);
    
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
Geeks
{% endhighlight %}
* We can see in the above program that strings can be printed using a normal printf statements just like we print any other variable. Unlike arrays we do not need to print a string, character by character. The C language does not provide an inbuilt data type for strings but it has an access specifier “%s” which can be used to directly print and read strings.
* Below is a sample program to read a string from user:
{% highlight c %}
// C program to read strings

#include<stdio.h>

int main()
{   
    // declaring string
    char str[50];
    
    // reading string
    scanf("%s",str);
    
    // print string
    printf("%s",str);

    return 0;
}
{% endhighlight %}
* You can see in the above program that string can also be read using a single scanf statement. Also you might be thinking that why we have not used the ‘&’ sign with string name ‘str’ in scanf statement! To understand this you will have to recall your knowledge of scanf. We know that the ‘&’ sign is used to provide the address of the variable to the scanf() function to store the value read in memory. As str[] is a character array so using str without braces ‘[‘ and ‘]’ will give the base address of this string. That’s why we have not used ‘&’ in this case as we are already providing the base address of the string to scanf.
* Passing strings to function: As strings are character arrays, so we can pass strings to function in a same way we pass an array to a function. Below is a sample program to do this:
{% highlight c %}
// C program to illustrate how to 
// pass string to functions
#include<stdio.h>

void printStr(char str[])
{
    printf("String is : %s",str);
}

int main()
{   
    // declare and initialize string
    char str[] = "GeeksforGeeks";
    
    // print string by passing string
    // to a different function
    printStr(str);
    
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
String is : GeeksforGeeks
{% endhighlight %}
* Related Articles:
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

