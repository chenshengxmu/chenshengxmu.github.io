---
layout: post
title: Maximum segment value after putting k breakpoints in a number
---
* Given a large number as string s and an integer k which denotes the number of breakpoints we must put in the number k <= string length. The task is to find maximum segment value after putting exactly k breakpoints.
* Examples:
{% highlight cpp %}
Input : s = "8754", k = 2
Output : Maximum number = 87
Explanation : We need to two breakpoints. After
putting the breakpoints, we get following options
8 75 4
87 5 4
The maximum segment value is 87.

Input : s = "999", k = 1 
Output : Maximum Segment Value = 99
Explanation : We need to one breakpoint. After
putting the breakpoint, we either get 99,9 or
9,99.
{% endhighlight %}
* One important observation is, the maximum would always be of length “string-length – k” which is the maximum value of any segment. Considering the fact, problem becomes like sliding window problem means we need to find maximum of all substrings of size (string-length – k).
{% highlight cpp %}
// CPP program to find the maximum segment
// value after putting k breaks.
#include <bits/stdc++.h>
using namespace std;

// Function to Find Maximum Number
int findMaxSegment(string &s, int k) {

  // Maximum segment length
  int seg_len = s.length() - k;

  // Find value of first segment of seg_len
  int res = 0;
  for (int i=0; i<seg_len; i++)
     res = res * 10 + (s[i] - '0');

  // Find value of remaining segments using sliding
  // window
  int seg_len_pow = pow(10, seg_len-1);
  int curr_val = res;
  for (int i = 1; i <= (s.length() - seg_len); i++) {

    // To find value of current segment, first remove
    // leading digit from previous value    
    curr_val = curr_val - (s[i-1]- '0')*seg_len_pow;

    // Then add trailing digit
    curr_val = curr_val*10 + (s[i+seg_len-1]- '0');

    res = max(res, curr_val);
  }
  return res;
}

// Driver's Function
int main() {
  string s = "8754";
  int k = 2;
  cout << "Maximum number = " << findMaxSegment(s, k);
  return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to find the maximum segment
// value after putting k breaks.
class GFG {
    
    // Function to Find Maximum Number
    static int findMaxSegment(String s, int k) {
    
        // Maximum segment length
        int seg_len = s.length() - k;
    
        // Find value of first segment of seg_len
        int res = 0;
        
        for (int i = 0; i < seg_len; i++)
            res = res * 10 + (s.charAt(i) - '0');
    
        // Find value of remaining segments using 
        // sliding window
        int seg_len_pow = (int)Math.pow(10,
                                    seg_len - 1);
        int curr_val = res;
        
        for (int i = 1; 
             i <= (s.length() - seg_len); i++) {
    
            // To find value of current segment, 
            // first remove leading digit from 
            // previous value
            curr_val = curr_val - 
            (s.charAt(i - 1) - '0') * seg_len_pow;
        
            // Then add trailing digit
            curr_val = curr_val * 10 + 
               (s.charAt(i + seg_len - 1) - '0');
        
            res = Math.max(res, curr_val);
        }
        
        return res;
    }
    
    // Driver code
    public static void main(String[] args) {
        
        String s = "8754";
        int k = 2;
        
        System.out.print("Maximum number = "
                        + findMaxSegment(s, k));
    }
}

// This code is contributed by Anant Agarwal.
{% endhighlight %}
{% highlight cpp %}
Maximum number = 87
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

