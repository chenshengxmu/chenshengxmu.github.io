---
layout: post
title: Burrows - Wheeler Data Transform Algorithm
---
* What is the Burrows – Wheeler Transform? The BWT is a data transformation algorithm that restructures data in such a way that the transformed message is more compressible. Technically, it is a lexicographical reversible permutation of the characters of a string. It is first of the three steps to be performed in succession while implementing Burrows – Wheeler Data Compression algorithm that forms the basis of the Unix compression utility bzip2.
* Why BWT? The main idea behind it. The most important application of BWT is found in biological sciences where genomes(long strings written in A, C, T, G alphabets) don’t have many runs but they do have many repeats. The idea of the BWT is to build an array whose rows are all cyclic shifts of the input string in dictionary order, and return the last column of the array that tends to have long runs of identical characters. The benefit of this is that once the characters have been clustered together, they effectively have an ordering, which can make our string more compressible for other algorithms like run length encoding and Huffman Coding. The remarkable thing about BWT is that this particular transform is reversible with minimal data overhead.
* Steps involved in BWT algorithm Let’s take the word “banana$” as an example. Step 1: Form all cyclic rotations of the given text.
{% highlight cpp %}
banana$                                                
       $    b                        $banana 
    a           a                    a$banan
   Cyclic rotations    ---------->   na$bana                                 
    n         n                      ana$ban                                         
          a                          nana$ba
                                     anana$b
{% endhighlight %}
* Step 2: The next step is to sort the rotations lexicographically. The ‘$’ sign is viewed as first letter lexicographically, even before ‘a’.
{% highlight cpp %}
banana$                    $banana
          $banana                    a$banan
          a$banan       Sorting      ana$ban
          na$bana      ---------->   anana$b 
          ana$ban    alphabetically  banana$
          nana$ba                    na$bana
          anana$b                    nana$ba
{% endhighlight %}
* Step 3: The last column is what we output as BWT.
{% highlight cpp %}
BWT(banana$) = annb$aa
{% endhighlight %}
* Examples:
{% highlight cpp %}
Input : banana$ // Input text
Output : annb$aa // Burrows - Wheeler Transform

Input : abracadabra$
Output : ard$rcaaaabb
{% endhighlight %}
* Why last column is considered BWT? 1. The last column has better symbol clustering than any other columns.
* 2. If we only have BWT of our string, we can recover the rest of the cyclic rotations entirely. The rest of the columns don’t possess this characteristic which is highly important while computing inverse of BWT.
* Why ‘$’ sign is embedded in the text? We can compute BWT even if our text is not concatenated with any EOF character (‘$’ here). The implication of ‘$’ sign comes while computing the inverse of BWT.
* Way of implementation 1. Let’s instantiate “banana$” as our input_text and instantiate character array bwt_arr for our output.
* 2. Let’s get all the suffixes of “banana$” and compute it’s suffix_arr to store index of each suffix.
{% highlight cpp %}
0 banana$                6 $   
          1 anana$                 5 a$
          2 nana$      Sorting     3 ana$
          3 ana$     ---------->   1 anana$
          4 na$     alphabetically 0 banana$
          5 a$                     4 na$
          6 $                      2 nana$
{% endhighlight %}
* 3. Iterating over the suffix_arr, let’s now add to our output array bwt_arr, the last character of each rotation.
* 4. The last character of each rotation of input_text starting at the position denoted by the current value in the suffix array can be calculated with input_text[(suffix_arr[i] – 1 + n ) % n], where n is the number of elements in the suffix_arr.
{% highlight cpp %}
bwt_arr[0] = input_text[(suffix_arr[0] - 1 + 7) % 7] 
           = input_text[5] 
           = a
bwt_arr[1] = input_text[(suffix_arr[1] - 1 + 7) % 7] 
           = input_text[4] 
           = n
{% endhighlight %}
* Following is the code for way of implementation explained above
{% highlight c %}
// C program to find Burrows Wheeler transform of 
// a given text
#include<stdio.h>
#include<string.h>
#include<stdlib.h>

// Structure to store data of a rotation
struct rotation
{
    int index;
    char *suffix;
};

// Compares the rotations and
// sorts the rotations alphabetically
int cmpfunc (const void *x, const void *y)
{
    struct rotation *rx = (struct rotation *)x;
    struct rotation *ry = (struct rotation *)y;
    return strcmp(rx -> suffix, ry -> suffix);
}

// Takes text to be transformed and its length as
// arguments and returns the corresponding suffix array
int *computeSuffixArray(char *input_text, int len_text)
{
    // Array of structures to store rotations and 
    // their indexes
    struct rotation suff[len_text];

    // Structure is needed to maintain old indexes of
    // rotations after sorting them
    for(int i = 0; i < len_text; i++)
    {
        suff[i].index = i;
        suff[i].suffix = (input_text+i);
    }

    // Sorts rotations using comparison function defined above
    qsort(suff, len_text, sizeof(struct rotation), cmpfunc);

    // Stores the indexes of sorted rotations
    int *suffix_arr = (int *) malloc (len_text * sizeof(int));
    for (int i = 0; i < len_text; i++)
        suffix_arr[i] = suff[i].index;

    // Returns the computed suffix array
    return suffix_arr;
}

// Takes suffix array and its size as arguments and returns
// the Burrows - Wheeler Transform of given text
char *findLastChar(char *input_text, int *suffix_arr, int n)
{
    // Iterates over the suffix array to find
    // the last char of each cyclic rotation
    char *bwt_arr = (char *) malloc (n * sizeof(char));
    int i;
    for (i = 0; i < n; i++)
    {
        // Computes the last char which is given by
        // input_text[(suffix_arr[i] + n - 1) % n]
        int j = suffix_arr[i] - 1;
        if (j < 0)       
            j = j + n;
       
        bwt_arr[i] = input_text[j];
    }

    bwt_arr[i] = '\0';

    // Returns the computed Burrows - Wheeler Transform
    return bwt_arr;
}

// Driver program to test functions above
int main()
{
    char input_text[] = "banana$";
    int len_text = strlen(input_text);

    // Computes the suffix array of our text
    int *suffix_arr = computeSuffixArray(input_text, len_text);

    // Adds to the output array the last char of each rotation
    char *bwt_arr = findLastChar(input_text, suffix_arr, len_text);

    printf("Input text : %s\n", input_text);
    printf("Burrows - Wheeler Transform : %s\n", bwt_arr);
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
Input text : banana$
Burrows - Wheeler Transform : annb$aa
{% endhighlight %}
* Time Complexity: O(Logn). This is because of the method used above to build suffix array which has O(Logn) time complexity, due to O(n) time for strings comparisons in O(nLogn) sorting algorithm.
* Exercise: 1. Compute suffix array in O(nLogn) time and then implement BWT. 2. Implement Inverse of Burrows – Wheeler Transform.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

