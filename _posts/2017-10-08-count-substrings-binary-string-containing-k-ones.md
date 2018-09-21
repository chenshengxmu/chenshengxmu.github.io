---
layout: post
title: Count of substrings of a binary string containing K ones
---
* Given a binary string of length N and an integer K, we need to find out how many substrings of this string are exist which contains exactly K ones.
* Examples:
{% highlight cpp %}
Input : s = “10010”
        K = 1
Output : 9
The 9 substrings containing one 1 are,
“1”, “10”, “100”, “001”, “01”, “1”, 
“10”, “0010” and “010”
{% endhighlight %}
* In this problem we need to find count of substrings which contains exactly K ones or in other words sum of digits in those substring is K. We first create a prefix sum array and loop over that and stop when sum value is greater than or equal to K. Now if sum at current index is (K + a) then we know that substring sum, from all those indices where sum is (a), till current index will be K, so count of indices having sum (a), will be added to result. This procedure is explained with an example below,
{% highlight cpp %}
string s = “100101”
K = 2
prefix sum array = [1, 1, 1, 2, 2, 3]

So, at index 3,    we have prefix sum 2, 
Now total indices from where sum is 2, is 1
so result = 1

Substring considered = [“1001”]
At index 4,        we have prefix sum 2,
Now total indices from where sum is 2, is 
1 so result = 2

Substring considered = [“1001”, “10010”]
At index 5,     we have prefix sum 3,
Now total indices from where sum is 2, 
is 3 so result = 5
Substring considered = [“1001”, “10010”, 
“00101”, “0101”, “101”]
{% endhighlight %}
* So we need to track two things, prefix sum and frequency of particular sum. In below code, instead of storing complete prefix sum, only prefix sum at current index is stored using one variable and frequency of sums in stored in an array. Total time complexity of solution is O(N).
{% highlight cpp %}
// C++ program to find count of substring containing 
// exactly K ones
#include <bits/stdc++.h>
using namespace std;

// method returns total number of substring having K ones
int countOfSubstringWithKOnes(string s, int K)
{
    int N = s.length();
    int res = 0;
    int countOfOne = 0;
    int freq[N + 1] = {0};

    // initialize index having zero sum as 1
    freq[0] = 1;

    // loop over binary characters of string
    for (int i = 0; i < N; i++) {

        // update countOfOne variable with value
        // of ith character
        countOfOne += (s[i] - '0');

        // if value reaches more than K, then 
        // update result
        if (countOfOne >= K) {

            // add frequency of indices, having
            // sum (current sum - K), to the result
            res += freq[countOfOne - K];
        }

        // update freqency of one's count
        freq[countOfOne]++;
    }
    return res;
}

// Driver code to test above methods
int main()
{
    string s = "10010";
    int K = 1;
    cout << countOfSubstringWithKOnes(s, K) << endl;
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to find count of substring
// containing exactly K ones
import java.io.*;

public class GFG {

    // method returns total number of
    // substring having K ones
    static int countOfSubstringWithKOnes(
                            String s, int K)
    {
        int N = s.length();
        int res = 0;
        int countOfOne = 0;
        int []freq = new int[N+1];
    
        // initialize index having zero
        // sum as 1
        freq[0] = 1;
    
        // loop over binary characters
        // of string
        for (int i = 0; i < N; i++) {
    
            // update countOfOne variable
            // with value of ith character
            countOfOne += (s.charAt(i) - '0');
    
            // if value reaches more than
            // K, then update result
            if (countOfOne >= K) {
    
                // add frequency of indices,
                // having sum (current sum - K),
                // to the result
                res += freq[countOfOne - K];
            }
    
            // update freqency of one's count
            freq[countOfOne]++;
        }
        
        return res;
    }
    
    // Driver code to test above methods
    static public void main (String[] args)
    {
        String s = "10010";
        int K = 1;
        
        System.out.println(
            countOfSubstringWithKOnes(s, K));
    }
}

// This code is contributed by vt_m.
{% endhighlight %}
{% highlight cpp %}
9
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

