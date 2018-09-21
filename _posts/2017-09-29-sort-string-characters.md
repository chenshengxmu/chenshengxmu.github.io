---
layout: post
title: Sort string of characters
---
* Given a string of lowercase characters from ‘a’ – ‘z’. We need to write a program to print the characters of this string in sorted order.
* Examples:
{% highlight cpp %}
Input : bbccdefbbaa 
Output : aabbbbccdef

Input : geeksforgeeks
Output : eeeefggkkorss
{% endhighlight %}
* A simple approach will be to use sorting algorithms like quick sort or merge sort and sort the input string and print it.
{% highlight cpp %}
// C++ program to sort a string of characters
#include<bits/stdc++.h>
using namespace std;

// function to print string in sorted order
void sortString(string &str)
{
   sort(str.begin(), str.end());
   cout << str;
}

// Driver program to test above function
int main()
{
    string s = "geeksforgeeks"; 
    sortString(s); 
    return 0;
}
{% endhighlight %}
{% highlight cpp %}
eeeefggkkorss
{% endhighlight %}
* Time Complexity: O(n log n), where n is the length of string.
* An efficient approach will be to observe first that there can be a total of 26 unique characters only. So, we can store the count of occurrences of all the characters from ‘a’ to ‘z’ in a hashed array. The first index of the hashed array will represent character ‘a’, second will represent ‘b’ and so on. Finally, we will simply traverse the hashed array and print the characters from ‘a’ to ‘z’ the number of times they occurred in input string.
* Below is the implementation of above idea:
{% highlight cpp %}
// C++ program to sort a string of characters
#include<bits/stdc++.h>
using namespace std;

const int MAX_CHAR = 26;

// function to print string in sorted order
void sortString(string &str)
{
    // Hash array to keep count of characters.
    // Initially count of all charters is 
    // initialized to zero.
    int charCount[MAX_CHAR] = {0};
    
    // Traverse string and increment 
    // count of characters
    for (int i=0; i<str.length(); i++)

        // 'a'-'a' will be 0, 'b'-'a' will be 1,
        // so for location of character in count 
        // array we wil do str[i]-'a'.
        charCount[str[i]-'a']++;    
    
    // Traverse the hash array and print 
    // characters
    for (int i=0;i<MAX_CHAR;i++)
        for (int j=0;j<charCount[i];j++)
            cout << (char)('a'+i);
}

// Driver program to test above function
int main()
{
    string s = "geeksforgeeks";    
    sortString(s);    
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to sort 
// a string of characters
import java.util.Arrays;
import java.util.Collections;

class GFG 
{
    // Method to sort a 
    // string alphabetically
    public static String sortString(String inputString)
    {
        // convert input 
        // string to char array
        char tempArray[] = 
             inputString.toCharArray();
        
        // sort tempArray
        Arrays.sort(tempArray);
        
        // return new sorted string
        return new String(tempArray);
    }
    
    // Driver Code
    public static void main(String[] args)
    {
        String inputString = "geeksforgeeks";
        
        System.out.println(sortString(inputString));
    }
}

// This code is contributed 
// by prabhat kumar singh
{% endhighlight %}
{% highlight cpp %}
eeeefggkkorss
{% endhighlight %}
* Time Complexity: O( n ), where n is the length of input string. Auxiliary Space: O( 1 ).
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

