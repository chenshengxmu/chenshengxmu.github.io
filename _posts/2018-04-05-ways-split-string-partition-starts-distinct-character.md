---
layout: post
title: Ways to split string such that each partition starts with distinct character
---
* Given a string s. Let k be the maximum number of partitions possible of the given string with each partition starts with distinct character. The task is to find the number of ways string s can be split into k partition (non-empty) such that each partition start with distinct character.
* Examples:
{% highlight cpp %}
Input : s = "abb"
Output : 2
"abb" can be maximum split into 2 
partitions {a, bb} with distinct 
starting character, so k = 2. And, 
number of ways to split "abb" into 
2 partition with distinct starting 
character is 2 that are {a, bb} and
{ab, b}.

Input : s = "acbbcc"
Output : 6
{% endhighlight %}
* First we need to find the value of k. Observe that k will be equal to number of distinct characters in the string because only that number of partitions can be maximum such that each partition have distinct starting element. Now, to find the number of ways to split string into k parts with each partition starts with distinct character. First observe that first partition will always have first character of string fixed, no matter how much it is long. Now, we need to deal with all other character except the first one. Let’s take an example, say s = “acbbcc”, we have discussed about first character ‘a’ above. Now, to deal with ‘b’ and ‘c’, observe ‘b’ occurs at two positions in the string whereas ‘c’ at three. If we select any positions out of two for ‘b’ and any one position out of three for ‘c’, then, we can partition the string at those positions. Note that that number of parts will be equal to 3 (equals to number of distinct characters in s i.e k).
* So generalizing the observation, let counti be the number of occurrences of character i in s. So our answer will be product of counti of all i’s such that i occurs in the string and i is not equal to first character of the string.
* Below is the C++ implementation of this approach:
{% highlight cpp %}
// CPP Program to find number of way 
// to split string such that each partition
// starts with distinct character with 
// maximum number of partitions.
#include <bits/stdc++.h>

using namespace std;

// Returns the number of we can split
// the string
int countWays(string s)
{
    int count[26] = { 0 };

    // Finding the frequency of each
    // character.
    for (char x : s)
        count[x - 'a']++;

    // making frequency of first character
    // of string equal to 1.
    count[s[0] - 'a'] = 1;

    // Finding the product of frequency 
    // of occurrence of each character.
    int ans = 1;
    for (int i = 0; i < 26; ++i)
        if (count[i] != 0)
            ans *= count[i];

    return ans;
}

// Driven Program
int main()
{
    string s = "acbbcc";
    cout << countWays(s) << endl;
    return 0;
}
{% endhighlight %}
{% highlight cpp %}
6
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

