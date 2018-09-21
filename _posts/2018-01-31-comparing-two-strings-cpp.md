---
layout: post
title: Comparing two strings in C++
---
* Given two strings, how to check if the two strings are equal or not. Examples:
{% highlight cpp %}
Input  : ABCD, XYZ
Output : ABCD is not equal to XYZ
         ABCD is greater than XYZ

Input  : Geeks, forGeeks
Output : Geeks is not equal to forGeeks
         forGeeks is greater than Geeks
{% endhighlight %}
* This problem can be solved using any of following two methords
{% highlight cpp %}
// CPP code to implement relational
// operators on string objects
#include <iostream>
using namespace std;

void relationalOperation(string s1, string s2)
{

    if (s1 != s2)
        cout << s1 << " is not equal to "
             << s2 << endl;
    if (s1 > s2)
        cout << s1 << " is greater than "
             << s2 << endl;
    else
        cout << s2 << " is greater than "
             << s1 << endl;
}

// Main function
int main()
{
    string s1("Geeks");
    string s2("forGeeks");
    relationalOperation(s1, s2);
    return 0;
}
{% endhighlight %}
{% highlight cpp %}
Geeks is not equal to forGeeks
forGeeks is greater than Geeks
{% endhighlight %}
{% highlight cpp %}
// CPP code perform relational
// operation using compare function
#include <iostream>

using namespace std;

void compareFunction(string s1, string s2)
{
    // comparing both using inbuilt function
    int x = s1.compare(s2);

    if (x != 0)
        cout << s1 << " is not equal to "
             << s2 << endl;
    if (x > 0)
        cout << s1 << " is greater than "
             << s2 << endl;
    else
        cout << s2 << " is greater than "
             << s1 << endl;
}

// Main function
int main()
{
    string s1("Geeks");
    string s2("forGeeks");
    compareFunction(s1, s2);
    return 0;
}
{% endhighlight %}
{% highlight cpp %}
Geeks is not equal to forGeeks
forGeeks is greater than Geeks
{% endhighlight %}
* Differences between C++ Relational operators and compare() :-
{% highlight cpp %}
// Compare 3 characters from 3rd position
// (or index 2) of str1 with 3 characters 
// from 4th position of str2. 
if (str1.compare(2, 3, str2, 3, 3) == 0)
   cout<<"Equal";
else
   cout<<"Not equal";
{% endhighlight %}
* Using Relational operator
{% highlight cpp %}
for (i = 2, j = 3; i <= 5 && j <= 6; i++, j++)    
{ 
    if (s1[i] != s2[j])
       break;
}
if (i == 6 && j == 7)
    cout << "Equal";
else
    cout << "Not equal";
{% endhighlight %}
* Above example clearly shows how compare() reduces lots of extra processing, therefore it is advisable to use it while performing substring comparison at some position, otherwise both perform almost in same manner.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

