---
layout: post
title: Print all palindromic partitions of a string
---
* Given a string s, partition s such that every string of the partition is a palindrome. Return all possible palindrome partitioning of s.
* Example :
{% highlight cpp %}
Input  : s = "bcc"
Output : [["b", "c", "c"], ["b", "cc"]]

Input  : s = "geeks"
Output : [["g", "e", "e", "k", "s"], 
          ["g", "ee", "k", "s"]]
{% endhighlight %}
* We have to list the all possible partitions so we will think in the direction of recursion. When we are on index i, we incrementally check all substrings starting from i for being palindromic. If found, we recursively solve the problem for the remaining string and add this in our solution.
* Following is the solution-
* To check whether it’s a palindrome or not, iterate on string by taking two pointers. Initialize the first to start and other to end of string. If both characters are same increase the first and decrease the last pointer and keep on iterating until first is less than last one.
{% highlight c %}
// C++ program to print all palindromic partitions
// of a given string.
#include <bits/stdc++.h>
using namespace std;

// Returns true if str is palindrome, else false
bool checkPalindrome(string str)
{
    int len = str.length();
    len--;
    for (int i=0; i<len; i++)
    {
        if (str[i] != str[len])
            return false;
        len--;
    }
    return true;
}

void printSolution(vector<vector<string> > partitions)
{
    for (int i = 0; i < partitions.size(); ++i)
    {
        for(int j = 0; j < partitions[i].size(); ++j)
            cout << partitions[i][j] << " ";
        cout << endl;
    }
    return;
}

// Goes through all indexes and recursively add remaining
// partitions if current string is palindrome.
void addStrings(vector<vector<string> > &v, string &s,
                vector<string> &temp, int index)
{
    int len = s.length();
    string str;
    vector<string> current = temp;
    if (index == 0)
        temp.clear();
    for (int i = index; i < len; ++i)
    {
        str = str + s[i];
        if (checkPalindrome(str))
        {
            temp.push_back(str);
            if (i+1 < len)
                addStrings(v,s,temp,i+1);
            else
                v.push_back(temp);
            temp = current;
        }
    }
    return;
}

// Generates all palindromic partitions of 's' and
// stores the result in 'v'.
void partition(string s, vector<vector<string> >&v)
{
    vector<string> temp;
    addStrings(v, s, temp, 0);
    printSolution(v);
    return;
}

// Driver code
int main()
{
    string s = "geeks";
    vector<vector<string> > partitions;
    partition(s, partitions);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to print all palindromic partitions
// of a given string.
import java.util.ArrayList;
public class GFG 
{     
    // Returns true if str is palindrome, else false
    static boolean checkPalindrome(String str)
    {
        int len = str.length();
        len--;
        for (int i=0; i<len; i++)
        {
            if (str.charAt(i) != str.charAt(len))
                return false;
            len--;
        }
        return true;
    }
    
    // Prints the partition list
    static void printSolution(ArrayList<ArrayList<String>> 
                                          partitions)
    {
        for(ArrayList<String> i: partitions)
        {
            for(String j: i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
     
    // Goes through all indexes and recursively add remaining
    // partitions if current string is palindrome.
    static ArrayList<ArrayList<String>> addStrings(ArrayList<
       ArrayList<String>> v, String s, ArrayList<String> temp, 
                                             int index)
    {
        int len = s.length();
        String str = "";
        ArrayList<String> current = new ArrayList<>(temp);
        
        if (index == 0)
            temp.clear();
        
        // Iterate over the string
        for (int i = index; i < len; ++i)
        {
            str = str + s.charAt(i);
            
            // check whether the substring is 
            // palindromic or not
            if (checkPalindrome(str))
            {
                // if palindrome add it to temp list
                temp.add(str);
                
                if (i + 1 < len)
                {    
                    // recurr to get all the palindromic
                    // partitions for the substrings
                    v = addStrings(v,s,temp,i+1);
                }
                else
                {
                    // if end of the string is reached 
                    // add temp to v
                    v.add(temp);
                }
                
                // temp is reinitialize with the 
                // current i.
                temp = new ArrayList<>(current);
            }
        }
        return v;
    }
     
    // Generates all palindromic partitions of 's' and
    // stores the result in 'v'.
    static void partition(String s, ArrayList<ArrayList<
                                          String>> v)
    {
        // temporary ArrayList to store each
        // palindromic string
        ArrayList<String> temp = new ArrayList<>();
        
        // calling addString method it adds all  
        // the palindromic partitions to v
        v = addStrings(v, s, temp, 0);
        
        // printing the solution
        printSolution(v);
    }
     
    // Driver code
    public static void main(String args[])
    {
        String s = "geeks";
        ArrayList<ArrayList<String>> partitions = new
                                           ArrayList<>();
        partition(s, partitions);
    }
}
// This code is contributed by Sumit Ghosh
{% endhighlight %}
{% highlight cpp %}
g e e k s 
g ee k s
{% endhighlight %}
* Related Article: Dynamic Programming | Set 17 (Palindrome Partitioning)
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above

