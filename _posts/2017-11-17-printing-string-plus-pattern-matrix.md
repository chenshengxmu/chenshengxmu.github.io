---
layout: post
title: Printing string in plus ‘+’ pattern in the matrix
---
* Given a string, print it inside a matrix in such a way that a ‘plus’ is formed.
* Examples:
{% highlight cpp %}
Input: TOP
Output:  
X    T    X
T    O    P
X    P    X

Input: FEVER
Output:
X    X    F    X    X
X    X    E    X    X
F    E    V    E    R
X    X    E    X    X
X    X    R    X    X
{% endhighlight %}
* Approach: The idea is simple. First we can access every element of the matrix and make it ‘X’. Then we will insert the characters of the string in the middle row as well as in the middle column of the matrix. For example, we have string of length 5. So we will need a (5X5) matrix for it.
* To access the middle column of the matrix, column index is made constant and is equal to (n/2), where n is the length of the string. Row index will go from 0 to (n-1) for it. To access the middle row, the row index will be made constant and equal to (n/2) and the column index will go from 0 to (n-1).
* Below is the implementation of above approach:
{% highlight cpp %}
// CPP program to print the 
// string in 'plus' pattern
#include <bits/stdc++.h>
#define max 100
using namespace std;

// Function to make a cross in the matrix
void carveCross(string str)
{ 
    int n = str.length();
    if (n % 2 == 0) 
    {  
        /* As, it is not possible to make 
        the cross exactly in the middle of 
        the matrix with an even length string.*/
        cout << "Not possible. Please enter "
             << "odd length string.\n";
    }
    else {

        // declaring a 2D array i.e a matrix
        char arr[max][max]; 
        int m = n / 2;

        /* Now, we will fill all the 
        elements of the array with 'X'*/
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = 'X';
            }
        }

        /* Now, we will place the characters 
        of the string in the matrix, such 
        that a cross is formed in it.*/
        for (int i = 0; i < n; i++) 
        { 
            /* here the characters of the 
            string will be added in the 
            middle column of our array.*/
            arr[i][m] = str[i];
        }
        
        for (int i = 0; i < n; i++) 
        { 
            // here the characters of the 
            // string will be added in the 
            // middle row of our array.
            arr[m][i] = str[i];
        }

        /* Now finally, we will print 
        the array*/
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cout << arr[i][j] << " ";
            }
            cout << "\n";
        }
    }
}

// driver code
int main()
{
    string str = "PICTURE";
    carveCross(str);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to print the
// string in 'plus' pattern
class GFG {
static final int max = 100;

// Function to make a cross in the matrix
static void carveCross(String str) {
    int n = str.length();
    if (n % 2 == 0) {
        
        // As, it is not possible to make
        // the cross exactly in the middle of
        // the matrix with an even length string.
        System.out.print("Not possible. Please enter "
                             + "odd length string.\n");
    } 
    else {

        // declaring a 2D array i.e a matrix
        char arr[][] = new char[max][max];
        int m = n / 2;

        // Now, we will fill all the
        // elements of the array with 'X'
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                arr[i][j] = 'X';
        }
    }

    // Now, we will place the characters
    // of the string in the matrix, such
    // that a cross is formed in it.
    for (int i = 0; i < n; i++) {
        
        // here the characters of the
        // string will be added in the
        // middle column of our array.
        arr[i][m] = str.charAt(i);
    }

    for (int i = 0; i < n; i++) {
        
        // here the characters of the
        // string will be added in the
        // middle row of our array.
        arr[m][i] = str.charAt(i);
    }

    // Now finally, we will print
    // the array
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            System.out.print(arr[i][j] + " ");
        }
        System.out.print("\n");
    }
    }
}

// Driver code
public static void main(String[] args) {
    String str = "PICTURE";
    carveCross(str);
}
}
// This code is contributed by Anant Agarwal.
{% endhighlight %}
{% highlight cpp %}
X X X P X X X 
X X X I X X X 
X X X C X X X 
P I C T U R E 
X X X U X X X 
X X X R X X X 
X X X E X X X
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

