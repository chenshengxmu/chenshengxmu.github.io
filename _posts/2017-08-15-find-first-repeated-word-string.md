---
layout: post
title: Find the first repeated word in a string
---
* Given a string, Find the 1st repeated word in a string
* Examples:
{% highlight cpp %}
Input : "Ravi had been saying that he had been there"
Output : had

Input : "Ravi had been saying that"
Output : No Repetition

Input : "he had had he"
Output : he
{% endhighlight %}
* question source : https://www.geeksforgeeks.org/goldman-sachs-interview-experience-set-29-internship/
* The idea is to tokenize the string and store each word and its count in hashmap. Then traverse the string again and for each word of string, check its count in created hashmap
{% highlight cpp %}
// CPP program for finding first repeated
// word in a string
#include <bits/stdc++.h>
using namespace std;

// returns first repeated word
string findFirstRepeated(string s)
{
    // break string into tokens
    // and then each string into set
    // if a word appeared before appears
    // again, return the word and break

    istringstream iss(s);
    string token;

    // hashmap for storing word and its count
    // in sentence
    unordered_map<string, int> setOfWords;

    // store all the words of string
    // and the count of word in hashmap

    while (getline(iss, token, ' ')) {
        if (setOfWords.find(token) != setOfWords.end())             
            setOfWords[token] += 1;  // word exists
        else 
            // insert new word to set
            setOfWords.insert(make_pair(token, 1));        
    }

    // traverse again from first word of string s
    // to check if count of word is greater than 1

    // either take a new stream or store the words 
    // in vector of strings in previous loop
    istringstream iss2(s);
    while (getline(iss2, token, ' ')) {
        int count = setOfWords[token];
        if (count > 1) {
            return token;
        }
    }

    return "NoRepetition";
}

// driver program
int main()
{
    string s("Ravi had been saying that he had been there");
    string firstWord = findFirstRepeated(s);
    if (firstWord != "NoRepetition")
        cout << "First repeated word :: " 
             << firstWord << endl;
    else
        cout << "No Repetitionn";
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
First repeated word :: had
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

