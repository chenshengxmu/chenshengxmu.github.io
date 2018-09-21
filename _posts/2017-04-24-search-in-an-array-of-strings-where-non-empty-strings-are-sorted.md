---
layout: post
title: Search in an array of strings where non-empty strings are sorted
---
* Given an array of strings. The array has both empty and non-empty strings. All non-empty strings are in sorted order. Empty strings can be present anywhere between non-empty strings.
* Examples:
{% highlight cpp %}
Input :  arr[] =  {"for", "", "", "", "geeks", 
                   "ide", "", "practice", "" , 
                   "", "quiz", "", ""};
          str = "quiz"
Output :   10
The string "quiz" is present at index 10 in 
given array.
{% endhighlight %}
* A simple solution is to linearly search given str in array of strings.
* A better solution is to do modified Binary Search. Like normal binary search, we compare given str with middle string. If middle string is empty, we find the closest non-empty string x (by linearly searching on both sides). Once we find x, we do standard binary search, i.e., we compare given str with x. If str is same as x, we return index of x. if str is greater, we recur for right half, else we recur for left half.
* Below is C++ implementation of the idea.
{% highlight cpp %}
// C++ program to find location of a str in
// an array of strings which is sorted and
// has empty strings between strings.
#include <bits/stdc++.h>
using namespace std;

// Compare two string equals are not
int compareStrings(string str1, string str2)
{
    int i = 0;
    while (str1[i] == str2[i] && str1[i] != '\0')
        i++;
    if (str1[i] > str2[i])
        return -1;

    return (str1[i] < str2[i]);
}

// Main function to find string location
int searchStr(string arr[], string str, int first,
                                        int last)
{
    if (first > last)
        return -1;

    // Move mid to the middle
    int mid = (last+first)/2;

    // If mid is empty , find closet non-empty string
    if (arr[mid].empty())
    {
        // If mid is empty, search in both sides of mid
        // and find the closest non-empty string, and
        // set mid accordingly.
        int left  = mid - 1;
        int right = mid + 1;
        while (true)
        {
            if (left < first && right > last)
                return -1;
            if (right<=last && !arr[right].empty())
            {
                mid = right;
                break;
            }
            if (left>=first && !arr[left].empty())
            {
                mid = left;
                break;
            }
            right++;
            left--;
        }
    }

    // If str is found at mid
    if (compareStrings(str, arr[mid]) == 0)
        return mid;

    // If str is greater than mid
    if (compareStrings(str, arr[mid]) < 0)
        return searchStr(arr, str, mid+1, last);

    // If str is smaller than mid
    return searchStr(arr, str, first, mid-1);
}

// Driver Code
int main()
{
    // Input arr of Strings.
    string arr[] = {"for", "", "", "", "geeks", "ide", "",
                     "practice", "" , "", "quiz", "", ""};

    // input Search String
    string str = "quiz";
    int n = sizeof(arr)/sizeof(arr[0]);

    cout << searchStr(arr, str, 0, n-1);
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
10
{% endhighlight %}
* Although this approach works better than linear search, the worst-case runtime for this algorithm is O(n).
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

