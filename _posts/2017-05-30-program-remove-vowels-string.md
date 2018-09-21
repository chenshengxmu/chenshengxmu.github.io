---
layout: post
title: Program to remove vowels from a String
---
* Given a string, remove the vowels from the string and print the string without vowels.
* Examples:
{% highlight cpp %}
Input : welcome to geeksforgeeks
Output : wlcm t gksfrgks

Input : what is your name ?
Output : wht s yr nm ?
{% endhighlight %}
* A loop is designed that goes through a list composed of the characters of that string, removes the vowels and then joins them.
{% highlight java %}
// Java program to remove vowels from a String

import java.util.Arrays;
import java.util.List;

class Test
{    
    static String remVowel(String str)
    {
         Character vowels[] = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};
         
         List<Character> al = Arrays.asList(vowels);
         
         StringBuffer sb = new StringBuffer(str);
         
         for (int i = 0; i < sb.length(); i++) {
            
             if(al.contains(sb.charAt(i))){
                sb.replace(i, i+1, "") ;
                i--;
             }
        }
         
        
        return sb.toString();
    }
    // Driver method to test the above function
    public static void main(String[] args) 
    {
        String str = "GeeeksforGeeks - A Computer Science Portal for Geeks";
        
        System.out.println(remVowel(str));
    }
}
{% endhighlight %}
{% highlight python %}
# Python program to remove vowels from a string
# Function to remove vowels
def rem_vowel(string):
    vowels = ('a', 'e', 'i', 'o', 'u') 
    for x in string.lower():
        if x in vowels:
            string = string.replace(x, "")
            
    # Print string without vowels
    print(string)

# Driver program
string = "GeeksforGeeks - A Computer Science Portal for Geeks"
rem_vowel(string)
{% endhighlight %}
* Output:
{% highlight cpp %}
GksfrGks - A Cmptr Scnc Prtl fr Gks
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

