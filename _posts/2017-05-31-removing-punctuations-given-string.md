---
layout: post
title: Removing punctuations from a given string
---
* Given a string, remove the punctuation from the string if the given character is a punctuation character as classified by the current C locale. The default C locale classifies these characters as punctuation:
{% highlight cpp %}
!"#$%&'()*+,-./:;<=>?@[\]^_`{|}~
{% endhighlight %}
* Examples:
{% highlight cpp %}
Input : %welcome' to @geeksforgeek<s
Output : welcome to geeksforgeeks

Input : Hello!!!, he said ---and went.
Output : Hello he said and went
{% endhighlight %}
* A loop is designed that goes through a list composed of the characters and punctuations of that string, removes the punctuation and then joins them.
{% highlight cpp %}
// CPP program to remove punctuation from a given string

#include <iostream>
using namespace std;

int main() 
{
	// input string
	std::string str = "Welcome ???@@##$ to#$% Geeks%$^for$%^&Geeks";

	for (int i = 0, len = str.size(); i < len; i++)
	{
		// check whether parsing character is punctuation or not
		if (ispunct(str[i]))
		{
			str.erase(i--, 1);
			len = str.size();
		}
	}
	
	// print string without punctuation
	std::cout << str;
	return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to remove punctuation from a given string

public class Test
{
	public static void main(String[] args)
	{
		// input string
	    String str = "Welcome ???@@##$ to#$% Geeks%$^for$%^&Geeks";
        
	    // similar to Matcher.replaceAll
	    str = str.replaceAll("\\p{Punct}","");
	    
	    System.out.println(str);
	}
	
}
// This code is contributed by Gaurav Miglani
{% endhighlight %}
{% highlight python %}
# Python program to remove punctuation from a given string
# Function to remove punctuation
def Punctuation(string):

	# punctuation marks
	punctuations = '''!()-[]{};:'"\,<>./?@#$%^&*_~'''

	# traverse the given string and if any punctuation
	# marks occur replace it with null
	for x in string.lower():
		if x in punctuations:
			string = string.replace(x, "")

	# Print string without punctuation
	print(string)

# Driver program
string = "Welcome ???@@##$ to#$% Geeks%$^for$%^&Geeks"
Punctuation(string)
{% endhighlight %}
* Output:
{% highlight cpp %}
Welcome  to GeeksforGeeks
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

