---
layout: post
title: Remove extra spaces from a string
---
* Given a string containing many consecutive spaces, trim all spaces so that all words should contain only a single space between them. The conversion should be done in-place and solution should handle trailing and leading spaces and also remove preceding spaces before common punctuation like full stop, comma and a question mark.
* Examples:
{% highlight cpp %}
Input: 
str = "   Hello Geeks . Welcome   to  GeeksforGeeks   .    ";
Output: 
"Hello Geeks. Welcome to GeeksforGeeks."

Input: 
str = "GeeksforGeeks";
Output: 
"GeeksforGeeks"
(No change is needed)
{% endhighlight %}
* This problem is an extension of Remove spaces from a given string
* The idea is to maintain 2 pointers. Initially both point to the beginning of the array.
* The first pointer keeps track of next position to be filled in output string.
* The second pointer is advanced to read all characters of the string one by one.
* On finding any non-space character, the character is copied to the location of the first pointer and then both the first and second pointers are advanced.
* If non-space character is full stop, comma or a question mark, we also remove any preceding space before it.
* On finding consecutive space characters, one only space is copied to the location of the first pointer and rest are ignored. The leading and trailing spaces are handled separately in the solution.
* Below is C++ implementation of above idea.
{% highlight cpp %}
// C++ program to implement custom trim() function
#include <iostream>
using namespace std;

// Function to in-place trim all spaces in the
// string such that all words should contain only
// a single space between them.
void removeSpaces(string &str)
{
    // n is length of the original string
    int n = str.length();

    // i points to next postion to be filled in
    // output string/ j points to next character
    // in the original string
    int i = 0, j = -1;

    // flag that sets to true is space is found
    bool spaceFound = false;

    // Handles leading spaces
    while (++j < n && str[j] == ' ');

    // read all characters of original string
    while (j < n)
    {
        // if current characters is non-space
        if (str[j] != ' ')
        {
            // remove preceding spaces before dot,
            // comma & question mark
            if ((str[j] == '.' || str[j] == ',' ||
                 str[j] == '?') && i - 1 >= 0 &&
                 str[i - 1] == ' ')
                str[i - 1] = str[j++];

            else
                // copy current character at index i
                // and increment both i and j
                str[i++] = str[j++];

            // set space flag to false when any
            // non-space character is found
            spaceFound = false;
        }
        // if current character is a space
        else if (str[j++] == ' ')
        {
            // If space is encountered for the first
            // time after a word, put one space in the
            // output and set space flag to true
            if (!spaceFound)
            {
                str[i++] = ' ';
                spaceFound = true;
            }
        }
    }

    // Remove trailing spaces
    if (i <= 1)
        str.erase(str.begin() + i, str.end());
    else
        str.erase(str.begin() + i - 1, str.end());
}

// Driver Code
int main()
{
    string str = "   Hello Geeks . Welcome   to"
                 "  GeeksforGeeks   .    ";

    removeSpaces(str);

    cout << str;

    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
Hello Geeks. Welcome to GeeksforGeeks.
{% endhighlight %}
* Time complexity of above solution is O(n).
* Auxiliary Space is O(1) as the conversion is done in-place.
* Another solution using predefined functions in Python 3:
{% highlight python %}
# Python program to Remove 
# extra spaces from a string
input_string = \
    '   Hello Geeks  .  Welcome ,    Do you love Geeks , Geeks  ? '
output_string = []
space_flag = False # Flag to check if spaces have occured

for index in range(len(input_string)):

    if input_string[index] != ' ':
        if space_flag == True:
            if (input_string[index] == '.' 
                    or input_string[index] == '?' 
                    or input_string[index] == ','):
                pass
            else:
                output_string.append(' ')
            space_flag = False
        output_string.append(input_string[index])
    elif input_string[index - 1] != ' ':
        space_flag = True

print (''.join(output_string))
{% endhighlight %}
* Output:
{% highlight cpp %}
Hello Geeks. Welcome to GeeksforGeeks. Do you love Geeks, Geeks?
{% endhighlight %}
* Time complexity of above solution is O(n). Auxiliary Space is O(n) as another list had to be created.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

