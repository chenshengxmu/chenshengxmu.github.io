---
layout: post
title: Given a string, find its first non-repeating character
---
* We can use string characters as index and build a count array. Following is the algorithm.

![img](https://www.geeksforgeeks.org/wp-content/uploads/find-first-non-repeated-character-in-a-string.png)
{% highlight cpp %}
1) Scan the string from left to right and construct the count array.
2) Again, scan the string from left to right and check for count of each
 character, if you find an element who's count is 1, return it.
{% endhighlight %}
* Example:
{% highlight cpp %}
Input string: str = geeksforgeeks
1: Construct character count array from the input string.
   ....
  count['e'] = 4
  count['f'] = 1
  count['g'] = 2
  count['k'] = 2
  ……
2: Get the first character who's count is 1 ('f').
{% endhighlight %}
* Implementation:
{% highlight c %}
// C program to find first non-repeating character
#include<stdlib.h>
#include<stdio.h>
#define NO_OF_CHARS 256

/* Returns an array of size 256 containg count
   of characters in the passed char array */
int *getCharCountArray(char *str)
{
   int *count = (int *)calloc(sizeof(int), NO_OF_CHARS);
   int i;
   for (i = 0; *(str+i);  i++)
      count[*(str+i)]++;
   return count;
}

/* The function returns index of first non-repeating
   character in a string. If all characters are repeating 
   then returns -1 */
int firstNonRepeating(char *str)
{
  int *count = getCharCountArray(str);
  int index = -1, i;

  for (i = 0; *(str+i);  i++)
  {
    if (count[*(str+i)] == 1)
    {
      index = i;
      break;
    }   
  }  
  
  free(count); // To avoid memory leak
  return index;
}

/* Driver program to test above function */
int main()
{
  char str[] = "geeksforgeeks";
  int index =  firstNonRepeating(str);
  if (index == -1)  
    printf("Either all characters are repeating or string is empty");
  else
   printf("First non-repeating character is %c", str[index]);
  getchar();
  return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to find first non-repeating character

class GFG 
{
    static final int NO_OF_CHARS = 256;
    static char count[] = new char[NO_OF_CHARS];
    
    /* calculate count of characters 
       in the passed string */
     static void getCharCountArray(String str) 
     {
         for (int i = 0; i < str.length();  i++)
              count[str.charAt(i)]++;
     }
     
    /* The method returns index of first non-repeating
       character in a string. If all characters are repeating 
       then returns -1 */
    static int firstNonRepeating(String str)
    {
        getCharCountArray(str);
        int index = -1, i;
     
        for (i = 0; i < str.length();  i++)
        {
            if (count[str.charAt(i)] == 1)
            {
                index = i;
                break;
            }   
        }  
      
      return index;
    }

    // Driver method
    public static void main (String[] args)
    {
        String str = "geeksforgeeks";
        int index =  firstNonRepeating(str);
        
        System.out.println(index == -1 ? "Either all characters are repeating or string " +
                   "is empty" : "First non-repeating character is " +  str.charAt(index));
    }
}
{% endhighlight %}
{% highlight python %}
# Python program to print the first non-repeating character
NO_OF_CHARS = 256

# Returns an array of size 256 containg count
# of characters in the passed char array
def getCharCountArray(string):
    count = [0] * NO_OF_CHARS
    for i in string:
        count[ord(i)]+=1
    return count

# The function returns index of first non-repeating
# character in a string. If all characters are repeating
# then returns -1
def firstNonRepeating(string):
    count = getCharCountArray(string)
    index = -1
    k = 0

    for i in string:
        if count[ord(i)] == 1:
            index = k
            break
        k += 1

    return index

# Driver program to test above function
string = "geeksforgeeks"
index = firstNonRepeating(string)
if index==1:
    print "Either all characters are repeating or string is empty"
else:
    print "First non-repeating character is " + string[index]

# This code is contributed by Bhavya Jain
{% endhighlight %}
{% highlight cpp %}
First non-repeating character is f
{% endhighlight %}
* Can we do it by traversing the string only once? The above approach takes O(n) time, but in practice it can be improved. The first part of the algorithm runs through the string to construct the count array (in O(n) time). This is reasonable. But the second part about running through the string again just to find the first non-repeater is not good in practice. In real situations, your string is expected to be much larger than your alphabet. Take DNA sequences for example: they could be millions of letters long with an alphabet of just 4 letters. What happens if the non-repeater is at the end of the string? Then we would have to scan for a long time (again). We can augment the count array by storing not just counts but also the index of the first time you encountered the character e.g. (3, 26) for ‘a’ meaning that ‘a’ got counted 3 times and the first time it was seen is at position 26. So when it comes to finding the first non-repeater, we just have to scan the count array, instead of the string. Thanks to Ben for suggesting this approach.
* Following is implementation of the extended approach that traverses the input string only once.
{% highlight cpp %}
// CPP program to find first non-repeating
// character
#include <bits/stdc++.h>
using namespace std;
#define NO_OF_CHARS 256

/* The function returns index of the first
   non-repeating character in a string. If
   all characters are repeating then
   reurns INT_MAX */
int firstNonRepeating(char *str)
{
    pair<int, int> arr[NO_OF_CHARS];

    for (int i = 0; str[i]; i++)
    {
        (arr[str[i]].first)++;
        arr[str[i]].second = i;
    }

    int res = INT_MAX;
    for (int i = 0; i < NO_OF_CHARS; i++)

        // If this character occurs only
        // once and appears before the
        // current result, then update the
        // result
        if (arr[i].first == 1)
            res = min(res, arr[i].second);

    return res;
}

/* Driver program to test above function */
int main()
{
    char str[] = "geeksforgeeks";
    int index = firstNonRepeating(str);
    if (index == INT_MAX)
        printf("Either all characters are "
              "repeating or string is empty");
    else
        printf("First non-repeating character"
               " is %c", str[index]);
    return 0;
}
{% endhighlight %}
{% highlight c %}
#include <stdlib.h>
#include <stdio.h>
#include <limits.h>
#define NO_OF_CHARS 256

// Structure to store count of a character and index of the first
// occurrence in the input string
struct countIndex {
   int count;
   int index;
};

/* Returns an array of above structure type. The size of
   array is NO_OF_CHARS */
struct countIndex *getCharCountArray(char *str)
{
   struct countIndex *count =
        (struct countIndex *)calloc(sizeof(countIndex), NO_OF_CHARS);
   int i;
   for (i = 0; *(str+i);  i++)
   {
      (count[*(str+i)].count)++;

      // If it's first occurrence, then store the index
      if (count[*(str+i)].count == 1)
         count[*(str+i)].index = i;
   }
   return count;
}

/* The function returns index of the first non-repeating
    character in a string. If all characters are repeating
    then reurns INT_MAX */
int firstNonRepeating(char *str)
{
  struct countIndex *count = getCharCountArray(str);
  int result = INT_MAX, i;

  for (i = 0; i < NO_OF_CHARS;  i++)
  {
    // If this character occurs only once and appears
    // before the current result, then update the result
    if (count[i].count == 1 && result > count[i].index)
       result = count[i].index;
  }

  free(count); // To avoid memory leak
  return result;
}

/* Driver program to test above function */
int main()
{
  char str[] = "geeksforgeeks";
  int index =  firstNonRepeating(str);
  if (index == INT_MAX)
    printf("Either all characters are repeating or string is empty");
  else
   printf("First non-repeating character is %c", str[index]);
  getchar();
  return 0;
}
{% endhighlight %}
{% highlight java %}
// Java program to find first non-repeating character
// Note : hashmap is used

import java.util.HashMap;

class CountIndex
{
    int count,index;
    
    // constructor for first occurrence
    public CountIndex(int index) {
        this.count = 1;
        this.index = index;
    }
    
    // method for updating count
    public void incCount() {
        this.count++;
    }
}
class GFG 
{
    static final int NO_OF_CHARS = 256;
    
    static HashMap<Character, CountIndex> hm = new HashMap<Character, CountIndex>(NO_OF_CHARS);
    
    /* calculate count of characters 
       in the passed string */
     static void getCharCountArray(String str) 
     {
         for (int i = 0; i < str.length();  i++)
         {
            // If character already occurred, 
             if(hm.containsKey(str.charAt(i)))
             {
                 // updating count
                 hm.get(str.charAt(i)).incCount();
             }
             
            // If it's first occurrence, then store the index and count = 1
             else
             {
                 hm.put(str.charAt(i), new CountIndex(i));
             }
                 
         }    
     }
     
    /* The method returns index of first non-repeating
       character in a string. If all characters are repeating 
       then returns -1 */
    static int firstNonRepeating(String str)
    {
        getCharCountArray(str);
        int result = Integer.MAX_VALUE, i;
     
        for (i = 0; i < str.length();  i++)
        {
             // If this character occurs only once and appears
            // before the current result, then update the result
            if (hm.get(str.charAt(i)).count == 1 && result > hm.get(str.charAt(i)).index){
                 result = hm.get(str.charAt(i)).index;
            }
              
        }  
      
      return result;
    }

    // Driver method
    public static void main (String[] args)
    {
        String str = "geeksforgeeks";
        int index =  firstNonRepeating(str);
        
        System.out.println(index == Integer.MAX_VALUE ? "Either all characters are repeating " +
              " or string is empty" : "First non-repeating character is " +  str.charAt(index));
    }
}
{% endhighlight %}
{% highlight cpp %}
First non-repeating character is f
{% endhighlight %}
* Related Problem : K’th Non-repeating Character
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

