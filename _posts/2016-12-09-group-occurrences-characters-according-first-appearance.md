---
layout: post
title: Group all occurrences of characters according to first appearance
---
* Given a string of lowercase characters, the task is to print the string in a manner such that a character comes first in string displays first with all its occurrences in string.
* Examples:
{% highlight cpp %}
Input : str = "geeksforgeeks"
Output:  ggeeeekkssfor
Explanation: In the given string 'g' comes first 
and occurs 2 times so it is printed first
Then 'e' comes in this string and 4 times so 
it gets printed. Similarly remaining string is
printed.

Input :  str = "occurrence"
output : occcurreen 

Input  : str = "cdab"
Output : cdab
{% endhighlight %}
* This problem is a string version of following problem for array of integers.
* Group multiple occurrence of array elements ordered by first occurrences
* Since given strings have only 26 possible characters, it is easier to implement for strings.
* Implementation: 1- Count the occurrence of all the characters in given string using an array of size 26. 2- Then start traversing the string. Print every character its count times.
{% highlight cpp %}
// C++ program to print all occurrences of every character
// together.
# include<bits/stdc++.h>
using namespace std;

// Since only lower case characters are there
const int MAX_CHAR = 26;

// Function to print the string
void printGrouped(string str)
{
    int n = str.length();

    // Initialize counts of all characters as 0
    int  count[MAX_CHAR] = {0};

    // Count occurrences of all characters in string
    for (int i = 0 ; i < n ; i++)
        count[str[i]-'a']++;

    // Starts traversing the string
    for (int i = 0; i < n ; i++)
    {
        // Print the character till its count in
        // hash array
        while (count[str[i]-'a']--)
            cout << str[i];

        // Make this character's count value as 0.
        count[str[i]-'a'] = 0;
    }
}

// Driver code
int main()
{
    string str = "geeksforgeeks";

    printGrouped(str);

    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to print all occurrences of every character
// together.

class Test
{
    // Since only lower case characters are there
    static final int MAX_CHAR = 26;
    
    // Method to print the string
    static void printGrouped(String str)
    {
        int n = str.length();
     
        // Initialize counts of all characters as 0
        int  count[] = new int[MAX_CHAR];
     
        // Count occurrences of all characters in string
        for (int i = 0 ; i < n ; i++)
            count[str.charAt(i)-'a']++;
     
        // Starts traversing the string
        for (int i = 0; i < n ; i++)
        {
            // Print the character till its count in
            // hash array
            while (count[str.charAt(i)-'a']!=0){
                System.out.print(str.charAt(i));
                count[str.charAt(i)-'a']--;
            }
     
            // Make this character's count value as 0.
            count[str.charAt(i)-'a'] = 0;
        }
    }
    
    // Driver method
    public static void main(String args[])
    {
        String str = new String("geeksforgeeks");
         
        printGrouped(str);
    }
}
{% endhighlight %}
{% highlight cpp %}
ggeeeekkssfor
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

