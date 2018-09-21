---
layout: post
title: Java program to swap first and last characters of words in a sentence
---
* Write a Java Program to Swap first and last character of words in a Sentence as mentioned in the example?
* Examples:
{% highlight cpp %}
Input : geeks for geeks
Output :seekg rof seekg
{% endhighlight %}
* Approach:As mentioned in the example we have to replace first and last character of word and keep rest of the alphabets as it is.
{% highlight java %}
class SwapFirstLastCharacters {
    static String count(String str)
    {
        // Create an equivalent char array
        // of given string
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {

            // k stores index of first character
            // and i is going to store index of last 
            // character. 
            int k = i;
            while (i < ch.length && ch[i] != ' ') 
                i++;
            
            // Swapping
            char temp = ch[k];
            ch[k] = ch[i - 1];
            ch[i - 1] = temp;

            // We assume that there is only one space
            // between two words.
        }
        return new String(ch);
    }
    public static void main(String[] args)
    {
        String str = "geeks for geeks";
        System.out.println(count(str));
    }
}
{% endhighlight %}
* Output:
{% highlight cpp %}
seekg rof seekg
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

