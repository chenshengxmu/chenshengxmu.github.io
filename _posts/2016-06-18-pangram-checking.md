---
layout: post
title: Pangram Checking
---
* Given a string check if it is Pangram or not. A pangram is a sentence containing every letter in the English Alphabet.
* Examples : The quick brown fox jumps over the lazy dog ” is a Pangram [Contains all the characters from ‘a’ to ‘z’] “The quick brown fox jumps over the dog” is not a Pangram [Doesn’t contains all the characters from ‘a’ to ‘z’, as ‘l’, ‘z’, ‘y’ are missing]
* We create a mark[] array of Boolean type. We iterate through all the characters of our string and whenever we see a character we mark it. Lowercase and Uppercase are considered the same. So ‘A’ and ‘a’ are marked in index 0 and similarly ‘Z’ and ‘z’ are marked in index 25.
* After iterating through all the characters we check whether all the characters are marked or not. If not then return false as this is not a pangram else return true.
{% highlight cpp %}
// A C++ Program to check if the given
// string is a pangram or not
#include<bits/stdc++.h>
using namespace std;

// Returns true if the string is pangram else false
bool checkPangram (string &str)
{
    // Create a hash table to mark the characters
    // present in the string
    vector<bool> mark(26, false);

    // For indexing in mark[]
    int index;

    // Traverse all characters
    for (int i=0; i<str.length(); i++)
    {
        // If uppercase character, subtract 'A'
        // to find index.
        if ('A' <= str[i] && str[i] <= 'Z')
            index = str[i] - 'A';

        // If lowercase character, subtract 'a'
        // to find index.
        else if('a' <= str[i] && str[i] <= 'z')
            index = str[i] - 'a';

        // Mark current character
        mark[index] = true;
    }

    // Return false if any character is unmarked
    for (int i=0; i<=25; i++)
        if (mark[i] == false)
            return (false);

    // If all characters were present
    return (true);
}

// Driver Program to test above functions
int main()
{
    string str = "The quick brown fox jumps over the"
                 " lazy dog";

    if (checkPangram(str) == true)
        printf (""%s" is a pangram", str.c_str());
    else
        printf (""%s" is not a pangram", str.c_str());

    return(0);
}
{% endhighlight %}
{% highlight java %}
// Java Program to illustrate Pangram
class GFG 
{

    // Returns true if the string
    // is pangram else false
    public static boolean checkPangram (String str)
    {
        // Create a hash table to mark the 
        // characters present in the string
        // By default all the elements of 
        // mark would be false.
        boolean[] mark = new boolean[26];

        // For indexing in mark[]
        int index = 0;

        // Traverse all characters
        for (int i = 0; i < str.length(); i++)
        {
            // If uppercase character, subtract 'A'
            // to find index.
            if ('A' <= str.charAt(i) && 
                    str.charAt(i) <= 'Z')
                        
                index = str.charAt(i) - 'A';

                // If lowercase character, subtract 'a'
                // to find index.
            else if('a' <= str.charAt(i) && 
                        str.charAt(i) <= 'z')
                            
                index = str.charAt(i) - 'a';

            // Mark current character
            mark[index] = true;
        }

        // Return false if any character is unmarked
        for (int i = 0; i <= 25; i++)
            if (mark[i] == false)
                return (false);

        // If all characters were present
        return (true);
    }

    // Driver Code
    public static void main(String[] args) 
    {
        String str = "The quick brown fox jumps over the lazy dog";

        if (checkPangram(str) == true)
            System.out.print(str + " is a pangram.");
        else
            System.out.print(str+ " is not a pangram.");

    }
}
{% endhighlight %}
{% highlight python %}
# A Python Program to check if the given
# string is a pangram or not

def checkPangram(s):
    List = []
    # create list of 26 charecters and set false each entry
    for i in range(26):
        List.append(False)
        
    #converting the sentence to lowercase and iterating
    # over the sentence 
    for c in s.lower(): 
        if not c == " ":
            # make the corresponding entry True
            List[ord(c) -ord('a')]=True 
            
    #check if any charecter is missing then return False
    for ch in List:
        if ch == False:
            return False
    return True

# Driver Program to test above functions
sentence = "The quick brown fox jumps over the little lazy dog"

if (checkPangram(sentence)):
    print '"'+sentence+'"'
    print "is a pangram"
else:
    print '"'+sentence+'"'
    print "is not a pangram"

# This code is contributed by Danish Mushtaq
{% endhighlight %}
{% highlight cpp %}
"The quick brown fox jumps over the lazy dog"
 is a pangram
{% endhighlight %}
* Time Complexity: O(n), where n is the length of our string Auxiliary Space – O(1).
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above

