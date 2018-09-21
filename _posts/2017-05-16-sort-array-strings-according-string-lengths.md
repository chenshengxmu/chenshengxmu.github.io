---
layout: post
title: Sort an array of strings according to string lengths
---
* We are given an array of strings, we need to sort the array in increasing order of string lengths.
* Examples:
{% highlight cpp %}
Input : {"GeeksforGeeeks", "I", "from", "am"}
Output : I am from GeeksforGeeks

Input :  {"You", "are", "beautiful", "looking"}
Output : You are looking beautiful
{% endhighlight %}
* A simple solution is to write our own sort function that compares string lengths to decide which string should come first. Below is the C++ implementation that uses Insertion Sort to sort the array.
{% highlight cpp %}
// C++ program to sort an Array of 
// Strings according to their lengths
#include<iostream>
using namespace std;

// Function to print the sorted array of string
void printArraystring(string,int);

// Function to Sort the array of string
// according to lengths. This function 
// implements Insertion Sort. 
void sort(string s[], int n)
{
    for (int i=1 ;i<n; i++)
    {
        string temp = s[i];

        // Insert s[j] at its correct position
        int j = i - 1;
        while (j >= 0 && temp.length() < s[j].length())
        {
            s[j+1] = s[j];
            j--;
        }
        s[j+1] = temp;
    }
}
 
// Function to print the sorted array of string
void printArraystring(string str[], int n)
{
    for (int i=0; i<n; i++)
        cout << str[i] << " ";
}

// Driver function
int main()
{
    string arr[] = {"GeeksforGeeks", "I", "from", "am"};
    int n = sizeof(arr)/sizeof(arr[0]);
    
    // Function to perform sorting
    sort(arr, n);

    // Calling the function to print result
    printArraystring(arr, n);
    
    return 0;
}
{% endhighlight %}
{% highlight cpp %}
I am from GeeksforGeeks
{% endhighlight %}
* A better solution is to use sort function provided by programming languages like C++, Java. These functions also allow us to write our own custom comparator. Below is C++ implementation that uses C++ STL Sort function.
{% highlight cpp %}
#include <bits/stdc++.h>
using namespace  std;

// Function to check the small string
bool compare(string &s1,string &s2)
{
    return s1.size() < s2.size();
}

// Function to print the sorted array of string
void printArraystring(string str[], int n)
{
    for (int i=0; i<n; i++)
        cout << str[i] << " ";
}

// Driver function
int main()
{
    string arr[] = {"GeeksforGeeks", "I", "from", "am"};
    int n = sizeof(arr)/sizeof(arr[0]);
    
    // Function to perform sorting
    sort(arr, arr+n, compare);

    // Calling the function to print result
    printArraystring(arr, n);
    
    return 0;
}
{% endhighlight %}
{% highlight cpp %}
I am from GeeksforGeeks
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

