---
layout: post
title: Program to find the initials of a name.
---
* Given a string name. we have to find the initial of the name
* Examples:
{% highlight cpp %}
Input  : prabhat kumar singh
Output : P K S
We take the first letter of all
words and print in capital letter.

Input  : Jude Law
Output : J L

Input  : abhishek kumar singh
Output : A K S
{% endhighlight %}
* 1) Print first character in capital. 2) Traverse rest of the string and print every character after space in capital letter.
{% highlight cpp %}
// C++ program to print initials of a name
#include <bits/stdc++.h>
using namespace std;

void printInitials(const string& name)
{
    if (name.length() == 0)
        return;

    // Since touuper() returns int, we do typecasting
    cout << (char)toupper(name[0]);

    // Traverse rest of the string and print the
    // characters after spaces.
    for (int i = 1; i < name.length() - 1; i++)
        if (name[i] == ' ')
            cout << " " << (char)toupper(name[i + 1]);
}

// Driver code
int main()
{
    string name = "prabhat kumar singh";
    printInitials(name);
    return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to print initials of a name
class initials {
    
    static void printInitials(String name)
    {
        if (name.length() == 0)
            return;

        // Since touuper() returns int, 
        // we do typecasting
        System.out.print(Character.toUpperCase(
            name.charAt(0)));

        // Traverse rest of the string and 
        // print the characters after spaces.
        for (int i = 1; i < name.length() - 1; i++)
            if (name.charAt(i) == ' ')
                System.out.print(" " + Character.toUpperCase(
                                        name.charAt(i + 1)));
    }

    // Driver code
    public static void main(String args[])
    {
        String name = "prabhat kumar singh";
        printInitials(name);
    }
}

// This code is contributed by Danish Kaleem
{% endhighlight %}
{% highlight python %}
# Python program to print 
# initials of a name

# user define function 
def printInitials(name): 
    if(len(name) == 0):
        return
    print(name[0].upper()),
    for i in range(1, len(name) - 1):
        if (name[i] == ' '):
            print (name[i + 1].upper()),

def main():
    name = "Prabhat Kumar Singh"
    printInitials(name)

if __name__=="__main__":
    main() 

# This code is contributed
# by prabhat kumar singh
{% endhighlight %}
{% highlight cpp %}
P K S
{% endhighlight %}
* We can also use strtok() function in C/C++ to achieve this.
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

