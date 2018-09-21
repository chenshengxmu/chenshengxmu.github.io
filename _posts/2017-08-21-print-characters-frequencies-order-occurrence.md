---
layout: post
title: Print characters and their frequencies in order of occurrence
---
* Given a string str containing only lowercase characters. The problem is to print the characters along with their frequency in order of their occurrence and in the given format explained in the examples below.
* Examples:
{% highlight cpp %}
Input : str = "geeksforgeeks"
Output : g2 e4 k2 s2 f1 o1 r1

Input : str = "elephant"
Output : e2 l1 p1 h1 a1 n1 t1
{% endhighlight %}
* Source: SAP Interview Experience | Set 26
* Approach: Create a count array to store the frequency of each character in the given string str. Traverse the string str again and check whether the frequency of that character is 0 or not. If not 0, then print the character along with its frequency and update its frequency to 0 in the hash table. This is done so that the same character is not printed again.
{% highlight cpp %}
// C++ implementation to print the character and
// its frequency in order of its occurrence
#include <bits/stdc++.h>
using namespace std;

#define SIZE 26

// function to print the character and its frequency
// in order of its occurrence
void printCharWithFreq(string str)
{
    // size of the string 'str'
    int n = str.size();

    // 'freq[]' implemented as hash table
    int freq[SIZE];

    // initialize all elements of freq[] to 0
    memset(freq, 0, sizeof(freq));

    // accumulate freqeuncy of each character in 'str'
    for (int i = 0; i < n; i++)
        freq[str[i] - 'a']++;

    // traverse 'str' from left to right
    for (int i = 0; i < n; i++) {

        // if frequency of character str[i] is not
        // equal to 0
        if (freq[str[i] - 'a'] != 0) {

            // print the charcter along with its
            // frequency
            cout << str[i] << freq[str[i] - 'a'] << " ";

            // update frequency of str[i] to 0 so 
            // that the same character is not printed 
            // again
            freq[str[i] - 'a'] = 0;
        }
    }
}

// Driver program to test above
int main()
{
    string str = "geeksforgeeks";
    printCharWithFreq(str);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java implementation to print the character and
// its frequency in order of its occurrence
public class Char_frequency {
    
    static final int SIZE = 26;
     
    // function to print the character and its 
    // frequency in order of its occurrence
    static void printCharWithFreq(String str)
    {
         // size of the string 'str'
        int n = str.length();

        // 'freq[]' implemented as hash table
        int[] freq = new int[SIZE];

        // accumulate freqeuncy of each character
        // in 'str'
        for (int i = 0; i < n; i++)
            freq[str.charAt(i) - 'a']++;

        // traverse 'str' from left to right
        for (int i = 0; i < n; i++) {

            // if frequency of character str.charAt(i)
            // is not equal to 0
            if (freq[str.charAt(i) - 'a'] != 0) {

                // print the character along with its
                // frequency
                System.out.print(str.charAt(i));
                System.out.print(freq[str.charAt(i) - 'a'] + " "); 

                // update frequency of str.charAt(i) to 
                // 0 so that the same character is not
                // printed again
                freq[str.charAt(i) - 'a'] = 0;
            }
        }
    }
     
    // Driver program to test above
    public static void main(String args[])
    {
        String str = "geeksforgeeks";
        printCharWithFreq(str);
    }
}
// This code is contributed by Sumit Ghosh
{% endhighlight %}
{% highlight python %}
# Python3 implementation to pr the character and
# its frequency in order of its occurrence

# import library
import numpy as np

# Function to print the character and its 
# frequency in order of its occurrence
def prCharWithFreq(str) :
    
    # Size of the 'str'
    n = len(str)
    
    # Initialize all elements of freq[] to 0
    freq = np.zeros(26, dtype = np.int)

    # Accumulate freqeuncy of each 
    # character in 'str'
    for i in range(0, n) :
        freq[ord(str[i]) - ord('a')] += 1 
                
    # Traverse 'str' from left to right
    for i in range(0, n) :
        
        # if frequency of character str[i]  
        # is not equal to 0
        if (freq[ord(str[i])- ord('a')] != 0) :
            
            # print the charcter along 
            # with its frequency
            print (str[i], freq[ord(str[i]) - ord('a')], 
                                                end = " ")

            # Update frequency of str[i] to 0 so that
            # the same character is not printed again
            freq[ord(str[i]) - ord('a')] = 0
        
    
# Driver Code
if __name__ == "__main__" :
    
    str = "geeksforgeeks";
    prCharWithFreq(str);
    
# This code is contributed by 'Saloni1297'
{% endhighlight %}
{% highlight cpp %}
g2 e4 k2 s2 f1 o1 r1
{% endhighlight %}
* Time Complexity: O(n), where n is the number of characters in the string. Auxiliary Space: O(1), as there are only lowercase letters.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

