---
layout: post
title: Divide a string in N equal parts
---
* Difficulty Level: Rookie
* Question: Write a program to print N equal parts of a given string. Solution: 1) Get the size of the string using string function strlen() (present in string.h) 2) Get size of a part.
{% highlight cpp %}
part_size = string_length/n
{% endhighlight %}
* 3) Loop through the input string. In loop, if index becomes multiple of part_size then put a part separator(“\n”)
* Implementation:
{% highlight c %}
// C program to divide a string
// in n equal parts
#include<stdio.h>
#include<string.h>

// Function to print n equal parts of str
void divideString(char *str, int n)
{
int str_size = strlen(str);
int i;
int part_size;

// Check if string can be divided in
// n equal parts
if (str_size % n != 0)
{
    printf("Invalid Input: String size");
    printf(" is not divisible by n");
    return;
}

// Calculate the size of parts to
// find the division points
part_size = str_size / n;
for (i = 0; i< str_size; i++)
{
    if (i % part_size == 0)
        printf("\n"); 
    printf("%c", str[i]);
}
}

int main()
{
    // length od string is 28
    char *str = "a_simple_divide_string_quest";

    // Print 4 equal parts of the string 
    divideString(str, 4);

    getchar();
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to divide a string 
// in n equal parts

class GFG 
{
    // Method to print n equal parts of str
    static void divideString(String str, int n)
    {
    int str_size = str.length();
    int part_size;
    
    // Check if string can be divided in
    // n equal parts 
    if (str_size % n != 0)
    {
        System.out.println("Invalid Input: String size" +
                                "is not divisible by n");
        return;
    }
    
    // Calculate the size of parts to find 
    // the division points
    part_size = str_size / n;
        
    for (int i = 0; i< str_size; i++)
    {
        if(i % part_size == 0)
            System.out.println(); 
        System.out.print(str.charAt(i));
    }
    }
    
    // Driver Code
    public static void main(String[] args)
    {
        // length od string is 28
        String str = "a_simple_divide_string_quest";
    
        // Print 4 equal parts of the string
        divideString(str, 4);
    }
}
{% endhighlight %}
{% highlight python %}
# Python program to print n equal parts of string

# Function to print n equal parts of string
def divideString(string, n):
    str_size = len(string)

    # Check if string can be divided in n equal parts
    if str_size % n != 0:
        print "Invalid Input: String size is not divisible by n"
        return

    # Calculate the size of parts to find the division points
    part_size = str_size/n
    k = 0
    for i in string:
        if k%part_size==0:
            print "\n",
        print i,
        k += 1

# Driver program to test the above function
# Length of string is 28
string = "a_simple_divide_string_quest"

# Print 4 equal parts of the string
divideString(string, 4)

# This code is contributed by Bhavya Jain
{% endhighlight %}
{% highlight cpp %}
a_simpl
e_divid
e_strin
g_quest
{% endhighlight %}
* In above solution, n equal parts of the string are only printed. If we want individual parts to be stored then we need to allocate part_size + 1 memory for all N parts (1 extra for string termination character ‘\0’), and store the addresses of the parts in an array of character pointers.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

