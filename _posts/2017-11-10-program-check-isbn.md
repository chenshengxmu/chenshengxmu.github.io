---
layout: post
title: Program to check for ISBN
---
* An ISBN (International Standard Book Number) is a 10 digit number that is used to identify a book.
* The first nine digits of the ISBN number are used to represent the Title, Publisher and Group of the book and the last digit is used for checking whether ISBN is correct or not.
* The first 9 digits of it, can take any value between 0 and 9, but the last digits, sometimes may take value equal to 10; this is done by writing it as ‘X’.
* To verify an ISBN, calculate 10 times the first digit, plus 9 times the second digit, plus 8 times the third digit and so on until we add 1 time the last digit. If the final number leaves no remainder when divided by 11, the code is a valid ISBN.
* Examples :
{% highlight cpp %}
Input : 007462542X
Output : Valid
007462542X = 10*0 + 9*0 + 8*7 + 7*4 + 6*6 + 
        5*2 + 4*5 + 3*4 + 2*2 + 1*10 = 176
Since 55 leaves no remainder when divided 
by 11, hence it is a valid ISBN.

Input : 0112112425
Output : Invalid
0112112425 = 10*0 + 9*1 + 8*1 + 7*2 + 6*1 +
           5*1 + 4*1 + 3*4 + 2*2 + 1*5 = 71
Since 71 is not divisible by 11, given number
is not a valid ISBN.
{% endhighlight %}
* Now, we design a program to accept a ten digit code from the user and then we will check whether a number is ISBN or not. Display an appropriate message.
{% highlight cpp %}
// CPP program to check if a 
// given ISBN is valid or not
#include <bits/stdc++.h>
using namespace std;

bool isValidISBN(string& isbn)
{
    // length must be 10
    int n = isbn.length();
    if (n != 10)
        return false;

    // Computing weighted sum 
    // of first 9 digits
    int sum = 0;
    for (int i = 0; i < 9; i++) 
    {
        int digit = isbn[i] - '0';
        if (0 > digit || 9 < digit)
            return false;
        sum += (digit * (10 - i));
    }

    // Checking last digit.
    char last = isbn[9];
    if (last != 'X' && (last < '0' || 
                        last > '9'))
        return false;

    // If last digit is 'X', add 10 
    // to sum, else add its value.
    sum += ((last == 'X') ? 10 : 
                  (last - '0'));

    // Return true if weighted sum 
    // of digits is divisible by 11.
    return (sum % 11 == 0);
}

// Driver code
int main()
{
    string isbn = "007462542X";
    if (isValidISBN(isbn))
        cout << "Valid";
    else
        cout << "Invalid";
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to check if 
// a given ISBN isvalid or not

class GFG 
{
    static boolean isValidISBN(String isbn)
    {
        // length must be 10
        int n = isbn.length();
        if (n != 10)
            return false;

        // Computing weighted sum
        // of first 9 digits
        int sum = 0;
        for (int i = 0; i < 9; i++) 
        {
            int digit = isbn.charAt(i) - '0';
            if (0 > digit || 9 < digit)
                return false;
            sum += (digit * (10 - i));
        }

        // Checking last digit.
        char last = isbn.charAt(9);
        if (last != 'X' && (last < '0' || 
                            last > '9'))
            return false;

        // If last digit is 'X', add 10 
        // to sum, else add its value
        sum += ((last == 'X') ? 10 : (last - '0'));

        // Return true if weighted sum 
        // of digits is divisible by 11.
        return (sum % 11 == 0);
    }

    // Driver code
    public static void main(String[] args)
    {
        String isbn = "007462542X";
        if (isValidISBN(isbn))
            System.out.print("Valid");
        else
            System.out.print("Invalid");
    }
}

// This code is contributed
// by Anant Agarwal.
{% endhighlight %}
{% highlight python %}
# Python code to check if a 
# given ISBN is valid or not.

def isValidISBN(isbn):

    # check for length
    if len(isbn) != 10:
        return False
    
    # Computing weighted sum 
    # of first 9 digits
    _sum = 0
    for i in range(9):
        if 0 <= int(isbn[i]) <= 9:
            _sum += int(isbn[i]) * (10 - i)
        else:
            return False
        
    # Checking last digit
    if(isbn[9] != 'X' and 
       0 <= int(isbn[9]) <= 9):
        return False
    
    # If last digit is 'X', add 
    # 10 to sum, else add its value.
    _sum += 10 if isbn[9] == 'X' else int(isbn[9])
    
    # Return true if weighted sum of 
    # digits is divisible by 11
    return (_sum % 11 == 0)

# Driver Code
isbn = "007462542X"
if isValidISBN(isbn):
    print('Valid')
else:
    print("Invalid")
    
# This code is contributed
# by "Abhishek Sharma 44"
{% endhighlight %}
{% highlight cpp %}
Valid
{% endhighlight %}
* The above code checks for ISBN 10. The recent version of ISBN is ISBN 13 (in 2005).
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

