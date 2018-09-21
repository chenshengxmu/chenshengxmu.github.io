---
layout: post
title: Print N-bit binary numbers having more 1’s than 0’s in all prefixes
---
* Given a positive integer n, print all n-bit binary numbers having more 1’s than 0’s for any prefix of the number.
* Examples:
{% highlight cpp %}
Input : n = 2
Output : 11 10

Input : n = 4
Output : 1111 1110 1101 1100 1011 1010
{% endhighlight %}
* A simple but not efficient solution will be to generate all N-bit binary numbers and print those numbers that satisfy the conditions. The time complexity of this solution is exponential.
* An efficient solution is to generate only those N-bit numbers that satisfy the given conditions. We use recursion. At each point in the recursion, we append 0 and 1 to the partially formed number and recur with one less digit.
{% highlight cpp %}
// CPP program to print all N-bit binary
#include <bits/stdc++.h>
using namespace std;

/* function to generate n  digit numbers*/
void printRec(string number, int extraOnes, 
                       int remainingPlaces)
{
    /* if number generated */
    if (0 == remainingPlaces) {
        cout << number << " ";
        return;
    }

    /* Append 1 at the current number and reduce 
       the remaining places by one */
    printRec(number + "1", extraOnes + 1, 
                           remainingPlaces - 1);

    /* If more ones than zeros, append 0 to the 
       current number and reduce the remaining 
       places by one*/
    if (0 < extraOnes) 
        printRec(number + "0", extraOnes - 1, 
                            remainingPlaces - 1);    
}

void printNums(int n)
{
    string str = "";
    printRec(str, 0, n);
}

/*driver function*/
int main()
{
    int n = 4;
    printNums(n);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// java program to print all N-bit binary
import java.io.*;

class GFG 
{
    // function to generate n digit numbers
    static void printRec(String number, int extraOnes, 
                                   int remainingPlaces)
    {
        // if number generated 
        if (0 == remainingPlaces) 
        {
            System.out.print( number +" ");
            return;
        }
    
        // Append 1 at the current number and  
        // reduce the remaining places by one 
        printRec(number + "1", extraOnes + 1, 
                            remainingPlaces - 1);
    
        // If more ones than zeros, append 0 to the 
        // current number and reduce the remaining 
        // places by one
        if (0 < extraOnes) 
            printRec(number + "0", extraOnes - 1, 
                            remainingPlaces - 1); 
    }
    
    static void printNums(int n)
    {
        String str = "";
        printRec(str, 0, n);
    }
    
    // Driver function
    public static void main (String[] args) 
    {
        int n = 4;
        printNums(n);
    
    }
}

// This code is contributed by vt_m
{% endhighlight %}
* Output:
{% highlight cpp %}
1111 1110 1101 1100 1011 1010
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

