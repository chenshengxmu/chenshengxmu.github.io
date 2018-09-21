---
layout: post
title: Remove all consecutive duplicates from the string
---
* Given a string S, remove all the consecutive duplicates. Note that this problem is different from Recursively remove all adjacent duplicates. Here we keep one character and remove all subsequent same characters.
* Examples:
{% highlight cpp %}
Input  : aaaaabbbbbb
Output : ab

Input : geeksforgeeks
Output : geksforgeks

Input : aabccba
Output : abcba
{% endhighlight %}
* Recursive Solution:
* The above problem can be solved using recursion.
* The recursion tree for the string S = aabcca is shown below.
{% highlight cpp %}
aabcca   S = aabcca
        /
       abcca     S = abcca        
       /
      bcca       S = abcca
      /
     cca         S = abcca
     /
    ca           S = abca
   /
  a              S = abca (Output String)
 /
empty string
{% endhighlight %}
* The C++ implementation is given below.
{% highlight cpp %}
// Recursive Program to remove consecutive
// duplicates from string S.
#include <bits/stdc++.h>
using namespace std;

// A recursive function that removes 
// consecutive duplicates from string S
void removeDuplicates(char* S)
{
    // When string is empty, return
    if (S[0] == '&#092;&#048;')
        return;

    // if the adjacent characters are same
    if (S[0] == S[1]) {
        
        // Shift character by one to left
        int i = 0; 
        while (S[i] != '&#092;&#048;') {
            S[i] = S[i + 1];
            i++;
        }

        // Check on Updated String S
        removeDuplicates(S);
    }

    // If the adjacent characters are not same
    // Check from S+1 string address
    removeDuplicates(S + 1);
}

// Driver Program
int main()
{
    char S1[] = "geeksforgeeks";
    removeDuplicates(S1);
    cout << S1 << endl;

    char S2[] = "aabcca";
    removeDuplicates(S2);
    cout << S2 << endl;

    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
geksforgeks
abca
{% endhighlight %}
* The worst case time complexity of the above solution is O(n2). The worst case happens when all characters are same.
* Iterative Solution :
* The idea is to keep track of two indexes, index of current character in str and index of next distinct character in str. Whenever we see same character, we only increment current character index. We we see different character, we increment index of distinct character.
{% highlight cpp %}
// C++ program to remove consecutive 
// duplicates from a given string.
#include <bits/stdc++.h>
using namespace std;

// A iterative function that removes  
// consecutive duplicates from string S
void removeDuplicates(char S[]){
    
   int n = strlen(S);

   // We don't need to do anything for
   // empty or single character string.
   if (n < 2)
     return;
   
   // j is used to store index is result
   // string (or index of current distinct
   // character)  
   int j = 0;

   // Traversing string 
   for (int i=1; i<n; i++)
   {
       // If current character S[i]
       // is different from S[j]
       if (S[j] != S[i])
       {
           j++; 
           S[j] = S[i];
       }     
   }   

   // Putting string termination
   // character.
   j++;
   S[j] = '&#092;&#048;';     
}
 
// Driver Program
int main() {
     
    char S1[] = "geeksforgeeks";
    removeDuplicates(S1);
    cout << S1 << endl;
     
    char S2[] = "aabcca";
    removeDuplicates(S2);
    cout << S2 << endl;
     
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
geksforgeks
abca
{% endhighlight %}
* Time Complexity : O(n) Auxiliary Space : O(1)
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

