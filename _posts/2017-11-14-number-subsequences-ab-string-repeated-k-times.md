---
layout: post
title: Number of subsequences as "ab" in a string repeated K times
---
* Given a String S, consider a new string formed by repeating the S exactly K times. We need find the number of subsequences as “ab” in the newly formed string. Examples :
{% highlight cpp %}
Input : S = "abcb"
        K = 2
Output : 6
Here, Given string is repeated 2 times and
we get a new string "abcbabcb"
Below are 6 occurrences of "ab"
abcbabcb
abcbabcb
abcbabcb
abcbabcb
abcbabcb

Input : S = "aacbd"
        K = 1
Output : 2
{% endhighlight %}
* Naive Approach: Finding no.of subsequences of “ab” is in fact finding a pair s[i], s[j] (i < j) where s[i] = ‘a’, s[j] = ‘b’. We can do this by using two nested for loops and count the no. of pairs. We can improve this approach in a single traversal of the string. Let us consider an index j, s[j] =’b’, if we find no.of index i‘s such that s[i] = ‘a’ and i < j, then it is same as no.of subsequences of "ab" till j. This can be done by maintaining count of a’s by traversing the array and add the count to our answer at position where s[i] =’b . Time Complexity:O(|S|*K)
* Efficient Approach: Let T be the newly formed string T = s1 + s2 + s3 + ….. + sk; where si is the ith occurrence of the string s. Here, occurrence of “ab” in T are as follows: 1)”ab” lies completely in the some of occurrence of string S, so we can simply find occurrences of “ab” in Si.Let it be C. So, total no.of occurrences of “ab” in T will be C*K.
* 2) Otherwise, ”a” lies strictly inside some string Si and “b” lies inside some other string Sj, (i < j). In this way finding no.of occurrences of "ab" will be choosing two occurrences of string S from K occurrences(KC2) and multiplying it with no. of occurrences of “a” in Si and no.of occurrences of “b” in Sj. As, Si = Sj = S. Time Complexity: O(|S|), for counting no.of “a”s and no.of “b”s.
{% highlight cpp %}
// CPP code to find number of subsequences of
// "ab" in the string S which is repeated K times.
#include <bits/stdc++.h>
using namespace std;

int countOccurrences(string s, int K)
{
    int n = s.length();
    int C, c1 = 0, c2 = 0;
    for (int i = 0; i < n; i++) {
        if (s[i] == 'a')
            c1++; // Count of 'a's
        if (s[i] == 'b') {
            c2++; // Count of 'b's
            C += c1; // occurrence of "ab"s in string S
        }
    }

    // Add following two :
    // 1) K * (Occurrences of "ab" in single string)
    // 2) a is from one string and b is from other.
    return C * K + (K * (K - 1) / 2) * c1 * c2;
}

// Driver code
int main()
{
    string S = "abcb";
    int k = 2;
    cout << countOccurrences(S, k) << endl;
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java code to find number of subsequences of
// "ab" in the string S which is repeated K times.

import java.io.*;

class GFG {

    static int countOccurrences(String s, int K)
    {
        int n = s.length();
        int C = 0, c1 = 0, c2 = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'a')
                c1++; // Count of 'a's
            if (s.charAt(i) == 'b') {
                c2++; // Count of 'b's

                // occurrence of "ab"s
                // in string S
                C += c1;
            }
        }

        // Add following two :
        // 1) K * (Occurrences of "ab" in single string)
        // 2) a is from one string and b is from other.
        return C * K + (K * (K - 1) / 2) * c1 * c2;
    }

    // Driver code
    public static void main(String[] args)
    {
        String S = "abcb";
        int k = 2;

        System.out.println(countOccurrences(S, k));
    }
}

// This code is contributed by vt_m.
{% endhighlight %}
{% highlight python %}
# Python3 code to find number of 
# subsequences of "ab" in the 
# string S which is repeated K times.

def countOccurrences (s, K):
    n = len(s)
    c1 = 0
    c2 = 0
    C = 0
    for i in range(n):
        if s[i] == 'a':
            c1+= 1 # Count of 'a's
        if s[i] == 'b':
            c2+= 1 # Count of 'b's
            
            # occurrence of "ab"s in string S
            C += c1 
            
    # Add following two :
    # 1) K * (Occurrences of "ab" in single string)
    # 2) a is from one string and b is from other.
    return C * K + (K * (K - 1) / 2) * c1 * c2
    
    
# Driver code
S = "abcb"
k = 2
print (countOccurrences(S, k))

# This code is contributed by "Abhishek Sharma 44"
{% endhighlight %}
{% highlight cpp %}
6
{% endhighlight %}
* Time complexity:O(|S|).
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

