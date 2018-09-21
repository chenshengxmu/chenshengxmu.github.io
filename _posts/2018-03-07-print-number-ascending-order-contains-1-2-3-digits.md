---
layout: post
title: Print number in ascending order which contains 1, 2 and 3 in their digits.
---
* Given an array of numbers, the task is to print those numbers in ascending order separated by commas which have 1, 2 and 3 in their digits. If no number containing digits 1, 2, and 3 present then print -1.
* Examples:
{% highlight cpp %}
Input : numbers[] = {123, 1232, 456, 234, 32145}
Output : 123, 1232, 32145

Input : numbers[] = {9821, 627183, 12, 1234}
Output : 1234, 627183

Input : numbers[] = {12, 232, 456, 234}
Output : -1
{% endhighlight %}
* Asked in : Goldman Sachs Approach: First finding all the number in from of array which contains 1, 2 & 3 then sort the number according to 1, 2 and 3 and then print it.
{% highlight cpp %}
// CPP program to print all number containing 
// 1, 2 and 3 in any order.
#include<bits/stdc++.h>
using namespace std;


// convert the number to string and find 
// if it contains 1, 2 & 3.
bool findContainsOneTwoThree(int number)
{    
    string str = to_string(number);
    int countOnes = 0, countTwo = 0, countThree = 0;
    for(int i = 0; i < str.length(); i++) {
        if(str[i] == '1') countOnes++;
        else if(str[i] == '2') countTwo++;
        else if(str[i] == '3') countThree++;
    }         
    return (countOnes && countTwo && countThree);
}
// prints all the number containing 1, 2, 3 
string printNumbers(int numbers[], int n)
{
    vector<int> oneTwoThree;
    for (int i = 0; i < n; i++) 
    {
        // check if the number contains 1, 
        // 2 & 3 in any order
        if (findContainsOneTwoThree(numbers[i]))
            oneTwoThree.push_back(numbers[i]);
    }

    // sort all the numbers
    sort(oneTwoThree.begin(), oneTwoThree.end());
    
    string result = "";
    for(auto number: oneTwoThree) 
    {
        int value = number;
        if (result.length() > 0)
            result += ", ";
            
        result += to_string(value);
    }
    
    
    return (result.length() > 0) ? result : "-1";
}

// Driver Code
int main() {
    int numbers[] = { 123, 1232, 456, 234, 32145 };

    int n = sizeof(numbers)/sizeof(numbers[0]);
    
    string result = printNumbers(numbers, n);
    cout << result;
    return 0;
}
// This code is contributed 
// by Sirjan13
{% endhighlight %}
{% highlight java %}
// Java program to print all number containing 
// 1, 2 and 3 in any order.
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class GFG {
    
    // prints all the number containing 1, 2, 3 
    // in any order
    private static String printNumbers(int[] numbers)
    {
        
        ArrayList<Integer> array = new ArrayList<>();
        for (int number : numbers) {
            
            // check if the number contains 1, 
            // 2 & 3 in any order
            if (findContainsOneTwoThree(number))
                array.add(number);
        }

        // sort all the numbers
        Collections.sort(array);
        
        StringBuffer strbuf = new StringBuffer();
        Iterator it = array.iterator();        
        while (it.hasNext()) {
            
            int value = (int)it.next();
            if (strbuf.length() > 0)
                strbuf.append(", ");
                
            strbuf.append(Integer.toString(value));
        }
        
        return (strbuf.length() > 0) ? 
                     strbuf.toString() : "-1";
    }

    // convert the number to string and find 
    // if it contains 1, 2 & 3.
    private static boolean findContainsOneTwoThree(
                                         int number)
    {
        
        String str = Integer.toString(number);        
        return (str.contains("1") && str.contains("2") && 
                                    str.contains("3"));
    }

    public static void main(String[] args) 
    {        
        int[] numbers = { 123, 1232, 456, 234, 32145 };        
        System.out.println(printNumbers(numbers));
    }
}
{% endhighlight %}
{% highlight python %}
# Python program for printing 
# all numbers containing 1,2 and 3

def printNumbers(numbers):
    
    # convert all numbers
    # to strings
    numbers = map(str, numbers)
    result = []
    for num in numbers:
        
        # check if each number 
        # in the list has 1,2 and 3
        if ('1' in num and 
            '2' in num and 
            '3' in num):
            result.append(num)
    
    # if there are no
    # valid numbers
    if not result:
        result = ['-1']
    
    return sorted(result);

# Driver Code
numbers = [123, 1232, 456, 
           234, 32145]
result = printNumbers(numbers)
print ', '.join(num for num in result)

# This code is contributed 
# by IshitaTripathi
{% endhighlight %}
{% highlight cpp %}
123, 1232, 32145
{% endhighlight %}
* Time Complexity: Time complexity of the above approach is O(n).
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

