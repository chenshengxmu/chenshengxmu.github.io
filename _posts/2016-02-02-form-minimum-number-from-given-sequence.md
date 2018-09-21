---
layout: post
title: Form minimum number from given sequence
---
* Given a pattern containing only I’s and D’s. I for increasing and D for decreasing. Devise an algorithm to print the minimum number following that pattern. Digits from 1-9 and digits can’t repeat.
* Examples:
{% highlight cpp %}
Input: D        Output: 21
   Input: I        Output: 12
   Input: DD       Output: 321
   Input: II       Output: 123
   Input: DIDI     Output: 21435
   Input: IIDDD    Output: 126543
   Input: DDIDDIID Output: 321654798
{% endhighlight %}
* Source: Amazon Interview Question
* Below are some important observations
* Since digits can’t repeat, there can be at most 9 digits in output.
* Also number of digits in output is one more than number of characters in input. Note that the first character of input corresponds to two digits in output.
* Idea is to iterate over input array and keep track of last printed digit and maximum digit printed so far. Below is the implementation of above idea.
{% highlight c %}
// C++ program to print minimum number that can be formed
// from a given sequence of Is and Ds
#include <iostream>
using namespace std;

// Prints the minimum number that can be formed from
// input sequence of I's and D's
void PrintMinNumberForPattern(string arr)
{
    // Initialize current_max (to make sure that
    // we don't use repeated character
    int curr_max = 0;

    // Initialize last_entry (Keeps track for
    // last printed digit)
    int last_entry = 0;

    int j;

    // Iterate over input array
    for (int i=0; i<arr.length(); i++)
    {
        // Initialize 'noOfNextD' to get count of
        // next D's available
        int noOfNextD = 0;

        switch(arr[i])
        {
        case 'I':
            // If letter is 'I'

            // Calculate number of next consecutive D's
            // available
            j = i+1;
            while (arr[j] == 'D' && j < arr.length())
            {
                noOfNextD++;
                j++;
            }
              
            if (i==0)
            {
                curr_max = noOfNextD + 2;

                // If 'I' is first letter, print incremented
                // sequence from 1
                cout << " " << ++last_entry;
                cout << " " << curr_max;

                // Set max digit reached
                last_entry = curr_max;
            }
            else
            {
                // If not first letter

                // Get next digit to print
                curr_max = curr_max + noOfNextD + 1;

                // Print digit for I
                last_entry = curr_max;
                cout << " " << last_entry;
            }

            // For all next consecutive 'D' print 
            // decremented sequence
            for (int k=0; k<noOfNextD; k++)
            {
                cout << " " << --last_entry;
                i++;
            }
            break;

        // If letter is 'D'
        case 'D':
            if (i == 0)
            {
                // If 'D' is first letter in sequence
                // Find number of Next D's available
                j = i+1;
                while (arr[j] == 'D' && j < arr.length())
                {
                    noOfNextD++;
                    j++;
                }

                // Calculate first digit to print based on 
                // number of consecutive D's
                curr_max = noOfNextD + 2;

                // Print twice for the first time
                cout << " " << curr_max << " " << curr_max - 1;

                // Store last entry
                last_entry = curr_max - 1;
            }
            else
            {
                // If current 'D' is not first letter

                // Decrement last_entry
                cout << " " << last_entry - 1;
                last_entry--;
            }
            break;
        }
    }
    cout << endl;
}

// Driver program to test above
int main()
{
    PrintMinNumberForPattern("IDID");
    PrintMinNumberForPattern("I");
    PrintMinNumberForPattern("DD");
    PrintMinNumberForPattern("II");
    PrintMinNumberForPattern("DIDI");
    PrintMinNumberForPattern("IIDDD");
    PrintMinNumberForPattern("DDIDDIID");
    return 0;
}
{% endhighlight %}
{% highlight cpp %}
1 3 2 5 4
 1 2
 3 2 1
 1 2 3
 2 1 4 3 5
 1 2 6 5 4 3
 3 2 1 6 5 4 7 9 8
{% endhighlight %}
* This solution is suggested by Swapnil Trambake.
* Alternate Solution: Let’s observe a few facts in case of minimum number:
* The idea is to iterate over the entire input array , keeping track of the minimum number (1-9) which can be placed at that position of the output.
* The tricky part of course occurs when ‘D’ is encountered at index other than 0. In such a case we have to track the nearest ‘I’ to the left of ‘D’ and increment each number in the output vector by 1 in between ‘I’ and ‘D’.
* We cover the base case as follows:
* Now we iterate the input string from index 1 till its end and:
* Following is the program for the same:
{% highlight cpp %}
// C++ program to print minimum number that can be formed
// from a given sequence of Is and Ds
#include<bits/stdc++.h>
using namespace std;

void printLeast(string arr)
{
    // min_avail represents the minimum number which is
    // still available for inserting in the output vector.
    // pos_of_I keeps track of the most recent index
    // where 'I' was encountered w.r.t the output vector
    int min_avail = 1, pos_of_I = 0;

    //vector to store the output
    vector<int>v;

    // cover the base cases
    if (arr[0]=='I')
    {
        v.push_back(1);
        v.push_back(2);
        min_avail = 3;
        pos_of_I = 1;
    }
    else
    {
        v.push_back(2);
        v.push_back(1);
        min_avail = 3;
        pos_of_I = 0;
    }

    // Traverse rest of the input
    for (int i=1; i<arr.length(); i++)
    {
        if (arr[i]=='I')
        {
            v.push_back(min_avail);
            min_avail++;
            pos_of_I = i+1;
        }
        else
        {
            v.push_back(v[i]);
            for (int j=pos_of_I; j<=i; j++)
                v[j]++;

            min_avail++;
        }
    }

    // print the number
    for (int i=0; i<v.size(); i++)
        cout << v[i] << " ";
    cout << endl;
}

// Driver program to check the above function
int main()
{
    printLeast("IDID");
    printLeast("I");
    printLeast("DD");
    printLeast("II");
    printLeast("DIDI");
    printLeast("IIDDD");
    printLeast("DDIDDIID");
    return 0;
}
{% endhighlight %}
{% highlight cpp %}
1 3 2 5 4 
1 2 
3 2 1 
1 2 3 
2 1 4 3 5 
1 2 6 5 4 3 
3 2 1 6 5 4 7 9 8
{% endhighlight %}
* This solution is suggested by Ashutosh Kumar.
*  
* Method 3 We can that when we encounter I, we got numbers in increasing order but if we encounter ‘D’, we want to have numbers in decreasing order. Length of the output string is always one more than the input string. So loop is from 0 till the length of the sting. We have to take numbers from 1-9 so we always push (i+1) to our stack. Then we check what is the resulting character at the specified index.So,there will be two cases which are as follows:- Case 1: If we have encountered I or we are at the last character of input string,then pop from the stack and add it to the end of the output string until the stack gets empty. Case 2: If we have encountered D, then we want the numbers in decreasing order.so we just push (i+1) to our stack.
{% highlight cpp %}
#include <bits/stdc++.h>
using namespace std;

// Function to decode the given sequence to construct
// minimum number without repeated digits
void PrintMinNumberForPattern(string seq)
{
    // result store output string
    string result;

    // create an empty stack of integers
    stack<int> stk;

    // run n+1 times where n is length of input sequence
    for (int i = 0; i <= seq.length(); i++)
    {
        // push number i+1 into the stack
        stk.push(i + 1);

        // if all characters of the input sequence are
        // processed or current character is 'I'
        // (increasing)
        if (i == seq.length() || seq[i] == 'I')
        {
            // run till stack is empty
            while (!stk.empty())
            {
                // remove top element from the stack and
                // add it to solution
                result += to_string(stk.top());
                result += " ";
                stk.pop();
            }
        }
    }

    cout << result << endl;
}

// main function
int main()
{
    PrintMinNumberForPattern("IDID");
    PrintMinNumberForPattern("I");
    PrintMinNumberForPattern("DD");
    PrintMinNumberForPattern("II");
    PrintMinNumberForPattern("DIDI");
    PrintMinNumberForPattern("IIDDD");
    PrintMinNumberForPattern("DDIDDIID");
    return 0;
}
{% endhighlight %}
{% highlight cpp %}
1 3 2 5 4 
1 2 
3 2 1 
1 2 3 
2 1 4 3 5 
1 2 6 5 4 3 
3 2 1 6 5 4 7 9 8
{% endhighlight %}
* Time Complexity : O(n) Auxiliary Space : O(n)
* This method is contributed by Roshni Agarwal.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above

