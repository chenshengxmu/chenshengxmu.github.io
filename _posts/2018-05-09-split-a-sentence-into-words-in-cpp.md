---
layout: post
title: Split a sentence into words in C++
---
* Give a sentence, print different words present in it. Words are separated by space.
* Examples:
{% highlight cpp %}
Input : str = "Geeks for Geeks"
Output : Geeks
         for
         Geeks  
Explanation : All space separated words 
are printed line by line.

Input : str = "a computer science portal"
Output : a
         computer
         science
         portal
{% endhighlight %}
* Method 1 (Writing our own logic) We traverse through all characters. If current character is space, we have reached end of a word, we print current word and reset it to empty. Else we append current character to word.
{% highlight cpp %}
// C++ program to print words in a sentence
#include <bits/stdc++.h>
using namespace std;

void removeDupWord(string str)
{
   string word = "";
   for (auto x : str)
   {
       if (x == ' ')
       {
           cout << word << endl;
           word = "";
       }
       else
       {
           word = word + x;
       }
   } 
   cout << word << endl;
}

// Driver function
int main()
{
    string str = "Geeks for Geeks";
    removeDupWord(str);
    return 0;
}
{% endhighlight %}
{% highlight cpp %}
Geeks
for
Geeks
{% endhighlight %}
* Method 2 (Using strtok())
{% highlight cpp %}
// C++ program to words in a sentence.
#include <bits/stdc++.h>
using namespace std;

void removeDupWord(char str[])
{
    // Returns first token 
    char *token = strtok(str, " ");
 
    // Keep printing tokens while one of the
    // delimiters present in str[].
    while (token != NULL)
    {
        printf("%s\n", token);
        token = strtok(NULL, " ");
    }
}

// Driver function
int main()
{
    char str[] = "Geeks for Geeks";
    removeDupWord(str);
    return 0;
}
{% endhighlight %}
{% highlight cpp %}
Geeks
for
Geeks
{% endhighlight %}
* Method 3 (Using stringstream)
{% highlight cpp %}
// C++ program to print words in a sentence
#include <bits/stdc++.h>
using namespace std;

void removeDupWord(string str)
{
    // Used to split string around spaces.
    istringstream ss(str);

    // Traverse through all words
    do {
        // Read a word
        string word;
        ss >> word;

        // Print the read word
        cout << word << endl;

        // While there is more to read
    } while (ss);
}

// Driver function
int main()
{
    string str = "Geeks for Geeks";
    removeDupWord(str);
    return 0;
}
{% endhighlight %}
{% highlight cpp %}
Geeks
for
Geeks
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

