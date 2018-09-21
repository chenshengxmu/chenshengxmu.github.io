---
layout: post
title: Find the arrangement of queue at given time
---
* n people are standing in a queue to buy entry ticket for the carnival. People present there strongly believe in chivalry. Therefore, at time = t, if a man at position x, finds a woman standing behind him then he exchanges his position with her and therefore, at time = t+1, woman is standing at position x while man is standing behind her. Given the total number of people standing in a queue as n, particular instant of time as t and the initial arrangement of the queue in the form of a string containing ‘M’ representing man at position i and ‘W’ representing woman is at position i, find out the arrangement of the queue at time = t.
* Examples :
{% highlight cpp %}
Input : n = 6, t = 2
       BBGBBG
Output: GBBGBB
Explanation:
At t = 1, 'B' at position 2 will swap
with 'G' at position 3 and 'B' at 
position 5 will swap with 'G' at 
position 6. String after t = 1 changes 
to "BGBBGB". Now at t = 2, 'B' at
position = 1 will swap with 'G' at 
position = 2 and 'B' at position = 4 
will swap with 'G' at position 5. 
String changes to "GBBGBB". Since, 
we have to display arrangement at
t = 2, the current arrangement is 
our answer. 

Input : n = 8, t = 3
       BBGBGBGB
Output: GGBGBBBB
{% endhighlight %}
* Approach: Traverse the entire string at every moment of time from 1 to t and if we find pairwise “BG” then swap them and move to check the next pair.
* Below is the implementation of above approach:
{% highlight cpp %}
// CPP program to find the arrangement
// of queue at time = t
#include <bits/stdc++.h>
using namespace std;

// prints the arrangement at time = t
void solve(int n, int t, string s)
{
    // Checking the entire queue for 
    // every moment from time = 1 to
    // time = t.
    for (int i = 0; i < t; i++) 
        for (int j = 0; j < n - 1; j++) 
        
            /*If current index contains 'B' 
              and next index contains 'G' 
              then swap*/
            if (s[j] == 'B' && s[j + 1] == 'G') {
                char temp = s[j];
                s[j] = s[j + 1];
                s[j + 1] = temp;
                j++;
            }
            
    cout << s;
}

// Driver function for the program
int main()
{
    int n = 6, t = 2;
    string s = "BBGBBG";
    solve(n, t, s);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to find the arrangement
// of queue at time = t
import java.io.*;

class Geek {
    
    // prints the arrangement at time = t
    static void solve(int n, int t, char s[])
    {
        // Checking the entire queue for 
        // every moment from time = 1 to 
        // time = t.
        for (int i = 0; i < t; i++) 
            for (int j = 0; j < n - 1; j++) 
            
                /*If current index contains 'B' 
                  and next index contains 'G' 
                  then swap.*/
                if (s[j] == 'B' && s[j + 1] == 'G') {
                    char temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                    j++;
                }
                
        System.out.print(s);
    }
    
    // Driver function
    public static void main(String args[])
    {
        int n = 6, t = 2;
        String s = "BBGBBG";
        char str[] = s.toCharArray();
        solve(n, t, str);
    }
}
{% endhighlight %}
{% highlight python %}
# Python program to find 
# the arrangement of 
# queue at time = t

# prints the arrangement
# at time = t
def solve(n, t, p) :
    
    s = list(p)
    
    # Checking the entire 
    # queue for every
    # moment from time = 1
    # to time = t.
    for i in range(0, t) :
    
        for j in range(0, n - 1) :     
        
            # If current index 
            # contains 'B' and
            # next index contains 
            # 'G' then swap
            if (s[j] == 'B' and
                s[j + 1] == 'G') :
                
                temp = s[j];
                s[j] = s[j + 1];
                s[j + 1] = temp;
                j = j + 1    
                
    print (''.join(s))

# Driver code
n = 6
t = 2
p = "BBGBBG"
solve(n, t, p)

# This code is contributed by 
# Manish Shaw(manishshaw1)
{% endhighlight %}
{% highlight cpp %}
GBBGBB
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

