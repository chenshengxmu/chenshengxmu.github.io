---
layout: post
title: Given a number as a string, find the number of contiguous subsequences which recursively add up to 9 | Set 2
---
* Given a number as a string, write a function to find the number of substrings (or contiguous subsequences) of the given string which recursively add up to 9.
* For example digits of 729 recursively add to 9, 7 + 2 + 9 = 18 Recur for 18 1 + 8 = 9
* Examples:
{% highlight cpp %}
Input: 4189
Output: 3
There are three substrings which recursively 
add to 9. The substrings are 18, 9 and 189.

Input: 909
Output: 5
There are 5 substrings which recursively add 
to nine, 9, 90, 909, 09, 9
{% endhighlight %}
* This article is about an optimized solution of problem stated below article : Given a number as a string, find the number of contiguous subsequences which recursively add up to 9 | Set 1.
* All digits of a number recursively add up to 9, if only if the number is multiple of 9. We basically need to check for s%9 for all substrings s. One trick used in below program is to do modular arithmetic to avoid overflow for big strings.
* Algorithm:
{% highlight cpp %}
Initialize an array d of size 10 with 0
d[0]<-1
Initialize mod_sum = 0, continuous_zero = 0
for every character
    if character == '0';
        continuous_zero++
    else
        continuous_zero=0
    compute mod_sum
    update result += d[mod_sum]
    update d[mod_sum]++
    subtract those cases from result which have only 0s
{% endhighlight %}
* Explanation: If sum of digits from index i to j add up to 9, then sum(0 to i-1) = sum(0 to j) (mod 9). We just have to remove cases which contain only zeroes.We can do this by remembring the no. of continuous zeroes upto this character(no. of these cases ending on this index) and subtracting them from the result.
* Following is a simple implementation based on this approach. The implementation assumes that there are can be leading 0’s in the input number.
{% highlight cpp %}
// C++ program to count substrings with recursive sum equal to 9
#include <iostream>
#include <cstring>
using namespace std;

int count9s(char number[])
{
    int n = strlen(number);

    // to store no. of previous encountered modular sums
    int d[9];
    memset(d, 0, sizeof(d));

    // no. of modular sum(==0) encountered till now = 1
    d[0] = 1;
    int result = 0;

    int mod_sum = 0, continuous_zero = 0;
    for (int i = 0; i < n; i++) {
        if (!int(number[i] - '0')) // if number is 0 increase
            continuous_zero++;     // no. of continuous_zero by 1
        else                       // else continuous_zero is 0
            continuous_zero=0;
        mod_sum += int(number[i] - '0');
        mod_sum %= 9;
        result+=d[mod_sum];
        d[mod_sum]++;      // increase d value of this mod_sum
                          // subtract no. of cases where there 
                          // are only zeroes in substring
        result -= continuous_zero;
    }
    return result;
}

// driver program to test above function
int main()
{
    cout << count9s("01809") << endl;
    cout << count9s("1809") << endl;
    cout << count9s("4189");
    return 0;
}
// This code is contributed by Gulab Arora
{% endhighlight %}
* Output:
{% highlight cpp %}
8
5
3
{% endhighlight %}
* Time Complexity of the above program is O(n). Program also supports leading zeroes.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

