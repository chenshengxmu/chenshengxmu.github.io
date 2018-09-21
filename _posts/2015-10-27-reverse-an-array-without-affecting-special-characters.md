---
layout: post
title: Reverse an array without affecting special characters
---
* Given a string, that contains special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’), reverse the string in a way that special characters are not affected.
* Examples:
{% highlight cpp %}
Input:   str = "a,b$c"
Output:  str = "c,b$a"
Note that $ and , are not moved anywhere.  
Only subsequence "abc" is reversed

Input:   str = "Ab,c,de!$"
Output:  str = "ed,c,bA!$"
{% endhighlight %}
* Simple Solution: 1) Create a temporary character array say temp[]. 2) Copy alphabetic characters from given array to temp[]. 3) Reverse temp[] using standard string reversal algorithm. 4) Now traverse input string and temp in a single loop. Wherever there is alphabetic character is input string, replace it with current character of temp[].
* Efficient Solution: Time complexity of above solution is O(n), but it requires extra space and it does two traversals of input string. We can reverse with one traversal and without extra space. Below is algorithm.
{% highlight cpp %}
1) Let input string be 'str[]' and length of string be 'n'
2) l = 0, r = n-1
3) While l is smaller than r, do following
    a) If str[l] is not an alphabetic character, do l++
    b) Else If str[r] is not an alphabetic character, do r--
    c) Else swap str[l] and str[r]
{% endhighlight %}
* Below are implementations of above algorithm.
{% highlight c %}
// C++ program to reverse a string 
// with special characters
#include<bits/stdc++.h>
using namespace std;

// Returns true if x is an aplhabatic
// character, false otherwise
bool isAlphabet(char x)
{
    return ( (x >= 'A' && x <= 'Z') ||
            (x >= 'a' && x <= 'z') );
}

void reverse(char str[])
{
    // Initialize left and right pointers
    int r = strlen(str) - 1, l = 0;

    // Traverse string from both ends until
    // 'l' and 'r'
    while (l < r)
    {
        // Ignore special characters
        if (!isAlphabet(str[l]))
            l++;
        else if(!isAlphabet(str[r]))
            r--;

        else // Both str[l] and str[r] are not spacial
        {
            swap(str[l], str[r]);
            l++;
            r--;
        }
    }
}

// Driver code
int main()
{
    char str[] = "a!!!b.c.d,e'f,ghi";
    cout << "Input string: " << str << endl;
    reverse(str);
    cout << "Output string: " << str << endl;
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java code to illustrate how to reverse
// an array without affecting special characters.
class GFG
{
    public static void reverse(char str[])
    {
        // Initialize left and right pointers
        int r = str.length - 1, l = 0;

        // Traverse string from both ends until
        // 'l' and 'r'
        while (l < r)
        {
            // Ignore special characters
            if (!Character.isAlphabetic(str[l]))
                l++;
            else if(!Character.isAlphabetic(str[r]))
                r--;

            // Both str[l] and str[r] are not spacial
            else 
            {
                char tmp = str[l];
                str[l] = str[r];
                str[r] = tmp;
                l++;
                r--;
            }
        }
    }

    // Driver Code
    public static void main(String[] args) 
    {
        String str = "a!!!b.c.d,e'f,ghi";
        char[] charArray = str.toCharArray();

        System.out.println("Input string: " + str);
                            reverse(charArray);
        String revStr = new String(charArray);

        System.out.println("Output string: " + revStr);
    }
}

// This code is contributed by panwarabhishek345
{% endhighlight %}
{% highlight python %}
# Python program to reverse a 
# string with special characters

# Returns true if x is an aplhabatic 
# character, false otherwise
def isAlphabet(x):
    return x.isalpha()

def reverse(string):
    LIST = toList(string)

    # Initialize left and right pointers
    r = len(LIST) - 1
    l = 0

    # Traverse LIST from both ends until
    # 'l' and 'r'
    while l < r:

        # Ignore special characters
        if not isAlphabet(LIST[l]):
            l += 1
        elif not isAlphabet(LIST[r]):
            r -= 1
        
        # Both LIST[l] and LIST[r] are not special
        else: 
            LIST[l], LIST[r] = swap(LIST[l],
                                    LIST[r])
            l += 1
            r -= 1

    return toString(LIST)

# Utility functions
def toList(string):
    List = []
    for i in string:
        List.append(i)
    return List

def toString(List):
    return ''.join(List)

def swap(a, b):
    return b, a

# Driver code
string = "a!!!b.c.d,e'f,ghi"
print "Input string: " + string
string = reverse(string)
print "Output string: " + string

# This code is contributed by Bhavya Jain
{% endhighlight %}
{% highlight cpp %}
Input string: a!!!b.c.d,e'f,ghi
Output string: i!!!h.g.f,e'd,cba
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above

