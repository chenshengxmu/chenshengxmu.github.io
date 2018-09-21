---
layout: post
title: Minimum sum of squares of character counts in a given string after removing k characters
---
* Given a string of lowercase alphabets and a number k, the task is to print the minimum value of the string after removal of ‘k’ characters. The value of a string is defined as the sum of squares of the count of each distinct character. For example consider the string “saideep”, here frequencies of characters are s-1, a-1, i-1, e-2, d-1, p-1 and value of the string is 1^2 + 1^2 + 1^2 + 1^2 + 1^1 + 2^2 = 9.
* Expected Time Complexity : O(n)
* Examples:
{% highlight cpp %}
Input :  str = abccc, K = 1
Output :  6
We remove c to get the value as 11 + 11 + 22

Input :  str = aaab, K = 2
Output :  2
{% endhighlight %}
* Asked In : Amazon
* One clear observation is that we need to remove character with highest frequency. One trick is the character ma
* A Simple solution is to use sorting technique through all current highest frequency reduce up to k times. For After every reduce again sort frequency array.
* A Better Solution used to Priority Queue which has to the highest element on top.
* Below is the implementation of the above idea.
{% highlight cpp %}
// C++ program to find min sum of squares
// of characters after k removals
#include <bits/stdc++.h>
using namespace std;

const int MAX_CHAR = 26;

// Main Function to calculate min sum of
// squares of characters after k removals
int minStringValue(string str, int k)
{
    int l = str.length(); // find length of string

    // if K is greater than length of string
    // so reduced string will become 0
    if (k >= l)
        return 0;

    // Else find Frequency of each character and
    // store in an array
    int frequency[MAX_CHAR] = {0};
    for (int i=0; i<l; i++)
        frequency[str[i]-'a']++;

    // Push each char frequency into a priority_queue
    priority_queue<int> q;
    for (int i=0; i<MAX_CHAR; i++)
        q.push(frequency[i]);


    // Removal of K characters
    while (k--)
    {
        // Get top element in priority_queue,
        // remove it. Decrement by 1 and again
        // push into priority_queue
        int temp = q.top();
        q.pop();
        temp = temp-1;
        q.push(temp);
    }

    // After removal of K characters find sum
    // of squares of string Value
    int result = 0; // Initialize result
    while (!q.empty())
    {
        int temp = q.top();
        result += temp*temp;
        q.pop();
    }

    return result;
}

// Driver Code
int main()
{
    string str = "abbccc";   // Input 1
    int k = 2;
    cout << minStringValue(str, k) << endl;

    str = "aaab";           // Input 2
    k = 2;
    cout << minStringValue(str, k);

    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to find min sum of squares
// of characters after k removals
import java.util.Comparator;
import java.util.PriorityQueue;
public class GFG {
      
    static final int MAX_CHAR = 26;
    
    // Defining a comparator class
    static class IntCompare implements Comparator<Integer>{
        @Override
        public int compare(Integer arg0, Integer arg1) {
            if(arg0 > arg1)
                return -1;
            else if(arg0 < arg1)
                return 1;
            else
                return 0;
        }
    }
    
    // Main Function to calculate min sum of
    // squares of characters after k removals
    static int minStringValue(String str, int k)
    {
        int l = str.length(); // find length of string
     
        // if K is greater than length of string
        // so reduced string will become 0
        if (k >= l)
            return 0;
     
        // Else find Frequency of each character and
        // store in an array
        int[] frequency = new int[MAX_CHAR];
        for (int i=0; i<l; i++)
            frequency[str.charAt(i)-'a']++;
     
        
        // creating object for comparator
        Comparator<Integer> c = new IntCompare();
        
        // creating a priority queue with comparator
        // such that elements in the queue are in
        // descending order.
        PriorityQueue<Integer> q = new PriorityQueue<>(c);
        
        // Push each char frequency into a priority_queue
        for (int i = 0; i < MAX_CHAR; i++){
            if(frequency[i] != 0)
                q.add(frequency[i]);
        }
     
        
        // Removal of K characters
        while (k != 0)
        {
            // Get top element in priority_queue,
            // remove it. Decrement by 1 and again
            // push into priority_queue
            int temp = q.peek();
            q.poll();
            temp = temp-1;
            q.add(temp);
            k--;
        }
     
        // After removal of K characters find sum
        // of squares of string Value
        int result = 0; // Initialize result
        while (!q.isEmpty())
        {
            int temp = q.peek();
            result += temp*temp;
            q.poll();
        }
        
        return result;
    }
     
    // Driver Code
    public static void main(String args[])
    {
        String str = "abbccc";   // Input 1
        int k = 2;
        System.out.println(minStringValue(str, k));
     
        str = "aaab";           // Input 2
        k = 2;
        System.out.println(minStringValue(str, k));
    }
}
// This code is contributed by Sumit Ghosh
{% endhighlight %}
{% highlight cpp %}
6
2
{% endhighlight %}
* Time Complexity : O(n)
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

