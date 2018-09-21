---
layout: post
title: Given a binary string, count number of substrings that start and end with 1.
---
* Given a binary string, count number of substrings that start and end with 1. For example, if the input string is “00100101”, then there are three substrings “1001”, “100101” and “101”.
* Source: Amazon Interview Experience | Set 162
* Difficulty Level: Rookie
* A Simple Solution is to run two loops. Outer loops picks every 1 as starting point and inner loop searches for ending 1 and increments count whenever it finds 1.
{% highlight c %}
// A simple C++ program to count number of substrings starting and ending
// with 1
#include<iostream>
using namespace std;

int countSubStr(char str[])
{
   int res = 0;  // Initialize result

   // Pick a starting point
   for (int i=0; str[i] !='\0'; i++)
   {
        if (str[i] == '1')
        {
            // Search for all possible ending point
            for (int j=i+1; str[j] !='\0'; j++)
               if (str[j] == '1')
                  res++;
        }
   }
   return res;
}

// Driver program to test above function
int main()
{
  char str[] = "00100101";
  cout << countSubStr(str);
  return 0;
}
{% endhighlight %}
{% highlight java %}
// A simple C++ program to count number of 
//substrings starting and ending with 1

class CountSubString 
{
    int countSubStr(char str[],int n) 
    {
        int res = 0;  // Initialize result

        // Pick a starting point
        for (int i = 0; i<n; i++) 
        {
            if (str[i] == '1') 
            {
                // Search for all possible ending point
                for (int j = i + 1; j< n; j++) 
                {
                    if (str[j] == '1')
                        res++;
                }
            }
        }
        return res;
    }

    // Driver program to test the above function
    public static void main(String[] args) 
    {
        CountSubString count = new CountSubString();
        String string = "00100101";
        char str[] = string.toCharArray();
        int n = str.length;
        System.out.println(count.countSubStr(str,n));
    }
}
{% endhighlight %}
{% highlight python %}
# A simple Python 3 program to count number of
# substrings starting and ending with 1

def countSubStr(st, n) :
    
    # Initialize result
    res = 0   
 
   # Pick a starting point
    for i in range(0, n) :
        if (st[i] == '1') :

            # Search for all possible ending point
            for j in range(i+1, n) :
                if (st[j] == '1') :
                    res = res + 1
        
    return res
    
 
# Driver program to test above function
st = "00100101";
list(st)
n= len(st)
print(countSubStr(st, n), end="")


# This code is contributed
# by Nikita Tiwari.
{% endhighlight %}
{% highlight cpp %}
3
{% endhighlight %}
* Time Complexity of the above solution is O(n2). We can find count in O(n) using a single traversal of input string. Following are steps. a) Count the number of 1’s. Let the count of 1’s be m. b) Return m(m-1)/2 The idea is to count total number of possible pairs of 1’s.
{% highlight c %}
// A O(n) C++ program to count number of substrings starting and ending
// with 1
#include<iostream>
using namespace std;

int countSubStr(char str[])
{
   int m = 0; // Count of 1's in input string

   // Travers input string and count of 1's in it
   for (int i=0; str[i] !='\0'; i++)
   {
        if (str[i] == '1')
           m++;
   }

   // Return count of possible pairs among m 1's
   return m*(m-1)/2;
}

// Driver program to test above function
int main()
{
  char str[] = "00100101";
  cout << countSubStr(str);
  return 0;
}
{% endhighlight %}
{% highlight java %}
// A O(n) C++ program to count number of substrings 
//starting and ending with 1

class CountSubString 
{
    int countSubStr(char str[], int n) 
    {
        int m = 0; // Count of 1's in input string

        // Travers input string and count of 1's in it
        for (int i = 0; i < n; i++) 
        {
            if (str[i] == '1')
                m++;
        }

        // Return count of possible pairs among m 1's
        return m * (m - 1) / 2;
    }<div id="company_tags"></div><div id="company_tags"></div>

    // Driver program to test the above function
    public static void main(String[] args) 
    {
        CountSubString count = new CountSubString();
        String string = "00100101";
        char str[] = string.toCharArray();
        int n = str.length;
        System.out.println(count.countSubStr(str, n));
    }
}
{% endhighlight %}
{% highlight python %}
# A Python3 program to count number of
# substrings starting and ending with 1

def countSubStr(st, n) :

    # Count of 1's in input string
    m = 0  
 
    # Traverse input string and 
    # count of 1's in it
    for i in range(0, n) :
        if (st[i] == '1') :
            m = m + 1
        
    # Return count of possible
    # pairs among m 1's
    return m * (m - 1) // 2
   
 
# Driver program to test above function
st = "00100101";
list(st)
n= len(st)
print(countSubStr(st, n), end="")


# This code is contributed
# by Nikita Tiwari.
{% endhighlight %}
{% highlight cpp %}
3
{% endhighlight %}
* This article is contributed by Shivam. Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above

