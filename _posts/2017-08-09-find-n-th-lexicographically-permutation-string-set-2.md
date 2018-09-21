---
layout: post
title: Find n-th lexicographically permutation of a string | Set 2
---
* Given a string of length m containing lowercase alphabets only. We need to find the n-th permutation of string lexicographically.
* Examples:
{% highlight cpp %}
Input : str[] = "abc", n = 3
Output : Result = "bac"
Explanation : All possible permutation
in sorted order: abc, acb, bac, bca, 
cab, cba

Input : str[] = "aba", n = 2
Output : Result = "aba"
Explanation : All possible permutation 
in sorted order: aab, aba, baa
{% endhighlight %}
* We have discussed how to find lexicographically n-th permutation using STL. Time complexity of previous approach is O(n * n!) which is quite high.
* Here we use some Mathematical concept for solving this problem.
* The idea is based on below facts.
* We first count frequencies of all characters in an array freq[]. Now from the first smallest character present in the string (smallest index i such that freq[i] > 0), we compute the number of maximum permutation possible after setting that particular i-th character as the first character. If this sum value is more than given n, then we set that character as the first result output character, decrement freq[i], and continue same for remaining n-1 characters. On the other hand, if the count is less than the required n, iterate for the next character in the frequency table and update the count over and over again until we find a character that produces a count greater than the required n. Time Complexity: O(n) i.e. order of string length
{% highlight cpp %}
// C++ program to print n-th permutation
#include <bits/stdc++.h>
using namespace std;

#define ll long long int

const int MAX_CHAR = 26;
const int MAX_FACT = 20;
ll fact[MAX_FACT];

// utility for calculating factorials
void precomputeFactorials()
{
    fact[0] = 1;
    for (int i = 1; i < MAX_FACT; i++)
        fact[i] = fact[i - 1] * i;
}

// function for nth permutation
void nPermute(char str[], int n)
{
    precomputeFactorials();

    // length of given string
    int len = strlen(str);

    // Count frequencies of all
    // characters
    int freq[MAX_CHAR] = { 0 };
    for (int i = 0; i < len; i++)
        freq[str[i] - 'a']++;

    // out string for output string
    char out[MAX_CHAR];

    // iterate till sum equals n
    int sum = 0;
    int k = 0;

    // We update both n and sum in this
    // loop.
    while (sum != n) {

        sum = 0;
        // check for characters present in freq[]
        for (int i = 0; i < MAX_CHAR; i++) {
            if (freq[i] == 0)
                continue;

            // Remove character
            freq[i]--;

            // calculate sum after fixing
            // a particuar char
            int xsum = fact[len - 1 - k];
            for (int j = 0; j < MAX_CHAR; j++)
                xsum /= fact[freq[j]];
            sum += xsum;

            // if sum > n fix that char as
            // present char and update sum
            // and required nth after fixing
            // char at that position
            if (sum >= n) {
                out[k++] = i + 'a';
                n -= (sum - xsum);
                break;
            }

            // if sum < n, add character back
            if (sum < n)
                freq[i]++;
        }
    }

    // if sum == n means this char will provide its
    // greatest permutation as nth permutation
    for (int i=MAX_CHAR-1; k < len && i >= 0; i--)
        if (freq[i]) {
            out[k++] = i + 'a';
            freq[i++]--;
        }

    // append string termination
    // character and print result
    out[k] = '\0';
    cout << out;
}

// Driver program
int main()
{
    int n = 2;
    char str[] = "geeksquiz";

    nPermute(str, n);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to print n-th permutation
public class PermuteString 
{
    final static int MAX_CHAR = 26;
    final static int MAX_FACT = 20;
    static long fact[] = new long[MAX_FACT];

    // utility for calculating factorial
    static void precomputeFactorirals() 
    {
        fact[0] = 1;
        for (int i = 1; i < MAX_FACT; i++)
            fact[i] = fact[i - 1] * i;
    }
    
    // function for nth permutation
    static void nPermute(String str, int n) 
    {
        precomputeFactorirals();
        
        // length of given string
        int len = str.length();

        // Count frequencies of all
        // characters
        int freq[] = new int[MAX_CHAR];
        for (int i = 0; i < len; i++)
            freq[str.charAt(i) - 'a']++;
        
        // out string for output string
        String out = "";

        // iterate till sum equals n
        int sum = 10;
        int k = 0;

        // We update both n and sum in this
        // loop.
        while (sum >= n) {
            
            // check for characters present in freq[]
            for (int i = 0; i < MAX_CHAR; i++) {
                if (freq[i] == 0)
                    continue;
                
                // Remove character
                freq[i]--;

                // calculate sum after fixing
                // a particular char
                sum = 0;
                int xsum = (int) fact[len - 1 - k];
                for (int j = 0; j < MAX_CHAR; j++)
                    xsum /=  fact[freq[j]];
                sum += xsum;

                // if sum > n fix that char as
                // present char and update sum
                // and required nth after fixing
                // char at that position
                if (sum >= n) {
                    out += (char)(i + 'a');
                    k++;
                    n -= (sum - xsum);
                    break;
                }

                // if sum < n, add character back
                if (sum < n)
                    freq[i]++;    
            }
        }

        // if sum == n means this char will provide its
        // greatest permutation as nth permutation
        for (int i = MAX_CHAR - 1; k < len && i >= 0; i--)
            if (freq[i] != 0) {
                out += (char)(i + 'a');
                freq[i++]--;
            }

        // append string termination
        // character and print result
        System.out.println(out);
    }
    
    // Driver program to test above method
    public static void main(String[] args) {
        
        // TODO Auto-generated method stub
        int n = 2;
        String str = "geeksquiz";
        
        nPermute(str, n);
    }
}
// This code is contributed by Sumit Ghosh
{% endhighlight %}
{% highlight cpp %}
eegikqszu
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

