---
layout: post
title: Calculate sum of all numbers present in a string
---
* Given a string containing alphanumeric characters, calculate sum of all numbers present in the string.
* Examples:
{% highlight cpp %}
Input:  1abc23
Output: 24

Input:  geeks4geeks
Output: 4

Input:  1abc2x30yz67
Output: 100

Input:  123abc
Output: 123
{% endhighlight %}
* Difficulty level: Rookie
* The only tricky part in this question is multiple consecutive digits and considering as one number.
* The idea is very simple. We scan each character of the input string and if a number is formed by consecutive characters of the string, we increment the result by that amount.
* Below is its C++ implementation –
{% highlight cpp %}
// C++ program to calculate sum of all numbers present
// in a string containing alphanumeric characters
#include <iostream>
using namespace std;

// Function to calculate sum of all numbers present
// in a string containing alphanumeric characters
int findSum(string str)
{
    // A temporary string
    string temp = "";

    // holds sum of all numbers present in the string
    int sum = 0;

    // read each charcater in input string
    for (char ch: str)
    {
        // if current character is a digit
        if (isdigit(ch))
            temp += ch;

        // if current character is an alphabet
        else
        {
            // increment sum by number found earlier
            // (if any)
            sum += atoi(temp.c_str());

            // reset temporary string to empty
            temp = "";
        }
    }

    // atoi(temp.c_str()) takes care of trailing
    // numbers
    return sum + atoi(temp.c_str());
}

// Driver code
int main()
{
    // input alphanumeric string
    string str = "12abc20yz68";

    cout << findSum(str);

    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
100
{% endhighlight %}
* Time complexity of above solution is O(n) where n is length of the string.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

