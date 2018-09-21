---
layout: post
title: Check if a string is Pangrammatic Lipogram
---
* To understand what a pangrammatic lipogram is we will break this term down into 2 terms i.e. a pangram and a lipogram
* Pangram: A pangram or holoalphabetic sentence is a sentence using every letter of a given alphabet at least once. The best-known English pangram is “The quick brown fox jumps over the lazy dog.”
* Lipogram: A lipogram is a kind of constrained writing or word game consisting of writing paragraphs or longer works in which a particular letter or group of letters is avoided—usually a common vowel, and frequently E, the most common letter in the English language. Example: The original “Mary Had a Little Lamb” was changed by A. Ross Eckler Jr. to exclude the letter ‘S’.
{% highlight cpp %}
Original:
Mary had a little lamb
Its fleece was white as snow
And everywhere that Mary went
The lamb was sure to go

He followed her to school one day
That was against the rule
It made the children laugh and play
To see the lamb in school

Lipogram (Without "S"):
Mary had a little lamb
With fleece a pale white hue
And everywhere that Mary went
The lamb kept her in view

To academe he went with her,
Illegal, and quite rare;
It made the children laugh and play
To view the lamb in there
{% endhighlight %}
* Pangrammatic Lipogram: A pangrammatic lipogram is a text that uses every letter of the alphabet except one. For example, “The quick brown fox jumped over the lazy dog” omits the letter S, which the usual pangram includes by using the word jumps.
* Given a string, our task is to check whether this string is a pangrammatic lipogram or not?
* The idea to do this is, we will keep track of all the letters which are not found in the string.
* Below is the implementation of above idea:
{% highlight cpp %}
// C++ program to check if a string 
// is Pangrammatic Lipogram

#include<bits/stdc++.h>
using namespace std;

// collection of letters
string alphabets = "abcdefghijklmnopqrstuvwxyz";

/*
    Category                No of letters unmatched
    Pangram                     0
    Lipogram                    >1
    Pangrammatic Lipogram       1
*/

// function to check for a Pangrammatic Lipogram
void panLipogramChecker(string s)
{   
    // convert string to lowercase
    for(int i=0; i<s.length(); i++)
    {
        s[i] = tolower(s[i]);
    }
    
    // variable to keep count of all the letters 
    // not found in the string
    int counter = 0 ;
    
    // traverses the string for every 
    // letter of the alphabet
    for(int i=0 ; i<26 ; i++)
    {   
        int pos = s.find(alphabets[i]);
        
        // if character not found in string 
        // then increment count
        if(pos<0 || pos>s.length())
            counter += 1;
    }
  
    if(counter == 0)
        cout<<"Pangram"<<endl;
    else if(counter >= 2)
        cout<<"Not a pangram but might a lipogram"<<endl;
    else
        cout<<"Pangrammatic Lipogram"<<endl;
}

// Driver program to to test above function
int main()
{
    string str = "The quick brown fox jumped over the lazy dog";
    panLipogramChecker(str);
    
    str = "The quick brown fox jumps over the lazy dog";
    panLipogramChecker(str);
    
    str = "The quick brown fox jum over the lazy dog";
    panLipogramChecker(str);
}

// This code is contributed by Harsh Agarwal
{% endhighlight %}
{% highlight python %}
# Python program to check if a string 
# is Pangrammatic Lipogram

# collection of letters
alphabets = 'abcdefghijklmnopqrstuvwxyz'

'''
Category                No of letters unmatched
Pangram                     0
Lipogram                    >1
Pangrammatic Lipogram       1
'''

# function to check for a Pangrammatic Lipogram
def panLipogramChecker(s):
    s.lower()
    
    # variable to keep count of all the letters 
    # not found in the string
    counter = 0 
    
    # traverses the string for every 
    # letter of the alphabet
    for ch in alphabets: 
        # character not found in string then increment count
        if(s.find(ch) < 0): 
            counter += 1

    if(counter == 0):
        result = "Pangram"
    elif(counter == 1):
        result = "Pangrammatic Lipogram"
    else:
        result = "Not a pangram but might a lipogram"

    return result

# Driver program to to test above function
def main():
    print(panLipogramChecker("The quick brown fox \
                            jumped over the lazy dog"))
    
    print(panLipogramChecker("The quick brown fox \
                              jumps over the lazy dog"))

    print(panLipogramChecker("The quick brown fox jum\
                                     over the lazy dog"))
    

if __name__ == '__main__':
    main()
{% endhighlight %}
{% highlight cpp %}
Pangrammatic Lipogram
Pangram
Not a Pangram but might a Lipogram
{% endhighlight %}
* Time Complexity: O(26 * N) , here N is the number of characters in the string to be checked and 26 represents the total number of alphabets.
* Efficient Approach: An efficient approach will be instead of iterating through all the letters of the alphabet we can maintain a hashed array or map to store the count of occurrences of each letter of alphabet in the input string. Initially count of all the letters will be initialized to zero. We will start traversing the string and increment the count of characters. Once we have completed traversing the string then we will iterate over the map or hashed array to look for how many characters have count as zero. Thanks to Ravi Teja Gannavarapu for suggesting this approach.
* Below is implementation of above idea.
{% highlight python %}
# Python program to check for a Pangrammatic 
# Lipogram O(n) approach

'''
Category                No of letters unmatched
Pangram                     0
Lipogram                    >1
Pangrammatic Lipogram       1
'''

# function to check for Pangrammatic Lipogram
def panLipogramChecker(s):
    
    # dictionary to keep count of the 
    # occurence of each letter
    counter = {'a': 0, 'b': 0, 'c': 0, 'd': 0, 'e': 0, 
               'f': 0, 'g': 0, 'h': 0, 'i': 0, 'j': 0, 
               'k': 0, 'l': 0, 'm': 0, 'n': 0, 'o': 0, 
               'p': 0, 'q': 0, 'r': 0, 's': 0, 't': 0, 
               'u': 0, 'v': 0, 'w': 0, 'x': 0, 'y': 0, 
               'z': 0}

    s = s.lower()
    
    # increment count of characters in dictionary
    for i in s:
        if (i.isalpha()):
            counter[i] += 1

    # returns a list containing the values of all
    # the keys in h=the dictionary
    b = list(counter.values())

    if (b.count(0) > 1):
        print ("Not a pangram, but might be a lipogram.")
    elif (b.count(0) == 1):
        print ("Pangrammatic Lipogram.")
    elif (b.count(0) < 1):
        print ("Pangram.")


# Driver program to test above function
def main():
    panLipogramChecker("The quick brown fox \
                        jumped over the lazy dog")
    panLipogramChecker("The quick brown fox \
                        jumps over the lazy dog")
    panLipogramChecker("The quick brown fox \
                        jum over the lazy dog")

if __name__ == '__main__':
    main()
{% endhighlight %}
* Output:
{% highlight cpp %}
Pangrammatic Lipogram
Pangram
Not a Pangram but might a Lipogram
{% endhighlight %}
* Time Complexity: O(N), where N is the number of characters in the input string.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

