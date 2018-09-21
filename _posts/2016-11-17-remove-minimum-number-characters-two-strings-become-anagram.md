---
layout: post
title: Remove minimum number of characters so that two strings become anagram
---
* Given two strings in lowercase, the task is to make them anagram. The only allowed operation is to remove a character from any string. Find minimum number of characters to be deleted to make both the strings anagram? If two strings contains same data set in any order then strings are called Anagrams.
* Examples :
{% highlight cpp %}
Input : str1 = "bcadeh" str2 = "hea"
Output: 3
We need to remove b, c and d from str1.

Input : str1 = "cddgk" str2 = "gcd"
Output: 2

Input : str1 = "bca" str2 = "acb"
Output: 0
{% endhighlight %}
* The idea is to make character count arrays for both the strings and store frequency of each character. Now iterate the count arrays of both strings and difference in frequency of any character abs(count1[str1[i]-‘a’] – count2[str2[i]-‘a’]) in both the strings is the number of character to be removed in either string.
{% highlight cpp %}
// C++ program to find minimum number of characters
// to be removed to make two strings anagram.
#include<bits/stdc++.h>
using namespace std;
const int CHARS = 26;

// function to calculate minimum numbers of characters
// to be removed to make two strings anagram
int remAnagram(string str1, string str2)
{
    // make hash array for both string and calculate
    // frequency of each character
    int count1[CHARS] = {0}, count2[CHARS] = {0};

    // count frequency of each character in first string
    for (int i=0; str1[i]!='\0'; i++)
        count1[str1[i]-'a']++;

    // count frequency of each character in second string
    for (int i=0; str2[i]!='\0'; i++)
        count2[str2[i]-'a']++;

    // traverse count arrays to find number of characters
    // to be removed
    int result = 0;
    for (int i=0; i<26; i++)
        result += abs(count1[i] - count2[i]);
    return result;
}

// Driver program to run the case
int main()
{
    string str1 = "bcadeh", str2 = "hea";
    cout << remAnagram(str1, str2);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to find minimum number of
// characters to be removed to make two
// strings anagram.
import java.util.*;

class GFG {

    // function to calculate minimum numbers
    // of characters to be removed to make
    // two strings anagram
    static int remAnagram(String str1, String str2)
    {
        // make hash array for both string 
        // and calculate frequency of each
        // character
        int count1[] = new int[26]; 
        int count2[] = new int[26];

        // count frequency of each charcter 
        // in first string
        for (int i = 0; i < str1.length() ; i++)
            count1[str1.charAt(i) -'a']++;
    
        // count frequency of each charcter 
        // in second string
        for (int i = 0; i < str2.length() ; i++)
            count2[str2.charAt(i) -'a']++;

        // traverse count arrays to find 
        // number of charcters to be removed
        int result = 0;
        for (int i = 0; i < 26; i++)
            result += Math.abs(count1[i] -
                               count2[i]);
        return result;
    }

    // Driver program to run the case
    public static void main(String[] args)
    {
        String str1 = "bcadeh", str2 = "hea";
        System.out.println(remAnagram(str1, str2));
    }
}
// This code is contributed by Prerna Saini
{% endhighlight %}
{% highlight cpp %}
3
{% endhighlight %}
* Time Complexity : O(n) Auxiliary space : O(ALPHABET-SIZE)
* The above solution can be optimized to work with single count array.
{% highlight cpp %}
// C++ implementation to count number of deletions
// required from two strings to create an anagram 
#include <bits/stdc++.h>
using namespace std;
const int CHARS = 26;

int countDeletions(string str1, string str2)
{ 
    int arr[CHARS] = {0};
    for (int i = 0; i < str1.length(); i++) 
        arr[str1[i] - 'a']++; 
    
    for (int i = 0; i < str2.length(); i++) 
        arr[str2[i] - 'a']--;
    
    long long int ans = 0;
    for(int i = 0; i < CHARS; i++)
        ans +=abs(arr[i]);
    return ans;
}

int main() {
    string str1 = "bcadeh", str2 = "hea";
    cout << countDeletions(str1, str2);
    return 0;
}
{% endhighlight %}
{% highlight cpp %}
3
{% endhighlight %}
* Thanks to vishal9619 for suggesting this optimized solution.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

