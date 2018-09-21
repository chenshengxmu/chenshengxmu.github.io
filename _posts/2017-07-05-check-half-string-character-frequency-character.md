---
layout: post
title: Check if both halves of the string have same set of characters
---
* Given a string of lowercase characters only, the task is to check if it is possible to split a string from middle which will gives two halves having the same characters and same frequency of each character. If the length of the given string is ODD then ignore the middle element and check for the rest.
* Examples:
{% highlight cpp %}
Input : abbaab
Output : NO
The two halves contain the same characters
but their frequencies do not match so they
are NOT CORRECT

Input : abccab
Output : YES
{% endhighlight %}
* Algorithm:
* Below is the implementation of above idea:
{% highlight cpp %}
// C++ program to check if it is
// possible to split string or not
#include <bits/stdc++.h>
using namespace std;
const int MAX_CHAR = 26;

// function to check if we can spilt
// string or not
bool checkCorrectOrNot(string s)
{
    // Counter array inisialized with 0
    int count1[MAX_CHAR] = {0};
    int count2[MAX_CHAR] = {0};

    // Length of the string
    int n = s.length();
    if (n == 1)
        return true;

    // traverse till the middle element
    // is reached
    for (int i=0,j=n-1; i<j; i++,j--)
    {
        // First half
        count1[s[i]-'a']++;

        // Second half
        count2[s[j]-'a']++;
    }

    // Checking if values are diffrent
    // set flag to 1
    for (int i = 0; i<MAX_CHAR; i++)
        if (count1[i] != count2[i])
            return false;

    return true;
}

// Driver program to test above function
int main()
{
    // String to be checked
    string s = "abab";

    if (checkCorrectOrNot(s))
        cout << "Yes\n";
    else
        cout << "No\n";
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to check if it two 
// half of string contain same Character
// set or not
public class GFG {

    static final int MAX_CHAR = 26;
     
    // function to check both halves
    // for equality
    static boolean checkCorrectOrNot(String s)
    {
        // Counter array inisialized with 0
        int[] count1 = new int[MAX_CHAR];
        int[] count2 = new int[MAX_CHAR];
     
        // Length of the string
        int n = s.length();
        if (n == 1)
            return true;
     
        // traverse till the middle element
        // is reached
        for (int i = 0, j = n - 1; i < j; i++, j--)
        {
            // First half
            count1[s.charAt(i) - 'a']++;
     
            // Second half
            count2[s.charAt(j) - 'a']++;
        }
     
        // Checking if values are different
        // set flag to 1
        for (int i = 0; i < MAX_CHAR; i++)
            if (count1[i] != count2[i])
                return false;
     
        return true;
    }
     
    // Driver program to test above function
    public static void main(String args[])
    {
        // String to be checked
        String s = "abab";
     
        if (checkCorrectOrNot(s))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
// This code is contributed by Sumit Ghosh
{% endhighlight %}
{% highlight python %}
# Python3 program to check if it is
# possible to split string or not
MAX_CHAR = 26

# Function to check if we 
# can spilt string or not
def checkCorrectOrNot(s):
    
    global MAX_CHAR
    
    # Counter array inisialized with 0
    count1 = [0] * MAX_CHAR
    count2 = [0] * MAX_CHAR

    # Length of the string
    n = len(s)
    
    if n == 1:
        return true

    # Traverse till the middle 
    # element is reached
    i = 0; j = n - 1
    
    while (i < j):
        
        # First half
        count1[ord(s[i]) - ord('a')] += 1

        # Second half
        count2[ord(s[j]) - ord('a')] += 1

        i += 1; j -= 1

    # Checking if values are 
    # diffrent set flag to 1
    for i in range(MAX_CHAR):
        
        if count1[i] != count2[i]:
            return False
            
    return True


# Driver Code

# String to be checked
s = "ababc"

print("Yes" if checkCorrectOrNot(s) else "No")


# This code is contributed by Ansu Kumari.
{% endhighlight %}
{% highlight cpp %}
YES
{% endhighlight %}
* Space optimized solution: Below is the space optimized solution of the above approach.
* Below is the implementation of above idea:
{% highlight cpp %}
// C++ program to check if it is
// possible to split string or not
#include <bits/stdc++.h>
using namespace std;
const int MAX_CHAR = 26;

// function to check if we can spilt
// string or not
bool checkCorrectOrNot(string s)
{
    // Counter array inisialized with 0
    int count[MAX_CHAR] = {0};

    // Length of the string
    int n = s.length();
    if (n == 1)
        return true;

    // traverse till the middle element
    // is reached
    for (int i=0,j=n-1; i<j; i++,j--)
    {
        // First half
        count[s[i]-'a']++;

        // Second half
        count[s[j]-'a']--;
    }

    // Checking if values are diffrent
    // set flag to 1
    for (int i = 0; i<MAX_CHAR; i++)
        if (count[i] != 0)
            return false;

    return true;
}

// Driver program to test above function
int main()
{
    // String to be checked
    string s = "abab";

    if (checkCorrectOrNot(s))
        cout << "Yes\n";
    else
        cout << "No\n";
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to check if it two 
// half of string contain same Character
// set or not
public class GFG {

    static final int MAX_CHAR = 26;
     
    // function to check both halves
    // for equality
    static boolean checkCorrectOrNot(String s)
    {
        // Counter array inisialized with 0
        int[] count = new int[MAX_CHAR];
     
        // Length of the string
        int n = s.length();
        if (n == 1)
            return true;
     
        // traverse till the middle element
        // is reached
        for (int i = 0,j = n - 1; i < j; i++, j--)
        {
            // First half
            count[s.charAt(i) - 'a']++;
     
            // Second half
            count[s.charAt(j) - 'a']--;
        }
     
        // Checking if values are different
        // set flag to 1
        for (int i = 0; i < MAX_CHAR; i++)
            if (count[i] != 0)
                return false;
     
        return true;
    }
     
    // Driver program to test above function
    public static void main(String args[])
    {
        // String to be checked
        String s = "abab";
     
        if (checkCorrectOrNot(s))
            System.out.println("Yes");
        else
           System.out.println("No");
    }
}
// This code is contributed by Sumit Ghosh
{% endhighlight %}
{% highlight python %}
# Python3 program to check if it is
# possible to split string or not
MAX_CHAR = 26

# Function to check if we  
# can spilt string or not
def checkCorrectOrNot(s):
    
    global MAX_CHAR
    
    # Counter array inisialized with 0
    count = [0] * MAX_CHAR

    # Length of the string
    n = len(s)
    
    if n == 1:
        return true

    # Traverse till the middle 
    # element is reached
    i = 0; j = n-1
    
    while i < j:
        
        # First half
        count[ord(s[i]) - ord('a')] += 1

        # Second half
        count[ord(s[j])-ord('a')] -= 1

        i += 1; j -= 1

    # Checking if values are 
    # diffrent, set flag to 1
    for i in range(MAX_CHAR):
        
        if count[i] != 0:
            return False

    return True


# Driver Code

# String to be checked
s = "abab"

print("Yes" if checkCorrectOrNot(s) else "No")


# This code is contributed by Ansu Kumari.
{% endhighlight %}
{% highlight cpp %}
YES
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

