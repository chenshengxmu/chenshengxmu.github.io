---
layout: post
title: Minimum Number of Manipulations required to make two Strings Anagram Without Deletion of Character
---
* Given two strings s1 and s2, we need to find the minimum number of manipulations required to make two strings anagram without deleting any character. Note:- The anagram strings have same set of characters, sequence of characters can be different. If deletion of character is allowed and cost is given, refer to Minimum Cost To Make Two Strings Identical
* Question Source: Yatra.com Interview Experience | Set 7 Examples:
{% highlight cpp %}
Input : 
       s1 = "aba"
       s2 = "baa"
Output : 0
Explanation: Both String contains identical characters

Input :
       s1 = "ddcf"
       s2 = "cedk"
Output : 2
Explanation : Here, we need to change two characters
in either of the strings to make them identical. We 
can change 'd' and 'f' in s1 or 'e' and 'k' in s2.
{% endhighlight %}
* Assumption: Length of both the Strings is considered similar
{% highlight cpp %}
// C++ Program to find minimum number
// of manipulations required to make
// two strings identical
#include <iostream>
using namespace std;

    // Counts the no of manipulations
    // required
    int countManipulations(string s1, string s2)
    {
        
        int count = 0;

        // store the count of character
        int char_count[26];

        // iterate though the first String
        // and update count
        for (int i = 0; i < s1.length(); i++) 
            char_count[s1[i] - 'a']++; 

        // iterate through the second string
        // update char_count.
        // if character is not found in 
        // char_count then increase count
        for (int i = 0; i < s2.length(); i++) 
            if (char_count[s2[i] - 'a']-- <= 0)
                count++;
        
        return count;
    }

    // Driver code
    int main()
    {

        string s1 = "ddcf";
        string s2 = "cedk";
        
        cout<<countManipulations(s1, s2);
    }

// This code is contributed by vt_m.
{% endhighlight %}
{% highlight java %}
// Java Program to find minimum number of manipulations
// required to make two strings identical
public class Similar_strings {

    // Counts the no of manipulations required
    static int countManipulations(String s1, String s2)
    {
        int count = 0;

        // store the count of character
        int char_count[] = new int[26];

        // iterate though the first String and update 
        // count
        for (int i = 0; i < s1.length(); i++) 
            char_count[s1.charAt(i) - 'a']++;        

        // iterate through the second string
        // update char_count.
        // if character is not found in char_count
        // then increase count
        for (int i = 0; i < s2.length(); i++) 
            if (char_count[s2.charAt(i) - 'a']-- <= 0)
                count++;
        
        return count;
    }

    // Driver code
    public static void main(String[] args)
    {

        String s1 = "ddcf";
        String s2 = "cedk";
        System.out.println(countManipulations(s1, s2));
    }
}
{% endhighlight %}
{% highlight cpp %}
2
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

