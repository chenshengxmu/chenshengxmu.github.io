---
layout: post
title: Sort the given string using character search
---
* Given a string str of size n. The problem is to sort the given string without using any sorting techniques (like bubble, selection, etc). The string contains only lowercase characters.
* Examples:
{% highlight cpp %}
Input : geeksforgeeks
Output : eeeefggkkorss

Input : coding
Output : cdgino
{% endhighlight %}
* Algorithm:
{% highlight cpp %}
sortString(str, n)
    Initialize new_str = ""
    
    for i = 'a' to 'z'
        for j = 0 to n-1
            if str[j] == i, then
                new_str += str[j]

    return new_str
{% endhighlight %}
{% highlight cpp %}
// C++ implementation to sort the given string without
// using any sorting technique
#include <bits/stdc++.h>
using namespace std;

// function to sort the given string without
// using any sorting technique
string sortString(string str, int n) {

  // to store the final sorted string
  string new_str = "";

  // for each character 'i'
  for (int i = 'a'; i <= 'z'; i++)

    // if character 'i' is present at a particular
    // index then add character 'i' to 'new_str'
    for (int j = 0; j < n; j++)
      if (str[j] == i)
        new_str += str[j];

  // required final sorted string
  return new_str;
}

// Driver program to test above
int main() {
  string str = "geeksforgeeks";
  int n = str.size();
  cout << sortString(str, n);
  return 0;
}
{% endhighlight %}
{% highlight java %}
// Java implementation to sort the given 
// string without using any sorting technique
class GFG {
    
    // function to sort the given string 
    // without using any sorting technique
    static String sortString(String str, int n)
    {

        // to store the final sorted string
        String new_str = "";

        // for each character 'i'
        for (int i = 'a'; i <= 'z'; i++)

            // if character 'i' is present at a 
            // particular index then add character
            // 'i' to 'new_str'
            for (int j = 0; j < n; j++)
                if (str.charAt(j) == i)
                    new_str += str.charAt(j);

        // required final sorted string
        return new_str;
    }
    
    // Driver code
    public static void main(String[] args)
    {
        String str = "geeksforgeeks";
        int n = str.length();
        
        System.out.print(sortString(str, n));
    }
}

// This code is contributed by Anant Agarwal.
{% endhighlight %}
{% highlight python %}
# Python3 implementation to sort 
# the given string without using
# any sorting technique

# Function to sort the given string 
# without using any sorting technique
def sortString(str, n):

    # To store the final sorted string
    new_str = ""

    # for each character 'i'
    for i in range(ord('a'), ord('z') + 1):

        # if character 'i' is present at a particular
        # index then add character 'i' to 'new_str'
        for j in range(n):
            if (str[j] == chr(i)):
                new_str += str[j]

    # required final sorted string
    return new_str

# Driver Code
str = "geeksforgeeks"
n = len(str)
print(sortString(str, n))

# This code is contributed by Anant Agarwal.
{% endhighlight %}
{% highlight cpp %}
eeeefggkkorss
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

