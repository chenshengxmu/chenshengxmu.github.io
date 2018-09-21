---
layout: post
title: Find all strings that match specific pattern in a dictionary
---
* Given a dictionary of words, find all strings that matches the given pattern where every character in the pattern is uniquely mapped to a character in the dictionary.
* Examples:
{% highlight cpp %}
Input:  
dict = ["abb", "abc", "xyz", "xyy"];
pattern = "foo"
Output: [xyy abb]
Explanation: 
xyy and abb have same character at index 1 and 2 like the pattern

Input:  
dict = ["abb", "abc", "xyz", "xyy"];
pat = "mno"
Output: [abc xyz]
Explanation: 
abc and xyz have all distinct characters, similar to the pattern

Input:  
dict = ["abb", "abc", "xyz", "xyy"];
pattern = "aba"
Output: [] 
Explanation: 
Pattern has same character at index 0 and 2. 
No word in dictionary follows the pattern.

Input:  
dict = ["abab", "aba", "xyz", "xyx"];
pattern = "aba"
Output: [aba xyx]
Explanation: 
aba and xyx have same character at index 0 and 2 like the pattern
{% endhighlight %}
* The idea is to encode the pattern in such a way that any word from the dictionary that matches the pattern will have same hash as that of the pattern after encoding. We iterate through all words in dictionary one by one and print the words that have same hash as that of the pattern.
* Below is C++ implementation of above idea –
{% highlight cpp %}
// C++ program to print all the strings that match the
// given pattern where every character in the pattern is
// uniquely mapped to a character in the dictionary
#include <bits/stdc++.h>
using namespace std;

// Function to encode given string
string encodeString(string str)
{
    unordered_map<char, int> map;
    string res = "";
    int i = 0;

    // for each character in given string
    for (char ch : str)
    {
        // If the character is occurring for the first
        // time, assign next unique number to that char
        if (map.find(ch) == map.end())
            map[ch] = i++;

        // append the number associated with current
        // character into the output string
        res += to_string(map[ch]);
    }

    return res;
}

// Function to print all the strings that match the
// given pattern where every character in the pattern is
// uniquely mapped to a character in the dictionary
void findMatchedWords(unordered_set<string> dict,
                      string pattern)
{
    // len is length of the pattern
    int len = pattern.length();

    // encode the string
    string hash = encodeString(pattern);

    // for each word in the dictionary
    for (string word : dict)
    {
        // If size of pattern is same as size of current
        // dictionary word and both pattern and the word
        // has same hash, print the word
        if (word.length() == len && encodeString(word) == hash)
            cout << word << " " ;
    }
}

// Driver code
int main()
{
    unordered_set<string> dict = { "abb", "abc", "xyz", "xyy" };
    string pattern = "foo";

    findMatchedWords(dict, pattern);

    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
xyy abb
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

