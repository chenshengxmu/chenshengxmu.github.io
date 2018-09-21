---
layout: post
title: Convert a sentence into its equivalent mobile numeric keypad sequence
---
* Given a sentence in the form of a string, convert it into its equivalent mobile numeric keypad sequence.

![img](https://www.geeksforgeeks.org/wp-content/uploads/Mobile-keypad.png)
* Examples :
{% highlight cpp %}
Input : GEEKSFORGEEKS
Output : 4333355777733366677743333557777
For obtaining a number, we need to press a
number corresponding to that character for 
number of times equal to position of the 
character. For example, for character C, 
we press number 2 three times and accordingly.

Input : HELLO WORLD
Output : 4433555555666096667775553
{% endhighlight %}
* Follow the steps given below to convert a sentence into its equivalent mobile numeric keypad sequence.
* Below is the implementation of above method :
{% highlight cpp %}
// C++ implementation to convert a
// sentence into its equivalent
// mobile numeric keypad sequence
#include <bits/stdc++.h>
using namespace std;

// Function which computes the sequence
string printSequence(string arr[],
                       string input)
{
    string output = "";

    // length of input string
    int n = input.length();
    for (int i=0; i<n; i++)
    {
        // Checking for space
        if (input[i] == ' ')
            output = output + "0";

        else
        {
            // Calculating index for each 
            // character
            int position = input[i]-'A';
            output = output + arr[position];
        }
    }

    // Output sequence
    return output;
}

// Driver function
int main()
{
    // storing the sequence in array
    string str[] = {"2","22","222",
                    "3","33","333",
                    "4","44","444",
                    "5","55","555",
                    "6","66","666",
                    "7","77","777","7777",
                    "8","88","888",
                    "9","99","999","9999"
                   };

    string input = "GEEKSFORGEEKS";
    cout << printSequence(str, input);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java implementation to convert a
// sentence into its equivalent
// mobile numeric keypad sequence
import java.util.*;

class GFG
{

    // Function which computes the sequence
    static String printSequence(String arr[],
                               String input)
    {
        String output = "";
    
        // length of input string
        int n = input.length();
        for (int i = 0; i < n; i++)
        {
            // Checking for space
            if (input.charAt(i) == ' ')
                output = output + "0";
    
            else
            {
                // Calculating index for each 
                // character
                int position = input.charAt(i) - 'A';
                output = output + arr[position];
            }
        }
    
        // Output sequence
        return output;
    }
    
    // Driver Function
    public static void main(String[] args)
    {
        // storing the sequence in array
        String str[] = {"2","22","222",
                        "3","33","333",
                        "4","44","444",
                        "5","55","555",
                        "6","66","666",
                        "7","77","777","7777",
                        "8","88","888",
                        "9","99","999","9999"
                    };

        String input = "GEEKSFORGEEKS";
        System.out.println(printSequence(str, input));
    }
}

// This code is contributed by Gitanjali.
{% endhighlight %}
{% highlight python %}
# Python3 implementation to convert
# a sentence into its equivalent
# mobile numeric keypad sequence

# Function which computes the 
# sequence
def printSequence(arr, input):

# length of input string
    n = len(input)
    output = ""
    
    for i in range(n):
    
        # checking for space
        if(input[i] == ' '):
            output = output + "0"
        else:
            # calculating index for each
            # character         
            position = ord(input[i]) - ord('A')
            output = output + arr[position]
    # output sequence     
    return output
    
# Driver code
str = ["2", "22", "222",
       "3", "33", "333",
       "4", "44", "444",
       "5", "55", "555",
       "6", "66", "666",
       "7", "77", "777", "7777",
       "8", "88", "888",
       "9", "99", "999", "9999" ]

input = "GEEKSFORGEEKS";
print( printSequence(str, input))

# This code is contributed by upendra bartwal
{% endhighlight %}
{% highlight cpp %}
4333355777733366677743333557777
{% endhighlight %}
* Time complexity : O(n)
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

