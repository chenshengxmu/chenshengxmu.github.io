---
layout: post
title: Find index of closing bracket for a given opening bracket in an expression
---
* Given a string with brackets. If the start index of the open bracket is given, find the index of the closing bracket.
* Examples:
{% highlight cpp %}
Input : string = [ABC[23]][89]
        index = 0
Output : 8
The opening bracket at index 0 corresponds
to closing bracket at index 8.
{% endhighlight %}
* The idea is to use Stack data structure. We traverse given expression from given index and keep pushing starting brackets. Whenever we encounter a closing bracket, we pop a starting bracket. If stack becomes empty at any moment, we return that index.
{% highlight cpp %}
// CPP program to find index of closing
// bracket for given opening bracket.
#include <bits/stdc++.h>
using namespace std;

// Function to find index of closing
// bracket for given opening bracket.
void test(string expression, int index){
    int i;
    
    // If index given is invalid and is 
    // not an opening bracket.
    if(expression[index]!='['){
        cout << expression << ", " <<
                    index << ": -1\n";
        return;
    }
    
    // Stack to store opening brackets.
    stack <int> st;
    
    // Traverse through string starting from
    // given index.
    for(i = index; i < expression.length(); i++){
        
        // If current character is an 
        // opening bracket push it in stack.
        if(expression[i] == '[')
          st.push(expression[i]);
        
        // If current character is a closing
        // bracket, pop from stack. If stack 
        // is empty, then this closing
        // bracket is required bracket.
        else if(expression[i] == ']'){
            st.pop();
            if(st.empty()){
                cout << expression << ", " << 
                       index << ": " << i << "\n";
                return;
            }
        }
    }
    
    // If no matching closing bracket
    // is found.
    cout << expression << ", " <<
                index << ": -1\n";
}

// Driver Code
int main() {
    test("[ABC[23]][89]", 0); // should be 8
    test("[ABC[23]][89]", 4); // should be 7
    test("[ABC[23]][89]", 9); // should be 12
    test("[ABC[23]][89]", 1); // No matching bracket
    return 0;
}

// This code is contributed by Nikhil Jindal.
{% endhighlight %}
{% highlight python %}
# Python program to find index of closing
# bracket for a given opening bracket.
from collections import deque

def getIndex(s, i):

    # If input is invalid.
    if s[i] != '[':
        return -1

    # Create a deque to use it as a stack.
    d = deque()

    # Traverse through all elements
    # starting from i.
    for k in range(i, len(s)):

        # Pop a starting bracket
        # for every closing bracket
        if s[k] == ']':
            d.popleft()

        # Push all starting brackets
        elif s[k] == '[':
            d.append(s[i])

        # If deque becomes empty
        if not d:
            return k

    return -1

# Driver code to test above method.
def test(s, i):
    matching_index = getIndex(s, i)
    print(s + ", " + str(i) + ": " + str(matching_index))

def main():
    test("[ABC[23]][89]", 0) # should be 8
    test("[ABC[23]][89]", 4) # should be 7
    test("[ABC[23]][89]", 9) # should be 12
    test("[ABC[23]][89]", 1) # No matching bracket

if __name__ == "__main__":
    main()
{% endhighlight %}
{% highlight cpp %}
Output :[ABC[23]][89], 0: 8
Output :[ABC[23]][89], 4: 7
Output :[ABC[23]][89], 9: 12
Output :[ABC[23]][89], 1: -1
{% endhighlight %}
* Time Complexity: O(n) Auxiliary Space: O(n)
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

