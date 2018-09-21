---
layout: post
title: Lexicographically largest subsequence such that every character occurs at least k times
---
* Given a string S and an integer K. The task is to find lexicographically largest subsequence of S, say T, such that every character in T must occur at least K times.
* Examples:
{% highlight cpp %}
Input : S = "banana", K = 2.
Output : nn
Possible subsequence where each character exists at least 2 times are:

From the above subsequences, "nn" is the lexicographically largest.
{% endhighlight %}
* The idea is to solve greedily the above problem. If we want to make the subsequence lexicographically largest, we must give priority to lexicographically larger characters. ‘z’ is the largest character, let suppose z occurs fz times in S. If fz >= K, append ‘z’z k times in the string T and keep removing characters from the left of S until all the z’s are removed. Apply the strategy with ‘y’, ‘w’, ….., ‘a’. In the end you will find the answer.
* Let see an example. Suppose S = “zzwzawa” and K = 2. Start with the largest character ‘z’. Here fz = 3 >= K. So T will become “zzz” and we will remove letters from the left of S until all the z’s are removed. So now S will became “awa”. Next largest is ‘y’ but that occurs 0 times in k so we will skip it. We will skip ‘w’, ‘v’ etc also until we go to ‘a’ which occurs 2 times. Now T will become “zzzaa” and S will become a empty string. Our answer is “zzzaa”.
* Below is C++ implementation of this approach:
{% highlight cpp %}
// C++ program to find lexicographically largest
// subsequence where every character appears at
// least k times.
#include <bits/stdc++.h>
using namespace std;

// Find lexicographically largest subsequence of
// s[0..n-1] such that every character appears 
// at least k times. The result is filled in t[]
void subsequence(char s[], char t[], int n, int k)
{
    int last = 0, cnt = 0, new_last = 0, size = 0;

    // Starting from largest charter 'z' to 'a'
    for (char ch = 'z'; ch >= 'a'; ch--) {
        cnt = 0;

        // Counting the frequency of the character
        for (int i = last; i < n; i++) {
            if (s[i] == ch)
                cnt++;
        }

        // If frequency is greater than k
        if (cnt >= k) {

            // From the last point we leave
            for (int i = last; i < n; i++) {

                // check if string contain ch
                if (s[i] == ch) {

                    // If yes, append to output string
                    t[size++] = ch;
                    new_last = i;
                }
            }

            // Update the last point.
            last = new_last;
        }
    }
    t[size] = '&#092;&#048;';
}

// Driver code
int main()
{
    char s[] = "banana";
    int n = sizeof(s);
    int k = 2;
    char t[n];
    subsequence(s, t, n - 1, k);
    cout << t << endl;
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
nn
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

