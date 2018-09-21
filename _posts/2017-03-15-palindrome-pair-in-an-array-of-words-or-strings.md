---
layout: post
title: Palindrome pair in an array of words (or strings)
---
* Given a list of words, find if any of the two words can be joined to form a palindrome.
* Examples:
{% highlight cpp %}
Input  : list[] = {"geekf", "geeks", "or", 
                            "keeg", "abc", "bc"}
Output : Yes
There is a pair "geekf" and "keeg"

Input : list[] =  {"abc", "xyxcba", "geekst", "or",
                                      "keeg", "bc"}
Output : Yes
There is a pair "abc" and "xyxcba"
{% endhighlight %}
* Asked in : Google Interview
* Simple approach:
{% highlight cpp %}
1- Consider each pair one by one.
2- Check if any of the pairs forms a palindrome
   after concatenating them.
3- Return true, if any such pair exists.
4- Else, return false.
{% endhighlight %}
{% highlight cpp %}
// C++ program to find if there is a pair that
// can form a palindrome.
#include<bits/stdc++.h>
using namespace std;

// Utility function to check if a string is a
// palindrome
bool isPalindrome(string str)
{
    int len = str.length();

    // compare each character from starting
    // with its corresponding character from last
    for (int i = 0; i < len/2; i++ )
        if (str[i] != str[len-i-1])
            return false;

    return true;
}

// Function to check if a palindrome pair exists
bool checkPalindromePair(vector <string> vect)
{
    // Consider each pair one by one
    for (int i = 0; i< vect.size()-1; i++)
    {
        for (int j = i+1; j< vect.size() ; j++)
        {
            string check_str = "";

            // concatenate both strings
            check_str = check_str + vect[i] + vect[j];

            // check if the concatenated string is
            // palindrome
            if (isPalindrome(check_str))
                return true;
        }
    }
    return false;
}

// Driver code
int main()
{
    vector <string> vect = {"geekf", "geeks", "or",
                            "keeg", "abc", "bc"};


    checkPalindromePair(vect)? cout << "Yes" :
                               cout << "No";
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to find if there is a pair that
// can form a palindrome.
import java.util.Arrays;
import java.util.List;
public class Palin_pair1 {
        
    // Utility function to check if a string is a
    // palindrome
    static boolean isPalindrome(String str)
    {
        int len = str.length();
     
        // compare each character from starting
        // with its corresponding character from last
        for (int i = 0; i < len/2; i++ )
            if (str.charAt(i) != str.charAt(len-i-1))
                return false;
     
        return true;
    }
     
    // Function to check if a palindrome pair exists
    static boolean checkPalindromePair(List<String> vect)
    {
        // Consider each pair one by one
        for (int i = 0; i< vect.size()-1; i++)
        {
            for (int j = i+1; j< vect.size() ; j++)
            {
                String check_str = "";
     
                // concatenate both strings
                check_str = check_str + vect.get(i) + vect.get(j);
     
                // check if the concatenated string is
                // palindrome
                if (isPalindrome(check_str))
                    return true;
            }
        }
        return false;
    }
     
    // Driver code
    public static void main(String args[])
    {
        List<String> vect = Arrays.asList("geekf", "geeks", "or",
                                "keeg", "abc", "bc");
     
     
        if (checkPalindromePair(vect) == true)
            System.out.println("Yes");
        else    
            System.out.println("No");
    }
}
//This code is contributed by Sumit Ghosh
{% endhighlight %}
{% highlight cpp %}
Yes
{% endhighlight %}
* Time Complexity : O(n2k) Here n is the number of the words in the list and k is the maximum length that is checked for a palindrome.
*   Efficient method It can be done in an efficient manner by using the Trie data structure. The idea is to maintain a Trie of the reverse of all words.
{% highlight cpp %}
1) Create an empty Trie.
2) Do following for every word:-
    a) Insert reverse of current word.
    b) Also store up to which index it is 
       a palindrome.
3) Traverse list of words again and do following 
   for every word.
    a) If it is available in Trie then return true
    b) If it is partially available
         Check the remaining word is palindrome or not 
         If yes then return true that means a pair
         forms a palindrome.
         Note: Position upto which the word is palindrome
               is stored because of these type of cases.
{% endhighlight %}
{% highlight cpp %}
// C++ program to check if there is a pair that
// of above method using Trie
#include<bits/stdc++.h>
using namespace std;
#define ARRAY_SIZE(a) sizeof(a)/sizeof(a[0])

// Alphabet size (# of symbols)
#define ALPHABET_SIZE (26)

// Converts key current character into index
// use only 'a' through 'z' and lower case
#define CHAR_TO_INDEX(c) ((int)c - (int)'a')

// Trie node
struct TrieNode
{
    struct TrieNode *children[ALPHABET_SIZE];
    vector<int> pos; // To store palindromic
                     // positions in str
    int id;

    // isLeaf is true if the node represents
    // end of a word
    bool isLeaf;
};

// Returns new Trie node (initialized to NULLs)
struct TrieNode *getNode(void)
{
    struct TrieNode *pNode = new TrieNode;
    pNode->isLeaf = false;
    for (int i = 0; i < ALPHABET_SIZE; i++)
            pNode->children[i] = NULL;

    return pNode;
}

// Utility function to check if a string is a
// palindrome
bool isPalindrome(string str, int i, int len)
{
    // compare each character from starting
    // with its corresponding character from last
    while (i < len)
    {
        if (str[i] != str[len])
            return false;
        i++, len--;
    }

    return true;
}

// If not present, inserts reverse of key into Trie. If 
// the key is prefix of a Trie node, just mark leaf node
void insert(struct TrieNode* root, string key, int id)
{
    struct TrieNode *pCrawl = root;

    // Start traversing word from the last
    for (int level = key.length()-1; level >=0; level--)
    {
        // If it is not available in Trie, then
        // store it
        int index = CHAR_TO_INDEX(key[level]);
        if (!pCrawl->children[index])
            pCrawl->children[index] = getNode();

        // If current word is palindrome till this
        // level, store index of current word.
        if (isPalindrome(key, 0, level))
            (pCrawl->pos).push_back(id);

        pCrawl = pCrawl->children[index];
    }
    pCrawl->id = id;
    pCrawl->pos.push_back(id);

    // mark last node as leaf
    pCrawl->isLeaf = true;
}

// Returns true if key presents in Trie, else false
void search(struct TrieNode *root, string key,
            int id, vector<vector<int> > &result)
{
    struct TrieNode *pCrawl = root;
    for (int level = 0; level < key.length(); level++)
    {
        int index = CHAR_TO_INDEX(key[level]);

        // If it is present also check upto which index
        // it is palindrome
        if (pCrawl->id >= 0 && pCrawl->id != id &&
            isPalindrome(key, level, key.size()-1))
            result.push_back({id, pCrawl->id});

        // If not present then return
        if (!pCrawl->children[index])
            return;

        pCrawl = pCrawl->children[index];
    }

    for (int i: pCrawl->pos)
    {
        if (i == id)
            continue;
        result.push_back({id, i});
    }
}

// Function to check if a palindrome pair exists
bool checkPalindromePair(vector <string> vect)
{
    // Construct trie
    struct TrieNode *root = getNode();
    for (int i = 0; i < vect.size(); i++)
        insert(root, vect[i], i);

    // Search for different keys
    vector<vector<int> > result;
    for (int i=0; i<vect.size(); i++)
    {
        search(root, vect[i], i, result);
        if (result.size() > 0)
           return true;
    }

    return false;
}

// Driver code
int main()
{
    vector <string> vect = {"geekf", "geeks", "or",
                            "keeg", "abc", "bc"};


    checkPalindromePair(vect)? cout << "Yes" :
                               cout << "No";
    return 0;
}
{% endhighlight %}
{% highlight java %}
//Java program to check if there is a pair that
//of above method using Trie
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Palin_pair2 {

    // Alphabet size (# of symbols)
    static final int ALPHABET_SIZE = 26;

    // Trie node
    static class TrieNode {
        TrieNode[] children = new TrieNode[ALPHABET_SIZE];
        List<Integer> pos; // To store palindromic
                            // positions in str
        int id;

        // isLeaf is true if the node represents
        // end of a word
        boolean isLeaf;

        // constructor
        public TrieNode() {
            isLeaf = false;
            pos = new ArrayList<>();
            for (int i = 0; i < ALPHABET_SIZE; i++)
                children[i] = null;
        }
    }

    // Utility function to check if a string is a
    // palindrome
    static boolean isPalindrome(String str, int i, int len) {
        // compare each character from starting
        // with its corresponding character from last
        while (i < len) {
            if (str.charAt(i) != str.charAt(len))
                return false;

            i++;
            len--;
        }
        return true;
    }

    // If not present, inserts reverse of key into Trie. If
    // the key is prefix of a Trie node, just mark leaf node
    static void insert(TrieNode root, String key, int id) {
        TrieNode pCrawl = root;

        // Start traversing word from the last
        for (int level = key.length() - 1; level >= 0; level--) {
            // If it is not available in Trie, then
            // store it
            int index = key.charAt(level) - 'a';
            if (pCrawl.children[index] == null)
                pCrawl.children[index] = new TrieNode();

            // If current word is palindrome till this
            // level, store index of current word.
            if (isPalindrome(key, 0, level))
                (pCrawl.pos).add(id);

            pCrawl = pCrawl.children[index];
        }
        pCrawl.id = id;
        pCrawl.pos.add(id);

        // mark last node as leaf
        pCrawl.isLeaf = true;
    }

    // list to store result 
    static List<List<Integer>> result;

    // Returns true if key presents in Trie, else false
    static void search(TrieNode root, String key, int id) {
        TrieNode pCrawl = root;
        for (int level = 0; level < key.length(); level++) {
            int index = key.charAt(level) - 'a';

            // If it is present also check upto which index
            // it is palindrome
            if (pCrawl.id >= 0 && pCrawl.id != id
                    && isPalindrome(key, level, key.length() - 1)) {
                List<Integer> l = new ArrayList<>();
                l.add(id);
                l.add(pCrawl.id);
                result.add(l);
            }

            // If not present then return
            if (pCrawl.children[index] == null)
                return;

            pCrawl = pCrawl.children[index];
        }

        for (int i : pCrawl.pos) {
            if (i == id)
                continue;
            List<Integer> l = new ArrayList<>();
            l.add(id);
            l.add(i);
            result.add(l);
        }
    }

    // Function to check if a palindrome pair exists
    static boolean checkPalindromePair(List<String> vect) {
        
        // Construct trie
        TrieNode root = new TrieNode();
        for (int i = 0; i < vect.size(); i++)
            insert(root, vect.get(i), i);

        // Search for different keys
        result = new ArrayList<>();
        for (int i = 0; i < vect.size(); i++) {
            search(root, vect.get(i), i);

            if (result.size() > 0)
                return true;
        }

        return false;
    }

    // Driver code
    public static void main(String args[]) {
        List<String> vect = Arrays.asList("geekf", "geeks", 
                            "or", "keeg", "abc", "bc");

        if (checkPalindromePair(vect) == true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
//This code is contributed by Sumit Ghosh
{% endhighlight %}
{% highlight cpp %}
Yes
{% endhighlight %}
* Time Complexity: O(nk2) Where n is the number of words in the list and k is the maximum length that is checked for palindrome.
* Reference : https://www.careercup.com/question?id=4879869638868992
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

