---
layout: post
title: Count of character pairs at same distance as in English alphabets
---
* Given a string, the task is to count the number of pairs whose elements are at same distances as in the English alphabets. Note : Absolute distance between characters is considered.
* Examples :
{% highlight cpp %}
Input:  str = "geeksforgeeks"
Output:  4
Explanation: In this (g, s), (e, g), (e, k), (e, g) 
are the pairs that are at same distances as
in English alphabets.

Input:  str = "observation"
Output:  4
Explanation: (b, i), (s, v), (o, n), (v, t) are 
at same distances as in English alphabets.
{% endhighlight %}
* A simple solution is to consider generate all pairs and compare pair characters with distance between them. If distance is same for a pair, then increment result.
{% highlight cpp %}
// A Simple C++ program to find pairs with distance
// equal to English alphabet distance
#include <bits/stdc++.h>
using namespace std;

// Function to count pairs
int countPairs(string str)
{
    int result = 0;
    int n = str.length();
    for (int i = 0; i < n; i++)
        for (int j = i + 1; j < n; j++)

            // Increment count if characters are at
            // same distance
            if (abs(str[i] - str[j]) == abs(i - j))
                result++;

    return result;
}

// Driver code
int main()
{
    string str = "geeksforgeeks";
    cout << countPairs(str);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// A Simple Java program to find pairs with distance
// equal to English alphabet distance
class Test {
    
    // Method to count pairs
    static int countPairs(String str)
    {
        int result = 0;
        int n = str.length();
        for (int i = 0; i < n; i++)
          for (int j = i + 1; j < n; j++)
            
            // Increment count if characters 
            // are at same distance
            if (Math.abs(str.charAt(i) - str.charAt(j)) ==
                                          Math.abs(i - j))
                result++;

        return result;
    }

    // Driver method
    public static void main(String args[])
    {
        String str = "geeksforgeeks";
        System.out.println(countPairs(str));
    }
}
{% endhighlight %}
{% highlight cpp %}
4
{% endhighlight %}
* Time complexity of above method is O(n2). The above method can be optimized by using the fact that there can be only 26 alphabets i.e. instead of checking an element upto length of string, check only from current index to 26th index.
{% highlight cpp %}
// An otpimized C++ program to find pairs with distance
// equal to English alphabet distance
#include <bits/stdc++.h>
using namespace std;
const int MAX_CHAR = 26;

// Function to count pairs with distance
// equal to English alphabet distance
int countPairs(string str)
{
    int result = 0;
    int n = str.length();

    for (int i = 0; i < n; i++)

        // This loop runs at most 26 times
        for (int j = 1; (i + j) < n && j <= MAX_CHAR; j++)
            if ((abs(str[i + j] - str[i]) == j))
                result++;

    return result;
}

// Driver code
int main()
{
    string str = "geeksforgeeks";
    cout << countPairs(str);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// An otpimized Java program to find pairs with distance
// equal to English alphabet distance

class Test {
    static final int MAX_CHAR = 26;

    // Method to count pairs with distance
    // equal to English alphabet distance
    static int countPairs(String str)
    {
        int result = 0;
        int n = str.length();

        for (int i = 0; i < n; i++)

            // This loop runs at most 26 times
            for (int j = 1; (i + j) < n && j <= MAX_CHAR; j++)
                if ((Math.abs(str.charAt(i + j) - str.charAt(i)) == j))
                    result++;

        return result;
    }

    // Driver method
    public static void main(String args[])
    {
        String str = "geeksforgeeks";
        System.out.println(countPairs(str));
    }
}
{% endhighlight %}
{% highlight cpp %}
4
{% endhighlight %}
* Time complexity of the optimized solution is O(n) under the assumption that alphabet size is constant.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

