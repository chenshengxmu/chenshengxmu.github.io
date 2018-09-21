---
layout: post
title: Reverse words in a given string
---
* Example: Let the input string be “i like this program very much”. The function should change the string to “much very program this like i”

![img](https://www.geeksforgeeks.org/wp-content/uploads/reverse-Words.jpg)
* Examples :
{% highlight cpp %}
Input  : s = "geeks quiz practice code"
Output : s = "code practice quiz geeks"

Input  : s = "getting good at coding needs a lot of practice"
Output : s = "practice of lot a needs coding at good getting"
{% endhighlight %}
* Algorithm:
{% highlight cpp %}
1) Reverse the individual words, we get the below string.
     "i ekil siht margorp yrev hcum"
2) Reverse the whole string from start to end and you get the desired output.
     "much very program this like i"
{% endhighlight %}
{% highlight c %}
// CPP program to reverse a string
#include <stdio.h>

/* function prototype for utility function to
  reverse a string from begin to end  */
void reverse(char* begin, char* end);

/*Function to reverse words*/
void reverseWords(char* s)
{
    char* word_begin = s;
    char* temp = s; /* temp is for word boundry */

    /*STEP 1 of the above algorithm */
    while (*temp) {
        temp++;
        if (*temp == '\0') {
            reverse(word_begin, temp - 1);
        }
        else if (*temp == ' ') {
            reverse(word_begin, temp - 1);
            word_begin = temp + 1;
        }
    } /* End of while */

    /*STEP 2 of the above algorithm */
    reverse(s, temp - 1);
}

/* UTILITY FUNCTIONS */
/*Function to reverse any sequence starting with pointer
  begin and ending with pointer end  */
void reverse(char* begin, char* end)
{
    char temp;
    while (begin < end) {
        temp = *begin;
        *begin++ = *end;
        *end-- = temp;
    }
}

/* Driver function to test above functions */
int main()
{
    char s[] = "i like this program very much";
    char* temp = s;
    reverseWords(s);
    printf("%s", s);
    getchar();
    return 0;
}
{% endhighlight %}
{% highlight cpp %}
much very program this like i
{% endhighlight %}
* Output:
{% highlight cpp %}
much very program this like i
{% endhighlight %}
* The above code doesn’t handle the cases when the string starts with space. The following version handles this specific case and doesn’t make unnecessary calls to reverse function in the case of multiple space in between. Thanks to rka143 for providing this version.
{% highlight c %}
void reverseWords(char* s)
{
    char* word_begin = NULL;
    char* temp = s; /* temp is for word boundry */

    /*STEP 1 of the above algorithm */
    while (*temp) {
        /*This condition is to make sure that the string start with
          valid character (not space) only*/
        if ((word_begin == NULL) && (*temp != ' ')) {
            word_begin = temp;
        }
        if (word_begin && ((*(temp + 1) == ' ') || (*(temp + 1) == '\0'))) {
            reverse(word_begin, temp);
            word_begin = NULL;
        }
        temp++;
    } /* End of while */

    /*STEP 2 of the above algorithm */
    reverse(s, temp - 1);
}
{% endhighlight %}
* Time Complexity: O(n) In Python, we csn do the above task by splitting and saving the string in reverse manner
{% highlight python %}
# Python program to reverse a string
# s = input()
s = "i like this program very much"
words = s.split(' ')
string =[]
for word in words:
    string.insert(0, word)

print("Reversed String:")
print(" ".join(string))

# Solution proposed bu Uttam
{% endhighlight %}
{% highlight cpp %}
Reversed String:
much very program this like i
{% endhighlight %}
* Please write comments if you find any bug in above code/algorithm, or find other ways to solve the same problem.

