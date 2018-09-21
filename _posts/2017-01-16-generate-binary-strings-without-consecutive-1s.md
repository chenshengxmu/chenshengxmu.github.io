---
layout: post
title: Generate all binary strings without consecutive 1's
---
* Given a integer K. Task is Print All binary string of size K (Given number).
* Examples:
{% highlight cpp %}
Input : K = 3  
Output : 000 , 001 , 010 , 100 , 101 

Input : K  = 4 
Output :0000 0001 0010 0100 0101 1000 1001 1010
{% endhighlight %}
* Idea behind that is IF string ends with ‘1’ then we put only ‘0’ at the end. IF string ends with ‘0’ then we put both ‘0’ and ‘1’ at the end of string for generating new string.
* Below is algorithm
{% highlight cpp %}
K : size of string 
First We Generate All string starts with '0'
initialize n = 1 . 
GenerateALLString ( K  , Str , n )
  a. IF n == K 
     PRINT str.
  b. IF previous character is '1' :: str[n-1] == '1'
     put str[n] = '1'
     GenerateAllString ( K , str , n+1 )
  c. IF previous character is '0' :: str[n-1] == '0'
     First We Put zero at end and call function 
      PUT  str[n] = '0'
           GenerateAllString ( K , str , n+1 )  
      PUT  str[n] = '1'
           GenerateAllString ( K , str , n+1 )

Second Generate all binary string starts with '1'
DO THE SAME PROCESS
{% endhighlight %}
* Below is recursive C++ implementation.
{% highlight cpp %}
// C++ program to Generate all binary string without
// consecutive 1's of size K
#include<bits/stdc++.h>
using namespace std ;

// A utility function generate all string without
// consecutive 1'sof size K
void generateAllStringsUtil(int K, char str[], int n)
{
    // print binary string without consecutive 1's
    if (n  == K)
    {
        // terminate binary string
        str[n] = '\0' ;
        cout << str << " ";
        return ;
    }

    // if previous character is '1' then we put
    // only 0 at end of string
    //example str = "01" then new string be "000"
    if (str[n-1] == '1')
    {
        str[n] = '0';
        generateAllStringsUtil (K , str , n+1);
    }

    // if previous character is '0' than we put
    // both '1' and '0' at end of string
    // example str = "00" then new  string "001" and "000"
    if (str[n-1] == '0')
    {
        str[n] = '0';
        generateAllStringsUtil(K, str, n+1);
        str[n] = '1';
        generateAllStringsUtil(K, str, n+1) ;
    }
}

// function generate all binary string without
// consecutive 1's
void generateAllStrings(int K )
{
    // Base case
    if (K <= 0)
        return ;

    // One by one stores every binary string of length K
    char str[K];

    // Generate all Binary string starts with '0'
    str[0] = '0' ;
    generateAllStringsUtil ( K , str , 1 ) ;

    // Generate all Binary string starts with '1'
    str[0] = '1' ;
    generateAllStringsUtil ( K , str , 1 );
}

// Driver program to test above function
int main()
{
    int K = 3;
    generateAllStrings (K) ;
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
000 001 010 100 101
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

