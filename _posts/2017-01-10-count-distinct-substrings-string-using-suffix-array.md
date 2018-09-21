---
layout: post
title: Count of distinct substrings of a string using Suffix Array
---
* Given a string of length n of lowercase alphabet characters, we need to count total number of distinct substrings of this string. Examples:
{% highlight cpp %}
Input  : str = “ababa”
Output : 10
Total number of distinct substring are 10, which are,
"", "a", "b", "ab", "ba", "aba", "bab", "abab", "baba"
and "ababa"
{% endhighlight %}
* We have discussed a Suffix Trie based solution in below post : Count of distinct substrings of a string using Suffix Trie
* We can solve this problem using suffix array and longest common prefix concept. A suffix array is a sorted array of all suffixes of a given string. For string “ababa” suffixes are : “ababa”, “baba”, “aba”, “ba”, “a”. After taking these suffixes in sorted form we get our suffix array as [4, 2, 0, 3, 1] Then we calculate lcp array using kasai’s algorithm. For string “ababa”, lcp array is [1, 3, 0, 2, 0]
* After constructing both arrays, we calculate total number of distinct substring by keeping this fact in mind : If we look through the prefixes of each suffix of a string, we cover all substrings of that string. We will explain the procedure for above example,
{% highlight cpp %}
String  = “ababa”
Suffixes in sorted order : “a”, “aba”, “ababa”,
                            “ba”, “baba”
Initializing distinct substring count by length
of first suffix, 
Count = length(“a”) = 1        
Substrings taken in consideration : “a”

Now we consider each consecutive pair of suffix, 
lcp("a", "aba") = "a".
All characters that are not part of the longest 
common prefix contribute to a distinct substring. 
In the above case, they are 'b' and ‘a'. So they 
should be added to Count.
Count += length(“aba”) - lcp(“a”, “aba”) 
Count  = 3    
Substrings taken in consideration : “aba”, “ab”

Similarly for next pair also,
Count += length(“ababa”) - lcp(“aba”, “ababa”)
Count = 5
Substrings taken in consideration : “ababa”, “abab”

Count += length(“ba”) - lcp(“ababa”, “ba”)
Count = 7
Substrings taken in consideration : “ba”, “b”

Count += length(“baba”) - lcp(“ba”, “baba”)
Count = 9
Substrings taken in consideration : “baba”, “bab”

We finally add 1 for empty string.
count = 10
{% endhighlight %}
* Above idea is implemented in below code.
{% highlight cpp %}
// C++ code to count total distinct substrings
// of a string
#include <bits/stdc++.h>
using namespace std;

// Structure to store information of a suffix
struct suffix
{
    int index;  // To store original index
    int rank[2]; // To store ranks and next
                 // rank pair
};

// A comparison function used by sort() to compare
// two suffixes. Compares two pairs, returns 1 if
// first pair is smaller
int cmp(struct suffix a, struct suffix b)
{
    return (a.rank[0] == b.rank[0])?
           (a.rank[1] < b.rank[1] ?1: 0):
           (a.rank[0] < b.rank[0] ?1: 0);
}

// This is the main function that takes a string
// 'txt' of size n as an argument, builds and return
// the suffix array for the given string
vector<int> buildSuffixArray(string txt, int n)
{
    // A structure to store suffixes and their indexes
    struct suffix suffixes[n];

    // Store suffixes and their indexes in an array
    // of structures. The structure is needed to sort
    // the suffixes alphabatically and maintain their
    // old indexes while sorting
    for (int i = 0; i < n; i++)
    {
        suffixes[i].index = i;
        suffixes[i].rank[0] = txt[i] - 'a';
        suffixes[i].rank[1] = ((i+1) < n)?
                              (txt[i + 1] - 'a'): -1;
    }

    // Sort the suffixes using the comparison function
    // defined above.
    sort(suffixes, suffixes+n, cmp);

    // At his point, all suffixes are sorted according
    // to first 2 characters.  Let us sort suffixes
    // according to first 4 characters, then first
    // 8 and so on
    int ind[n];  // This array is needed to get the
                 // index in suffixes[] from original
                 // index. This mapping is needed to get
                 // next suffix.
    for (int k = 4; k < 2*n; k = k*2)
    {
        // Assigning rank and index values to first suffix
        int rank = 0;
        int prev_rank = suffixes[0].rank[0];
        suffixes[0].rank[0] = rank;
        ind[suffixes[0].index] = 0;

        // Assigning rank to suffixes
        for (int i = 1; i < n; i++)
        {
            // If first rank and next ranks are same as
            // that of previous suffix in array, assign
            // the same new rank to this suffix
            if (suffixes[i].rank[0] == prev_rank &&
               suffixes[i].rank[1] == suffixes[i-1].rank[1])
            {
                prev_rank = suffixes[i].rank[0];
                suffixes[i].rank[0] = rank;
            }

            else // Otherwise increment rank and assign
            {
                prev_rank = suffixes[i].rank[0];
                suffixes[i].rank[0] = ++rank;
            }
            ind[suffixes[i].index] = i;
        }

        // Assign next rank to every suffix
        for (int i = 0; i < n; i++)
        {
            int nextindex = suffixes[i].index + k/2;
            suffixes[i].rank[1] = (nextindex < n)?
                      suffixes[ind[nextindex]].rank[0]: -1;
        }

        // Sort the suffixes according to first k characters
        sort(suffixes, suffixes+n, cmp);
    }

    // Store indexes of all sorted suffixes in the suffix
    // array
    vector<int>suffixArr;
    for (int i = 0; i < n; i++)
        suffixArr.push_back(suffixes[i].index);

    // Return the suffix array
    return  suffixArr;
}

/* To construct and return LCP */
vector<int> kasai(string txt, vector<int> suffixArr)
{
    int n = suffixArr.size();

    // To store LCP array
    vector<int> lcp(n, 0);

    // An auxiliary array to store inverse of suffix array
    // elements. For example if suffixArr[0] is 5, the
    // invSuff[5] would store 0.  This is used to get next
    // suffix string from suffix array.
    vector<int> invSuff(n, 0);

    // Fill values in invSuff[]
    for (int i=0; i < n; i++)
        invSuff[suffixArr[i]] = i;

    // Initialize length of previous LCP
    int k = 0;

    // Process all suffixes one by one starting from
    // first suffix in txt[]
    for (int i=0; i<n; i++)
    {
        /* If the current suffix is at n-1, then we don’t
           have next substring to consider. So lcp is not
           defined for this substring, we put zero. */
        if (invSuff[i] == n-1)
        {
            k = 0;
            continue;
        }

        /* j contains index of the next substring to
           be considered  to compare with the present
           substring, i.e., next string in suffix array */
        int j = suffixArr[invSuff[i]+1];

        // Directly start matching from k'th index as
        // at-least k-1 characters will match
        while (i+k<n && j+k<n && txt[i+k]==txt[j+k])
            k++;

        lcp[invSuff[i]] = k; // lcp for the present suffix.

        // Deleting the starting character from the string.
        if (k>0)
            k--;
    }

    // return the constructed lcp array
    return lcp;
}

//  method to return count of total distinct substring
int countDistinctSubstring(string txt)
{
    int n = txt.length();
    //  calculating suffix array and lcp array
    vector<int> suffixArr = buildSuffixArray(txt, n);
    vector<int> lcp = kasai(txt, suffixArr);

    // n - suffixArr[i] will be the length of suffix
    // at ith position in suffix array initializing
    // count with length of first suffix of sorted
    // suffixes
    int result = n - suffixArr[0];

    for (int i = 1; i < lcp.size(); i++)

        //  subtract lcp from the length of suffix
        result += (n - suffixArr[i]) - lcp[i - 1];

    result++;  // For empty string
    return result;
}

//  Driver code to test above methods
int main()
{
    string txt = "ababa";
    cout << countDistinctSubstring(txt);
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
10
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

