---
layout: post
title: Minimal operations to make a number magical
---
* Given a 6 digit number, calculate the minimum number of digits that needs to be replaced in order to make the number magical. The number is considered magical if the sum of first three digits equals to the sum of last three digits. In one operation, we can choose a digit at any position and replace it with any arbitrary digit.
* Examples :
{% highlight cpp %}
Input: 123456 
Output: 2 
Explanation : Replace 4 with 0 and 5 with 0,
              then number = 123006, where 
              1 + 2 + 3 = 0 + 0 + 6,
              hence number of replacements
              done = 2  

Input: 111000
Output: 1
Explanation: Replace 0 with 3, then 
             number = 111030, where 
             1 + 1 + 1 = 0 + 3 + 0,
             hence number of replacements
             done = 1
{% endhighlight %}
* Approach : The best approach will be to check with all the magical numbers and the number of replacements needed. Run a loop that generates all 6 digit numbers. Check if that number is magical, if it is then simply calculate the number of replacements needs to be done and compare with the ans, if it is smaller then make it the the ans and at the end return ans.
* Below is the implementation of the above approach.
{% highlight cpp %}
// CPP program to make a number magical
#include "bits/stdc++.h"
using namespace std;

// function to calculate the minimal changes
int calculate(string s)
{
    // maximum digits that can be changed
    int ans = 6;

    // nested loops to generate all 6 
    // digit numbers
    for (int i = 0; i < 10; ++i) {
        for (int j = 0; j < 10; ++j) {
            for (int k = 0; k < 10; ++k) {
                for (int l = 0; l < 10; ++l) {
                    for (int m = 0; m < 10; ++m) {
                        for (int n = 0; n < 10; ++n) {
                            if (i + j + k == l + m + n) {
                                
                                // counter to count the number
                                // of change required
                                int c = 0;
                                
                                // if first digit is equal
                                if (i != s[0] - '0') 
                                    c++;
                                    
                                // if 2nd digit is equal    
                                if (j != s[1] - '0') 
                                    c++;
                                
                                // if 3rd digit is equal    
                                if (k != s[2] - '0') 
                                    c++;
                                
                                // if 4th digit is equal    
                                if (l != s[3] - '0') 
                                    c++;
                                    
                                // if 5th digit is equal    
                                if (m != s[4] - '0') 
                                    c++;
                                    
                                // if 6th digit is equal    
                                if (n != s[5] - '0') 
                                    c++;

                                // checks if less then the
                                // previous calculate changes
                                if (c < ans)
                                    ans = c;
                            }
                        }
                    }
                }
            }
        }
    }
    
    // returns the answer
    return ans;
}

// driver program to test the above function
int main()
{
    // number stored in string
    string s = "123456";

    // prints the minimum operations
    cout << calculate(s);
}
{% endhighlight %}
{% highlight java %}
// java program to make a number magical
import java.io.*;
 
class GFG {

// function to calculate the minimal changes
static int calculate(String s)
{
    // maximum digits that can be changed
    int ans = 6;

    // nested loops to generate 
    // all 6 digit numbers
    for (int i = 0; i < 10; ++i) {
        for (int j = 0; j < 10; ++j) {
            for (int k = 0; k < 10; ++k) {
                for (int l = 0; l < 10; ++l) {
                    for (int m = 0; m < 10; ++m) {
                        for (int n = 0; n < 10; ++n) {
                            if (i + j + k == l + m + n) {
                                
                                // counter to count the number
                                // of change required
                                int c = 0;
                                
                                // if first digit is equal
                                if (i != s.charAt(0) - '0') 
                                    c++;
                                    
                                // if 2nd digit is equal 
                                if (j != s.charAt(1) - '0') 
                                    c++;
                                
                                // if 3rd digit is equal 
                                if (k != s.charAt(2) - '0') 
                                    c++;
                                
                                // if 4th digit is equal 
                                if (l != s.charAt(3) - '0') 
                                    c++;
                                    
                                // if 5th digit is equal 
                                if (m != s.charAt(4) - '0') 
                                    c++;
                                    
                                // if 6th digit is equal 
                                if (n != s.charAt(5) - '0') 
                                    c++;

                                // checks if less then the
                                // previous calculate changes
                                if (c < ans)
                                    ans = c;
                            }
                        }
                    }
                }
            }
        }
    }
    
    // returns the answer
    return ans;
}

   // Driver code
    static public void main (String[] args)
    {
        // number stored in string
        String s = "123456";

        // prints the minimum operations
        System.out.println(calculate(s));
    }
}

// This code is contributed by vt_m.
{% endhighlight %}
{% highlight cpp %}
2
{% endhighlight %}
* Time complexity : O( 10^6) Auxiliary Space : O(1)
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

