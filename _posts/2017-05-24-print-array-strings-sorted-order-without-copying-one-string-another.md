---
layout: post
title: Print array of strings in sorted order without copying one string into another
---
* Given an array of n strings. The task is to print the strings in sorted order. The approach should be such that no string should be copied to another string during sorting process.
* Examples:
{% highlight cpp %}
Input : {"geeks", "for", "geeks", "quiz")
Output : for geeks geeks quiz

Input : {"ball", "pen", "apple", "kite"}
Output : apple ball kite pen
{% endhighlight %}
* Approach: It has the following steps:
* An Illustration:
{% highlight cpp %}
--> str[] = {"world", "hello"}
--> corresponding index array will be
    indexed_arr = {0, 1}
--> Now, how the strings are compared and 
    accordingly values in indexed_arr are changed.
--> Comparison process:
    if (str[index[0]].compare(str[index[1]] > 0
        temp = index[0]
        index[0] = index[1]
        index[1] = temp

// after sorting values of
// indexed_arr = {1, 0}
--> for i=0 to 1
        print str[index[i]]

This is how the strings are compared and their 
corresponding indexes in the indexed_arr
are being manipulated/swapped so that after the sorting process
is completed, the order of indexes in the indexed_arr
gives us the sorted order of the strings.
{% endhighlight %}
{% highlight cpp %}
// C++ implementation to print array of strings in sorted
// order without copying one string into another
#include <bits/stdc++.h>

using namespace std;

// function to print strings in sorted order
void printInSortedOrder(string arr[], int n)
{
    int index[n];
    int i, j, min;
    
    // Initially the index of the strings
    // are assigned to the 'index[]' 
    for (i=0; i<n; i++)
        index[i] = i;
    
    // selection sort technique is applied    
    for (i=0; i<n-1; i++)    
    {
        min = i;
        for (j=i+1; j<n; j++)
        {
            // with the help of 'index[]'
            // strings are being compared
            if (arr[index[min]].compare(arr[index[j]]) > 0)
                min = j;
        }
        
        // index of the smallest string is placed
        // at the ith index of 'index[]'
        if (min != i)
        {
            int temp = index[min];
            index[min] = index[i];
            index[i] = temp;
        }
    }
    
    // printing strings in sorted order
    for (i=0; i<n; i++)
        cout << arr[index[i]] << " ";
}

// Driver program to test above
int main()
{
    string arr[] = {"geeks", "quiz", "geeks", "for"};
    int n = 4;
    printInSortedOrder(arr, n);
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
for geeks geeks quiz
{% endhighlight %}
* Time Complexity: O(n2)
* The approach can have its usage when we have to minimize the number of disc writes as in the case of array of structures. The structure values are compared but their values are not being swapped, instead their index is maintained in another array, which is manipulated so as keep the indexes in an order which represents the sorted array of structures.
* Exercise: Apply this approach with the help of other sorting techniques like merge sort, insertion sort, etc.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

