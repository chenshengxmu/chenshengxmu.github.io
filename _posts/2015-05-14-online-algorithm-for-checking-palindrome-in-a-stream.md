---
layout: post
title: Online algorithm for checking palindrome in a stream
---
* Given a stream of characters (characters are received one by one), write a function that prints ‘Yes’ if a character makes the complete string palindrome, else prints ‘No’.
* Examples:
{% highlight cpp %}
Input: str[] = "abcba"
Output: a Yes   // "a" is palindrome
        b No    // "ab" is not palindrome
        c No    // "abc" is not palindrome
        b No    // "abcb" is not palindrome
        a Yes   // "abcba" is palindrome

Input: str[] = "aabaacaabaa"
Output:  a Yes   // "a" is palindrome
         a Yes   // "aa" is palindrome
         b No    // "aab" is not palindrome 
         a No    // "aaba" is not palindrome  
         a Yes   // "aabaa" is palindrome  
         c No    // "aabaac" is not palindrome  
         a No    // "aabaaca" is not palindrome  
         a No    // "aabaacaa" is not palindrome  
         b No    // "aabaacaab" is not palindrome  
         a No    // "aabaacaaba" is not palindrome  
         a Yes   // "aabaacaabaa" is palindrome
{% endhighlight %}
* Let input string be str[0..n-1]. A Simple Solution is to do following for every character str[i] in input string. Check if substring str[0…i] is palindrome, then print yes, else print no.
* A Better Solution is to use the idea of Rolling Hash used in Rabin Karp algorithm. The idea is to keep track of reverse of first half and second half (we also use first half and reverse of second half) for every index. Below is complete algorithm.
{% highlight cpp %}
1) The first character is always a palindrome, so print yes for 
     first character.

  2) Initialize reverse of first half as "a" and second half as "b".  
     Let the hash value of first half reverse be 'firstr' and that of 
     second half be 'second'.

  3) Iterate through string starting from second character, do following
      for every character str[i], i.e., i varies from 1 to n-1.
     a) If 'firstr' and 'second' are same, then character by character 
        check the substring ending with current character and print 
        "Yes" if palindrome.
        Note that if hash values match, then strings need not be same.
        For example, hash values of "ab" and "ba" are same, but strings
        are different. That is why we check complete string after hash.

     b) Update 'firstr' and 'second' for next iteration.  
           If 'i' is even, then add next character to the beginning of 
                           'firstr' and end of second half and update 
                            hash values.
           If 'i' is odd,  then keep 'firstr' as it is, remove leading 
                           character from second and append a next 
                           character at end.
{% endhighlight %}
* Let us see all steps for example string “abcba”
* Initial values of ‘firstr’ and ‘second’      firstr’ = hash(“a”), ‘second’ = hash(“b”)
* Start from second character, i.e., i = 1      a) Compare ‘firstr’ and ‘second’, they don’t match, so print no.      b) Calculate hash values for next iteration, i.e., i = 2      Since i is odd, ‘firstr’ is not changed and ‘second’ becomes hash(“c”)
* i = 2      a) Compare ‘firstr’ and ‘second’, they don’t match, so print no.      b) Calculate hash values for next iteration, i.e., i = 3      Since i is even, ‘firstr’ becomes hash(“ba”) and ‘second’ becomes hash(“cb”)
* i = 3      a) Compare ‘first’ and ‘second’, they don’t match, so print no.      b) Calculate hash values for next iteration, i.e., i = 4      Since i is odd, ‘firstr’ is not changed and ‘second’ becomes hash(“ba”)
* i = 4      a) ‘firstr’ and ‘second’ match, compare the whole strings, they match, so print yes      b) We don’t need to calculate next hash values as this is last index
* The idea of using rolling hashes is, next hash value can be calculated from previous in O(1) time by just doing some constant number of arithmetic operations.
* Below are the implementations of above approach.
{% highlight c %}
// C program for online algorithm for palindrome checking
#include<stdio.h>
#include<string.h>

// d is the number of characters in input alphabet
#define d 256

// q is a prime number used for evaluating Rabin Karp's Rolling hash
#define q 103

void checkPalindromes(char str[])
{
    // Length of input string
    int N = strlen(str);

    // A single character is always a palindrome
    printf("%c Yes\n", str[0]);

    // Return if string has only one character
    if (N == 1) return;

    // Initialize first half reverse and second half for 
    // as firstr and second characters
    int firstr  = str[0] % q;
    int second = str[1] % q;

    int h = 1, i, j;

    // Now check for palindromes from second character
    // onward
    for (i=1; i<N; i++)
    {
        // If the hash values of 'firstr' and 'second' 
        // match, then only check individual characters
        if (firstr == second)
        {
            /* Check if str[0..i] is palindrome using
               simple character by character match */
            for (j = 0; j < i/2; j++)
            {
                if (str[j] != str[i-j])
                    break;
            }
            (j == i/2)?  printf("%c Yes\n", str[i]):
            printf("%c No\n", str[i]);
        }
        else printf("%c No\n", str[i]);

        // Calculate hash values for next iteration.
        // Don't calculate hash for next characters if
        // this is the last character of string
        if (i != N-1)
        {
            // If i is even (next i is odd) 
            if (i%2 == 0)
            {
                // Add next character after first half at beginning 
                // of 'firstr'
                h = (h*d) % q;
                firstr  = (firstr + h*str[i/2])%q;
                
                // Add next character after second half at the end
                // of second half.
                second = (second*d + str[i+1])%q;
            }
            else
            {
                // If next i is odd (next i is even) then we
                // need not to change firstr, we need to remove
                // first character of second and append a
                // character to it.
                second = (d*(second + q - str[(i+1)/2]*h)%q
                          + str[i+1])%q;
            }
        }
    }
}

/* Driver program to test above function */
int main()
{
    char *txt = "aabaacaabaa";
    checkPalindromes(txt);
    getchar();
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program for online algorithm for
// palindrome checking
public class GFG 
{      
    // d is the number of characters in 
    // input alphabet
    static final int d = 256;
     
    // q is a prime number used for 
    // evaluating Rabin Karp's Rolling hash
    static final int q = 103;
     
    static void checkPalindromes(String str)
    {
        // Length of input string
        int N = str.length();
     
        // A single character is always a palindrome
        System.out.println(str.charAt(0)+" Yes");
     
        // Return if string has only one character
        if (N == 1) return;
     
        // Initialize first half reverse and second 
        // half for as firstr and second characters
        int firstr  = str.charAt(0) % q;
        int second = str.charAt(1) % q;
     
        int h = 1, i, j;
     
        // Now check for palindromes from second 
        // character onward
        for (i = 1; i < N; i++)
        {
            // If the hash values of 'firstr' and
            // 'second' match, then only check 
            // individual characters
            if (firstr == second)
            {
                /* Check if str[0..i] is palindrome
                using simple character by character 
                 match */
                for (j = 0; j < i/2; j++)
                {
                    if (str.charAt(j) != str.charAt(i 
                                               - j))
                        break;
                }
                System.out.println((j == i/2) ? 
                  str.charAt(i) + " Yes": str.charAt(i)+
                  " No");
            }
            else System.out.println(str.charAt(i)+ " No");
     
            // Calculate hash values for next iteration.
            // Don't calculate hash for next characters
            // if this is the last character of string
            if (i != N - 1)
            {
                // If i is even (next i is odd) 
                if (i % 2 == 0)
                {
                    // Add next character after first 
                    // half at beginning of 'firstr'
                    h = (h * d) % q;
                    firstr  = (firstr + h *str.charAt(i / 
                                                 2)) % q;
                     
                    // Add next character after second 
                    // half at the end of second half.
                    second = (second * d + str.charAt(i + 
                                                1)) % q;
                }
                else
                {
                    // If next i is odd (next i is even)
                    // then we need not to change firstr,
                    // we need to remove first character
                    // of second and append a character
                    // to it.
                    second = (d * (second + q - str.charAt(
                             (i + 1) / 2) * h) % q +
                               str.charAt(i + 1)) % q;
                }
            }
        }
    }
     
    /* Driver program to test above function */
    public static void main(String args[])
    {
        String txt = "aabaacaabaa";
        checkPalindromes(txt);
    }
}
// This code is contributed by Sumit Ghosh
{% endhighlight %}
{% highlight python %}
# Python program Online algorithm for checking palindrome
# in a stream

# d is the number of characters in input alphabet
d = 256

# q is a prime number used for evaluating Rabin Karp's
# Rolling hash
q = 103

def checkPalindromes(string):

    # Length of input string
    N = len(string)

    # A single character is always a palindrome
    print string[0] + " Yes"

    # Return if string has only one character
    if N == 1:
        return

    # Initialize first half reverse and second half for
    # as firstr and second characters
    firstr = ord(string[0]) % q
    second = ord(string[1]) % q

    h = 1
    i = 0
    j = 0

    # Now check for palindromes from second character
    # onward
    for i in xrange(1,N):

        # If the hash values of 'firstr' and 'second'
        # match, then only check individual characters
        if firstr == second:

            # Check if str[0..i] is palindrome using
            # simple character by character match
            for j in xrange(0,i/2):
                if string[j] != string[i-j]:
                    break
            j += 1
            if j == i/2:
                print string[i] + " Yes"
            else:
                print string[i] + " No"
        else:
            print string[i] + " No"

        # Calculate hash values for next iteration.
        # Don't calculate hash for next characters if
        # this is the last character of string
        if i != N-1:

            # If i is even (next i is odd)
            if i % 2 == 0:

                # Add next character after first half at
                # beginning of 'firstr'
                h = (h*d) % q
                firstr = (firstr + h*ord(string[i/2]))%q

                # Add next character after second half at
                # the end of second half.
                second = (second*d + ord(string[i+1]))%q
            else:
                # If next i is odd (next i is even) then we
                # need not to change firstr, we need to remove
                # first character of second and append a
                # character to it.
                second = (d*(second + q - ord(string[(i+1)/2])*h)%q
                            + ord(string[i+1]))%q

# Driver program
txt = "aabaacaabaa"
checkPalindromes(txt)
# This code is contributed by Bhavya Jain
{% endhighlight %}
{% highlight cpp %}
a Yes
a Yes
b No
a No
a Yes
c No
a No
a No
b No
a No
a Yes
{% endhighlight %}
* The worst case time complexity of the above solution remains O(n*n), but in general, it works much better than simple approach as we avoid complete substring comparison most of the time by first comparing hash values. The worst case occurs for input strings with all same characters like “aaaaaa”.
* This article is contributed by Ajay. Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

