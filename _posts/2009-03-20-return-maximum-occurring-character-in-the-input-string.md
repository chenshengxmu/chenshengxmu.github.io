---
layout: post
title: Return maximum occurring character in an input string
---
* Write an efficient function to return maximum occurring character in the input string e.g., if input string is “test” then function should return ‘t’.
* Algorithm: One obvious approach to solve this problem would be to sort the input string and then traverse through the sorted string to find the character which is occurring maximum number of times. Let us see if we can improve on this. So we will use a technique called ‘Hashing’. In this, when we traverse through the string, we would hash each character into an array of ASCII characters.
{% highlight cpp %}
Input string = “test”
1: Construct character count array from the input string.
  count['e'] = 1
  count['s'] = 1
  count['t'] = 2

2: Return the index of maximum value in count array (returns ‘t’).
{% endhighlight %}
* Typically, ASCII characters are 256, so we use our Hash array size as 256. But if we know that our input string will have characters with value from 0 to 127 only, we can limit Hash array size as 128. Similarly, based on extra info known about input string, the Hash array size can be limited to 26.
* Implementation:
{% highlight cpp %}
// C++ program to output the maximum occurring character
// in a string
#include<bits/stdc++.h>
#define ASCII_SIZE 256
using namespace std;

char getMaxOccuringChar(char* str)
{
    // Create array to keep the count of individual
    // characters and initialize the array as 0
    int count[ASCII_SIZE] = {0};

    // Construct character count array from the input
    // string.
    int len = strlen(str);
    for (int i=0; i<len; i++)
        count[str[i]]++;

    int max = -1;  // Initialize max count
    char result;   // Initialize result

    // Traversing through the string and maintaining
    // the count of each character
    for (int i = 0; i < len; i++) {
        if (max < count[str[i]]) {
            max = count[str[i]];
            result = str[i];
        }
    }

    return result;
}

// Driver program to test the above function
int main()
{
    char str[] = "sample string";
    cout << "Max occurring character is "
         << getMaxOccuringChar(str);
}
{% endhighlight %}
{% highlight java %}
// Java program to output the maximum occurring character
// in a string

public class GFG 
{
    static final int ASCII_SIZE = 256;
    static char getMaxOccuringChar(String str)
    {
        // Create array to keep the count of individual
        // characters and initialize the array as 0
        int count[] = new int[ASCII_SIZE];
     
        // Construct character count array from the input
        // string.
        int len = str.length();
        for (int i=0; i<len; i++)
            count[str.charAt(i)]++;
     
        int max = -1;  // Initialize max count
        char result = ' ';   // Initialize result
     
        // Traversing through the string and maintaining
        // the count of each character
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
     
        return result;
    }
    
    // Driver Method
    public static void main(String[] args)
    {
        String str = "sample string";
        System.out.println("Max occurring character is " +
                            getMaxOccuringChar(str));
    }
}
{% endhighlight %}
{% highlight python %}
# Python program to return the maximum occuring character in the input string
ASCII_SIZE = 256

def getMaxOccuringChar(str):
    # Create array to keep the count of individual characters
    # Initialize the count array to zero
    count = [0] * ASCII_SIZE

    # Utility variables
    max = -1
    c = ''

    # Traversing through the string and maintaining the count of
    # each character
    for i in str:
        count[ord(i)]+=1;

    for i in str:
        if max < count[ord(i)]:
            max = count[ord(i)]
            c = i

    return c

# Driver program to test the above function
str = "sample string"
print "Max occurring character is " + getMaxOccuringChar(str)

# Although this program can be written in atmost 3 lines in Python
# the above program has been written for a better understanding of
# the reader

# Shorter version of the program
# import collections
# str = "sample string"
# print "Max occurring character is " +
#        collections.Counter(str).most_common(1)[0][0]

# This code has been contributed by Bhavya Jain
{% endhighlight %}
* Output:
{% highlight cpp %}
Max occurring character is s
{% endhighlight %}
* Time Complexity: O(n) Space Complexity: O(1) — Because we are using fixed space (Hash array) irrespective of input string size.
* Notes: If more than one characters have the same count and that count is maximum then the function returns the first character with maximum count in input string. For example if input string is “test sample” then there are three characters with same and maximum count two i.e. “t”, “e” and “s” but our program will result “t” because “t” comes first in input string. Similarly, the output for “cbbbbccc” would be “c”.
* As an variation to the above program, think about the change in code if you want to output “e” for input “test sample” i.e. the character of maximum count and that character should be of least ASCII value. For “cbbbbccc”, output should be “b”. Try it out !
* Also, can you think of improvement if we can avoid two loopings in the above? Basically, you need to figure out if we can solve the same problem with one loop itself instead of two loops.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above

