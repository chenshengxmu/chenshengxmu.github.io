---
layout: post
title: Remove spaces from a given string
---
* Given a string, remove all spaces from the string and return it.
{% highlight cpp %}
Input:  "g  eeks   for ge  eeks  "
Output: "geeksforgeeks"
{% endhighlight %}
* Expected time complexity is O(n) and only one traversal of string.
* Below is a Simple Solution
{% highlight cpp %}
1) Iterate through all characters of given string, do following
   a) If current character is a space, then move all subsequent
      characters one position back and decrease length of the 
      result string.
{% endhighlight %}
* Time complexity of above solution is O(n2).
* A Better Solution can solve it in O(n) time. The idea is to keep track of count of non-space character seen so far.
{% highlight cpp %}
1) Initialize 'count' = 0 (Count of non-space character seen so far)
2) Iterate through all characters of given string, do following
     a) If current character is non-space, then put this character
        at index 'count' and increment 'count'
3) Finally, put '\0' at index 'count'
{% endhighlight %}
* Below are C++ and Python implementation of above algorithm.
{% highlight cpp %}
// An efficient C++ program to remove all spaces
// from a string
#include <iostream>
using namespace std;

// Function to remove all spaces from a given string
void removeSpaces(char *str)
{
    // To keep track of non-space character count
    int count = 0;

    // Traverse the given string. If current character
    // is not space, then place it at index 'count++'
    for (int i = 0; str[i]; i++)
        if (str[i] != ' ')
            str[count++] = str[i]; // here count is
                                   // incremented
    str[count] = '\0';
}

// Driver program to test above function
int main()
{
    char str[] = "g  eeks   for ge  eeks  ";
    removeSpaces(str);
    cout << str;
    return 0;
}
{% endhighlight %}
{% highlight python %}
# Python program to Remove spaces from a given string

# Function to remove all spaces from a given string
def removeSpaces(string):

    # To keep track of non-space character count
    count = 0

    list = []

    # Traverse the given string. If current character
    # is not space, then place it at index 'count++'
    for i in xrange(len(string)):
        if string[i] != ' ':
            list.append(string[i])

    return toString(list)

# Utility Function
def toString(List):
    return ''.join(List)

# Driver program
string = "g  eeks  for ge  eeks  "
print removeSpaces(string)

# This code is contributed by Bhavya Jain
{% endhighlight %}
{% highlight cpp %}
geeksforgeeeks
{% endhighlight %}
* Time complexity of above solution is O(n) and it does only one traversal of string. Another solution suggested by Divyam Madaan is to use predefined functions. Here is the implementation:
{% highlight cpp %}
// CPP program to Remove spaces 
// from a given string
 
#include <iostream>
#include <algorithm>
using namespace std;

// Function to remove all spaces from a given string
string removeSpaces(string str) 
{
    str.erase(remove(str.begin(), str.end(), ' '), str.end());
    return str;
}

// Driver program to test above function
int main() 
{
    string str = "g  eeks   for ge  eeks   ";
    str = removeSpaces(str);
    cout << str;
    return 0;
}

// This code is contributed by Divyam Madaan
{% endhighlight %}
{% highlight java %}
// Java program to remove 
// all spaces from a string

class GFG {
    
    // Function to remove all 
    // spaces from a given string
    static String removeSpace(String str)
    {
        str = str.replaceAll("\\s","");
        return str;
    }

    // Driver Code
    public static void main(String args[])
    {
        String str = "g eeks for ge eeks ";
        System.out.println(removeSpace(str));
    }
}

// This code is contributed by Kanhaiya.
{% endhighlight %}
{% highlight python %}
# Python program to Remove spaces from a given string
 
# Function to remove all spaces from a given string
def removeSpaces(string):
    string = string.replace(' ','')
    return string
    
# Driver program
string = "g  eeks  for ge  eeks  "
print(removeSpaces(string))

# This code is contributed by Divyam Madaan
{% endhighlight %}
* Thanks to Souravi Sarkar for suggesting this problem and initial solution. Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above

