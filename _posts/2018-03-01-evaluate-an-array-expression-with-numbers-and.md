---
layout: post
title: Evaluate an array expression with numbers, + and
---
* Given an array arr[] of string type which consists of strings “+”, “-” and Numbers. Find the sum of the given array. Examples :
{% highlight cpp %}
Input : arr[] = {"3", "+", "4", "-", "7", "+", "13"}
Output : Value = 13
The value of expression 3+4-7+13 is 13.

Input : arr[] = { "2", "+", "1", "-8", "+", "13"}
Output : Value = 8
{% endhighlight %}
* Approach : 1) First of all, initialize the sum i.e, sum = 0. 2) Start traversing the array. 3) As there is string of numbers at every even position of the array, so convert this string into integer and store in a variable value by using stoi function in C++. 4) As there is operator at every odd position, check if the operator is ‘+’ or ‘-‘. If it is ‘+’, then add the value to the sum, else subtract from the sum. 5) Finally, return the sum obtained.
* Below is the implementation of the above approach :
{% highlight cpp %}
// C++ program to find sum of given array of 
// string type in integer form
#include <bits/stdc++.h>
using namespace std;

// Function to find the sum of given array
int calculateSum(string arr[], int n)
{   
    // if string is empty
    if (n == 0)
       return 0;

    string s = arr[0];

    // stoi function to convert
    // string into integer
    int value = stoi(s);
    int sum = value;

    for (int i = 2; i < n; i = i + 2)
    {
        s = arr[i];

        // stoi function to convert 
        // string into integer
        int value = stoi(s);

        // Find operator
        char operation = arr[i - 1][0];

        // If operator is equal to '+',
        // add value in sum variable 
        // else subtract
        if (operation == '+')
            sum += value;
        else
            sum -= value;
    }
    return sum;
}

// Driver Function
int main()
{
    string arr[] = { "3", "+", "4", "-",
                     "7", "+", "13" };
    int n = sizeof(arr) / sizeof(arr[0]);   
    cout << calculateSum(arr, n);   
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to find sum of given array of 
// string type in integer form
import java.io.*;

class GFG {
    
    // Function to find the sum of given array
    public static int calculateSum(String arr[], int n)
    { 
        // if string is empty
        if (n == 0)
        return 0;
        String s = arr[0];
        
        // parseInt function to convert
        // string into integer
        int value = Integer.parseInt(s);
        int sum = value;
    
        for (int i = 2; i < n; i = i + 2)
        {
            s = arr[i];
    
            // parseInt function to convert 
            // string into integer
            value = Integer.parseInt(s);
    
            // Find operator
            char operation = arr[i - 1].charAt(0);
    
            // If operator is equal to '+',
            // add value in sum variable 
            // else subtract
            if (operation == '+')
                sum += value;
            else
                sum -= value;
        }
        return sum;
    }

    // Driver code
    public static void main (String[] args) 
    {
        String arr[] = { "3", "+", "4", "-",
                        "7", "+", "13" };
        int n = arr.length; 
        System.out.println( calculateSum(arr, n)); 
    }
}

// This code in contributed by Upendra bartwal
{% endhighlight %}
{% highlight python %}
# Python3 program to find sum of given 
# array of string type in integer form

# Function to find the sum of given array
def calculateSum(arr, n):

    # if string is empty
    if (n == 0):
        return 0

    s = arr[0]

    # stoi function to convert
    # string into integer
    value = int(s)
    sum = value

    for i in range(2 , n, 2):
    
        s = arr[i]

        # stoi function to convert 
        # string into integer
        value = int(s)

        # Find operator
        operation = arr[i - 1][0]

        # If operator is equal to '+',
        # add value in sum variable 
        # else subtract
        if (operation == '+'):
            sum += value
        else:
            sum -= value
    
    return sum

# Driver Function
arr = ["3", "+", "4", "-","7", "+", "13"] 
n = len(arr)
print(calculateSum(arr, n))

# This code is contributed by Smitha
{% endhighlight %}
{% highlight cpp %}
13
{% endhighlight %}
* Time Complexity : O(n)
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

