---
layout: post
title: Count of words whose i-th letter is either (i-1)-th, i-th, or (i+1)-th letter of given word
---
* Given a string str. The task is to count the words having the same length as str and each letter at the i-th position is either (i-1)-th, i-th, or (i+1)-th position letter of str.
* Note: For the first letter consider i-th and (i+1)-th position letter of W. And for last letter consider (i-1)-th and i-th position letter of str.
* Examples:
{% highlight cpp %}
Input : str[] = "ab"
Output : 4
Words that can be formed: aa, ab, ba, bb.

Input : str[] = "x"
Output : 1
{% endhighlight %}
* For any letter at index i, except first and last letter, there are three possible letter i.e (i-1)th, ith or (i+1)th letter of given words. So, if three of them are distinct, we have 3 possibilities. If two of them are same, we have 2 possibilities. And if all are same we have only 1 possibility. So, traverse the given words and find the possibility of each letter and multiply them.
* Similarly, for first letter check the distinct letter at first and second position. And for last position check the distinct letter at last and second last position.
* Below is the implementation of this approach:
{% highlight cpp %}
// C++ program to count words  whose ith letter
// is either (i-1)th, ith, or (i+1)th letter
// of given word.
#include<bits/stdc++.h>
using namespace std;

// Return the count of words.
int countWords(char str[], int len)
{
    int count = 1;

    // If word contain single letter, return 1.
    if (len == 1)
        return count;

    // Checking for first letter.
    if (str[0] == str[1])
        count *= 1;
    else
        count *= 2;

    // Traversing the string and multiplying
    // for combinations.
    for (int j=1; j<len-1; j++)
    {
        // If all three letters are same.
        if (str[j] == str[j-1] && str[j] == str[j+1])
            count *= 1;

        // If two letter are distinct.
        else if (str[j] == str[j-1] ||
                 str[j] == str[j+1] ||
                 str[j-1] == str[j+1])
            count *= 2;

        // If all three letter are distinct.
        else
            count *= 3;
    }

    // Checking for last letter.
    if (str[len - 1] == str[len - 2])
        count *= 1;
    else
        count *= 2;

    return count;
}

// Driven Program
int main()
{
    char str[] = "abc";
    int len = strlen(str);

    cout << countWords(str, len) << endl;
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to count words  whose ith letter
// is either (i-1)th, ith, or (i+1)th letter
// of given word.
public class GFG {

    // Return the count of words.
    static int countWords(String str, int len)
    {
        int count = 1;
     
        // If word contain single letter, return 1.
        if (len == 1)
            return count;
     
        // Checking for first letter.
        if (str.charAt(0) == str.charAt(1))
            count *= 1;
        else
            count *= 2;
     
        // Traversing the string and multiplying
        // for combinations.
        for (int j = 1; j < len - 1; j++)
        {
            // If all three letters are same.
            if (str.charAt(j) == str.charAt(j - 1) && 
                    str.charAt(j) == str.charAt(j + 1))
                count *= 1;
     
            // If two letter are distinct.
            else if (str.charAt(j) == str.charAt(j - 1)||
                    str.charAt(j) == str.charAt(j + 1) ||
                   str.charAt(j - 1) == str.charAt(j + 1))
                count *= 2;
     
            // If all three letter are distinct.
            else
                count *= 3;
        }
     
        // Checking for last letter.
        if (str.charAt(len - 1) == str.charAt(len - 2))
            count *= 1;
        else
            count *= 2;
     
        return count;
    }
     
    // Driven Program
    public static void main(String args[])
    {
        String str = "abc";
        int len = str.length();
     
        System.out.println(countWords(str, len));
    }
}
// This code is contributed by Sumit Ghosh
{% endhighlight %}
{% highlight cpp %}
12
{% endhighlight %}
* Time complexity : O(length of string).
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

