---
layout: post
title: Rearrange characters in a string such that no two adjacent are same
---
* Given a string with repeated characters, task is rearrange characters in a string so that no two adjacent characters are same.
* Note : It may be assumed that the string has only lowercase English alphabets.
* Examples:
{% highlight cpp %}
Input: aaabc 
Output: abaca 

Input: aaabb
Output: ababa 

Input: aa 
Output: Not Possible

Input: aaaabc 
Output: Not Possible
{% endhighlight %}
* Asked In : Amazon Interview
* Prerequisite : priority_queue.
* The idea is to put highest frequency character first (a greedy approach). We use a priority queue (Or Binary Max Heap) and put all characters and ordered by their frequencies (highest frequency character at root). We one by one take highest frequency character from the heap and add it to result. After we add, we decrease frequency of the character and we temporarily move this character out of priority queue so that it is not picked next time.
* We have to follow the step to solve this problem, they are: 1. Build a Priority_queue or max_heap, pq that stores characters and their frequencies. …… Priority_queue or max_heap is built on the bases of frequency of character. 2. Create a temporary Key that will used as the previous visited element ( previous element in resultant string. Initialize it { char = ‘#’ , freq = ‘-1’ } 3. While pq is not empty. ….. Pop an element and add it to result. ….. Decrease frequency of the popped element by ‘1’ ….. Push the previous element back into the priority_queue if it’s frequency > ‘0’ ….. Make the current element as previous element for the next iteration. 4. If length of resultant string and original, print “not possible”. Else print result.
* Below c++ implementation of above idea
{% highlight cpp %}
// C++ program to rearrange characters in a string
// so that no two adjacent characters are same.
#include<bits/stdc++.h>
using namespace std;

const int MAX_CHAR = 26;

struct Key
{
    int freq; // store frequency of character
    char ch;

    // function for priority_queue to store Key
    // according to freq
    bool operator<(const Key &k) const
    {
        return freq < k.freq;
    }
};

// Function to rearrange character of a string
// so that no char repeat twice
void rearrangeString(string str)
{
    int n = str.length();

    // Store frequencies of all characters in string
    int count[MAX_CHAR] = {0};
    for (int i = 0 ; i < n ; i++)
        count[str[i]-'a']++;

    // Insert all characters with their frequencies
    // into a priority_queue
    priority_queue< Key > pq;
    for (char c = 'a' ; c <= 'z' ; c++)
        if (count[c-'a'])
            pq.push( Key { count[c-'a'], c} );

    // 'str' that will store resultant value
    str = "" ;

    // work as the previous visited element
    // initial previous element be. ( '#' and
    // it's frequency '-1' )
    Key prev {-1, '#'} ;

    // traverse queue
    while (!pq.empty())
    {
        // pop top element from queue and add it
        // to string.
        Key k = pq.top();
        pq.pop();
        str = str + k.ch;

        // IF frequency of previous character is less
        // than zero that means it is useless, we
        // need not to push it
        if (prev.freq > 0)
            pq.push(prev);

        // make current character as the previous 'char'
        // decrease frequency by 'one'
        (k.freq)--;
        prev = k;
    }

    // If length of the resultant string and original
    // string is not same then string is not valid
    if (n != str.length())
        cout << " Not valid String " << endl;

    else // valid string
        cout << str << endl;
}

// Driver program to test above function
int main()
{
    string str = "bbbaa" ;
    rearrangeString(str);
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
babab
{% endhighlight %}
* Time complexity : O(n log n)
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

