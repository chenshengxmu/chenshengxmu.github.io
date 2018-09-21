---
layout: post
title: Move spaces to front of string in single traversal
---
* Given a string that has set of words and spaces, write a program to move all spaces to front of string, by traversing the string only once.
* Example:
{% highlight cpp %}
Input  : str = "geeks for geeks"
Output : ste = "  geeksforgeeks"

Input  : str = "move these spaces to beginning"
Output : str = "    movethesespacestobeginning"
There were four space characters in input,
all of them should be shifted in front.
{% endhighlight %}
* Method 1 (Using Swap) Idea is to maintain two indices i and j. Traverse from end to beginning. If the current index contains space, swap chars in index i with index j. This will bring all spaces to beginning of the array.
{% highlight cpp %}
// CPP program to bring all spaces in front of
// string using swapping technique
#include<bits/stdc++.h>
using namespace std;

// Function to find spaces and move to beginning
void moveSpaceInFront(char str[])
{
    // Traverse from end and swap spaces
    int i = strlen(str)-1;
    for (int j = i; j >= 0; j--)
        if (str[j] != ' ')
            swap(str[i--], str[j]);
}

// Driver code
int main()
{
    char str[] = "Hey there, it's GeeksforGeeks";
    moveSpaceInFront(str);
    cout << str;
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
Heythere,it'sGeeksforGeeks
{% endhighlight %}
* Time complexity-: O(n) Auxiliary Space-: O(1)
*  
* Method 2 (Without using swap) The idea is to copy all non-space characters to end. Finally copy spaces.
{% highlight cpp %}
// CPP program to bring all spaces in front of
// string using swapping technique
#include<bits/stdc++.h>
using namespace std;

// Function to find spaces and move to beginning
void moveSpaceInFront(char str[])
{
     // Keep copying non-space characters
     int i = strlen(str);
     for (int j=i; j >= 0; j--)
          if (str[j] != ' ')
             str[i--] = str[j];

     // Move spaces to be beginning
     while (i >= 0)
         str[i--] = ' ';
}

// Driver code
int main()
{
    char str[] = "Hey there, it's GeeksforGeeks";
    moveSpaceInFront(str);
    cout << str;
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
Heythere,it'sGeeksforGeeks
{% endhighlight %}
* Time complexity-: O(n) Auxiliary Space -:O(1)
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

