---
layout: post
title: Lexicographically minimum string rotation | Set 1
---
* Write code to find lexicographic minimum in a circular array, e.g. for the array BCABDADAB, the lexicographic minimum is ABBCABDAD.
* Source: Google Written Test
* More Examples:
{% highlight cpp %}
Input:  GEEKSQUIZ
Output: EEKSQUIZG

Input:  GFG
Output: FGG

Input:  GEEKSFORGEEKS
Output: EEKSFORGEEKSG
{% endhighlight %}
* Following is a simple solution. Let the given string be ‘str’ 1) Concatenate ‘str’ with itself and store in a temporary string say ‘concat’. 2) Create an array of strings to store all rotations of ‘str’. Let the array be ‘arr’. 3) Find all rotations of ‘str’ by taking substrings of ‘concat’ at index 0, 1, 2..n-1. Store these rotations in arr[] 4) Sort arr[] and return arr[0].
* Following is C++ implementation of above solution.
{% highlight cpp %}
// A simple C++ program to find lexicographically minimum rotation
// of a given string
#include <iostream>
#include <algorithm>
using namespace std;

// This functionr return lexicographically minimum
// rotation of str
string minLexRotation(string str)
{
    // Find length of given string
    int n = str.length();

    // Create an array of strings to store all rotations
    string arr[n];

    // Create a concatenation of string with itself
    string concat = str + str;

    // One by one store all rotations of str in array.
    // A rotation is obtained by getting a substring of concat
    for (int i = 0; i < n; i++)
        arr[i] = concat.substr(i, n);

    // Sort all rotations
    sort(arr, arr+n);

    // Return the first rotation from the sorted array
    return arr[0];
}

// Driver program to test above function
int main()
{
    cout << minLexRotation("GEEKSFORGEEKS") << endl;
    cout << minLexRotation("GEEKSQUIZ") << endl;
    cout << minLexRotation("BCABDADAB") << endl;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
EEKSFORGEEKSG
EEKSQUIZG
ABBCABDAD
{% endhighlight %}
* Lexicographically smallest rotated sequence | Set 2
* Time complexity of the above solution is O(n2Logn) under the assumption that we have used a O(nLogn) sorting algorithm. This problem can be solved using more efficient methods like Booth’s Algorithm which solves the problem in O(n) time. We will soon be covering these methods as separate posts.
* This article is contributed by Abhishek. Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

