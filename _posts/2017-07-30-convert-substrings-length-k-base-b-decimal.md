---
layout: post
title: Convert all substrings of length 'k' from base 'b' to decimal
---
* A string defining a valid number is given. Output all the base conversions of substrings of length ‘k’ from base ‘b’ to base 10.
* Examples:
{% highlight cpp %}
Input :  str = "12212", 
      k = 3, b = 3.
Output : 17 25 23
Explanation :
All the substrings of length 'k' are : 122, 221, 212.
Base conversion can be computed using the formula.
{% endhighlight %}
* Method 1 (Simple)
* A simple approach is to use simple base conversion technique. For a base b number str, its decimal equivalent is str[0]*b0 + str[1]*b1 + str[2]*b2 + … + str[n-1]*bn-1
{% highlight cpp %}
// Simple C++ program to convert all substrings from
// decimal to given base.
#include <bits/stdc++.h>
using namespace std;

int substringConversions(string str, int k, int b)
{
    for (int i=0; i + k <= str.size(); i++)
    {
        // Saving substring in sub
        string sub = str.substr(i, k);        
        
        // Evaluating decimal for current substring
        // and printing it.
        int sum = 0, counter = 0;
        for (int i = sub.size() - 1; i >= 0; i--)
        {
            sum = sum + ((sub.at(i) - '0') * pow(b, counter));
            counter++;
        }        
        cout << sum << " ";
    }
}

// Driver code
int main()
{
    string str = "12212";
    int b = 3, k = 3;
    substringConversions(str, b, k);    
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
17 25 23
{% endhighlight %}
* Time Complexity : O(n*k)
* Method 2 (Using sliding window)
* We can use Sliding Window technique to solve it in linear time. Every time we slide the window, we will subtract the weight of first element i.e. (element * pow(b, k-1) ). Now multiplying the previous sum with ‘b’ will increase weight of every element 3 times which is required. Also we will simply add the new element in window because its weight will be element * pow(b, 0).
* Below is the C++ implementation :
{% highlight cpp %}
// Efficient C++ program to convert all substrings from
// decimal to given base.
#include <bits/stdc++.h>
using namespace std;

int substringConversions(string str, int k, int b)
{
   int i = 0, sum = 0, counter = k-1;

    // Computing the decimal of first window
    for (i; i < k; i++)
    {
        sum = sum + ((str.at(i) - '0') * pow(b, counter));
        counter--;
    }
    cout << sum << " ";
    
    // prev stores the pervious decimal
    int prev = sum;
           
    // Computing decimal equivalents of all other windows
    sum = 0, counter = 0;
    for (i; i < str.size(); i++)
    {
        // Subtracting weight of the element pushed out of window
        sum = prev - ((str.at(i - k) - '0') * pow(b, k-1));
        
        // Multiplying the decimal by base to formulate other window 
        sum = sum * b;
        
        // Adding the new element of window to sum
        sum = sum + (str.at(i) - '0');
        
        // Decimal of current window
        cout << sum << " ";
        
        // Updating prev
        prev = sum;
        
        counter++;
    }
}

// Driver code
int main()
{
    string str = "12212";
    int b = 3, k = 3;
    substringConversions(str, b, k);    
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
17 25 23
{% endhighlight %}
* Time Complexity : O(n)
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

