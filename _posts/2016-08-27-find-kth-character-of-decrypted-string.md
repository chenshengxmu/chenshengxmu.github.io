---
layout: post
title: Find k'th character of decrypted string
---
* Given an encoded string where repetitions of substrings are represented as substring followed by count of substrings. For example, if encrypted string is “ab2cd2” and k=4 , so output will be ‘b’ because decrypted string is “ababcdcd” and 4th character is ‘b’.
* Note: Frequency of encrypted substring can be of more than one digit. For example, in “ab12c3”, ab is repeated 12 times. No leading 0 is present in frequency of substring.
* Examples:
{% highlight cpp %}
Input: "a2b2c3", k = 5
Output: c
Decrypted string is "aabbccc"

Input : "ab4c2ed3", k = 9
Output : c
Decrypted string is "ababababccededed"

Input: "ab4c12ed3", k = 21
Output: e
Decrypted string is "ababababccccccccccccededed"
{% endhighlight %}
* The idea is simple. Initially take empty decrypted string then decompress the string by reading substring and it’s frequency one by one and append current substring in decrypted string by it’s frequency. Repeat the process till the end of string and print the K’th character from decrypted string.
{% highlight cpp %}
// C++ program to find K'th character in
// decrypted string
#include<bits/stdc++.h>
using namespace std;

// Function to find K'th character in Encoded String
char encodedChar(string str,int k)
{
    // expand string variable is used to
    // store final string after decompressing string str
    string expand = "";

    string temp;  // Current substring
    int freq = 0; // Count of current substring

    for (int i=0; str[i]!='\0'; )
    {
        temp = ""; // Current substring
        freq = 0; // count frequency of current substring

        // read characters untill you find a number
        // or end of string
        while (str[i]>='a' && str[i]<='z')
        {
            // push character in temp
            temp.push_back(str[i]);
            i++;
        }

        // read number for how many times string temp
        // will be repeated in decompressed string
        while (str[i]>='1' && str[i]<='9')
        {
            // generating frequency of temp
            freq = freq*10 + str[i] - '0';
            i++;
        }

        // now append string temp into expand
        // equal to its frequency
        for (int j=1; j<=freq; j++)
            expand.append(temp);
    }

    // this condition is to handle the case
    // when string str is ended with alphabeds
    // not with numeric value
    if (freq==0)
        expand.append(temp);

    return expand[k-1];
}

// Driver program to test the string
int main()
{
    string str = "ab4c12ed3";
    int k = 21;
    cout << encodedChar(str, k) << endl;
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to find K'th character in
// decrypted string
public class GFG {
     
    // Function to find K'th character in 
    // Encoded String
    static char encodedChar(String str,int k)
    {
        // expand string variable is used to
        // store final string after decompressing 
        // string str
        String expand = "";
     
        String temp = "";  // Current substring
        int freq = 0; // Count of current substring
     
        for (int i=0; i < str.length() ; )
        {
            temp = ""; // Current substring
            freq = 0; // count frequency of current
                      // substring
     
            // read characters until you find a number
            // or end of string
            while (i < str.length() && str.charAt(i)>='a'
                                && str.charAt(i)<='z')
            {
                // push character in temp
                temp += str.charAt(i);
                i++;
            }
     
            // read number for how many times string temp
            // will be repeated in decompressed string
            while (i < str.length() && str.charAt(i)>='1'
                                && str.charAt(i)<='9')
            {
                // generating frequency of temp
                freq = freq*10 + str.charAt(i) - '0';
                i++;
            }
     
            // now append string temp into expand
            // equal to its frequency
            for (int j=1; j<=freq; j++)
                 expand += temp;
        }
     
        // this condition is to handle the case
        // when string str is ended with alphabets
        // not with numeric value
        if (freq==0)
            expand += temp;
     
        return expand.charAt(k-1);
    }
     
    // Driver program to test the string
    public static void main(String args[])
    {
        String str = "ab4c12ed3";
        int k = 21;
        System.out.println(encodedChar(str, k));
    }
}
// This code is contributed by Sumit Ghosh
{% endhighlight %}
{% highlight cpp %}
e
{% endhighlight %}
* Exercise : The above solution builds the decoded string to find k’th character. Extend the solution to work in O(1) extra space.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

