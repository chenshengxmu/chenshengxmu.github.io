---
layout: post
title: Count of operations to make a binary string"ab" free
---
* Given a string containing characters ‘a’ and ‘b’ only. Convert the given string into a string in which there is no ‘ab’ substring. To make string ‘ab’ free we can perform an operation in which we select a ‘ab’ substring and replace it by ‘bba’. Find the total number of operations required to convert the given string.
* Examples:
{% highlight cpp %}
Input : s = 'abbaa'
Output : 2
Explanation:
Here, ['ab'baa] is replaced s = [bbabaa]
[bb'ab'aa] is replaced s = [bbbbaaa]
which is ab free. Hence, 2 operations required.

Input : s = 'aab'
Output : 3
Explanation:
Here, [a'ab'] is replaced s = [abba]
['ab'ba] is replaced s = [bbaba]
[bb'ab'a] is replaced s = [bbbbaa]
which is ab free. Hence, 3 operations required.
{% endhighlight %}
* Approach: The final state will be some character ‘a’ after ‘b’: “bbb…baaa…a” It’s obvious to prove all ‘b’s are distinctive to each other(i.e. Each ‘b’ in the initial state, will add some number of ‘b’s to the final state disjoint from other ‘b’s). For a character ‘b’ from the initial state it will double after seeing a character ‘a’. For each i-th character ‘b’, consider ti the number of a before it. So the final number of ‘b’s can be defined as sumation of 2^ti.
* Below is the Python3 implementation of above approach.
{% highlight python %}
# code to make 'ab' free string
def abFree(s):
   
    # Traverse from end. Keep track of count
    # b's. For every 'a' encountered, add b_count 
    # to result and double b_count.
    b_count = 0
    res = 0
    for i in range(len(s)):
        if s[~i] == 'a':
            res = (res + b_count)
            b_count  = (b_count  * 2)
        else:
            b_count  += 1
    return res

# driver code
s = 'abbaa'
print(abFree(s))

s = 'aab'
print(abFree(s))

s ='ababab'
print(abFree(s))
{% endhighlight %}
* Output:
{% highlight cpp %}
2
3
11
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

