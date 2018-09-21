---
layout: post
title: Find one extra character in a string
---
* Given two strings which are of lengths n and n+1. The second string contains all the character of the first string, but there is one extra character. Your task to find the extra character in the second string.
* Examples :
{% highlight cpp %}
Input : string strA = "abcd";
        string strB = "cbdae";
Output : e
string B contain all the element 
there is a one extra character which is e

Input : string strA = "kxml";
        string strB = "klxml";
Output : l
string B contain all the element 
there is a one extra character which is l
{% endhighlight %}
* Method 1(Brute Force):- Check with two for loop. Time Complexity:- O(n^2) Space Complexity:- O(1).
* Method 2(Hash Map):- Create an empty hash table and insert all character of second string. Now remove all characters of first string. Remaining character is the extra character.
* Time Complexity:- O(n) Auxiliary Space:- O(n).
{% highlight cpp %}
// CPP program to find extra character in one 
// string
#include <bits/stdc++.h>
using namespace std;

char findExtraCharcter(string strA, string strB)
{
    // store string values in map
    unordered_map<char, int> m1;

    // store second string in map with frequency
    for (int i = 0; i < strB.length(); i++)
        m1[strB[i]]--;

    // store first string in map with frequency
    for (int i = 0; i < strA.length(); i++)
        m1[strA[i]]--;

    for (auto h1 = m1.begin(); h1 != m1.end(); h1++) {

        // if the frequency is 1 then this
        // character is which is added extra
        if (h1->second == -1)
            return h1->first;
    }
}

int main()
{
    // given string
    string strA = "abcd";
    string strB = "cbdae";

    // find Extra Character
    cout << findExtraCharcter(strA, strB);
}
{% endhighlight %}
{% highlight cpp %}
e
{% endhighlight %}
* Method 3(Bits):- traverse first and second string from starting with xor operation at the end you get the character which is extra. Time Complexity:- O(n+n+1) Space Complexity:- O(1).
{% highlight cpp %}
// CPP program to find extra character in one 
// string
#include <iostream>
using namespace std;

char findExtraCharcter(string strA, string strB)
{
    // result store the result
    int res = 0, i;

    // traverse string A till end and 
    // xor with res
    for (i = 0; i < strA.length(); i++) {

        // xor with res
        res ^= strA[i];
    }

    // traverse string B till end and 
    // xor with res
    for (i = 0; i < strB.length(); i++) {

        // xor with res
        res ^= strB[i];
    }

    // print result at the end
    return ((char)(res));
}

int main()
{
    // given string
    string strA = "abcd";
    string strB = "cbdad";
    cout << findExtraCharcter(strA, strB);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to find extra
// character in one string
import java.io.*;

class GFG {
    
    static char findExtraCharcter(String strA,
                                  String strB)
    {
        // result store the result
        int res = 0, i;
    
        // traverse string A till 
        // end and xor with res
        for (i = 0; i < strA.length(); i++)
        {
            // xor with res
            res ^= strA.charAt(i);
        }
    
        // traverse string B till end and 
        // xor with res
        for (i = 0; i < strB.length(); i++)
        {
            // xor with res
            res ^= strB.charAt(i);
        }
    
        // print result at the end
        return ((char)(res));
    }
    
    // Driver code
    public static void main(String args[])
    {
        // given string
        String strA = "abcd";
        String strB = "cbdad";
        System.out.println(findExtraCharcter(strA, strB));
    }
}

/*This code is contributed by Nikita Tiwari.*/
{% endhighlight %}
{% highlight python %}
# Python 3 program to find 
# extra character in one string

def findExtraCharcter(strA, strB) :
    
    # result store the result
    res = 0

    # traverse string A till 
    # end and xor with res
    for i in range(0,len(strA)) :
        
        # xor with res
        res =res ^ (ord)(strA[i])
        
    # traverse string B till 
    # end and xor with res
    for i in range(0,len(strB)) :
        
        # xor with res
        res = res ^ (ord)(strB[i])
        
    # print result at the end
    return ((chr)(res));

# given string
strA = "abcd"
strB = "cbdad"
print(findExtraCharcter(strA, strB))

# This code is contributed by Nikita Tiwari.
{% endhighlight %}
{% highlight cpp %}
d
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

