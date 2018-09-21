---
layout: post
title: Change string to a new character set
---
* Given a 26 letter character set, which is equivalent to character set of English alphabet i.e. (abcd….xyz) and act as a relation. We are also given several sentences and we have to translate them with the help of given new character set.
* Examples:
{% highlight cpp %}
New character set : qwertyuiopasdfghjklzxcvbnm
Input : "utta"
Output : geek

Input : "egrt"
Output : code
{% endhighlight %}
* Idea behind conversion of new character set is to use hashing. Perform hashing of new character set where element of set is index and its position will be new alphabet value.
* Explanation:
* Given New character set = “qwertyuiopasdfghjklzxcvbnm”
* For “egrt” is equivalent to “code”.
{% highlight cpp %}
// CPP program to change the sentence
// with virtual dictionary 
#include<bits/stdc++.h>
using namespace std;

// Converts str to given character set
void conversion(char charSet[], string &str)
{ 
    int n = str.length();

    // hashing for new character set
    char hashChar[26];
    for (int i = 0; i < 27; i++)    
        hashChar[charSet[i]-'a'] = 'a' + i;    
    
    // conversion of new character set
    for (int i = 0; i < n; i++)
        str[i] = hashChar[str[i]-'a'];
}

// Driver code
int main()
{
    char charSet[27] = "qwertyuiopasdfghjklzxcvbnm";
    string str = "egrt"; 
    conversion(charSet, str);
    cout << str;
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
code
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

