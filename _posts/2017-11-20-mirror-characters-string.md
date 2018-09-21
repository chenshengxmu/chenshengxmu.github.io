---
layout: post
title: Mirror characters of a string
---
* Given a string and a number N, we need to mirror the characters from N-th position up to the length of the string in the alphabetical order. In mirror operation, we change ‘a’ to ‘z’, ‘b’ to ‘y’, and so on.
* Examples:
{% highlight cpp %}
Input : N = 3
        paradox
Output : paizwlc
We mirror characters from position 3 to end.

Input : N = 6
        pneumonia
Output : pnefnlmrz
{% endhighlight %}
* Below are different characters and their mirrors.
* Mirroring the alphabetical order means that a corresponds to z, b corresponds to y. Which means that first character becomes the last and so on. Now, to achieve this we maintain a string(or a character array) which contains the English alphabets in lower case. Now from the pivot point up to the length, we can look up the reverse alphabetical order of a character by using its ASCII value as an index. Using the above technique, we transform the given string in the required one.
{% highlight cpp %}
// C++ code to find the reverse alphabetical
// order from a given position
#include <iostream>
#include <string>
using namespace std;

// Function which take the given string
// and the position from which the reversing shall
// be done and returns the modified string
string compute(string str, int n)
{
    // Creating a string having reversed alphabetical order
    string reverseAlphabet = "zyxwvutsrqponmlkjihgfedcba";
    int l = str.length();

    // The string up to the point specified in the question,
    // the string remains unchanged and from the point up to
    // the length of the string, we reverse the alphabetical
    // order
    for (int i = n; i < l; i++)
        str[i] = reverseAlphabet[str[i] - 'a'];

    return str;
}

// Driver function
int main()
{
    string str = "pneumonia";
    int n = 4;
    string answer = compute(str, n - 1);
    cout << answer;
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java code to find the reverse alphabetical
// order from a given position
import java.io.*;

class GeeksforGeeks {

    // Function which take the given string
    // and the position from which the reversing shall
    // be done and returns the modified string
    static String compute(String str, int n)
    {

        // Creating a string having reversed alphabetical order
        String reverseAlphabet = "zyxwvutsrqponmlkjihgfedcba";
        int l = str.length();
        
        // The string up to the point specified in the question,
        // the string remains unchanged and from the point up to
        // the length of the string, we reverse the alphabetical order
        String answer = "";
        for (int i = 0; i < n; i++)
            answer = answer + str.charAt(i);
        for (int i = n; i < l; i++)
            answer = answer + reverseAlphabet.charAt(str.charAt(i) - 'a');
        return answer;
    }

    // Driver function
    public static void main(String args[])
    {
        String str = "pneumonia";
        int n = 4;
        System.out.print(compute(str, n - 1));
    }
}
{% endhighlight %}
{% highlight python %}
# python code to find the reverse
# alphabetical order from a given
# position

# Function which take the given string and the
# position from which the reversing shall be
# done and returns the modified string
def compute(st, n):
    
    # Creating a string having reversed
    # alphabetical order
    reverseAlphabet = "zyxwvutsrqponmlkjihgfedcba"
    l = len(st)
    
    # The string up to the point specified in the
    # question, the string remains unchanged and
    # from the point up to the length of the 
    # string, we reverse the alphabetical order
    answer = ""
    for i in range(0, n):
        answer = answer + st[i];
            
    for i in range(n, l):
        answer = (answer + 
        reverseAlphabet[ord(st[i]) - ord('a')]);
        
    return answer;

# Driver function
st = "pneumonia"
n = 4
answer = compute(st, n - 1)
print(answer)

# This code is contributed by Sam007.
{% endhighlight %}
{% highlight cpp %}
pnefnlmrz
{% endhighlight %}
* Complexity =
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

