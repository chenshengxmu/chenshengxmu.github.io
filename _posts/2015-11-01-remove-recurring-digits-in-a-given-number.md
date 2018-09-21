---
layout: post
title: Remove recurring digits in a given number
---
* Given a number as string, remove recurring digits from the given string. The changes must be made in-place. Expected time complexity O(n) and auxiliary space O(1).
* Examples:
{% highlight cpp %}
Input:  num[] = "1299888833"
Output: num[] = "12983"

Input:  num[] = "1299888833222"
Output: num[] = "129832"
{% endhighlight %}
* We strongly recommend you to minimize your browser and try this yourself first
* This problem is similar to Run Length Encoding.
{% highlight cpp %}
Let num[] be input number represented as character array

1) Initialize index of modified string 'j' as 0. 
2) Traverse input string and do following for every digit num[i].
   a) Copy current character 'num[i]' to 'num[j]' and increment i & j.
   b) Keep incrementing i while num[i] is same as previous digit.
3) Add string termination character at 'num[j]'
{% endhighlight %}
* Below is C++ implementation of above algorithm.
{% highlight cpp %}
// C++ program to remove recurring digits from
// a given number
#include <bits/stdc++.h>
using namespace std;

/* Removes recurring digits in num[]  */
void removeRecurringDigits(char num[])
{
    int len = strlen(num);

    int j = 0; // Index in modified string

    /* Traverse digits of given number one by one */
    for (int i=0; i<len; i++)
    {
        /* Copy the first occurrence of new digit */
        num[j++] = num[i];

        /* Remove repeating occurrences of digit */
        while (i + 1 < len && num[i] == num[i+1])
            i++;
    }

    /* terminate the modified string */
    num[j] = '\0';
}

/* Driver program to test above function */
int main()
{
    char num[] = "1299888833";
    removeRecurringDigits(num);
    cout << "Modified number is " << num;
    return 0;
}
{% endhighlight %}
* Output:
{% highlight cpp %}
Modified number is 12983
{% endhighlight %}
* This article is contributed by Priyanka. Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above

