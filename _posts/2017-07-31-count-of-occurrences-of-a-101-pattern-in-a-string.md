---
layout: post
title: Count of occurrences of a "1(0+)1" pattern in a string
---
* Given an alphanumeric string, find the number of times a pattern 1(0+)1 occurs in the given string. Here, (0+) signifies the presence of non empty sequence of consecutive 0’s.
* Examples:
{% highlight cpp %}
Input : 1001010001
Output : 3
First sequence is in between 0th and 3rd index.
Second sequence is in between 3rd and 5th index.
Third sequence is in between 5th and 9th index.
So total number of sequences comes out to be 3.

Input : 1001ab010abc01001
Output : 2
First sequence is in between 0th and 3rd index.
Second valid sequence is in between 13th and 16th
index. So total number of sequences comes out to 
be 2.
{% endhighlight %}
* The idea to solve this problem is to first find a ‘1’ and keep moving forward in the string and check as mentioned below:
* Below is the implementation of above idea:
{% highlight cpp %}
// C++ program to calculate number of times
// the pattern occured in given string
#include<iostream>
using namespace std;

// Returns count of occurrences of "1(0+)1"
// int str.
int countPattern(string str)
{
    int len = str.size();
    bool oneSeen = 0;

    int count = 0;  // Initialize result
    for (int i = 0; i < len ; i++)
    {
        // if 1 encountered for first time
        // set oneSeen to 1
        if (str[i] == '1' && oneSeen == 0)
            oneSeen = 1;

        // Check if there is any other character
        // other than '0' or '1'. If so then set
        // oneSeen to 0 to search again for new
        // pattern
        if (str[i] != '0' && str[i] != '1')
            oneSeen = 0;

        // Check if encountered '1' forms a valid
        // pattern as specified
        if (str[i] == '1' && oneSeen == 1)
            if (str[i - 1] == '0')
                count++;
    }

    return count;
}

// Driver program to test above function
int main()
{
    string str = "100001abc101";
    cout << countPattern(str);
    return 0;
}
{% endhighlight %}
{% highlight java %}
//Java program to calculate number of times
//the pattern occurred in given string
public class GFG
{
    // Returns count of occurrences of "1(0+)1"
    // int str.
    static int countPattern(String str)
    {
        int len = str.length();
        boolean oneSeen = false;
        
        int count = 0;  // Initialize result
        for(int i = 0; i < len ; i++)
        {
            char getChar = str.charAt(i);
            
            // if 1 encountered for first time
            // set oneSeen to 1
            if(getChar == '1' && oneSeen == false)
                oneSeen = true;
            
            // Check if there is any other character
            // other than '0' or '1'. If so then set
            // oneSeen to 0 to search again for new
            // pattern
            else if(getChar != '0' && str.charAt(i) != '1')
                oneSeen = false;
            
            // Check if encountered '1' forms a valid
            // pattern as specified
            else if (getChar == '1' && oneSeen == true){
                if (str.charAt(i - 1) == '0')
                    count++;
            }
        }
        return count;
    }

    // Driver program to test above function
    public static void main(String[] args)
    {
         String str = "100001abc101";
         System.out.println(countPattern(str));
    }

}
// This code is contributed by Sumit Ghosh
{% endhighlight %}
{% highlight python %}
# Python program to calculate number of times
# the pattern occured in given string

# Returns count of occurrences of "1(0+)1"
def countPattern(s):
    length = len(s)
    oneSeen = False
    
    count = 0   # Initialize result
    for i in range(length):

        # if 1 encountered for first time
        # set oneSeen to 1
        if (s[i] == '1' and oneSeen == 0):
            oneSeen = True
 
        # Check if there is any other character
        # other than '0' or '1'. If so then set
        # oneSeen to 0 to search again for new
        # pattern
        if (s[i] != '0' and s[i] != '1'):
            oneSeen = False
 
        # Check if encountered '1' forms a valid
        # pattern as specified
        if (s[i] == '1' and oneSeen):
            if (s[i - 1] == '0'):
                count += 1
 
    return count

# Driver code
s = "100001abc101"
print countPattern(s)

# This code is contributed by Sachin Bisht
{% endhighlight %}
{% highlight cpp %}
2
{% endhighlight %}
* Time Complexity: O( N ), where N is the length of input string.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

