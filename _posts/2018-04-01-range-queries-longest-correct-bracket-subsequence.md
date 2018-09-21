---
layout: post
title: Range Queries for Longest Correct Bracket Subsequence
---
* Given a bracket sequence or in other words a string S of length n, consisting of characters ‘(‘ and ‘)’. Find length of the maximum correct bracket subsequence of sequence for a given query range. Note: A correct bracket sequence is the one that have matched bracket pairs or which contains another nested correct bracket sequence. For e.g (), (()), ()() are some correct bracket sequence.
* Examples:
{% highlight cpp %}
Input : S = ())(())(())(
        Start Index of Range = 0, 
        End Index of Range = 11
Output : 10
Explanation:  Longest Correct Bracket Subsequence is ()(())(())

Input : S = ())(())(())(
        Start Index of Range = 1, 
        End Index of Range = 2
Output : 0
{% endhighlight %}
* Segment Trees can be used to solve this problem efficiently
* At each node of the segment tree, we store the following:
{% highlight cpp %}
1) a - Number of correctly matched pairs of brackets.
2) b - Number of unused open brackets.  
3) c - Number of unused closed brackets.
{% endhighlight %}
* (unused open bracket – means they can’t be matched with any closing bracket, unused closed bracket – means they can’t be matched with any opening bracket, for e.g S = )( contains an unused open and an unused closed bracket)
* For each interval [L, R], we can match X number of unused open brackets ‘(‘ in interval [L, MID] with unused closed brackets ‘)’ in interval [MID + 1, R] where X = minimum(number of unused ‘(‘ in [L, MID], number of unused ‘)’ in [MID + 1, R]) Hence, X is also the number of correctly matched pairs built by combination. So, for interval [L, R]
* 1) Total number of correctly matched pairs becomes the sum of correctly matched pairs in left child and correctly matched pairs in right child and number of combinations of unused ‘(‘ and unused ‘)’ from left and right child respectively.
{% highlight cpp %}
a[L, R] = a[L, MID] + a[MID + 1, R] + X
{% endhighlight %}
* 2) Total number of unused open brackets becomes the sum of unused open brackets in left child and unused open brackets in right child minus X (minus – because we used X unused ‘(‘ from left child to match with unused ‘) from right child).
{% highlight cpp %}
a[L, R] = b[L, MID] + b[MID + 1, R] - X
{% endhighlight %}
* 3) Similarly, for ununsed closed brackets, following relation holds.
{% highlight cpp %}
a[L, R] = c[L, MID] + c[MID + 1, R] - X
{% endhighlight %}
* where a, b and c are the representations described above for each node to be stored in.
* Below is the implementation of above approach in C++.
{% highlight cpp %}
/* CPP Program to find the longest correct
   bracket subsequence in a given range */
#include <bits/stdc++.h>
using namespace std;

/* Declaring Structure for storing
   three values in each segment tree node */
struct Node {
    int pairs;
    int open; // unused
    int closed; // unused

    Node()
    {
        pairs = open = closed = 0;
    }
};

// A utility function to get the middle index from corner indexes.
int getMid(int s, int e) { return s + (e - s) / 2; }

// Returns Parent Node after merging its left and right child
Node merge(Node leftChild, Node rightChild)
{
    Node parentNode;
    int minMatched = min(leftChild.open, rightChild.closed);
    parentNode.pairs = leftChild.pairs + rightChild.pairs + minMatched;
    parentNode.open = leftChild.open + rightChild.open - minMatched;
    parentNode.closed = leftChild.closed + rightChild.closed - minMatched;
    return parentNode;
}

// A recursive function that constructs Segment Tree 
// for string[ss..se]. si is index of current node in
// segment tree st
void constructSTUtil(char str[], int ss, int se, Node* st,
                                                 int si)
{
    // If there is one element in string, store it in
    // current node of segment tree and return
    if (ss == se) {

        // since it contains one element, pairs 
        // will be zero
        st[si].pairs = 0;

        // check whether that one element is opening 
        // bracket or not
        st[si].open = (str[ss] == '(' ? 1 : 0);

        // check whether that one element is closing
        // bracket or not
        st[si].closed = (str[ss] == ')' ? 1 : 0);

        return;
    }

    // If there are more than one elements, then recur
    // for left and right subtrees and store the relation
    // of values in this node
    int mid = getMid(ss, se);
    constructSTUtil(str, ss, mid, st, si * 2 + 1);
    constructSTUtil(str, mid + 1, se, st, si * 2 + 2);

    // Merge left and right child into the Parent Node
    st[si] = merge(st[si * 2 + 1], st[si * 2 + 2]);
}

/* Function to construct segment tree from given
   string. This function allocates memory for segment 
   tree and calls constructSTUtil() to fill the 
   allocated memory */
Node* constructST(char str[], int n)
{
    // Allocate memory for segment tree

    // Height of segment tree
    int x = (int)(ceil(log2(n)));

    // Maximum size of segment tree
    int max_size = 2 * (int)pow(2, x) - 1;

    // Declaring array of structure Allocate memory
    Node* st = new Node[max_size];

    // Fill the allocated memory st
    constructSTUtil(str, 0, n - 1, st, 0);

    // Return the constructed segment tree
    return st;
}

/* A Recursive function to get the desired 
   Maximum Sum Sub-Array,
The following are parameters of the function-
 
st     --> Pointer to segment tree 
si --> Index of the segment tree Node 
ss & se  --> Starting and ending indexes of the 
             segment represented by
                 current Node, i.e., tree[index]
qs & qe  --> Starting and ending indexes of query range */
Node queryUtil(Node* st, int ss, int se, int qs,
               int qe, int si)
{
    // No overlap
    if (ss > qe || se < qs) {

        // returns a Node for out of bounds condition
        Node nullNode;
        return nullNode;
    }

    // Complete overlap
    if (ss >= qs && se <= qe) {
        return st[si];
    }

    // Partial Overlap Merge results of Left
    // and Right subtrees
    int mid = getMid(ss, se);
    Node left = queryUtil(st, ss, mid, qs, qe, si * 2 + 1);
    Node right = queryUtil(st, mid + 1, se, qs, qe, si * 2 + 2);

    // merge left and right subtree query results
    Node res = merge(left, right);
    return res;
}

/* Returns the maximum length correct bracket 
   subsequencebetween start and end
   It mainly uses queryUtil(). */
int query(Node* st, int qs, int qe, int n)
{
    Node res = queryUtil(st, 0, n - 1, qs, qe, 0);

    // since we are storing numbers pairs
    // and have to return maximum length, hence
    // multiply no of pairs by 2
    return 2 * res.pairs;
}

// Driver Code
int main()
{
    char str[] = "())(())(())(";
    int n = strlen(str);

    // Build segment tree from given string
    Node* st = constructST(str, n);

    int startIndex = 0, endIndex = 11;
    cout << "Maximum Length Correct Bracket"
           " Subsequence between "
         << startIndex << " and " << endIndex << " = "
         << query(st, startIndex, endIndex, n) << endl;

    startIndex = 1, endIndex = 2;
    cout << "Maximum Length Correct Bracket"
           " Subsequence between "
         << startIndex << " and " << endIndex << " = "
         << query(st, startIndex, endIndex, n) << endl;

    return 0;
}
{% endhighlight %}
{% highlight cpp %}
Maximum Length Correct Bracket Subsequence between 0 and 11 = 10
Maximum Length Correct Bracket Subsequence between 1 and 2 = 0
{% endhighlight %}
* Time complexity for each query is O(logN), where N is the size of string.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

