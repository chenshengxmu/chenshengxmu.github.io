---
layout: post
title: Generate all binary permutations such that there are more or equal 1's than 0's before every point in all permutations
---
* Generate all permutations of given length such that every permutation has more or equal 1’s than 0’s in all prefixes of the permutation.
* Examples:
{% highlight cpp %}
Input: len = 4
Output: 1111 1110 1101 1100 1011 1010
Note that a permutation like 0101 can not be in output because
there are more 0's from index 0 to 2 in this permutation.

Input: len = 3
Output: 111 110 101

Input: len = 2
Output: 11 10
{% endhighlight %}
* We strongly recommend to minimize the browser and try this yourself first.
* Like permutation generation problems, recursion is the simplest approach to solve this. We start with an empty string, attach 1 to it and recur. While recurring, if we find more 1’s at any point, we append a 0 and make one more recursive call.
{% highlight cpp %}
// C++ program to generate all permutations of 1's and 0's such that
// every permutation has more 1's than 0's at all indexes.
#include <iostream>
#include <cstring>
using namespace std;

// ones & zeroes --> counts of 1's and 0's in current string 'str'
// len ---> desired length of every permutation
void generate(int ones, int zeroes, string str, int len)
{
    // If length of current string becomes same as desired length
    if (len == str.length())
    {
        cout << str << "  ";
        return;
    }

    // Append a 1 and recur
    generate(ones+1, zeroes, str+"1", len);

    // If there are more 1's, append a 0 as well, and recur
    if (ones > zeroes)
        generate(ones, zeroes+1, str+"0", len);
}

// Driver program to test above function
int main()
{
    string str = "";
    generate(0, 0, str, 4);
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
1111  1110  1101  1100  1011  1010
{% endhighlight %}
* This article is contributed by Sachin. Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above

