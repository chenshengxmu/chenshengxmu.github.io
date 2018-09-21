---
layout: post
title: Group words with same set of characters
---
* Given a list of words with lower cases. Implement a function to find all Words that have the same unique character set .
* Example:
{% highlight cpp %}
Input: words[] = { "may", "student", "students", "dog",
                 "studentssess", "god", "cat", "act",
                 "tab", "bat", "flow", "wolf", "lambs",
                 "amy", "yam", "balms", "looped", 
                 "poodle"};
Output : 
looped, poodle, 
lambs, balms, 
flow, wolf, 
tab, bat, 
may, amy, yam, 
student, students, studentssess, 
dog, god, 
cat, act, 

All words with same set of characters are printed 
together in a line.
{% endhighlight %}
* The idea is to use hashing. We generate a key for all words. The key contains all unique character (Size of key is at most 26 for lower case alphabets). We store indexes of words as values for a key. Once we have filled all keys and values in hash table, we can print the result by traversing the table.
* Below is the implementation of above idea .
{% highlight cpp %}
// C++ program to print all words that have
// the same unique character set
#include<bits/stdc++.h>
using namespace std;
#define MAX_CHAR 26

// Generates a key from given string. The key
// contains all unique characters of given string
// in sorted order.
string getKey(string &str)
{
    bool visited[MAX_CHAR] = { false };

    // store all unique characters of current
    // word in key
    for (int j = 0; j < str.length(); j++)
        visited[str[j] - 'a'] = true ;
    string key = "";
    for (int j=0; j < MAX_CHAR; j++)
        if (visited[j])
            key = key + (char)('a'+j);
    return key;
}

// Print all words together with same character sets.
void wordsWithSameCharSet(string words[], int n)
{
    // Stores indexes of all words that have same
    // set of unique characters.
    unordered_map <string, vector <int> > Hash;

    // Traverse all words
    for (int i=0; i<n; i++)
    {
        string key = getKey(words[i]);
        Hash[key].push_back(i);
    }

    // print all words that have the same unique character set
    for (auto it = Hash.begin(); it!=Hash.end(); it++)
    {
      for (auto v=(*it).second.begin(); v!=(*it).second.end(); v++)
          cout << words[*v] << ", ";
      cout << endl;
    }
}

// Driver program to test above function
int main()
{
    string words[] = { "may", "student", "students", "dog",
                 "studentssess", "god", "cat", "act", "tab",
                 "bat", "flow", "wolf", "lambs", "amy", "yam",
                 "balms", "looped", "poodle"};
    int n = sizeof(words)/sizeof(words[0]);
    wordsWithSameCharSet(words, n);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to print all words that have
// the same unique character set
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
public class GFG {
 
    static final int MAX_CHAR = 26;
     
    // Generates a key from given string. The key
    // contains all unique characters of given string
    // in sorted order.
    static String getKey(String str)
    {
        boolean[] visited = new boolean[MAX_CHAR];
        Arrays.fill(visited, false);
     
        // store all unique characters of current
        // word in key
        for (int j = 0; j < str.length(); j++)
            visited[str.charAt(j) - 'a'] = true ;
        String key = "";
        for (int j=0; j < MAX_CHAR; j++)
            if (visited[j])
                key = key + (char)('a'+j);
        return key;
    }
     
    // Print all words together with same character sets.
    static void wordsWithSameCharSet(String words[], int n)
    {
        // Stores indexes of all words that have same
        // set of unique characters.
        //unordered_map <string, vector <int> > Hash;
        HashMap<String, ArrayList<Integer>> Hash = new HashMap<>();
     
        // Traverse all words
        for (int i=0; i<n; i++)
        {
            String key = getKey(words[i]);
            
            // if the key is already in the map
            // then get its corresponding value
            // and update the list and put it in the map
            if(Hash.containsKey(key))
            {
                ArrayList<Integer> get_al = Hash.get(key);
                get_al.add(i);
                Hash.put(key, get_al);
            }
            
            // if key is not present in the map
            // then create a new list and add
            // both key and the list
            else
            {
                ArrayList<Integer> new_al = new ArrayList<>();
                new_al.add(i);
                Hash.put(key, new_al);
            }
        }
     
        // print all words that have the same unique character set
        for (Entry<String, ArrayList<Integer>> it : Hash.entrySet())
        {
            ArrayList<Integer> get =it.getValue();
            for (Integer v:get)
                System.out.print( words[v] + ", ");
            System.out.println();
        }
    }
     
    // Driver program to test above function
    public static void main(String args[])
    {
        String words[] = { "may", "student", "students", "dog",
                     "studentssess", "god", "cat", "act", "tab",
                     "bat", "flow", "wolf", "lambs", "amy", "yam",
                     "balms", "looped", "poodle"};
        int n = words.length;
        wordsWithSameCharSet(words, n);
    }
}
// This code is contributed by Sumit Ghosh
{% endhighlight %}
{% highlight python %}
# Function to group all strings with same characters
from collections import Counter

def groupStrings(input):
    # traverse all strings one by one
    # dict is an empty dictionary
    dict={}
    
    for word in input:
        # sort the current string and take it's
        # sorted value as key
        # sorted return list of sorted characters
        # we need to join them to get key as string
        # Counter() method returns dictionary with frequency of
        # each character as value
        wordDict=Counter(word)

        # now get list of keys
        key = wordDict.keys()

        # now sort these keys
        key = sorted(key)

        # join these characters to produce key string
        key = ''.join(key)
        
        # now check if this key already exist in
        # dictionary or not
        # if exist then simply append current word
        # in mapped list on key
        # otherwise first assign empty list to key and
        # then append current word in it
        if key in dict.keys():
            dict[key].append(word)
        else:
            dict[key]=[]
            dict[key].append(word)

        # now traverse complete dictionary and print
        # list of mapped strings in each key seprated by ,
    for (key,value) in dict.iteritems():
        print ','.join(dict[key])
        
# Driver program
if __name__ == "__main__":
    input=['may','student','students','dog','studentssess','god','cat','act','tab','bat','flow','wolf','lambs','amy','yam','balms','looped','poodle']
    groupStrings(input)
{% endhighlight %}
{% highlight cpp %}
looped, poodle, 
lambs, balms, 
flow, wolf, 
tab, bat, 
may, amy, yam, 
student, students, studentssess, 
dog, god, 
cat, act,
{% endhighlight %}
* Time complexity : O(n*k) where n is number of words in dictionary and k is maximum length of a word.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

