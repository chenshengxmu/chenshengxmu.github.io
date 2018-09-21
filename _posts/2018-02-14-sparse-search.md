---
layout: post
title: Sparse Search
---
* Given a sorted array of strings which is interspersed with empty strings, write a method to find the location of a given string.
* Examples:
{% highlight cpp %}
Input : arr[] = {"for", "geeks", "", "", "", "", "ide", 
                      "practice", "", "", "", "quiz"}
          x = "geeks"
Output : 1

Input : arr[] = {"for", "geeks", "", "", "", "", "ide", 
                      "practice", "", "", "", "quiz"}, 
          x = "ds"
Output : -1
{% endhighlight %}
* If there were no empty strings then we could’ve simply performed binary search. We can still use Binary Search with a little modification. If our mid is empty we just have to move mid to closest Non-Empty string.
* Below is a C++ solution for above approach.
{% highlight cpp %}
// CPP program to implement binary search
// in a sparse array.
#include <bits/stdc++.h>
using namespace std;

/* Binary Search in an array with blanks */
int binarySearch(string *arr, int low, int high, string x) {
  if (low > high)
    return -1;

  int mid = (low + high) / 2;

  /*Modified Part*/
  if (arr[mid] == "") {
    int left = mid - 1;
    int right = mid + 1;

    /*Search for both side for a non empty string*/
    while (1) {

      /* No non-empty string on both sides */
      if (left < low && right > high)
        return -1;

      if (left >= low && arr[left] != "") {
        mid = left;
        break;
      }

      else if (right <= high && arr[right] != "") {
        mid = right;
        break;
      }

      left--;
      right++;
    }
  }

  /* Normal Binary Search */
  if (arr[mid] == x)
    return mid;
  else if (arr[mid] > x)
    return binarySearch(arr, low, mid - 1, x);
  else
    return binarySearch(arr, mid + 1, high, x);
}

int sparseSearch(string arr[], string x, int n) {
  return binarySearch(arr, 0, n - 1, x);
}

int main() {
  ios_base::sync_with_stdio(false);

  string arr[] = {"for", "geeks", "", "", "", "", "ide", 
                      "practice", "", "", "", "quiz"};
  string x = "geeks";
  int n = sizeof(arr) / sizeof(arr[0]);
  int index = sparseSearch(arr, x, n);
  if (index != -1)
    cout << x << " found at index " << index << "\n";
  else
    cout << x << " not found\n";
  return 0;
}
{% endhighlight %}
{% highlight cpp %}
geeks found at index 1
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

