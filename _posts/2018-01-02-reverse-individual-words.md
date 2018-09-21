---
layout: post
title: Reverse individual words
---
* Given a string str, we need to print reverse of individual words.
* Examples:
{% highlight cpp %}
Input : Hello World
Output : olleH dlroW
 
Input :  Geeks for Geeks
Output : skeeG rof skeeG
{% endhighlight %}
* Method 1 (Simple): Generate all words separated by space. One by one reverse words and print them separated by space.
* Method 2 (Space Efficient): We use a stack to push all words before space. As soon as we encounter a space, we empty the stack.
{% highlight cpp %}
// C++ program to reverse individual words in a given 
// string using STL list
#include <bits/stdc++.h>
using namespace std;

// reverses individual words of a string
void reverseWords(string str)
{
    stack<char> st;

    // Traverse given string and push all characters
    // to stack until we see a space.
    for (int i = 0; i < str.length(); ++i) {
        if (str[i] != ' ')
            st.push(str[i]);

        // When we see a space, we print contents
        // of stack.
        else {
            while (st.empty() == false) {
                cout << st.top();
                st.pop();
            }
            cout << " ";
        }
    }

    // Since there may not be space after
    // last word.
    while (st.empty() == false) {
        cout << st.top();
        st.pop();
    }
}

// Driver program to test function
int main()
{
    string str = "Geeks for Geeks";
    reverseWords(str);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to reverse individual 
// words in a given string using STL list
import java.io.*;
import java.util.*;

class GFG {

// reverses individual words of a string
static void reverseWords(String str)
{
    Stack<Character> st=new Stack<Character>();
 
    // Traverse given string and push all
    // characters to stack until we see a space.
    for (int i = 0; i < str.length(); ++i) {
        if (str.charAt(i) != ' ')
            st.push(str.charAt(i));
 
        // When we see a space, we print
        // contents of stack.
        else {
            while (st.empty() == false) {
                System.out.print(st.pop());
                
            }
            System.out.print(" ");
        }
    }
 
    // Since there may not be space after
    // last word.
    while (st.empty() == false) {
        System.out.print(st.pop());
        
    }
}

// Driver program to test above function
public static void main(String[] args)
{
   String str = "Geeks for Geeks";
    reverseWords(str);
  }
}
{% endhighlight %}
{% highlight cpp %}
skeeG rof skeeG
{% endhighlight %}
* Python | Reverse each word in a sentence
* Using stringstream in C++ :
{% highlight cpp %}
#include<bits/stdc++.h>
using namespace std;
 
void printWords(string str)
{
    // word variable to store word
    string word;
 
    // making a string stream
    stringstream iss(str);
 
    // Read and print each word.
    while (iss >> word){
        reverse(word.begin(),word.end());
        cout<<word<<" ";
    }
}
 
// Driver code
int main()
{
    string s = "GeeksforGeeks is good to learn";
    printWords(s);
    return 0;
}
// This code is contributed by Nikhil Rawat
{% endhighlight %}
* Time complexity : O(n) Space complexity : O(n)
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

