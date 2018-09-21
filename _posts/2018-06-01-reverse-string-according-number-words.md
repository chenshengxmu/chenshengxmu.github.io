---
layout: post
title: Reverse String according to the number of words
---
* Given a string containing a number of words. If the count of words in string is even then reverse its even position’s words else reverse its odd position, push reversed words at the starting of a new string and append the remaining words as it is in order.
* Examples:
{% highlight cpp %}
Input:  Ashish Yadav Abhishek Rajput Sunil Pundir
Output: ridnuP tupjaR vadaY Ashish Abhishek Sunil

Input:  Ashish Yadav Abhishek Rajput Sunil Pundir Prem
Output: merP linuS kehsihbA hsihsA Yadav Rajput Pundir
{% endhighlight %}
* Approach : If number of words are even then even position’s words come first and also reverse that particular word, and if number of words are odd then odd position’s words come first and also reverse that particular word, after then the remaining words are appended in order. For e.g.
* Ashish Yadav Abhishek Rajput Sunil Pundir. In the above string, the number of words is even then “Yadav Rajput Pundir” comes at the even position and then the final output will be: ridnuP tupjaR vadaY Ashish Abhishek Sunil
{% highlight c %}
// C program to reverse string 
// according to the number of words 
#include<stdio.h>
#include<string.h>

// Reverse the letters of the word
void reverse(char str[], int start, int end) {

    // Temporary variable to store character
    char temp;
    while (start <= end)
    {
        // Swapping the first and last character
        temp = str[start];
        str[start] = str[end];
        str[end] = temp;
        start++;
        end--;
    }
}

// This function forms the required string
void reverseletter(char str[], int start, int end) {
            
    int wstart, wend;
    for (wstart = wend = start; wend < end; wend++) {
                    
        if (str[wend] == ' ')
            continue;
            
        // Checking the number of words
        // present in string to reverse
        while (str[wend] != ' ' && wend <= end)
            wend++;
        wend--;
        
        //Reverse the letter
        //of the words
        reverse(str, wstart, wend);
    }
}

// Driver Code
int main()
{
    char str[1000] = "Ashish Yadav Abhishek Rajput Sunil Pundir";
    reverseletter(str, 0, strlen(str)-1);
    printf("%s", str);
    return 0;
}
{% endhighlight %}
{% highlight cpp %}
ridnuP tupjaR vadaY Ashish Abhishek Sunil
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

