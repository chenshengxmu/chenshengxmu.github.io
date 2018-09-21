---
layout: post
title: Minimum Swaps for Bracket Balancing
---
* You are given a string of 2N characters consisting of N ‘[‘ brackets and N ‘]’ brackets. A string is considered balanced if it can be represented in the for S2[S1] where S1 and S2 are balanced strings. We can make an unbalanced string balanced by swapping adjacent characters. Calculate the minimum number of swaps necessary to make a string balanced.
* Examples:
{% highlight cpp %}
Input  : []][][
Output : 2
First swap: Position 3 and 4
[][]][
Second swap: Position 5 and 6
[][][]

Input  : [[][]]
Output : 0
String is already balanced.
{% endhighlight %}
* We can solve this problem using greedy strategies. If the first X characters form a balanced string, we can neglect these characters and continue on. If we encounter a ‘]’ before the required ‘[‘, then we must start swapping elements to balance the string.
* Naive Approach Initialize sum = 0 where sum stores result. Go through the string maintaining a count of the number of ‘[‘ brackets encountered. Reduce this count when we encounter a ‘]’ character. If the count hits negative, then we must start balancing the string. Let index ‘i’ represents the position we are at. We now move forward to the next ‘[‘ at index j. Increase sum by j – i. Move the ‘[‘ at position j, to position i, and shift all other characters to the right. Set the count back to 0 and continue traversing the string. At the end ‘sum’ will have the required value.
* Time Complexity = O(N^2) Extra Space = O(1)
* Optimized approach We can initially go through the string and store the positions of ‘[‘ in a vector say ‘pos‘. Initialize ‘p’ to 0. We shall use p to traverse the vector ‘pos’. Similar to the naive approach, we maintain a count of encountered ‘[‘ brackets. When we encounter a ‘[‘ we increase the count, and increase ‘p’ by 1. When we encounter a ‘]’ we decrease the count. If the count ever goes negative, this means we must start swapping. The element pos[p] tells us the index of the next ‘[‘. We increase the sum by pos[p] – i, where i is the current index. We can swap the elements in the current index and pos[p] and reset count to 0.
* Since we have converted a step that was O(N) in the naive approach, to an O(1) step, our new time complexity reduces. Time Complexity = O(N) Extra Space = O(N)
{% highlight cpp %}
// Program to count swaps required to balance string
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

// Function to calculate swaps required
long swapCount(string s)
{
    // Keep track of '['
    vector<int> pos;
    for (int i = 0; i < s.length(); ++i)
        if (s[i] == '[')
            pos.push_back(i);

    int count = 0; // To count number of encountered '['
    int p = 0;  // To track position of next '[' in pos
    long sum = 0; // To store result

    for (int i = 0; i < s.length(); ++i)
    {
        // Increment count and move p to next position
        if (s[i] == '[')
        {
            ++count;
            ++p;
        }
        else if (s[i] == ']')
            --count;

        // We have encountered an unbalanced part of string
        if (count < 0)
        {
            // Increment sum by number of swaps required
            // i.e. position of next '[' - current position
            sum += pos[p] - i;
            swap(s[i], s[pos[p]]);
            ++p;

            // Reset count to 1
            count = 1;
        }
    }
    return sum;
}

// Driver code
int main()
{
    string s = "[]][][";
    cout << swapCount(s) << "\n";

    s = "[[][]]";
    cout << swapCount(s) << "\n";
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
2
0
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

