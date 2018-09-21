---
layout: post
title: Check if a string can be obtained by rotating another string 2 places
---
* Given two strings, the task is to find if a string can be obtained by rotating another string two places. Examples:
{% highlight cpp %}
Input : string1 = "amazon" 
        string2 = "azonam"  // rotated anti-clockwise
Output : Yes

Input : string1 = "amazon"
        string2 = "onamaz"  // rotated clockwise
Output : Yes
{% endhighlight %}
* Asked in: Amazon Interview
{% highlight cpp %}
1- There can be only two cases:
    a) Clockwise rotated
    b) Anti-clockwise rotated

2- If clockwise rotated that means elements
   are shifted in right.
   So, check if a substring[2.... len-1] of 
   string2 when concatenated with substring[0,1]
   of string2 is equal to string1. Then, return true.

3- Else, check if it is rotated anti-clockwise 
   that means elements are shifted to left.
   So, check if concatenation of substring[len-2, len-1]
   with substring[0....len-3] makes it equals to
   string1. Then return true.

4- Else, return false.
{% endhighlight %}
{% highlight cpp %}
// C++ program to check if a string is two time
// rotation of another string.
#include<bits/stdc++.h>
using namespace std;

// Function to check if string2 is obtained by
// string 1
bool isRotated(string str1, string str2)
{
    if (str1.length() != str2.length())
        return false;

    string clock_rot = "";
    string anticlock_rot = "";
    int len = str2.length();

    // Initialize string as anti-clockwise rotation
    anticlock_rot = anticlock_rot +
                    str2.substr(len-2, 2) +
                    str2.substr(0, len-2) ;

    // Initialize string as clock wise rotation
    clock_rot = clock_rot +
                str2.substr(2) +
                str2.substr(0, 2) ;

    // check if any of them is equal to string1
    return (str1.compare(clock_rot) == 0 ||
            str1.compare(anticlock_rot) == 0);
}

// Driver code
int main()
{
    string str1 = "geeks";
    string str2 = "eksge";

    isRotated(str1, str2) ? cout << "Yes"
                          : cout << "No";
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to check if a string is two time
// rotation of another string.

class Test
{
	// Method to check if string2 is obtained by
	// string 1
	static boolean isRotated(String str1, String str2)
	{
	    if (str1.length() != str2.length())
	        return false;
	 
	    String clock_rot = "";
	    String anticlock_rot = "";
	    int len = str2.length();
	 
	    // Initialize string as anti-clockwise rotation
	    anticlock_rot = anticlock_rot +
	                    str2.substring(len-2, len) +
	                    str2.substring(0, len-2) ;
	 
	    // Initialize string as clock wise rotation
	    clock_rot = clock_rot +
	                str2.substring(2) +
	                str2.substring(0, 2) ;
	 
	    // check if any of them is equal to string1
	    return (str1.equals(clock_rot) ||
	            str1.equals(anticlock_rot));
	}
	
    // Driver method
    public static void main(String[] args) 
    {
    	String str1 = "geeks";
        String str2 = "eksge";
     
        System.out.println(isRotated(str1, str2) ?  "Yes"
                              : "No");
    }
}
{% endhighlight %}
{% highlight cpp %}
Yes
{% endhighlight %}
* Exercise : Check if string2 is obtained by rotating string1 by k places.
* Reference : https://www.careercup.com/question?id=5734821229756416
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

