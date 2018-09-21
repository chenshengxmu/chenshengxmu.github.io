---
layout: post
title: Generating distinct subsequences of a given string in lexicographic order
---
* Given a string s, make a list of all possible combinations of letters of a given string S. If there are two strings with the same set of characters, print the lexicographically smallest arrangement of the two strings
* For string abc, the list in lexicographic order subsequences are, a ab abc ac b bc c
* Examples:
{% highlight cpp %}
Input : s = "ab"
Output : a ab b

Input  : xyzx
Output : x xx xy xyx xyz xyzx xz xzx y
         yx yz yzx z zx
{% endhighlight %}
* The idea is to use a set (which is implemented using self balancing BST) to store subsequences so that duplicates can be tested.
* To generate all subsequences, we one by one remove every character and recur for remaining string.
{% highlight cpp %}
// C++ program to print all distinct subsequences
// of a string.
#include <bits/stdc++.h>
using namespace std;

// Finds and stores result in st for a given
// string s.
void generate(set<string>& st, string s)
{
    if (s.size() == 0) 
        return;

    // If current string is not already present.
    if (st.find(s) == st.end()) {
        st.insert(s);

        // Traverse current string, one by one 
        // remove every character and recur.
        for (int i = 0; i < s.size(); i++) {
            string t = s;
            t.erase(i, 1);
            generate(st, t);
        }
    }
    return;
}

// Driver code
int main()
{
    string s = "xyz";
    set<string> st;
    set<string>::iterator it;
    generate(st, s);
    for (auto it = st.begin(); it != st.end(); it++)
            cout << *it << endl;
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
x
xy
xyz
xz
y
yz
z
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

