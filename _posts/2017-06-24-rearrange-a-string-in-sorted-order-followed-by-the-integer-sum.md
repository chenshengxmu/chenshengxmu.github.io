---
layout: post
title: Rearrange a string in sorted order followed by the integer sum
---
* Given a string containing uppercase alphabets and integer digits (from 0 to 9), the task is to print the alphabets in the order followed by the sum of digits.
* Examples:
{% highlight cpp %}
Input : AC2BEW3
Output : ABCEW5
Alphabets in the lexicographic order 
followed by the sum of integers(2 and 3).
{% endhighlight %}
* Asked in : Facebook
{% highlight cpp %}
Implementation:
1- Start traversing the given string.
   a) If an alphabet comes increment its
      occurrence count into a hash_table.
   b) If an integer comes then store it 
      separately by summing up everytime.
2- Using hash_table append all the 
   characters first into a string and 
   then at the end, append the integers 
   sum.
3- Return the resultant string.
{% endhighlight %}
{% highlight cpp %}
// C++ program for above implementation
#include<bits/stdc++.h>
using namespace std;
const int MAX_CHAR = 26;

// Function to return string in lexicographic
// order followed by integers sum
string arrangeString(string str)
{
    int char_count[MAX_CHAR] = {0};
    int sum = 0;

    // Traverse the string
    for (int i = 0; i < str.length(); i++)
    {
        // Count occurence of uppercase alphabets
        if (str[i]>='A' && str[i] <='Z')
            char_count[str[i]-'A']++;

        //Store sum of integers
        else
            sum = sum + (str[i]-'0');
    }

    string res = "";

    // Traverse for all characters A to Z
    for (int i = 0; i < MAX_CHAR; i++)
    {
        char ch = (char)('A'+i);

        // Append the current character
        // in the string no. of times it
        //  occurs in the given string
        while (char_count[i]--)
            res = res + ch;
    }

    // Append the sum of integers
    if (sum > 0)
        res = res + to_string(sum);

    // return resultant string
    return res;
}

// Driver program
int main()
{
    string str = "ACCBA10D2EW30";
    cout << arrangeString(str);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program for above implementation

class Test
{
    static final int MAX_CHAR = 26;
    
    // Method to return string in lexicographic
    // order followed by integers sum
    static String arrangeString(String str)
    {
        int char_count[] = new int[MAX_CHAR];
        int sum = 0;
     
        // Traverse the string
        for (int i = 0; i < str.length(); i++)
        {
            // Count occurrence of uppercase alphabets
            if (Character.isUpperCase(str.charAt(i)))
                char_count[str.charAt(i)-'A']++;
     
            //Store sum of integers
            else
                sum = sum + (str.charAt(i)-'0');
            
        }
     
        String res = "";
     
        // Traverse for all characters A to Z
        for (int i = 0; i < MAX_CHAR; i++)
        {
            char ch = (char)('A'+i);
     
            // Append the current character
            // in the string no. of times it
            //  occurs in the given string
            while (char_count[i]-- != 0)
                res = res + ch;
        }
     
        // Append the sum of integers
        if (sum > 0)
            res = res + sum;
     
        // return resultant string
        return res;
    }
    
    // Driver method
    public static void main(String args[]) 
    {
        String str = "ACCBA10D2EW30";
        System.out.println(arrangeString(str));
    }
}
{% endhighlight %}
{% highlight cpp %}
AABCCDEW6
{% endhighlight %}
* Time Complexity: O(n)
* Reference : https://www.careercup.com/question?id=13382661
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

