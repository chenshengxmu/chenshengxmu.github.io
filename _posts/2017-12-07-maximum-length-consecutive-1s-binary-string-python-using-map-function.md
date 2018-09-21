---
layout: post
title: Maximum length of consecutive 1's in a binary string in Python using Map function
---
* We are given a binary string containing 1’s and 0’s. Find maximum length of consecutive 1’s in it.
* Examples:
{% highlight cpp %}
Input : str = '11000111101010111'
Output : 4
{% endhighlight %}
* We have existing solution for this problem please refer Maximum consecutive one’s (or zeros) in a binary array link. We can solve this problem within single line of code in Python. Approach is very simple,
{% highlight python %}
# Function to find Maximum legth of consecutive 1's in a binary string

def maxConsecutive1(input):
     # input.split('0') --> splits all sub-strings of consecutive 1's
     # separated by 0's, output will be like ['11','1111','1','1','111']
     # map(len,input.split('0'))  --> map function maps len function on each 
     # sub-string of consecutive 1's
     # max() returns maximum element from a list
     print max(map(len,input.split('0')))

# Driver program
if __name__ == "__main__":
    input = '11000111101010111'
    maxConsecutive1(input)
{% endhighlight %}
* Output:
{% highlight cpp %}
4
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

