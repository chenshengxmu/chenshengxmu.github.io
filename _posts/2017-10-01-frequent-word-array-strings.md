---
layout: post
title: Most frequent word in an array of strings
---
* Given an array of words find the most occurring word in it
* Examples:
{% highlight cpp %}
Input : arr[] = {"geeks", "for", "geeks", "a", 
                "portal", "to", "learn", "can",
                "be", "computer", "science", 
                 "zoom", "yup", "fire", "in", 
                 "be", "data"}
Output : Geeks 
"geeks" is the most frequent word as it 
occurs 3 times
{% endhighlight %}
* A simple solution is to run two loops and count occurrences of every word. Time complexity of this solution is O(n * n * MAX_WORD_LEN).
* An efficient solution is to use Trie data structure. The idea is simple first we will insert in trie. In trie, we keep counts of words ending at a node. We do preorder traversal and compare count present at each node and find the maximum occurring word
{% highlight cpp %}
// CPP code to find most frequent word in
// an array of strings
#include <bits/stdc++.h>
using namespace std;

/*structing the trie*/
struct Trie {
    string key;
    int cnt;
    unordered_map<char, Trie*> map;
};

/* Function to return a new Trie node */
Trie* getNewTrieNode()
{
    Trie* node = new Trie;
    node->cnt = 0;
    return node;
}

/* function to insert a string */
void insert(Trie*& root, string &str)
{
    // start from root node
    Trie* temp = root;

    for (int i=0; i<str.length(); i++) {
        
        char x = str[i]; 

        /*a new node if path doesn't exists*/
        if (temp->map.find(x) == temp->map.end())
            temp->map[x] = getNewTrieNode();

        // go to next node
        temp = temp->map[x];
    }

    // store key and its count in leaf nodes
    temp->key = str;
    temp->cnt += 1;
}

/* function for preorder traversal */
bool preorder(Trie* temp, int& maxcnt, string& key)
{
    if (temp == NULL)
        return false;

    for (auto it : temp->map) {

        /*leaf node will have non-zero count*/
        if (maxcnt < it.second->cnt) {
            key = it.second->key;
            maxcnt = it.second->cnt;
        }

        // recurse for current node children
        preorder(it.second, maxcnt, key);
    }
}

void mostFrequentWord(string arr[], int n)
{
    // Insert all words in a Trie
    Trie* root = getNewTrieNode();
    for (int i = 0; i < n; i++)
        insert(root, arr[i]);

    // Do preorder traversal to find the 
    // most frequent word
    string key;
    int cnt = 0;
    preorder(root, cnt, key);

    cout << "The word that occurs most is : "
        << key << endl;
    cout << "No of times: " << cnt << endl;
}

// Driver code
int main()
{
    // given set of keys
    string arr[] = {"geeks", "for", "geeks", "a", 
            "portal", "to", "learn", "can", "be", 
            "computer", "science", "zoom", "yup", 
            "fire", "in", "be", "data", "geeks"};
    int n = sizeof(arr) / sizeof(arr[0]);

    mostFrequentWord(arr, n);

    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
The word that occurs most is : geeks
No of times: 3
{% endhighlight %}
* Time Complexity : O(n * MAX_WORD_LEN)
* Another efficient solution is to use hashing. Please refer Find winner of an election where votes are represented as candidate names for details.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

