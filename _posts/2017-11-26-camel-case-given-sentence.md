---
layout: post
title: Camel case of a given sentence
---
* Given a sentence, task is to remove spaces from the sentence and rewrite in Camel case. It is a style of writing where we don’t have spaces and all words begin with capital letters.
* Examples:
{% highlight cpp %}
Input  : I got intern at geeksforgeeks
Output : IGotInternAtGeeksforgeeks

Input :  Here comes the garden
Output : HereComesTheGarden
{% endhighlight %}
* Simple solution: First method is to traverse sentence and one by one remove spaces by moving subsequent characters one position back and changing case of first character to capital. It takes O(n*n) time.
* Efficient solution : We traverse given string, while traversing we copy non space character to result and whenever we encounter space, we ignore it and change next letter to capital.
* Below is code implementation
{% highlight cpp %}
// CPP program to convert given sentence
/// to camel case.
#include <bits/stdc++.h>
using namespace std;

// Function to remove spaces and convert
// into camel case
string convert(string s)
{
    int n = s.length();

    int res_ind = 0;

    for (int i = 0; i < n; i++) {

        // check for spaces in the sentence
        if (s[i] == ' ') {

            // conversion into upper case
            s[i + 1] = toupper(s[i + 1]);
            continue;
        }

        // If not space, copy character 
        else 
            s[res_ind++] = s[i];        
    }

    s[res_ind] = '\0';

    // return string to main
    return s;
}

// Driver program
int main()
{
    string str = "I get intern at geeksforgeeks";
    cout << convert(str);
    return 0;
}
{% endhighlight %}
{% highlight python %}
# Python program to convert 
# given sentence to camel case.

# Function to remove spaces 
# and convert into camel case
def convert(s):
    if(len(s) == 0):
        return
    s1 = ''
    s1 += s[0].upper()
    for i in range(1, len(s) - 1):
        if (s[i] == ' '):
            s1 += s[i + 1].upper()
            i += 1
        elif(s[i - 1] != ' '):
            s1 += s[i] 
    print(s1)     
            

# Driver Code
def main():
    s = "I get intern at geeksforgeeks"
    convert(s)
    
if __name__=="__main__":
    main() 
    
# This code is contributed
# prabhat kumar singh
{% endhighlight %}
{% highlight cpp %}
IGetInternAtGeeksforgeeks
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

