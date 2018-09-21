---
layout: post
title: Find if an array of strings can be chained to form a circle | Set 2
---
* Given an array of strings, find if the given strings can be chained to form a circle. A string X can be put before another string Y in circle if the last character of X is same as first character of Y.
* Examples:
{% highlight cpp %}
Input: arr[] = {"geek", "king"}
Output: Yes, the given strings can be chained.
Note that the last character of first string is same
as first character of second string and vice versa is
also true.

Input: arr[] = {"for", "geek", "rig", "kaf"}
Output: Yes, the given strings can be chained.
The strings can be chained as "for", "rig", "geek" 
and "kaf"

Input: arr[] = {"aab", "bac", "aaa", "cda"}
Output: Yes, the given strings can be chained.
The strings can be chained as "aaa", "aab", "bac" 
and "cda"

Input: arr[] = {"aaa", "bbb", "baa", "aab"};
Output: Yes, the given strings can be chained.
The strings can be chained as "aaa", "aab", "bbb" 
and "baa"

Input: arr[] = {"aaa"};
Output: Yes

Input: arr[] = {"aaa", "bbb"};
Output: No

Input  : arr[] = ["abc", "efg", "cde", "ghi", "ija"]
Output : Yes
These strings can be reordered as, “abc”, “cde”, “efg”,
“ghi”, “ija”

Input : arr[] = [“ijk”, “kji”, “abc”, “cba”]
Output : No
{% endhighlight %}
* We have discussed one approach to this problem in below post. Find if an array of strings can be chained to form a circle | Set 1
* In this post another approach is discussed. We solve this problem by treating this as a graph problem, where vertices will be first and last character of strings and we will draw an edge between two vertices if they are first and last character of same string, so number of edges in graph will be same as number of strings in the array. Graph representation of some string arrays are given in below diagram, Now it can be clearly seen after graph representation that if a loop among graph vertices is possible then we can reorder the strings otherwise not. As in above diagram’s example a loop can be found in first and third array of string but not in second array of string. Now to check whether this graph can have a loop which goes through all the vertices, we’ll check two conditions, 1) Indegree and Outdegree of each vertex should be same. 2) Graph should be strongly connected.
* First condition can be checked easily by keeping two arrays, in and out for each character. For checking whether graph is having a loop which goes through all vertices is same as checking complete directed graph is strongly connected or not because if it has a loop which goes through all vertices then we can reach to any vertex from any other vertex that is, graph will be strongly connected and same argument can be given for reverse statement also. Now for checking second condition we will just run a DFS from any character and visit all reachable vertices from this, now if graph has a loop then after this one DFS all vertices should be visited, if all vertices are visited then we will return true otherwise false so visiting all vertices in a single DFS flags a possible ordering among strings.
{% highlight cpp %}
//	C++ code to check if cyclic order is possible among strings
//  under given constrainsts
#include <bits/stdc++.h>
using namespace std;
#define M 26

//	Utility method for a depth first search among vertices
void dfs(vector<int> g[], int u, vector<bool> &visit)
{
    visit[u] = true;
    for (int i = 0; i < g[u].size(); ++i)
        if(!visit[g[u][i]])
            dfs(g, g[u][i], visit);
}

//	Returns true if all vertices are strongly connected
// i.e. can be made as loop
bool isConnected(vector<int> g[], vector<bool> &mark, int s)
{
    // Initialize all vertices as not visited
    vector<bool> visit(M, false);

    //	perform a dfs from s
    dfs(g, s, visit);

    //	now loop through all characters
    for (int i = 0; i < M; i++)
    {
        /*  I character is marked (i.e. it was first or last
            character of some string) then it should be
            visited in last dfs (as for looping, graph
            should be strongly connected) */
        if (mark[i] && !visit[i])
            return false;
    }

    //	If we reach that means graph is connected
    return true;
}

//	return true if an order among strings is possible
bool possibleOrderAmongString(string arr[], int N)
{
    // Create an empty graph
    vector<int> g[M];

    // Initialize all vertices as not marked
    vector<bool> mark(M, false);

    // Initialize indegree and outdegree of every
    // vertex as 0.
    vector<int> in(M, 0), out(M, 0);

    // Process all strings one by one
    for (int i = 0; i < N; i++)
    {
        // Find first and last characters
        int f = arr[i].front() - 'a';
        int l = arr[i].back() - 'a';

        // Mark the characters
        mark[f] = mark[l] = true;

        //	increase indegree and outdegree count
        in[f]++;
        out[l]++;

        // Add an edge in graph
        g[f].push_back(l);
    }

    // If for any character indegree is not equal to
    // outdegree then ordering is not possible
    for (int i = 0; i < M; i++)
        if (in[i] != out[i])
            return false;

    return isConnected(g, mark, arr[0].front() - 'a');
}

//	Driver code to test above methods
int main()
{
    // string arr[] = {"abc", "efg", "cde", "ghi", "ija"};
    string arr[] = {"ab", "bc", "cd", "de", "ed", "da"};
    int N = sizeof(arr) / sizeof(arr[0]);

    if (possibleOrderAmongString(arr, N) == false)
        cout << "Ordering not possible\n";
    else
        cout << "Ordering is possible\n";
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
Ordering is possible
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

