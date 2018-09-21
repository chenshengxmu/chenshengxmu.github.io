---
layout: post
title: Program to find second most frequent character
---
* Given a string, find the second most frequent character in it. Expected time complexity is O(n) where n is the length of the input string.
* Examples:
{% highlight cpp %}
Input: str = "aabababa";
Output: Second most frequent character is 'b'

Input: str = "geeksforgeeks";
Output: Second most frequent character is 'g'

Input: str = "geeksquiz";
Output: Second most frequent character is 'g'
The output can also be any other character with 
count 1 like 'z', 'i'.

Input: str = "abcd";
Output: No Second most frequent character
{% endhighlight %}
* A simple solution is to start from the first character, count its occurrences, then second character and so on. While counting these occurrence keep track of max and second max. Time complexity of this solution is O(n2). We can solve this problem in O(n) time using a count array with size equal to 256 (Assuming characters are stored in ASCII format). Following is C implementation of the approach.
{% highlight c %}
#include <stdio.h>
#define NO_OF_CHARS 256

// C function to find the second most frequent character
// in a given string 'str'
char getSecondMostFreq(char *str)
{
    // count number of occurrences of every character. 
    int count[NO_OF_CHARS] = {0}, i;
    for (i=0; str[i]; i++)
        (count[str[i]])++;

    // Traverse through the count[] and find second highest element.
    int first = 0, second = 0;
    for (i = 0; i < NO_OF_CHARS; i++)
    {
        /* If current element is smaller than first then update both
          first and second */
        if (count[i] > count[first])
        {
            second = first;
            first = i;
        }

        /* If count[i] is in between first and second then update second  */
        else if (count[i] > count[second] &&
                 count[i] != count[first])
            second = i;
    }

    return second;
}

// Driver program to test above function
int main()
{
  char str[] = "geeksforgeeks";
  char res = getSecondMostFreq(str);
  if (res != '\0')
     printf("Second most frequent char is %c", res);
  else
     printf("No second most frequent character");
  return 0;
}
{% endhighlight %}
{% highlight java %}
// Java Program to find the second 
// most frequent character in a given string
public class GFG 
{
    static final int NO_OF_CHARS = 256;
    
    // finds the second most frequently occurring 
    // char
    static char getSecondMostFreq(String str)
    {
        // count number of occurrences of every
        // character. 
        int[] count = new int[NO_OF_CHARS];
        int i;
        for (i=0; i< str.length(); i++)
            (count[str.charAt(i)])++;
     
        // Traverse through the count[] and find
        // second highest element.
        int first = 0, second = 0;
        for (i = 0; i < NO_OF_CHARS; i++)
        {
            /* If current element is smaller than
            first then update both first and second */
            if (count[i] > count[first])
            {
                second = first;
                first = i;
            }
     
            /* If count[i] is in between first and
            second then update second  */
            else if (count[i] > count[second] &&
                     count[i] != count[first])
                second = i;
        }
     
        return (char)second;
    }
     
    // Driver program to test above function
    public static void main(String args[])
    {
      String str = "geeksforgeeks";
      char res = getSecondMostFreq(str);
      if (res != '\0')
         System.out.println("Second most frequent char"+
                                       " is " + res);
      else
         System.out.println("No second most frequent"+
                                       "character");
    }
}
// This code is contributed by Sumit Ghosh
{% endhighlight %}
{% highlight cpp %}
Second most frequent char is g
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above

