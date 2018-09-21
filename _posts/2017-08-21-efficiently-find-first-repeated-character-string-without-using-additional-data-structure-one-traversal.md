---
layout: post
title: Efficiently find first repeated character in a string without using any additional data structure in one traversal
---
* Implement a space efficient algorithm to check First repeated character in a string without using any additional data structure in one traversal. Use additional data structures like count array, hash, etc is not allowed.
* Examples :
{% highlight cpp %}
Input :  abcfdeacf
Output : char = a, index= 6
{% endhighlight %}
* The idea is to use an integer variable and uses bits in its binary representation to store whether a character is present or not. Typically an integer has at-least 32 bits and we need to store presence/absence of only 26 characters.
{% highlight cpp %}
// Efficiently check First repeated character
// in C++ program 
#include<bits/stdc++.h>
using namespace std;

// Returns -1 if all characters of str are
// unique.
// Assumptions : (1) str contains only characters
//                 from 'a' to 'z'
//             (2) integers are stored using 32
//                 bits
int FirstRepeated(string str)
{
    // An integer to store presence/absence
    // of 26 characters using its 32 bits.
    int checker = 0;

    for (int i = 0; i < str.length(); ++i)
    {
        int val = (str[i]-'a');

        // If bit corresponding to current
        // character is already set
        if ((checker & (1 << val)) > 0)
            return i;

        // set bit in checker
        checker |= (1 << val);
    }

    return -1;
}

// Driver code
int main()
{
    string s = "abcfdeacf";
    int i=FirstRepeated(s);
    if (i!=-1)
        cout <<"Char = "<< s[i] << "   and Index = "<<i;
    else
        cout << "No repeated Char";
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Efficiently check First repeated character
// in Java program 
public class First_Repeated_char {

    static int FirstRepeated(String str)
    {
        // An integer to store presence/absence
        // of 26 characters using its 32 bits.
        int checker = 0;
     
        for (int i = 0; i < str.length(); ++i)
        {
            int val = (str.charAt(i)-'a');
     
            // If bit corresponding to current
            // character is already set
            if ((checker & (1 << val)) > 0)
                return i;
     
            // set bit in checker
            checker |= (1 << val);
        }
     
        return -1;
    }
     
    // Driver code
    public static void main(String args[])
    {
        String s = "abcfdeacf";
        int i=FirstRepeated(s);
        if (i!=-1)
           System.out.println("Char = "+ s.charAt(i) + "   and Index = "+i);
        else
            System.out.println( "No repeated Char");
    }
}
// This code is contributed by Sumit Ghosh
{% endhighlight %}
{% highlight python %}
# Efficiently check First repeated character
# in Python 

# Returns -1 if all characters of str are
# unique.
# Assumptions : (1) str contains only characters
#                 from 'a' to 'z'
##             (2) integers are stored using 32
##                 bits
def FirstRepeated(string):
    
    # An integer to store presence/absence
    # of 26 characters using its 32 bits.
    checker = 0
 
    pos = 0
    for i in string:
        val = ord(i) - ord('a');
 
        # If bit corresponding to current
        # character is already set
        if ((checker & (1 << val)) > 0):
            return pos
 
        # set bit in checker
        checker |= (1 << val)
        pos += 1
 
    return -1
 
# Driver code
string = "abcfdeacf"
i = FirstRepeated(string)
if i != -1:
    print "Char = ", string[i], " and Index = ", i;
else:
    print "No repeated Char"

# This code is contributed by Sachin Bisht
{% endhighlight %}
{% highlight cpp %}
Char = a   and Index = 6
{% endhighlight %}
* Time Complexity: O(n) Auxiliary Space: O(1)
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

