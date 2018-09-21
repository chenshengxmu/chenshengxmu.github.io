---
layout: post
title: Left Rotation and Right Rotation of a String
---
* Given a string of size n, write functions to perform following operations on string.
* Examples:
{% highlight cpp %}
Input : s = "GeeksforGeeks"
        d = 2
Output : Left Rotation  : "eksforGeeksGe" 
         Right Rotation : "ksGeeksforGee"  


Input : s = "qwertyu" 
        d = 2
Output : Left rotation : "ertyuqw"
         Right rotation : "yuqwert"
{% endhighlight %}
* A Simple Solution is to use a temporary string to do rotations. For left rotation, first copy last n-d characters, then copy first d characters in order to the temporary string. For right rotation, first copy last d characters, then copy n-d characters.
* Can we do both rotations in-place and O(n) time? The idea is based on reversal algorithm for rotation.
{% highlight cpp %}
// Left rotate string s by d (Assuming d <= n)
leftRotate(s, d)
  reverse(s, 0, d-1); // Reverse substring s[0..d-1]
  reverse(s, d, n-1); // Reverse substring s[d..n-1]
  reverse(s, 0, n-1); // Reverse whole string.  

// Right rotate string s by d (Assuming d <= n)
rightRotate(s, d)

  // We can also call above reverse steps
  // with d = n-d.
  leftRotate(s, n-d)
{% endhighlight %}
* Below is the C++ implementation of above steps :
{% highlight cpp %}
// C program for Left Rotation and Right
// Rotation of a String
#include<bits/stdc++.h>
using namespace std;

// In-place rotates s towards left by d
void leftrotate(string &s, int d)
{
    reverse(s.begin(), s.begin()+d);
    reverse(s.begin()+d, s.end());
    reverse(s.begin(), s.end());
}

// In-place rotates s towards right by d
void rightrotate(string &s, int d)
{
   leftrotate(s, s.length()-d);
}

// Driver code
int main()
{
    string str1 = "GeeksforGeeks";
    leftrotate(str1, 2);
    cout << str1 << endl;

    string str2 = "GeeksforGeeks";
    rightrotate(str2, 2);
    cout << str2 << endl;
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
Left rotation:  eksforGeeksGe
Right rotation:  ksGeeksforGee
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

