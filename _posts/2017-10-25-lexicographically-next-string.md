---
layout: post
title: Lexicographically next string
---
* Given a string, find lexicographically next string.
* Examples:
{% highlight cpp %}
Input : geeks
Output : geekt
The last character 's' is changed to 't'.

Input : raavz
Output : raawz
Since we can't increase last character, 
we increment previous character.

Input :  zzz
Output : zzza
{% endhighlight %}
* If string is empty, we return ‘a’. If string contains all characters as ‘z’, we append ‘a’ at the end. Otherwise we find first character from end which is not z and increment it.
{% highlight cpp %}
// C++ program to find lexicographically next
// string
#include <bits/stdc++.h>
using namespace std;

string nextWord(string s)
{
    // If string is empty.
    if (s == "")
        return "a";

    // Find first character from right 
    // which is not z.
    
    int i = s.length() - 1;
    while (s[i] == 'z' && i >= 0)
        i--;

    // If all characters are 'z', append
    // an 'a' at the end.
    if (i == -1) 
        s = s + 'a';

    // If there are some non-z characters 
    else
        s[i]++;

    return s; 
}

// Driver code
int main()
{
    string str = "samez";
    cout << nextWord(str);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to find 
// lexicographically next string
import java.util.*;

class GFG
{
public static String nextWord(String str)
{
    
    // if string is empty
    if (str == "")
    return "a";
    
    // Find first character from
    // right which is not z.
    int i = str.length() - 1;
    while (str.charAt(i) == 'z' && i >= 0)
        i--;
        
    // If all characters are 'z', 
    // append an 'a' at the end.
    if (i == -1) 
        str = str + 'a';

// If there are some
// non-z characters 
else
    str = str.substring(0, i) + 
         (char)((int)(str.charAt(i)) + 1) + 
                      str.substring(i + 1);
return str; 
}

// Driver Code
public static void main (String[] args)
{
    String str = "samez";
    System.out.print(nextWord(str));
}
}

// This code is contributed 
// by Kirti_Mangal
{% endhighlight %}
{% highlight cpp %}
samfz
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

