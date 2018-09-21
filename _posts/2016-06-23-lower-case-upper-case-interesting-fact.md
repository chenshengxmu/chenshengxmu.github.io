---
layout: post
title: Lower case to upper case - An interesting fact
---
* Problem: Given a string containing only lowercase letters, generate a string with the same letters, but in uppercase.
{% highlight cpp %}
Input : GeeksForGeeks
Output : GEEKSFORGEEKS
{% endhighlight %}
* The first method that comes to our mind is
{% highlight cpp %}
// C++ program to convert a string to uppercase
#include <iostream>
using namespace std;

// Converts a string to uppercase
string to_upper(string &in)
{
    for (int i = 0; i < in.length(); i++)
          if ('a' <= in[i] <= 'z')
              in[i] = in[i] - 'a' + 'A';
    return in;
}

// Driver code
int main()
{
   string str = "geeksforgeeks";
   cout << to_upper(str);
   return 0;
}
{% endhighlight %}
* Output :
{% highlight cpp %}
GEEKSFORGEEKS
{% endhighlight %}
* A more interesting solution, on the other hand, would be:
{% highlight cpp %}
// C++ program to convert a string to uppercase
#include <iostream>
using namespace std;

// Converts a string to uppercase
string to_upper(string &in)
{
    for (int i = 0; i < in.length(); i++)
          if ('a' <= in[i] <= 'z')
              in[i] &= ~(1 << 5);
    return in;
}

// Driver code
int main()
{
   string str = "geeksforgeeks";
   cout << to_upper(str);
   return 0;
}
{% endhighlight %}
* Output :
{% highlight cpp %}
GEEKSFORGEEKS
{% endhighlight %}
* Explanation: The ASCII table is constructed in such way that the binary representation of lowercase letters is almost identical of binary representation of uppercase letters. The only difference is the sixth bit, setted only for lowercase letters. What that elegant function does is unset the bit of index 5 of in[i], consequently, making that character lowercase. Disadvantages: That strategy works only for alphabetical characters. If the input contains numbers or punctuations, we’ll have to use the naive way. Example: Character ‘A’ is integer 65 = (0100 0001)2, while character ‘a’ is integer = 97 = (0110 0001)2. (Note that 97 – 65 = 32. Can you guess why?) Exercises:
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above

