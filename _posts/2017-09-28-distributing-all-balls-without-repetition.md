---
layout: post
title: Distributing all balls without repetition
---
* Given N balls. For convenience, we denote color of each ball as — lowercase letter. We have to distribute N balls among K people. They will be upset, if they get two balls of the same color. We can give any number of balls to people and they won’t be upset even if they do not get any ball, but, we have to distribute all balls, such that no one will be upset — print YES, if it is possible , and NO, otherwise.
* Examples:
{% highlight cpp %}
Input : 4 2 // value of N and K
        aabb // colors of given balls
Output : YES
We can give 1st and 3rd ball to the first person,
and 2nd and 4th to the second.

Input : 6 3 // value of N and K
        aacaab // colors of given balls
Output : NO
We need to give all balls of color a, but one 
ball will stay, that's why answer is NO
{% endhighlight %}
* The approach will be really simple, we will create a count array to keep the count of each color that occurs and then we will check if any color occurs more than the number of people we have. If it occurs we will print NO else YES.
* The implementation of the above idea is given below.
{% highlight cpp %}
// CPP program to find if its possible to
// distribute balls without repitiion
#include <bits/stdc++.h>
using namespace std;

const int MAX_CHAR = 26;

// function to find if its possible to
// distribute balls or not
bool distributingBalls(int k, int n, string str)
{   
    // count array to count how many times
    // each color has occurred
    int a[MAX_CHAR] = {0};
    for (int i = 0; i < n; i++){
        
        // increasing count of each color
        // every time it appears
        a[str[i] - 'a']++;  
    }
    
    for (int i = 0; i < MAX_CHAR; i++)   

        // to check if any color appears 
        // more than K times if it does 
        // we will print NO
        if (a[i] > k) 
          return false;

    return true;
}

// Driver code
int main()
{
    long long int n = 6, k = 3;
    string str = "aacaab";

    if (distributingBalls(k, n, str))
        cout << "YES";
    else
        cout << "NO";
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to find if its possible
// to distribute balls without repitiio
import java.io.*;

public class GFG {

    static int MAX_CHAR = 26;
    
    // function to find if its possible
    // to distribute balls or not
    static boolean distributingBalls(long k,
                         long n, String str)
    { 
        
        // count array to count how many
        // times each color has occurred
        int []a = new int[MAX_CHAR];
        
        for (int i = 0; i < n; i++)
        {
            
            // increasing count of each
            // color every time it appears
            a[str.charAt(i) - 'a']++; 
        }
        
        for (int i = 0; i < MAX_CHAR; i++) 
    
            // to check if any color appears 
            // more than K times if it does 
            // we will print NO
            if (a[i] > k) 
                return false;
    
        return true;
    }
    
    // Driver code
    static public void main (String[] args)
    {
        long n = 6, k = 3;
        String str = "aacaab";
    
        if (distributingBalls(k, n, str))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

// This code is contributed by vt_m.
{% endhighlight %}
{% highlight cpp %}
NO
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

