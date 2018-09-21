---
layout: post
title: Check for balanced parentheses in an expression | O(1) space
---
* Given a string of length n having parentheses in it, your task is to find whether given string has balanced parentheses or not. Please note there is constraint on space i.e. we are allowed to use only O(1) extra space.
* Also See : Check for balanced parantheses
* Examples :
{% highlight cpp %}
Input : (())[]
Output : Yes

Input : ))(({}{
Output : No
{% endhighlight %}
* If k = 1, then we will simply keep a count variable c = 0, whenever we encounter an opening parentheses we will increment c and whenever we encounter a closing parentheses we will reduce the count of c, At any stage we shouldn’t have c < 0 and at the end we must have c = 0 for string to be balanced. Following is the idea of our algorithm for this problem. For any opening bracket say ‘[‘ we find its matching closing bracket ‘]’. Let’s say index of ‘[‘ was i and index of ‘]’ was j then following conditions must be true:
{% highlight cpp %}
// C++ code to check balanced parentheses with
// O(1) space. 
#include <stdio.h>
#include <stdlib.h>

// Function1 to match closing bracket
int matchClosing(char X[], int start,
                int end, char open, char close)
{
    int c = 1;
    int i = start + 1;
    while (i <= end) {
        if (X[i] == open)
            c++;
        else if (X[i] == close)
            c--;
        if (c == 0)
            return i;
        i++;
    }
    return i;
}

// Function1 to match opening bracket
int matchingOpening(char X[], int start,
                    int end, char open, char close)
{
    int c = -1;
    int i = end - 1;

    while (i >= start) {
        if (X[i] == open)
            c++;
        else if (X[i] == close)
            c--;
        if (c == 0)
            return i;
        i--;
    }
    return -1;
}

// Function to check balanced parantheses
bool isBalanced(char X[], int n)
{
    // helper variables
    int i, j, k, x, start, end;

    for (i = 0; i < n; i++) {
        // Handling case of opening parantheses
        if (X[i] == '(')
            j = matchClosing(X, i, n - 1, '(', ')');
        else if (X[i] == '{')
            j = matchClosing(X, i, n - 1, '{', '}');
        else if (X[i] == '[')
            j = matchClosing(X, i, n - 1, '[', ']');

        // Handling case of closing parantheses
        else {
            if (X[i] == ')')
                j = matchingOpening(X, 0, i, '(', ')');
            else if (X[i] == '}')
                j = matchingOpening(X, 0, i, '{', '}');
            else if (X[i] == ']')
                j = matchingOpening(X, 0, i, '[', ']');

            // If corresponsing matching
            // opening parantheses doesn't
            // lie in given interval return 0
            if (j < 0 || j >= i)
                return false;

            // else continue
            continue;
        }

        // If corresponding closing parantheses
        // doesn't lie in given interval
        // return 0
        if (j >= n || j < 0)
            return false;

        // if found, now check for each
        // opening and closing parantheses
        // in this interval
        start = i;
        end = j;

        for (k = start + 1; k < end; k++) {
            if (X[k] == '(') {
                x = matchClosing(X, k, end, '(', ')');
                if (!(k < x && x < end)) {
                    return false;
                }
            }
            else if (X[k] == ')') {
                x = matchingOpening(X, start, k, '(', ')');
                if (!(start < x && x < k)) {
                    return false;
                }
            }

            if (X[k] == '{') {
                x = matchClosing(X, k, end, '{', '}');
                if (!(k < x && x < end)) {
                    return false;
                }
            }

            else if (X[k] == '}') {
                x = matchingOpening(X, start, k, '{', '}');
                if (!(start < x && x < k)) {
                    return false;
                }
            }
            if (X[k] == '[') {
                x = matchClosing(X, k, end, '[', ']');
                if (!(k < x && x < end)) {
                    return false;
                }
            }
            else if (X[k] == ']') {
                x = matchingOpening(X, start, k, '[', ']');
                if (!(start < x && x < k)) {
                    return false;
                }
            }
        }
    }

    return true;
}

// Driver Code
int main()
{
    char X[] = "[()]()";
    int n = 6;
    if (isBalanced(X, n))
        printf("Yes\n");
    else
        printf("No\n");

    char Y[] = "[[()]])";
    n = 7;
    if (isBalanced(Y, n))
        printf("Yes\n");
    else
        printf("No\n");

    return 0;
}
{% endhighlight %}
{% highlight cpp %}
Yes
No
{% endhighlight %}
* Time Complexity: O(n3)
* Auxiliary Space: O(1)
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

