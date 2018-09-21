---
layout: post
title: Count words that appear exactly two times in an array of words
---
* Given an array of n words. Some words are repeated twice, we need count such words. Examples:
{% highlight cpp %}
Input : s[] = {"hate", "love", "peace", "love", 
               "peace", "hate", "love", "peace", 
               "love", "peace"};
Output : 1
There is only one word "hate" that appears twice

Input : s[] = {"Om", "Om", "Shankar", "Tripathi", 
                "Tom", "Jerry", "Jerry"};
Output : 2
There are two words "Om" and "Jerry" that appear
twice.
{% endhighlight %}
* Source : Amazon Interview
* Below is the implementation.
{% highlight cpp %}
// C++ program to count all words with count
// exavtly 2.
#include <bits/stdc++.h>
using namespace std;

// Returns count of words with frequency
// exactly 2.
int countWords(string str[], int n)
{
    unordered_map<string, int> m;
    for (int i = 0; i < n; i++)
        m[str[i]] += 1;

    int res = 0;
    for (auto it = m.begin(); it != m.end(); it++)
        if ((it->second == 2))
            res++;

    return res;
}

// Driver code
int main()
{
    string s[] = { "hate", "love", "peace", "love",
                   "peace", "hate", "love", "peace",
                   "love", "peace" };
    int n = sizeof(s) / sizeof(s[0]);
    cout << countWords(s, n);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to count all words with count
// exactly 2.
import java.util.HashMap;
import java.util.Map;
public class GFG {
     
    // Returns count of words with frequency
    // exactly 2.
    static int countWords(String str[], int n)
    {
        // map to store count of each word
        HashMap<String, Integer> m = new HashMap<>();
        
        for (int i = 0; i < n; i++){
            if(m.containsKey(str[i])){
                int get = m.get(str[i]);
                m.put(str[i], get + 1);
            }
            else{
                m.put(str[i], 1);
            }
        }
            
        int res = 0;
        for (Map.Entry<String, Integer> it: m.entrySet()){
            if(it.getValue() == 2)
                res++;
        }
                
        return res;
    }
     
    // Driver code
    public static void main(String args[])
    {
        String s[] = { "hate", "love", "peace", "love",
                       "peace", "hate", "love", "peace",
                       "love", "peace" };
        int n = s.length;
        System.out.println( countWords(s, n));
    }
}
// This code is contributed by Sumit Ghosh
{% endhighlight %}
{% highlight python %}
# Python program to count all
# words with count
# exactly 2.
 
# Returns count of words with frequency
# exactly 2.
def countWords(stri, n):
    m = dict()
    for i in range(n):
        m[stri[i]] = m.get(stri[i],0) + 1
 
    res = 0
    for i in m.values():
        if i == 2:
            res += 1
 
    return res
 
# Driver code
s = [ "hate", "love", "peace", "love",
      "peace", "hate", "love", "peace",
                "love", "peace" ]
n = len(s)
print(countWords(s, n))

# This code is contributed
# by Shubham Rana
{% endhighlight %}
{% highlight cpp %}
1
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

