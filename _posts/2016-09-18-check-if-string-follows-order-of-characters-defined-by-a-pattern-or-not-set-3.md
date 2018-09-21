---
layout: post
title: Check if string follows order of characters defined by a pattern or not | Set 3
---
* Given an input string and a pattern, check if characters in the input string follows the same order as determined by characters present in the pattern. Assume there won’t be any duplicate characters in the pattern.
* Examples:
{% highlight cpp %}
Input: string = "engineers rock", pattern = "er";
Output: true
All 'e' in the input string are before all 'r'.

Input: string = "engineers rock", pattern = "egr";
Output: false
There are two 'e' after 'g' in the input string.

Input: string = "engineers rock", pattern = "gsr";
Output: false
There are one 'r' before 's' in the input string.
{% endhighlight %}
* We have discussed two approaches to solve this problem. Check if string follows order of characters defined by a pattern or not | Set 1 Check if string follows order of characters defined by a pattern or not | Set 2
* In this approach we first assign a label (or order) to characters of pattern. The labels are assigned in increasing order.
* For example, the pattern “gsr” is labeled as following
{% highlight cpp %}
"g" => 1
"s" => 2
"r" => 3
{% endhighlight %}
* It means ‘g’ will come first, then ‘s’, then ‘r’
* After assigning labels to pattern characters, we iterate through string characters. While traversing, we keep track of label (or order) of last visited character. If label of current character is less than previous character, we return false. Otherwise we update last label. If all characters follow order, we return true.
* Below is the C++ implementation
{% highlight cpp %}
// C++ program to find if a string follows order
// defined by a given pattern.
#include <bits/stdc++.h>
using namespace std;

const int CHAR_SIZE = 256;

// Returns true if characters of str follow
// order defined by a given ptr.
bool checkPattern(string str, string pat)
{
    // Initialize all orders as -1
    vector<int> label(CHAR_SIZE, -1);

    // Assign an order to pattern characters
    // according to their appearance in pattern
    int order = 1;
    for (int i = 0; i < pat.length() ; i++)
    {
        // give the pattern characters order
        label[pat[i]] = order;

        // increment the order
        order++;
    }

    //  Now one by check if string characters
    // follow above order
    int last_order = -1;
    for (int i = 0; i < str.length(); i++)
    {
        if (label[str[i]] != -1)
        {
            // If order of this character is less
            // than order of previous, return false.
            if (label[str[i]] < last_order)
                return false;

            // Update last_order for next iteration
            last_order =  label[str[i]];
        }
    }

    // return that str followed pat
    return true;
}

// Driver code
int main()
{
    string str = "engineers rock";
    string pattern = "gsr";

    cout << boolalpha << checkPattern(str, pattern);

    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
false
{% endhighlight %}
* Time Complexity of this program is O(n) with constant extra space (the array label is of constant size, 256).
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

