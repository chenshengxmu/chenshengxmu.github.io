---
layout: post
title: Second most repeated word in a sequence
---
* Given a sequence of strings, the task is to find out the second most repeated (or frequent) string in the given sequence.(Considering no two words are the second most repeated, there will be always a single word).
* Examples:
{% highlight cpp %}
Input : {"aaa", "bbb", "ccc", "bbb", 
         "aaa", "aaa"}
Output : bbb

Input : {"geeks", "for", "geeks", "for", 
          "geeks", "aaa"}
Output : for
{% endhighlight %}
* Asked in : Amazon
{% highlight cpp %}
// C++ program to find out the second
// most repeated word
#include <bits/stdc++.h>
using namespace std;

// Function to find the word
string secMostRepeated(vector<string> seq)
{

    // Store all the words with its occurrence
    unordered_map<string, int> occ;
    for (int i = 0; i < seq.size(); i++)
        occ[seq[i]]++;

    // find the second largest occurrence
    int first_max = INT_MIN, sec_max = INT_MIN;
    for (auto it = occ.begin(); it != occ.end(); it++) {
        if (it->second > first_max) {
            sec_max = first_max;
            first_max = it->second;
        }

        else if (it->second > sec_max && 
                 it->second != first_max)
            sec_max = it->second;
    }

    // Return string with occurrence equals
    // to sec_max
    for (auto it = occ.begin(); it != occ.end(); it++)
        if (it->second == sec_max)
            return it->first;
}

// Driver program
int main()
{
    vector<string> seq = { "ccc", "aaa", "ccc",
                          "ddd", "aaa", "aaa" };
    cout << secMostRepeated(seq);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to find out the second
// most repeated word

import java.util.*;

class GFG 
{
	// Method to find the word
	static String secMostRepeated(Vector<String> seq)
	{
	    // Store all the words with its occurrence
	    HashMap<String, Integer> occ = new HashMap<String,Integer>(seq.size()){
	    	@Override
	    	public Integer get(Object key) {
	    		 return containsKey(key) ? super.get(key) : 0;
	    	}
	    };
	   
	    for (int i = 0; i < seq.size(); i++)
	        occ.put(seq.get(i), occ.get(seq.get(i))+1);
	 
	    // find the second largest occurrence
	   int first_max = Integer.MIN_VALUE, sec_max = Integer.MIN_VALUE;
	    
	   Iterator<Map.Entry<String, Integer>> itr = occ.entrySet().iterator();
	   while (itr.hasNext()) 
       {
		   Map.Entry<String, Integer> entry = itr.next();
		   int v = entry.getValue();
		   if( v > first_max) {
	            sec_max = first_max;
	            first_max = v;
	        }
	 
	        else if (v > sec_max && 
	                 v != first_max)
	            sec_max = v;
       }
	   
	   // Return string with occurrence equals
	    // to sec_max
	   itr = occ.entrySet().iterator();
	   while (itr.hasNext()) 
       {
		   Map.Entry<String, Integer> entry = itr.next();
		   int v = entry.getValue();
		   if (v == sec_max)
	            return entry.getKey();
       }
	   
	   return null;
	}
	
	// Driver method
	public static void main(String[] args) 
	{
		String arr[] = { "ccc", "aaa", "ccc",
                         "ddd", "aaa", "aaa" };
		List<String> seq =  Arrays.asList(arr);
		
        System.out.println(secMostRepeated(new Vector<>(seq)));
	}	
}
// This program is contributed by Gaurav Miglani
{% endhighlight %}
{% highlight cpp %}
ccc
{% endhighlight %}
* Reference: https://www.careercup.com/question?id=5748104113422336
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

