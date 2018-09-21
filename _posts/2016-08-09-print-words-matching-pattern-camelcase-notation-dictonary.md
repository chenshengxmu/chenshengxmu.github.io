---
layout: post
title: Print all words matching a pattern in CamelCase Notation Dictonary
---
* Given a dictionary of words where each word follows CamelCase notation, print all words in the dictionary that match with a given pattern consisting of uppercase characters only.
* CamelCase is the practice of writing compound words or phrases such that each word or abbreviation begins with a capital letter. Common examples include: “PowerPoint” and “WikiPedia”, “GeeksForGeeks”, “CodeBlocks”, etc.
* Examples:
{% highlight cpp %}
Input: 
dict[] = ["Hi", "Hello", "HelloWorld",  "HiTech", "HiGeek", 
"HiTechWorld", "HiTechCity", "HiTechLab"]

For pattern "HT",
Output: ["HiTech", "HiTechWorld", "HiTechCity", "HiTechLab"]

For pattern "H",
Output: ["Hi", "Hello", "HelloWorld",  "HiTech", "HiGeek", 
    "HiTechWorld", "HiTechCity", "HiTechLab"]

For pattern "HTC",
Output: ["HiTechCity"]


Input: 
dict[] = ["WelcomeGeek","WelcomeToGeeksForGeeks", "GeeksForGeeks"]

For pattern "WTG",
Output: ["WelcomeToGeeksForGeeks"]

For pattern "GFG",
Output: [GeeksForGeeks]

For pattern "GG",
Output: No match found
{% endhighlight %}
* The idea is to insert all dictionary keys into the Trie one by one. Here key refers to only Uppercase characters in original word in CamelCase notation. If we encounter the key for the first time, we need to mark the last node as leaf node and insert the complete word for that key into the vector associated with the leaf node. If we encounter a key that is already in the trie, we update the vector associated with the leaf node with current word. After all dictionary words are processed, we search for the pattern in the trie and print all words that matches the pattern.
* Below is C++ implementation of above idea –
{% highlight cpp %}
// C++ program to print all words in the CamelCase
// dictionary that matches with a given pattern
#include <bits/stdc++.h>
using namespace std;

// Alphabet size (# of upper-Case characters)
#define ALPHABET_SIZE 26

// A Trie node
struct TrieNode
{
    TrieNode* children[ALPHABET_SIZE];

    // isLeaf is true if the node represents
    // end of a word
    bool isLeaf;

    // vector to store list of complete words
    // in leaf node
    list<string> word;
};

// Returns new Trie node (initialized to NULLs)
TrieNode* getNewTrieNode(void)
{
    TrieNode* pNode = new TrieNode;

    if (pNode)
    {
        pNode->isLeaf = false;

        for (int i = 0; i < ALPHABET_SIZE; i++)
            pNode->children[i] = NULL;
    }

    return pNode;
}

// Function to insert word into the Trie
void insert(TrieNode* root, string word)
{
    int index;
    TrieNode* pCrawl = root;

    for (int level = 0; level < word.length(); level++)
    {
        // consider only uppercase characters
        if (islower(word[level]))
            continue;

        // get current character position
        index = int(word[level]) - 'A';
        if (!pCrawl->children[index])
            pCrawl->children[index] = getNewTrieNode();

        pCrawl = pCrawl->children[index];
    }

    // mark last node as leaf
    pCrawl->isLeaf = true;

    // push word into vector associated with leaf node
    (pCrawl->word).push_back(word);
}

// Function to print all children of Trie node root
void printAllWords(TrieNode* root)
{
    // if current node is leaf
    if (root->isLeaf)
    {
        for(string str : root->word)
            cout << str << endl;
    }

    // recurse for all children of root node
    for (int i = 0; i < ALPHABET_SIZE; i++)
    {
        TrieNode* child = root->children[i];
        if (child)
            printAllWords(child);
    }
}

// search for pattern in Trie and print all words
// matching that pattern
bool search(TrieNode* root, string pattern)
{
    int index;
    TrieNode* pCrawl = root;

    for (int level = 0; level < pattern.length(); level++)
    {
        index = int(pattern[level]) - 'A';
        // Invalid pattern
        if (!pCrawl->children[index])
            return false;

        pCrawl = pCrawl->children[index];
    }

    // print all words matching that pattern
    printAllWords(pCrawl);

    return true;
}

// Main function to print all words in the CamelCase
// dictionary that matches with a given pattern
void findAllWords(vector<string> dict, string pattern)
{
    // construct Trie root node
    TrieNode* root = getNewTrieNode();

    // Construct Trie from given dict
    for (string word : dict)
        insert(root, word);

    // search for pattern in Trie
    if (!search(root, pattern))
        cout << "No match found";
}

// Driver function
int main()
{
    // dictionary of words where each word follows
    // CamelCase notation
    vector<string> dict = {
        "Hi", "Hello", "HelloWorld", "HiTech", "HiGeek",
        "HiTechWorld", "HiTechCity", "HiTechLab"
    };

    // pattern consisting of uppercase characters only
    string pattern = "HT";

    findAllWords(dict, pattern);

    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to print all words in the CamelCase
// dictionary that matches with a given pattern
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class CamelCase {

    // Alphabet size (# of upper-Case characters)
    static final int ALPHABET_SIZE = 26;

    // A Trie node
    static class TrieNode {
        TrieNode[] children = new TrieNode[ALPHABET_SIZE];

        // isLeaf is true if the node represents
        // end of a word
        boolean isLeaf;

        // vector to store list of complete words
        // in leaf node
        List<String> word;

        public TrieNode() {
            isLeaf = false;
            for (int i = 0; i < ALPHABET_SIZE; i++)
                children[i] = null;

            word = new ArrayList<String>();
        }
    }

    static TrieNode root;

    // Function to insert word into the Trie
    static void insert(String word) {
        int index;
        TrieNode pCrawl = root;

        for (int level = 0; level < word.length(); level++) {
  
              // consider only uppercase characters
            if (Character.isLowerCase(word.charAt(level)))
                continue;

            // get current character position
            index = word.charAt(level) - 'A';
            if (pCrawl.children[index] == null)
                pCrawl.children[index] = new TrieNode();

            pCrawl = pCrawl.children[index];
        }

        // mark last node as leaf
        pCrawl.isLeaf = true;

        // push word into vector associated with leaf node
        (pCrawl.word).add(word);
    }

    // Function to print all children of Trie node root
    static void printAllWords(TrieNode root) {

        // if current node is leaf
        if (root.isLeaf) {
            for (String str : root.word)
                System.out.println(str);
        }

        // recurse for all children of root node
        for (int i = 0; i < ALPHABET_SIZE; i++) {
            TrieNode child = root.children[i];
            if (child != null)
                printAllWords(child);
        }
    }

    // search for pattern in Trie and print all words
    // matching that pattern
    static boolean search(String pattern) {
        int index;
        TrieNode pCrawl = root;

        for (int level = 0; level < pattern.length(); level++) {
            index = pattern.charAt(level) - 'A';

            // Invalid pattern
            if (pCrawl.children[index] == null)
                return false;

            pCrawl = pCrawl.children[index];
        }

        // print all words matching that pattern
        printAllWords(pCrawl);

        return true;
    }

    // Main function to print all words in the CamelCase
    // dictionary that matches with a given pattern
    static void findAllWords(List<String> dict, String pattern)
     {

        // construct Trie root node
        root = new TrieNode();

        // Construct Trie from given dict
        for (String word : dict)
            insert(word);

        // search for pattern in Trie
        if (!search(pattern))
            System.out.println("No match found");
    }

    // Driver function
    public static void main(String args[]) {

        // dictionary of words where each word follows
        // CamelCase notation
        List<String> dict = Arrays.asList("Hi", "Hello",
                           "HelloWorld", "HiTech", "HiGeek",
                          "HiTechWorld", "HiTechCity",
                            "HiTechLab");

        // pattern consisting of uppercase characters only
        String pattern = "HT";

        findAllWords(dict, pattern);
    }
}
// This code is contributed by Sumit Ghosh
{% endhighlight %}
{% highlight cpp %}
HiTech
HiTechCity
HiTechLab
HiTechWorld
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

