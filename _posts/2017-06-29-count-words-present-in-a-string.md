---
layout: post
title: Count words present in a string
---
* Given an array of words and a string, we need to count all words that are present in given string.
* Examples:
{% highlight cpp %}
Input : words[] = { "welcome", "to", "geeks", "portal"}
            str = "geeksforgeeks is a computer science portal for geeks."
Output :  2
Two words "portal" and "geeks" is present in str.


Input : words[] = {"Save", "Water", "Save", "Yourself"}
        str     = "Save"
Output :1
{% endhighlight %}
* Steps:
* Below is the Java implementation of above steps
{% highlight java %}
// Java program to count number 
// of words present in a string

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test 
{
	static int countOccurrence(String[] word, String str) 
	{
		// counter
		int counter = 0;
		
		// for extracting words
		Pattern p = Pattern.compile("[a-zA-Z]+");
		Matcher m = p.matcher(str);
		
		// HashSet for quick check whether
		//  a word in str present in word[] or not
		HashSet<String> hs = new HashSet<String>();
		
        for (String string : word) {
			hs.add(string);
		}
		
		while(m.find())
		{
			if(hs.contains(m.group()))
				counter++;
		}
		
		return counter;
		
	}
	
	public static void main(String[] args) 
	{
		String word[] = { "welcome", "to", "geeks", "portal"};
		
		String str = "geeksforgeeks is a computer science portal for geeks.";
		
		System.out.println(countOccurrence(word,str));
		
	}

}
{% endhighlight %}
* Output:
{% highlight cpp %}
2
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

