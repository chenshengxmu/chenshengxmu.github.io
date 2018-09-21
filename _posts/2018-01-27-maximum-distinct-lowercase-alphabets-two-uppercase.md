---
layout: post
title: Maximum distinct lowercase alphabets between two uppercase
---
* Given a string containing alphabets in lowercase and uppercase, find the maximum count of distinct lowercase alphabets present between two uppercase alphabets.
* Examples :
{% highlight cpp %}
Input : zACaAbbaazzC
Output : The maximum count = 3

Input : edxedxxxCQiIVmYEUtLi
Output : The maximum count = 1
{% endhighlight %}
* Method 1 (Using Character Count Array):
* Below is the implementation of the above method.
{% highlight cpp %}
// CPP Program to find maximum
// lowercase alphabets present
// between two uppercase alphabets
#include <bits/stdc++.h>
using namespace std;

#define MAX_CHAR 26

// Function which computes the
// maximum number of distinct
// lowercase alphabets between
// two uppercase alphabets
int maxLower(string str)
{
    int n = str.length();

    // Ignoring lowercase characters in the
    // beginning.
    int i = 0;
    for (; i < n; i++) {
        if (str[i] >= 'A' && str[i] <= 'Z') {
            i++;
            break;
        }
    }

    // We start from next of first capital letter
    // and traverse through remaining character.
    int maxCount = 0;
    int count[MAX_CHAR] = { 0 };
    for (; i < n; i++) {

        // If character is in uppercase,
        if (str[i] >= 'A' && str[i] <= 'Z') {

            // Count all distinct lower case
            // characters
            int currCount = 0;
            for (int j = 0; j < MAX_CHAR; j++)
                if (count[j] > 0)
                    currCount++;

            // Update maximum count
            maxCount = max(maxCount, currCount);

            // Reset count array
            memset(count, 0, sizeof(count));
        }

        // If character is in lowercase
        if (str[i] >= 'a' && str[i] <= 'z')
            count[str[i] - 'a']++;
    }

    return maxCount;
}

// Driver function
int main()
{
    string str = "zACaAbbaazzC";
    cout << maxLower(str);
    return 0;
}
{% endhighlight %}
{% highlight python %}
# Python3 Program to find maximum
# lowercase alphabets present
# between two uppercase alphabets

MAX_CHAR = 26

# Function which computes the
# maximum number of distinct
# lowercase alphabets between
# two uppercase alphabets
def maxLower(str):
    n = len(str)

    # Ignoring lowercase characters 
    # in the beginning.
    i = 0
    for i in range(n):
        if str[i] >= 'A' and str[i] <= 'Z':
            i += 1
            break
            
    # We start from next of first capital 
    # letter and traverse through 
    # remaining character.
    maxCount = 0
    count = []
    for j in range(MAX_CHAR):
        count.append(0)
        
    for j in range(i, n):

        # If character is in uppercase,
        if str[j] >= 'A' and str[j] <= 'Z':

            # Count all distinct lower
            # case characters
            currCount = 0
            for k in range(MAX_CHAR):
                if count[k] > 0:
                    currCount += 1

            # Update maximum count
            maxCount = max(maxCount, currCount)

            # Reset count array
            for y in count:
                y = 0
                
        # If character is in lowercase
        if str[j] >= 'a' and str[j] <= 'z':
            count[ord(str[j]) - ord('a')] += 1
            
    return maxCount

# Driver function
str = "zACaAbbaazzC";
print(maxLower(str))

# This code is contributed by Upendra Bartwal
{% endhighlight %}
{% highlight cpp %}
3
{% endhighlight %}
* Time Complexity : O(n).
*  
* Method 2 (Using Hash Table):In this method, we extensively use the C++ STL container unordered_set.
* Below is the implementation of above method :
{% highlight cpp %}
// CPP Program to find maximum
// lowercase alphabets present
// between two uppercase alphabets
#include <bits/stdc++.h>
using namespace std;

// Function which computes the
// maximum number of distinct
// lowercase alphabets between
// two uppercase alphabets
int maxLower(string str)
{
    int n = str.length();

    // Ignoring lowercase characters in the
    // beginning.
    int i = 0;
    for (; i < n; i++) {
        if (str[i] >= 'A' && str[i] <= 'Z') {
            i++;
            break;
        }
    }

    // We start from next of first capital letter
    // and traverse through remaining character.
    int maxCount = 0;
    unordered_set<int> s;
    for (; i < n; i++) {

        // If character is in uppercase,
        if (str[i] >= 'A' && str[i] <= 'Z') {

            // Update maximum count if lowercase
            // character before this is more.
            maxCount = max(maxCount, (int)s.size());

            // clear the set
            s.clear();
        }

        // If character is in lowercase
        if (str[i] >= 'a' && str[i] <= 'z')
            s.insert(str[i]);
    }

    return maxCount;
}

// Driver function
int main()
{
    string str = "zACaAbbaazzC";
    cout << maxLower(str);
    return 0;
}
{% endhighlight %}
{% highlight cpp %}
3
{% endhighlight %}
* Time complexity :
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

