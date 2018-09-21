---
layout: post
title: Program to sort string in descending order
---
* Given a string, sort it in descending order.
* Examples:
{% highlight cpp %}
Input : alkasingh
Output : snlkihgaa 

Input : nupursingh
Output : uusrpnnihg 

Input : geeksforgeeks
Output : ssrokkggfeeee
{% endhighlight %}
* A simple solution is to use library sort function std::sort()
{% highlight cpp %}
// CPP program to sort a string in descending
// order using library function
#include <bits/stdc++.h>
using namespace std;

void descOrder(string s)
{
    sort(s.begin(), s.end(), greater<char>());
}

int main()
{
    string s = "geeksforgeeks";
    descOrder(s); // function call
    return 0;
}
{% endhighlight %}
{% highlight python %}
# Python program to sort
# a string in descending
# order using library function

def descOrder(s):
    s.sort(reverse = True)
    str1 = ''.join(s)
    print(str1)

def main():
    s = list('geeksforgeeks')
    
    # function call
    descOrder(s)

if __name__=="__main__":
    main()

# This code is contributed by
# prabhat kumar singh
{% endhighlight %}
{% highlight cpp %}
ssrokkggfeeee
{% endhighlight %}
* The time complexity is : O(n log n)
* An efficient approach will be to observe first that there can be a total of 26 unique characters only. So, we can store the count of occurrences of all the characters from ‘a’ to ‘z’ in a hashed array. The first index of the hashed array will represent character ‘a’, second will represent ‘b’ and so on. Finally, we will simply traverse the hashed array and print the characters from ‘z’ to ‘a’ the number of times they occurred in input string.
* Below is the implementation of above idea:
{% highlight cpp %}
// C++ program to sort a string of characters
// in descending order
#include <bits/stdc++.h>
using namespace std;

const int MAX_CHAR = 26;

// function to print string in sorted order
void sortString(string& str)
{
    // Hash array to keep count of characters.
    // Initially count of all charters is
    // initialized to zero.
    int charCount[MAX_CHAR] = { 0 };

    // Traverse string and increment
    // count of characters
    for (int i = 0; i < str.length(); i++)

        // 'a'-'a' will be 0, 'b'-'a' will be 1,
        // so for location of character in count
        // array we wil do str[i]-'a'.
        charCount[str[i] - 'a']++;

    // Traverse the hash array and print
    // characters
    for (int i = MAX_CHAR - 1; i >= 0; i--)
        for (int j = 0; j < charCount[i]; j++)
            cout << (char)('a' + i);
}

// Driver program to test above function
int main()
{
    string s = "alkasingh";
    sortString(s);
    return 0;
}
{% endhighlight %}
{% highlight cpp %}
snlkihgaa
{% endhighlight %}
* Time Complexity: O( n ), where n is the length of input string. Auxiliary Space: O( 1 ).
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

