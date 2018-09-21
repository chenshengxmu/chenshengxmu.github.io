---
layout: post
title: Possibility of moving out of maze
---
* Given n integers in a maze indicating number of moves to be made from that position and a string which has “>” and “<" indicating which side to move. Starting position is first position. Print whether it stays inside the array or moves out of the array. Example:
{% highlight cpp %}
Input : 3 
        2 1 1 
        > > <       
Output: It stays inside forever
Explanation: 
It moves towards right by a position of 2, 
hence is at the last index, then it moves 
to the left by 1, and then it again moves 
to the right by 1. Hence it doesn't go
out.

Input: 2
       1 2 
       > <        
Output: comes out 
Explanation: 
Starts at 0th index, moves right by 1 
position, and then moves left by 2 to 
come out
{% endhighlight %}
* Approach to the above problem is as follows:
* We start from 0th index and move until we exceed n or decreased 0. If we reach at the same position twice then we are in an infinite loop and can never move out.
* * use mark array to mark the visited positions * start from 0th index and check the sign of move and move to that place marking that position as visited * if visited we can never move out , hence break out * check the reason of break from loop , and print the desired result.
* // below is the python implementation of the above approach
{% highlight java %}
//Java Possibility of moving out of maze
import java.io.*;

class GFG 
{
    // Function to check whether it 
    // will stay inside or come out
    static void checkingPossibility( int a[], int n, String s)
    {
           // marks all the positions that is visited
        int mark[] = new int[a[0] * n] ;
        
            // Initial starting point
            int start = 0;
        
            // initial assumption is it comes out
            int possible = 1;
        
            //runs till it is inside or comes out 
            while( start >= 0 && start < n)
            {
        
                //if the movement is towards left 
                //then we move left. The start variable 
                // and mark that position as visited
                // if not visited previously. Else we
                // break out
                if (s == "<")
                {
                    
                    if (mark[start] == 0)
                    {
                        mark[start] = 1;
                        start -= a[start] ;
                    }
        
                    // It will be inside forever
                    else{
                        possible = 0;
                        break;}
                }
                    
                // If the movement is towards right, then 
                // we move right. The start variable and 
                // mark that position as visited if not 
                // visited previously else we break out 
                else
                {
                    if (mark[start] == 0) 
                    {
                        mark[start] = 1;
                        start += a[start] ;
                    }
        
                    // it will be inside forever
                    else
                    {
                        possible = 0;
                        break;
                    }
                }
            }
                    
            if (possible == 0)
                System.out.print( "it stays inside forever");
            else
            System.out.print ("comes out");
    }
            
    // Driver code
    public static void main (String[] args) 
    {
        int n = 2;
        String s = "><";
        int a[] = {1, 2};
        checkingPossibility(a, n, s);
        
    }
}

// This code is contributed by vt_m.
{% endhighlight %}
{% highlight python %}
# Function to check whether it will stay inside 
# or come out
def checkingPossibility(a, n, s):

    # marks all the positions that is visited
    mark = [0] * n  

    # Initial starting point
    start = 0

    # initial assumption is it comes out
    possible = 1 

    # runs till it is inside or comes out 
    while start >= 0 and start < n:

        # if the movement is towards left 
        # then we move left. The start variable 
        # and mark that position as visited
        # if not visited previously. Else we
        # break out
        if s[start] == "<":
            
            if mark[start] == 0:
                mark[start] = 1 
                start -= a[start] 

            # It will be inside forever
            else:
                possible = 0 
                break
            
        # If the movement is towards right, then 
        # we move right. The start variable and 
        # mark that position as visited if not 
        # visited previously else we break out   
        else:
            if mark[start] == 0: 
                mark[start] = 1 
                start += a[start] 

            # it will be inside forever
            else:
                possible = 0 
                break 
            
    if possible == 0:
        print "it stays inside forever"
    else:
        print "comes out" 
        
# Driver code
n = 2
s = "><"
a = [1, 2]
checkingPossibility(a, n, s)
{% endhighlight %}
{% highlight cpp %}
comes out
{% endhighlight %}
* Time complexity: O(n)
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

