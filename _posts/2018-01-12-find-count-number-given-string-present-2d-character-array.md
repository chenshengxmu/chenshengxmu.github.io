---
layout: post
title: Count of number of given string in 2D character array
---
* Given a 2-Dimensional character array and a string, we need to find the given string in 2-dimensional character array such that individual characters can be present left to right, right to left, top to down or down to top.
* Examples:
{% highlight cpp %}
Input : a ={
            {D,D,D,G,D,D},
            {B,B,D,E,B,S},
            {B,S,K,E,B,K},
            {D,D,D,D,D,E},
            {D,D,D,D,D,E},
            {D,D,D,D,D,G}
           }
        str= "GEEKS"
Output :2

Input : a = {
            {B,B,M,B,B,B},
            {C,B,A,B,B,B},
            {I,B,G,B,B,B},
            {G,B,I,B,B,B},
            {A,B,C,B,B,B},
            {M,C,I,G,A,M}
            }
        str= "MAGIC"

Output :3
{% endhighlight %}
* We have discussed simpler problem to find if a word exists or not in a matrix.
* To count all occurrences, we follow simple brute force approach. Traverse through each character of the matrix and taking each character as start of the string to be found, try to search in all the possible directions. Whenever, a word is found, increase the count, and after traversing the matrix what ever will be the value of count will be number of times string exists in character matrix.
* Algorithm : 1- Traverse matrix character by character and take one character as string start 2- For each character find the string in all the four directions recursively 3- If a string found, we increase the count 4- When we are done with one character as start, we repeat the same process for the next character 5- Calculate the sum of count for each character 6- Final count will be the answer
{% highlight c %}
// C code for finding count
// of string in a given 2D
// character array.
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define ARRAY_SIZE(a) (sizeof(a) / sizeof(*a))

// utility function to search
// complete string from any
// given index of 2d char array
int internalSearch(char *needle, int row,
                   int col, char **hay, 
                   int row_max, int col_max)
{
    int found = 0;

    if (row >= 0 && row <= row_max && col >= 0 &&
        col <= col_max && *needle == hay[row][col])
        {
            
        char match = *needle++;

        hay[row][col] = 0;

        if (*needle == 0) {
            found = 1;
        } else { 

            // through Backtrack searching 
            // in every directions
            found += internalSearch(needle, row, 
                                    col+1, hay, 
                                    row_max, col_max);
            found += internalSearch(needle, row, col-1, 
                                    hay, row_max, col_max);
            found += internalSearch(needle, row+1, col, 
                                    hay, row_max, col_max);
            found += internalSearch(needle, row-1, col, 
                                    hay, row_max, col_max);
        }

        hay[row][col] = match;
    }

    return found;
}

// Function to search the string in 2d array
int searchString(char *needle, int row, int col, 
                 char **str, int row_count, int col_count)
{
    int found = 0;
    int r, c;

    for (r = 0; r < row_count; ++r) {
        for (c = 0; c < col_count; ++c) {
            found += internalSearch(needle, r, c, str, 
                            row_count - 1, col_count - 1);
        }
    }

    return found;
}

// Driver code
int main(void){

    char needle[] = "MAGIC";
    char *input[] = {
        "BBABBM",
        "CBMBBA",
        "IBABBG",
        "GOZBBI",
        "ABBBBC",
        "MCIGAM"
    };
    char *str[ARRAY_SIZE(input)];
    int i;
    for (i = 0; i < ARRAY_SIZE(input); ++i) {
        str[i] = malloc(strlen(input[i]));
        strcpy(str[i], input[i]);
    }

    printf("count: %d\n", searchString(needle, 0, 0,
              str, ARRAY_SIZE(str), strlen(str[0])));

    return 0;
}
{% endhighlight %}
{% highlight cpp %}
3
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

